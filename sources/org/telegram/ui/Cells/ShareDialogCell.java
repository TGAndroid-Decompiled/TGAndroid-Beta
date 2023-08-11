package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$TL_forumTopic;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$UserStatus;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.LayoutHelper;
public class ShareDialogCell extends FrameLayout {
    private AvatarDrawable avatarDrawable;
    private CheckBox2 checkBox;
    private int currentAccount;
    private long currentDialog;
    private int currentType;
    private BackupImageView imageView;
    private long lastUpdateTime;
    private TextView nameTextView;
    private float onlineProgress;
    private final Theme.ResourcesProvider resourcesProvider;
    private SimpleTextView topicTextView;
    private boolean topicWasVisible;
    private TLRPC$User user;

    public ShareDialogCell(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.avatarDrawable = new AvatarDrawable();
        this.currentAccount = UserConfig.selectedAccount;
        this.resourcesProvider = resourcesProvider;
        setWillNotDraw(false);
        this.currentType = i;
        BackupImageView backupImageView = new BackupImageView(context);
        this.imageView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(28.0f));
        if (i == 2) {
            addView(this.imageView, LayoutHelper.createFrame(48, 48.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        } else {
            addView(this.imageView, LayoutHelper.createFrame(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        }
        TextView textView = new TextView(this, context) {
            @Override
            public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
                super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), AndroidUtilities.dp(10.0f), false), bufferType);
            }
        };
        this.nameTextView = textView;
        NotificationCenter.listenEmojiLoading(textView);
        this.nameTextView.setTextColor(getThemedColor(i == 1 ? Theme.key_voipgroup_nameText : Theme.key_dialogTextBlack));
        this.nameTextView.setTextSize(1, 12.0f);
        this.nameTextView.setMaxLines(2);
        this.nameTextView.setGravity(49);
        this.nameTextView.setLines(2);
        this.nameTextView.setEllipsize(TextUtils.TruncateAt.END);
        addView(this.nameTextView, LayoutHelper.createFrame(-1, -2.0f, 51, 6.0f, this.currentType == 2 ? 58.0f : 66.0f, 6.0f, 0.0f));
        SimpleTextView simpleTextView = new SimpleTextView(context);
        this.topicTextView = simpleTextView;
        simpleTextView.setTextColor(getThemedColor(i == 1 ? Theme.key_voipgroup_nameText : Theme.key_dialogTextBlack));
        this.topicTextView.setTextSize(12);
        this.topicTextView.setMaxLines(2);
        this.topicTextView.setGravity(49);
        this.topicTextView.setAlignment(Layout.Alignment.ALIGN_CENTER);
        addView(this.topicTextView, LayoutHelper.createFrame(-1, -2.0f, 51, 6.0f, this.currentType == 2 ? 58.0f : 66.0f, 6.0f, 0.0f));
        CheckBox2 checkBox2 = new CheckBox2(context, 21, resourcesProvider);
        this.checkBox = checkBox2;
        checkBox2.setColor(Theme.key_dialogRoundCheckBox, i == 1 ? Theme.key_voipgroup_inviteMembersBackground : Theme.key_dialogBackground, Theme.key_dialogRoundCheckBoxCheck);
        this.checkBox.setDrawUnchecked(false);
        this.checkBox.setDrawBackgroundAsArc(4);
        this.checkBox.setProgressDelegate(new CheckBoxBase.ProgressDelegate() {
            @Override
            public final void setProgress(float f) {
                ShareDialogCell.this.lambda$new$0(f);
            }
        });
        addView(this.checkBox, LayoutHelper.createFrame(24, 24.0f, 49, 19.0f, this.currentType == 2 ? -40.0f : 42.0f, 0.0f, 0.0f));
        setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_listSelector), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
    }

    public void lambda$new$0(float f) {
        float progress = 1.0f - (this.checkBox.getProgress() * 0.143f);
        this.imageView.setScaleX(progress);
        this.imageView.setScaleY(progress);
        invalidate();
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.currentType == 2 ? 95.0f : 103.0f), 1073741824));
    }

    public void setDialog(long j, boolean z, CharSequence charSequence) {
        if (DialogObject.isUserDialog(j)) {
            TLRPC$User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j));
            this.user = user;
            this.avatarDrawable.setInfo(user);
            if (this.currentType != 2 && UserObject.isReplyUser(this.user)) {
                this.nameTextView.setText(LocaleController.getString("RepliesTitle", R.string.RepliesTitle));
                this.avatarDrawable.setAvatarType(12);
                this.imageView.setImage((ImageLocation) null, (String) null, this.avatarDrawable, this.user);
            } else if (this.currentType != 2 && UserObject.isUserSelf(this.user)) {
                this.nameTextView.setText(LocaleController.getString("SavedMessages", R.string.SavedMessages));
                this.avatarDrawable.setAvatarType(1);
                this.imageView.setImage((ImageLocation) null, (String) null, this.avatarDrawable, this.user);
            } else {
                if (charSequence != null) {
                    this.nameTextView.setText(charSequence);
                } else {
                    TLRPC$User tLRPC$User = this.user;
                    if (tLRPC$User != null) {
                        this.nameTextView.setText(ContactsController.formatName(tLRPC$User.first_name, tLRPC$User.last_name));
                    } else {
                        this.nameTextView.setText(BuildConfig.APP_CENTER_HASH);
                    }
                }
                this.imageView.setForUserOrChat(this.user, this.avatarDrawable);
            }
            this.imageView.setRoundRadius(AndroidUtilities.dp(28.0f));
        } else {
            this.user = null;
            TLRPC$Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j));
            if (charSequence != null) {
                this.nameTextView.setText(charSequence);
            } else if (chat != null) {
                this.nameTextView.setText(chat.title);
            } else {
                this.nameTextView.setText(BuildConfig.APP_CENTER_HASH);
            }
            this.avatarDrawable.setInfo(chat);
            this.imageView.setForUserOrChat(chat, this.avatarDrawable);
            this.imageView.setRoundRadius((chat == null || !chat.forum) ? AndroidUtilities.dp(28.0f) : AndroidUtilities.dp(16.0f));
        }
        this.currentDialog = j;
        this.checkBox.setChecked(z, false);
    }

    public long getCurrentDialog() {
        return this.currentDialog;
    }

    public void setChecked(boolean z, boolean z2) {
        this.checkBox.setChecked(z, z2);
        if (z) {
            return;
        }
        setTopic(null, true);
    }

    public void setTopic(TLRPC$TL_forumTopic tLRPC$TL_forumTopic, boolean z) {
        boolean z2 = this.topicWasVisible;
        boolean z3 = tLRPC$TL_forumTopic != null;
        if (z2 == z3 && z) {
            return;
        }
        SimpleTextView simpleTextView = this.topicTextView;
        int i = R.id.spring_tag;
        SpringAnimation springAnimation = (SpringAnimation) simpleTextView.getTag(i);
        if (springAnimation != null) {
            springAnimation.cancel();
        }
        if (z3) {
            SimpleTextView simpleTextView2 = this.topicTextView;
            simpleTextView2.setText(ForumUtilities.getTopicSpannedName(tLRPC$TL_forumTopic, simpleTextView2.getTextPaint()));
            this.topicTextView.requestLayout();
        }
        if (z) {
            SpringAnimation addEndListener = new SpringAnimation(new FloatValueHolder(z3 ? 0.0f : 1000.0f)).setSpring(new SpringForce(z3 ? 1000.0f : 0.0f).setStiffness(1500.0f).setDampingRatio(1.0f)).addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
                @Override
                public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
                    ShareDialogCell.this.lambda$setTopic$1(dynamicAnimation, f, f2);
                }
            }).addEndListener(new DynamicAnimation.OnAnimationEndListener() {
                @Override
                public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z4, float f, float f2) {
                    ShareDialogCell.this.lambda$setTopic$2(dynamicAnimation, z4, f, f2);
                }
            });
            this.topicTextView.setTag(i, addEndListener);
            addEndListener.start();
        } else if (z3) {
            this.topicTextView.setAlpha(1.0f);
            this.nameTextView.setAlpha(0.0f);
            this.topicTextView.setTranslationX(0.0f);
            this.nameTextView.setTranslationX(AndroidUtilities.dp(10.0f));
        } else {
            this.topicTextView.setAlpha(0.0f);
            this.nameTextView.setAlpha(1.0f);
            this.topicTextView.setTranslationX(-AndroidUtilities.dp(10.0f));
            this.nameTextView.setTranslationX(0.0f);
        }
        this.topicWasVisible = z3;
    }

    public void lambda$setTopic$1(DynamicAnimation dynamicAnimation, float f, float f2) {
        float f3 = f / 1000.0f;
        this.topicTextView.setAlpha(f3);
        float f4 = 1.0f - f3;
        this.nameTextView.setAlpha(f4);
        this.topicTextView.setTranslationX(f4 * (-AndroidUtilities.dp(10.0f)));
        this.nameTextView.setTranslationX(f3 * AndroidUtilities.dp(10.0f));
    }

    public void lambda$setTopic$2(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
        this.topicTextView.setTag(R.id.spring_tag, null);
    }

    @Override
    protected boolean drawChild(Canvas canvas, View view, long j) {
        TLRPC$User tLRPC$User;
        TLRPC$UserStatus tLRPC$UserStatus;
        boolean drawChild = super.drawChild(canvas, view, j);
        if (view == this.imageView && this.currentType != 2 && (tLRPC$User = this.user) != null && !MessagesController.isSupportUser(tLRPC$User)) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = elapsedRealtime - this.lastUpdateTime;
            if (j2 > 17) {
                j2 = 17;
            }
            this.lastUpdateTime = elapsedRealtime;
            TLRPC$User tLRPC$User2 = this.user;
            boolean z = (tLRPC$User2.self || tLRPC$User2.bot || (((tLRPC$UserStatus = tLRPC$User2.status) == null || tLRPC$UserStatus.expires <= ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) && !MessagesController.getInstance(this.currentAccount).onlinePrivacy.containsKey(Long.valueOf(this.user.id)))) ? false : true;
            if (z || this.onlineProgress != 0.0f) {
                int bottom = this.imageView.getBottom() - AndroidUtilities.dp(6.0f);
                int right = this.imageView.getRight() - AndroidUtilities.dp(10.0f);
                Theme.dialogs_onlineCirclePaint.setColor(getThemedColor(this.currentType == 1 ? Theme.key_voipgroup_inviteMembersBackground : Theme.key_windowBackgroundWhite));
                float f = right;
                float f2 = bottom;
                canvas.drawCircle(f, f2, AndroidUtilities.dp(7.0f) * this.onlineProgress, Theme.dialogs_onlineCirclePaint);
                Theme.dialogs_onlineCirclePaint.setColor(getThemedColor(Theme.key_chats_onlineCircle));
                canvas.drawCircle(f, f2, AndroidUtilities.dp(5.0f) * this.onlineProgress, Theme.dialogs_onlineCirclePaint);
                if (z) {
                    float f3 = this.onlineProgress;
                    if (f3 < 1.0f) {
                        float f4 = f3 + (((float) j2) / 150.0f);
                        this.onlineProgress = f4;
                        if (f4 > 1.0f) {
                            this.onlineProgress = 1.0f;
                        }
                        this.imageView.invalidate();
                        invalidate();
                    }
                } else {
                    float f5 = this.onlineProgress;
                    if (f5 > 0.0f) {
                        float f6 = f5 - (((float) j2) / 150.0f);
                        this.onlineProgress = f6;
                        if (f6 < 0.0f) {
                            this.onlineProgress = 0.0f;
                        }
                        this.imageView.invalidate();
                        invalidate();
                    }
                }
            }
        }
        return drawChild;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int left = this.imageView.getLeft() + (this.imageView.getMeasuredWidth() / 2);
        int top = this.imageView.getTop() + (this.imageView.getMeasuredHeight() / 2);
        Theme.checkboxSquare_checkPaint.setColor(getThemedColor(Theme.key_dialogRoundCheckBox));
        Theme.checkboxSquare_checkPaint.setAlpha((int) (this.checkBox.getProgress() * 255.0f));
        int dp = AndroidUtilities.dp(this.currentType == 2 ? 24.0f : 28.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(left - dp, top - dp, left + dp, top + dp);
        canvas.drawRoundRect(rectF, this.imageView.getRoundRadius()[0], this.imageView.getRoundRadius()[0], Theme.checkboxSquare_checkPaint);
        super.onDraw(canvas);
    }

    private int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.checkBox.isChecked()) {
            accessibilityNodeInfo.setSelected(true);
        }
    }
}
