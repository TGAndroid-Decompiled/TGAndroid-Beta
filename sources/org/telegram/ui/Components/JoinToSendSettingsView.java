package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.ProfileActivity;

public abstract class JoinToSendSettingsView extends LinearLayout {
    private final int MAXSPEC;
    private TLRPC.Chat currentChat;
    public boolean isJoinRequest;
    public boolean isJoinToSend;
    public HeaderCell joinHeaderCell;
    public TextCheckCell joinRequestCell;
    public TextInfoPrivacyCell joinRequestInfoCell;
    public TextCheckCell joinToSendCell;
    public TextInfoPrivacyCell joinToSendInfoCell;
    private ValueAnimator toggleAnimator;
    private float toggleValue;

    public abstract boolean onJoinRequestToggle(boolean z, Runnable runnable);

    public boolean onJoinToSendToggle(boolean z, Runnable runnable) {
        return true;
    }

    public JoinToSendSettingsView(Context context, TLRPC.Chat chat) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        super(context);
        this.MAXSPEC = View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE);
        this.currentChat = chat;
        this.isJoinToSend = chat.join_to_send;
        this.isJoinRequest = chat.join_request;
        boolean z = true;
        setOrientation(1);
        HeaderCell headerCell = new HeaderCell(context, 20);
        this.joinHeaderCell = headerCell;
        headerCell.setText(LocaleController.getString(R.string.ChannelSettingsJoinTitle));
        this.joinHeaderCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
        addView(this.joinHeaderCell);
        TextCheckCell textCheckCell = new TextCheckCell(context, 20);
        this.joinToSendCell = textCheckCell;
        String string = LocaleController.getString(R.string.ChannelSettingsJoinToSend);
        boolean z2 = this.isJoinToSend;
        textCheckCell.setTextAndCheck(string, z2, z2);
        this.joinToSendCell.setEnabled(chat.creator || ((tL_chatAdminRights2 = chat.admin_rights) != null && tL_chatAdminRights2.ban_users));
        this.joinToSendCell.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$new$2(view);
            }
        });
        addView(this.joinToSendCell);
        TextCheckCell textCheckCell2 = new TextCheckCell(context, 20);
        this.joinRequestCell = textCheckCell2;
        textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.ChannelSettingsJoinRequest), this.isJoinRequest, false);
        this.joinRequestCell.setPivotY(0.0f);
        TextCheckCell textCheckCell3 = this.joinRequestCell;
        if (!chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.ban_users)) {
            z = false;
        }
        textCheckCell3.setEnabled(z);
        this.joinRequestCell.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$new$5(view);
            }
        });
        addView(this.joinRequestCell);
        TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context, 12);
        this.joinToSendInfoCell = textInfoPrivacyCell;
        textInfoPrivacyCell.setText(LocaleController.getString(R.string.ChannelSettingsJoinToSendInfo));
        addView(this.joinToSendInfoCell);
        TextInfoPrivacyCell textInfoPrivacyCell2 = new TextInfoPrivacyCell(context, 12);
        this.joinRequestInfoCell = textInfoPrivacyCell2;
        textInfoPrivacyCell2.setText(LocaleController.getString(R.string.ChannelSettingsJoinRequestInfo));
        addView(this.joinRequestInfoCell);
        boolean z3 = this.isJoinToSend;
        this.toggleValue = z3 ? 1.0f : 0.0f;
        this.joinRequestCell.setVisibility(z3 ? 0 : 8);
        updateToggleValue(this.toggleValue);
    }

    public void lambda$new$2(View view) {
        final boolean z = this.isJoinToSend;
        boolean z2 = !z;
        final boolean z3 = this.isJoinRequest;
        if (onJoinToSendToggle(z2, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$1(z3, z);
            }
        })) {
            lambda$new$3(false);
            setJoinToSend(z2);
        }
    }

    public void lambda$new$1(final boolean z, final boolean z2) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$0(z, z2);
            }
        });
    }

    public void lambda$new$0(boolean z, boolean z2) {
        lambda$new$3(z);
        setJoinToSend(z2);
    }

    public void lambda$new$5(View view) {
        final boolean z = this.isJoinRequest;
        boolean z2 = !z;
        if (onJoinRequestToggle(z2, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$4(z);
            }
        })) {
            lambda$new$3(z2);
        }
    }

    public void lambda$new$4(final boolean z) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$3(z);
            }
        });
    }

    public float getBottomInfoMargin() {
        return (this.joinToSendInfoCell.getAlpha() * this.joinToSendInfoCell.getHeight()) + (this.joinRequestInfoCell.getAlpha() * this.joinRequestInfoCell.getHeight());
    }

    public void setChat(TLRPC.Chat chat) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        this.currentChat = chat;
        boolean z = true;
        this.joinToSendCell.setEnabled(chat.creator || ((tL_chatAdminRights2 = chat.admin_rights) != null && tL_chatAdminRights2.ban_users));
        TextCheckCell textCheckCell = this.joinRequestCell;
        TLRPC.Chat chat2 = this.currentChat;
        if (!chat2.creator && ((tL_chatAdminRights = chat2.admin_rights) == null || !tL_chatAdminRights.ban_users)) {
            z = false;
        }
        textCheckCell.setEnabled(z);
    }

    private void updateToggleValue(float f) {
        this.toggleValue = f;
        this.joinRequestCell.setAlpha(f);
        float f2 = 1.0f - f;
        this.joinRequestCell.setTranslationY((-AndroidUtilities.dp(16.0f)) * f2);
        this.joinRequestCell.setScaleY(1.0f - (0.1f * f2));
        int iDp = this.joinRequestCell.getMeasuredHeight() <= 0 ? AndroidUtilities.dp(50.0f) : this.joinRequestCell.getMeasuredHeight();
        this.joinToSendInfoCell.setAlpha(f2);
        float f3 = (-iDp) * f2;
        this.joinToSendInfoCell.setTranslationY(((-AndroidUtilities.dp(4.0f)) * f) + f3);
        this.joinRequestInfoCell.setAlpha(f);
        this.joinRequestInfoCell.setTranslationY(f3 + (AndroidUtilities.dp(4.0f) * f2));
        requestLayout();
    }

    public void showJoinToSend(boolean z) {
        this.joinHeaderCell.setVisibility(z ? 0 : 8);
        this.joinToSendCell.setVisibility(z ? 0 : 8);
        if (!z) {
            this.isJoinToSend = true;
            this.joinRequestCell.setVisibility(0);
            updateToggleValue(1.0f);
        }
        requestLayout();
    }

    public void setFullInfo(final BaseFragment baseFragment, final TLRPC.ChatFull chatFull) {
        int i;
        int i2;
        boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(this.currentChat);
        boolean zIsPublic = ChatObject.isPublic(this.currentChat);
        if (chatFull != null && chatFull.guard_bot_id != 0) {
            String str = "@" + DialogObject.getPublicUsername(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(chatFull.guard_bot_id)));
            TextInfoPrivacyCell textInfoPrivacyCell = this.joinRequestInfoCell;
            if (zIsChannelAndNotMegaGroup) {
                i2 = R.string.ChannelSettingsJoinRequestInfoManagedBy;
            } else if (zIsPublic) {
                i2 = R.string.GroupPublicSettingsJoinRequestInfoManagedBy;
            } else {
                i2 = R.string.GroupPrivateSettingsJoinRequestInfoManagedBy;
            }
            textInfoPrivacyCell.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(i2, str), Theme.getColor(Theme.key_telegram_color_text), new Runnable() {
                @Override
                public final void run() {
                    JoinToSendSettingsView.lambda$setFullInfo$6(chatFull, baseFragment);
                }
            }));
            return;
        }
        TextInfoPrivacyCell textInfoPrivacyCell2 = this.joinRequestInfoCell;
        if (zIsChannelAndNotMegaGroup) {
            i = R.string.ChannelSettingsJoinRequestInfo2;
        } else if (zIsPublic) {
            i = R.string.GroupPublicSettingsJoinRequestInfo2;
        } else {
            i = R.string.GroupPrivateSettingsJoinRequestInfo2;
        }
        textInfoPrivacyCell2.setText(LocaleController.getString(i));
    }

    public static void lambda$setFullInfo$6(TLRPC.ChatFull chatFull, BaseFragment baseFragment) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", chatFull.guard_bot_id);
        baseFragment.presentFragment(new ProfileActivity(bundle));
    }

    public void lambda$new$3(boolean z) {
        this.isJoinRequest = z;
        this.joinRequestCell.setChecked(z);
    }

    public void setJoinToSend(boolean z) {
        this.isJoinToSend = z;
        this.joinToSendCell.setChecked(z);
        this.joinToSendCell.setDivider(this.isJoinToSend);
        this.joinRequestCell.setChecked(this.isJoinRequest);
        ValueAnimator valueAnimator = this.toggleAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.toggleValue, this.isJoinToSend ? 1.0f : 0.0f);
        this.toggleAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(200L);
        this.toggleAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.toggleAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f$0.lambda$setJoinToSend$7(valueAnimator2);
            }
        });
        this.toggleAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                JoinToSendSettingsView joinToSendSettingsView = JoinToSendSettingsView.this;
                if (joinToSendSettingsView.isJoinToSend) {
                    return;
                }
                joinToSendSettingsView.joinRequestCell.setVisibility(8);
            }
        });
        this.joinRequestCell.setVisibility(0);
        this.toggleAnimator.start();
    }

    public void lambda$setJoinToSend$7(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.toggleValue = fFloatValue;
        updateToggleValue(fFloatValue);
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        if (this.joinToSendCell.getVisibility() == 0) {
            HeaderCell headerCell = this.joinHeaderCell;
            int i5 = i3 - i;
            int measuredHeight2 = headerCell.getMeasuredHeight();
            headerCell.layout(0, 0, i5, measuredHeight2);
            TextCheckCell textCheckCell = this.joinToSendCell;
            measuredHeight = textCheckCell.getMeasuredHeight() + measuredHeight2;
            textCheckCell.layout(0, measuredHeight2, i5, measuredHeight);
        } else {
            measuredHeight = 0;
        }
        TextCheckCell textCheckCell2 = this.joinRequestCell;
        int i6 = i3 - i;
        int measuredHeight3 = textCheckCell2.getMeasuredHeight() + measuredHeight;
        textCheckCell2.layout(0, measuredHeight, i6, measuredHeight3);
        TextInfoPrivacyCell textInfoPrivacyCell = this.joinToSendInfoCell;
        textInfoPrivacyCell.layout(0, measuredHeight3, i6, textInfoPrivacyCell.getMeasuredHeight() + measuredHeight3);
        TextInfoPrivacyCell textInfoPrivacyCell2 = this.joinRequestInfoCell;
        textInfoPrivacyCell2.layout(0, measuredHeight3, i6, textInfoPrivacyCell2.getMeasuredHeight() + measuredHeight3);
    }

    private int calcHeight() {
        float measuredHeight;
        if (this.joinToSendCell.getVisibility() == 0) {
            measuredHeight = this.joinHeaderCell.getMeasuredHeight() + this.joinToSendCell.getMeasuredHeight() + (this.joinRequestCell.getMeasuredHeight() * this.toggleValue);
        } else {
            measuredHeight = this.joinRequestCell.getMeasuredHeight();
        }
        return (int) (measuredHeight + AndroidUtilities.lerp(this.joinToSendInfoCell.getMeasuredHeight(), this.joinRequestInfoCell.getMeasuredHeight(), this.toggleValue));
    }

    @Override
    protected void onMeasure(int i, int i2) {
        this.joinHeaderCell.measure(i, this.MAXSPEC);
        this.joinToSendCell.measure(i, this.MAXSPEC);
        this.joinRequestCell.measure(i, this.MAXSPEC);
        this.joinToSendInfoCell.measure(i, this.MAXSPEC);
        this.joinRequestInfoCell.measure(i, this.MAXSPEC);
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(calcHeight(), 1073741824));
    }
}
