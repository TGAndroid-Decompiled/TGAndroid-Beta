package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.CounterView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.PremiumGradient;

public class HintDialogCell extends FrameLayout {
    private AvatarDrawable avatarDrawable;
    private int backgroundColorKey;
    CheckBox2 checkBox;
    CounterView counterView;
    private int currentAccount;
    private TLRPC.User currentUser;
    private long dialogId;
    private final boolean drawCheckbox;
    private BackupImageView imageView;
    private int lastUnreadCount;
    private Drawable lockDrawable;
    private TextView nameTextView;
    private boolean premiumBlocked;
    private final AnimatedFloat premiumBlockedT;
    private PremiumGradient.PremiumGradientTools premiumGradient;
    private RectF rect;
    private Theme.ResourcesProvider resourcesProvider;
    float showOnlineProgress;
    private boolean showPremiumBlocked;
    private final AnimatedFloat starsBlockedT;
    private long starsPriceBlocked;
    boolean wasDraw;

    public boolean isBlocked() {
        return this.premiumBlocked;
    }

    public HintDialogCell(Context context, boolean z, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.avatarDrawable = new AvatarDrawable();
        this.rect = new RectF();
        this.currentAccount = UserConfig.selectedAccount;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.premiumBlockedT = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.starsBlockedT = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.backgroundColorKey = Theme.key_windowBackgroundWhite;
        this.drawCheckbox = z;
        BackupImageView backupImageView = new BackupImageView(context);
        this.imageView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(27.0f));
        addView(this.imageView, LayoutHelper.createFrame(54, 54.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context) {
            @Override
            public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
                super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
            }
        };
        this.nameTextView = textView;
        NotificationCenter.listenEmojiLoading(textView);
        this.nameTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
        this.nameTextView.setTextSize(1, 12.0f);
        this.nameTextView.setMaxLines(1);
        this.nameTextView.setGravity(49);
        this.nameTextView.setLines(1);
        this.nameTextView.setEllipsize(TextUtils.TruncateAt.END);
        addView(this.nameTextView, LayoutHelper.createFrame(-1, -2.0f, 51, 6.0f, 64.0f, 6.0f, 0.0f));
        CounterView counterView = new CounterView(context, resourcesProvider);
        this.counterView = counterView;
        addView(counterView, LayoutHelper.createFrame(-1, 28.0f, 48, 0.0f, 4.0f, 0.0f, 0.0f));
        this.counterView.setColors(Theme.key_chats_unreadCounterText, Theme.key_chats_unreadCounter);
        this.counterView.setGravity(5);
        if (z) {
            CheckBox2 checkBox2 = new CheckBox2(context, 21, resourcesProvider);
            this.checkBox = checkBox2;
            checkBox2.setColor(Theme.key_dialogRoundCheckBox, Theme.key_dialogBackground, Theme.key_dialogRoundCheckBoxCheck);
            this.checkBox.setDrawUnchecked(false);
            this.checkBox.setDrawBackgroundAsArc(4);
            this.checkBox.setProgressDelegate(new CheckBoxBase.ProgressDelegate() {
                @Override
                public final void setProgress(float f) {
                    this.f$0.lambda$new$0(f);
                }
            });
            addView(this.checkBox, LayoutHelper.createFrame(24, 24.0f, 49, 19.0f, 42.0f, 0.0f, 0.0f));
            this.checkBox.setChecked(false, false);
            setWillNotDraw(false);
        }
    }

    public void lambda$new$0(float f) {
        float progress = 1.0f - (this.checkBox.getProgress() * 0.143f);
        this.imageView.setScaleX(progress);
        this.imageView.setScaleY(progress);
        invalidate();
    }

    public void showPremiumBlocked() {
        if (this.showPremiumBlocked) {
            return;
        }
        this.showPremiumBlocked = true;
        NotificationCenter.getInstance(this.currentAccount).listen(this, NotificationCenter.userIsPremiumBlockedUpadted, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.lambda$showPremiumBlocked$1((Object[]) obj);
            }
        });
    }

    public void lambda$showPremiumBlocked$1(Object[] objArr) {
        updatePremiumBlocked(true);
    }

    private void updatePremiumBlocked(boolean z) {
        TL_account.RequirementToContact requirementToContactIsUserContactBlocked = (!this.showPremiumBlocked || this.currentUser == null) ? null : MessagesController.getInstance(this.currentAccount).isUserContactBlocked(this.currentUser.id);
        if (this.premiumBlocked == DialogObject.isPremiumBlocked(requirementToContactIsUserContactBlocked) && this.starsPriceBlocked == DialogObject.getMessagesStarsPrice(requirementToContactIsUserContactBlocked)) {
            return;
        }
        this.premiumBlocked = DialogObject.isPremiumBlocked(requirementToContactIsUserContactBlocked);
        this.starsPriceBlocked = DialogObject.getMessagesStarsPrice(requirementToContactIsUserContactBlocked);
        if (!z) {
            this.premiumBlockedT.set(this.premiumBlocked, true);
            this.starsBlockedT.set(this.starsPriceBlocked > 0, true);
        }
        invalidate();
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), 1073741824));
        this.counterView.counterDrawable.horizontalPadding = AndroidUtilities.dp(13.0f);
    }

    public void update(int i) {
        int i2;
        if ((MessagesController.UPDATE_MASK_STATUS & i) != 0 && this.currentUser != null) {
            this.currentUser = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.currentUser.id));
            this.imageView.invalidate();
            invalidate();
        }
        if (i != 0 && (MessagesController.UPDATE_MASK_READ_DIALOG_MESSAGE & i) == 0 && (i & MessagesController.UPDATE_MASK_NEW_MESSAGE) == 0) {
            return;
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(this.currentAccount).dialogs_dict.get(this.dialogId);
        if (dialog != null && (i2 = dialog.unread_count) != 0) {
            if (this.lastUnreadCount != i2) {
                this.lastUnreadCount = i2;
                this.counterView.setCount(i2, this.wasDraw);
                return;
            }
            return;
        }
        this.lastUnreadCount = 0;
        this.counterView.setCount(0, this.wasDraw);
    }

    public void update() {
        if (DialogObject.isUserDialog(this.dialogId)) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.dialogId));
            this.currentUser = user;
            this.avatarDrawable.setInfo(this.currentAccount, user);
        } else {
            this.avatarDrawable.setInfo(this.currentAccount, MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId)));
            this.currentUser = null;
        }
        updatePremiumBlocked(true);
    }

    public void setColors(int i, int i2) {
        this.nameTextView.setTextColor(Theme.getColor(i, this.resourcesProvider));
        this.backgroundColorKey = i2;
        this.checkBox.setColor(Theme.key_dialogRoundCheckBox, i2, Theme.key_dialogRoundCheckBoxCheck);
    }

    public void setDialog(long j, boolean z, CharSequence charSequence) {
        if (this.dialogId != j) {
            this.wasDraw = false;
            invalidate();
        }
        this.dialogId = j;
        if (DialogObject.isUserDialog(j)) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j));
            this.currentUser = user;
            if (charSequence != null) {
                this.nameTextView.setText(charSequence);
            } else if (user != null) {
                this.nameTextView.setText(UserObject.getFirstName(user));
            } else {
                this.nameTextView.setText("");
            }
            this.avatarDrawable.setInfo(this.currentAccount, this.currentUser);
            this.imageView.setForUserOrChat(this.currentUser, this.avatarDrawable);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j));
            if (charSequence != null) {
                this.nameTextView.setText(charSequence);
            } else if (chat != null) {
                this.nameTextView.setText(chat.title);
            } else {
                this.nameTextView.setText("");
            }
            this.avatarDrawable.setInfo(this.currentAccount, chat);
            this.currentUser = null;
            this.imageView.setForUserOrChat(chat, this.avatarDrawable);
        }
        updatePremiumBlocked(false);
        if (z) {
            update(0);
        }
    }

    @Override
    protected boolean drawChild(Canvas canvas, View view, long j) {
        float f;
        float f2;
        TLRPC.User user;
        TLRPC.UserStatus userStatus;
        boolean zDrawChild = super.drawChild(canvas, view, j);
        if (view == this.imageView) {
            boolean z = (this.premiumBlocked || (user = this.currentUser) == null || user.bot || (((userStatus = user.status) == null || userStatus.expires <= ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) && !MessagesController.getInstance(this.currentAccount).onlinePrivacy.containsKey(Long.valueOf(this.currentUser.id)))) ? false : true;
            if (!this.wasDraw) {
                this.showOnlineProgress = z ? 1.0f : 0.0f;
            }
            if (z) {
                float f3 = this.showOnlineProgress;
                if (f3 != 1.0f) {
                    float f4 = f3 + 0.10666667f;
                    this.showOnlineProgress = f4;
                    if (f4 > 1.0f) {
                        this.showOnlineProgress = 1.0f;
                    }
                    invalidate();
                } else if (!z) {
                    f = this.showOnlineProgress;
                    if (f != 0.0f) {
                        f2 = f - 0.10666667f;
                        this.showOnlineProgress = f2;
                        if (f2 < 0.0f) {
                            this.showOnlineProgress = 0.0f;
                        }
                        invalidate();
                    }
                }
            } else if (!z) {
                f = this.showOnlineProgress;
                if (f != 0.0f) {
                    f2 = f - 0.10666667f;
                    this.showOnlineProgress = f2;
                    if (f2 < 0.0f) {
                        this.showOnlineProgress = 0.0f;
                    }
                    invalidate();
                }
            }
            float f5 = this.premiumBlockedT.set(this.premiumBlocked);
            if (f5 > 0.0f) {
                float y = view.getY() + (view.getHeight() / 2.0f) + AndroidUtilities.dp(18.0f);
                float x = view.getX() + (view.getWidth() / 2.0f) + AndroidUtilities.dp(18.0f);
                canvas.save();
                Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(this.backgroundColorKey, this.resourcesProvider));
                canvas.drawCircle(x, y, AndroidUtilities.dp(11.33f) * f5, Theme.dialogs_onlineCirclePaint);
                if (this.premiumGradient == null) {
                    this.premiumGradient = new PremiumGradient.PremiumGradientTools(Theme.key_premiumGradient1, Theme.key_premiumGradient2, -1, -1, -1, this.resourcesProvider);
                }
                this.premiumGradient.gradientMatrix((int) (x - AndroidUtilities.dp(10.0f)), (int) (y - AndroidUtilities.dp(10.0f)), (int) (AndroidUtilities.dp(10.0f) + x), (int) (AndroidUtilities.dp(10.0f) + y), 0.0f, 0.0f);
                canvas.drawCircle(x, y, AndroidUtilities.dp(10.0f) * f5, this.premiumGradient.paint);
                if (this.lockDrawable == null) {
                    Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                    this.lockDrawable = drawableMutate;
                    drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                }
                Drawable drawable = this.lockDrawable;
                drawable.setBounds((int) (x - (((drawable.getIntrinsicWidth() / 2.0f) * 0.875f) * f5)), (int) (y - (((this.lockDrawable.getIntrinsicHeight() / 2.0f) * 0.875f) * f5)), (int) (x + ((this.lockDrawable.getIntrinsicWidth() / 2.0f) * 0.875f * f5)), (int) (y + ((this.lockDrawable.getIntrinsicHeight() / 2.0f) * 0.875f * f5)));
                this.lockDrawable.setAlpha((int) (f5 * 255.0f));
                this.lockDrawable.draw(canvas);
                canvas.restore();
            } else if (this.showOnlineProgress != 0.0f) {
                int iDp = AndroidUtilities.dp(53.0f);
                int iDp2 = AndroidUtilities.dp(59.0f);
                canvas.save();
                float f6 = this.showOnlineProgress;
                float f7 = iDp2;
                float f8 = iDp;
                canvas.scale(f6, f6, f7, f8);
                Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(this.backgroundColorKey));
                canvas.drawCircle(f7, f8, AndroidUtilities.dp(7.0f), Theme.dialogs_onlineCirclePaint);
                Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(Theme.key_chats_onlineCircle));
                canvas.drawCircle(f7, f8, AndroidUtilities.dp(5.0f), Theme.dialogs_onlineCirclePaint);
                canvas.restore();
            }
            this.wasDraw = true;
        }
        return zDrawChild;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (this.drawCheckbox) {
            int left = this.imageView.getLeft() + (this.imageView.getMeasuredWidth() / 2);
            int top = this.imageView.getTop() + (this.imageView.getMeasuredHeight() / 2);
            Theme.checkboxSquare_checkPaint.setColor(Theme.getColor(Theme.key_dialogRoundCheckBox));
            Theme.checkboxSquare_checkPaint.setAlpha((int) (this.checkBox.getProgress() * 255.0f));
            canvas.drawCircle(left, top, AndroidUtilities.dp(28.0f), Theme.checkboxSquare_checkPaint);
        }
    }

    public void setChecked(boolean z, boolean z2) {
        if (this.drawCheckbox) {
            this.checkBox.setChecked(z, z2);
        }
    }

    public long getDialogId() {
        return this.dialogId;
    }
}
