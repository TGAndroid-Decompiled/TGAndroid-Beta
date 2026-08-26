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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.utils.WindowVisibilityManager$$ExternalSyntheticLambda0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.CounterView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.PremiumGradient;

public final class HintDialogCell extends FrameLayout {
    public final AvatarDrawable avatarDrawable;
    public int backgroundColorKey;
    public final CheckBox2 checkBox;
    public final CounterView counterView;
    public final int currentAccount;
    public TLRPC.User currentUser;
    public long dialogId;
    public final boolean drawCheckbox;
    public final BackupImageView imageView;
    public int lastUnreadCount;
    public Drawable lockDrawable;
    public final MentionCell.AnonymousClass1 nameTextView;
    public boolean premiumBlocked;
    public final AnimatedFloat premiumBlockedT;
    public PremiumGradient.PremiumGradientTools premiumGradient;
    public float showOnlineProgress;
    public boolean showPremiumBlocked;
    public final AnimatedFloat starsBlockedT;
    public long starsPriceBlocked;
    public boolean wasDraw;

    public HintDialogCell(Context context, boolean z, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.avatarDrawable = new AvatarDrawable();
        new RectF();
        this.currentAccount = UserConfig.selectedAccount;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.premiumBlockedT = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.starsBlockedT = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.backgroundColorKey = Theme.key_windowBackgroundWhite;
        this.drawCheckbox = z;
        BackupImageView backupImageView = new BackupImageView(context);
        this.imageView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(27.0f));
        addView(backupImageView, LayoutHelper.createFrame(54, 54.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        MentionCell.AnonymousClass1 anonymousClass1 = new MentionCell.AnonymousClass1(context, 2);
        this.nameTextView = anonymousClass1;
        NotificationCenter.listenEmojiLoading(anonymousClass1);
        anonymousClass1.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
        anonymousClass1.setTextSize(1, 12.0f);
        anonymousClass1.setMaxLines(1);
        anonymousClass1.setGravity(49);
        anonymousClass1.setLines(1);
        anonymousClass1.setEllipsize(TextUtils.TruncateAt.END);
        addView(anonymousClass1, LayoutHelper.createFrame(-1, -2.0f, 51, 6.0f, 64.0f, 6.0f, 0.0f));
        CounterView counterView = new CounterView(context, resourcesProvider);
        this.counterView = counterView;
        addView(counterView, LayoutHelper.createFrame(-1, 28.0f, 48, 0.0f, 4.0f, 0.0f, 0.0f));
        counterView.setColors(Theme.key_chats_unreadCounterText, Theme.key_chats_unreadCounter);
        counterView.setGravity(5);
        if (z) {
            CheckBox2 checkBox2 = new CheckBox2(context, 21, resourcesProvider);
            this.checkBox = checkBox2;
            checkBox2.setColor(Theme.key_dialogRoundCheckBox, Theme.key_dialogBackground, Theme.key_dialogRoundCheckBoxCheck);
            checkBox2.setDrawUnchecked(false);
            checkBox2.setDrawBackgroundAsArc(4);
            checkBox2.setProgressDelegate(new WindowVisibilityManager$$ExternalSyntheticLambda0(this, 19));
            addView(checkBox2, LayoutHelper.createFrame(24, 24.0f, 49, 19.0f, 42.0f, 0.0f, 0.0f));
            checkBox2.setChecked(false, false);
            setWillNotDraw(false);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        float f;
        float f2;
        TLRPC.User user;
        boolean zDrawChild = super.drawChild(canvas, view, j);
        if (view == this.imageView) {
            if (this.premiumBlocked || (user = this.currentUser) == null || user.bot) {
                z = false;
            } else {
                TLRPC.UserStatus userStatus = user.status;
                int i = this.currentAccount;
                if ((userStatus == null || userStatus.expires <= ConnectionsManager.getInstance(i).getCurrentTime()) && !MessagesController.getInstance(i).onlinePrivacy.containsKey(Long.valueOf(this.currentUser.id))) {
                    z = false;
                } else {
                    z = true;
                }
            }
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
                float height = (view.getHeight() / 2.0f) + view.getY() + AndroidUtilities.dp(18.0f);
                float width = (view.getWidth() / 2.0f) + view.getX() + AndroidUtilities.dp(18.0f);
                canvas.save();
                Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(null, this.backgroundColorKey, false));
                canvas.drawCircle(width, height, AndroidUtilities.dp(11.33f) * f5, Theme.dialogs_onlineCirclePaint);
                if (this.premiumGradient == null) {
                    this.premiumGradient = new PremiumGradient.PremiumGradientTools(Theme.key_premiumGradient1, Theme.key_premiumGradient2, -1, -1, null);
                }
                this.premiumGradient.gradientMatrix((int) (width - AndroidUtilities.dp(10.0f)), (int) (height - AndroidUtilities.dp(10.0f)), (int) (AndroidUtilities.dp(10.0f) + width), (int) (AndroidUtilities.dp(10.0f) + height), 0.0f, 0.0f);
                canvas.drawCircle(width, height, AndroidUtilities.dp(10.0f) * f5, this.premiumGradient.paint);
                if (this.lockDrawable == null) {
                    Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                    this.lockDrawable = drawableMutate;
                    drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                }
                Drawable drawable = this.lockDrawable;
                drawable.setBounds((int) (width - (((drawable.getIntrinsicWidth() / 2.0f) * 0.875f) * f5)), (int) (height - (((this.lockDrawable.getIntrinsicHeight() / 2.0f) * 0.875f) * f5)), (int) (((this.lockDrawable.getIntrinsicWidth() / 2.0f) * 0.875f * f5) + width), (int) (((this.lockDrawable.getIntrinsicHeight() / 2.0f) * 0.875f * f5) + height));
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
                Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(null, this.backgroundColorKey, false));
                canvas.drawCircle(f7, f8, AndroidUtilities.dp(7.0f), Theme.dialogs_onlineCirclePaint);
                Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(null, Theme.key_chats_onlineCircle, false));
                canvas.drawCircle(f7, f8, AndroidUtilities.dp(5.0f), Theme.dialogs_onlineCirclePaint);
                canvas.restore();
            }
            this.wasDraw = true;
        }
        return zDrawChild;
    }

    public long getDialogId() {
        return this.dialogId;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.drawCheckbox) {
            BackupImageView backupImageView = this.imageView;
            int measuredWidth = (backupImageView.getMeasuredWidth() / 2) + backupImageView.getLeft();
            int measuredHeight = (backupImageView.getMeasuredHeight() / 2) + backupImageView.getTop();
            Theme.checkboxSquare_checkPaint.setColor(Theme.getColor(null, Theme.key_dialogRoundCheckBox, false));
            Theme.checkboxSquare_checkPaint.setAlpha((int) (this.checkBox.getProgress() * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(28.0f), Theme.checkboxSquare_checkPaint);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), 1073741824));
        this.counterView.counterDrawable.horizontalPadding = AndroidUtilities.dp(13.0f);
    }

    public final void setDialog(long j, String str) {
        if (this.dialogId != j) {
            this.wasDraw = false;
            invalidate();
        }
        this.dialogId = j;
        boolean zIsUserDialog = DialogObject.isUserDialog(j);
        BackupImageView backupImageView = this.imageView;
        AvatarDrawable avatarDrawable = this.avatarDrawable;
        int i = this.currentAccount;
        MentionCell.AnonymousClass1 anonymousClass1 = this.nameTextView;
        if (zIsUserDialog) {
            TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(j));
            this.currentUser = user;
            if (str != null) {
                anonymousClass1.setText(str);
            } else if (user != null) {
                anonymousClass1.setText(UserObject.getFirstName(user));
            } else {
                anonymousClass1.setText("");
            }
            avatarDrawable.setInfo(i, this.currentUser);
            backupImageView.setForUserOrChat(this.currentUser, avatarDrawable);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-j));
            if (str != null) {
                anonymousClass1.setText(str);
            } else if (chat != null) {
                anonymousClass1.setText(chat.title);
            } else {
                anonymousClass1.setText("");
            }
            avatarDrawable.setInfo(i, chat);
            this.currentUser = null;
            backupImageView.setForUserOrChat(chat, avatarDrawable);
        }
        updatePremiumBlocked(false);
        update(0);
    }

    public final void update(int i) {
        int i2;
        int i3 = MessagesController.UPDATE_MASK_STATUS & i;
        int i4 = this.currentAccount;
        if (i3 != 0 && this.currentUser != null) {
            this.currentUser = MessagesController.getInstance(i4).getUser(Long.valueOf(this.currentUser.id));
            this.imageView.invalidate();
            invalidate();
        }
        if (i != 0 && (MessagesController.UPDATE_MASK_READ_DIALOG_MESSAGE & i) == 0 && (i & MessagesController.UPDATE_MASK_NEW_MESSAGE) == 0) {
            return;
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(i4).dialogs_dict.get(this.dialogId);
        CounterView counterView = this.counterView;
        if (dialog == null || (i2 = dialog.unread_count) == 0) {
            this.lastUnreadCount = 0;
            counterView.setCount(0, this.wasDraw);
        } else if (this.lastUnreadCount != i2) {
            this.lastUnreadCount = i2;
            counterView.setCount(i2, this.wasDraw);
        }
    }

    public final void updatePremiumBlocked(boolean z) {
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
}
