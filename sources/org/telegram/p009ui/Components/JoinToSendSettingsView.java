package org.telegram.p009ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C1072R;
import org.telegram.messenger.LocaleController;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Cells.HeaderCell;
import org.telegram.p009ui.Cells.TextCheckCell;
import org.telegram.p009ui.Cells.TextInfoPrivacyCell;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$TL_chatAdminRights;

public class JoinToSendSettingsView extends LinearLayout {
    private final int MAXSPEC;
    private TLRPC$Chat currentChat;
    public boolean isJoinRequest;
    public boolean isJoinToSend;
    public HeaderCell joinHeaderCell;
    public TextCheckCell joinRequestCell;
    public TextInfoPrivacyCell joinRequestInfoCell;
    public TextCheckCell joinToSendCell;
    public TextInfoPrivacyCell joinToSendInfoCell;
    private ValueAnimator toggleAnimator;
    private float toggleValue;

    public boolean onJoinRequestToggle(boolean z, Runnable runnable) {
        return true;
    }

    public boolean onJoinToSendToggle(boolean z, Runnable runnable) {
        return true;
    }

    public JoinToSendSettingsView(Context context, TLRPC$Chat tLRPC$Chat) {
        super(context);
        TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights;
        TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights2;
        this.MAXSPEC = View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE);
        this.currentChat = tLRPC$Chat;
        this.isJoinToSend = tLRPC$Chat.join_to_send;
        this.isJoinRequest = tLRPC$Chat.join_request;
        boolean z = true;
        setOrientation(1);
        HeaderCell headerCell = new HeaderCell(context, 23);
        this.joinHeaderCell = headerCell;
        headerCell.setText(LocaleController.getString("ChannelSettingsJoinTitle", C1072R.string.ChannelSettingsJoinTitle));
        this.joinHeaderCell.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
        addView(this.joinHeaderCell);
        TextCheckCell textCheckCell = new TextCheckCell(this, context) {
        };
        this.joinToSendCell = textCheckCell;
        textCheckCell.setBackground(Theme.getSelectorDrawable(true));
        TextCheckCell textCheckCell2 = this.joinToSendCell;
        String string = LocaleController.getString("ChannelSettingsJoinToSend", C1072R.string.ChannelSettingsJoinToSend);
        boolean z2 = this.isJoinToSend;
        textCheckCell2.setTextAndCheck(string, z2, z2);
        this.joinToSendCell.setEnabled(tLRPC$Chat.creator || ((tLRPC$TL_chatAdminRights2 = tLRPC$Chat.admin_rights) != null && tLRPC$TL_chatAdminRights2.ban_users));
        this.joinToSendCell.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                JoinToSendSettingsView.this.lambda$new$2(view);
            }
        });
        addView(this.joinToSendCell);
        TextCheckCell textCheckCell3 = new TextCheckCell(this, context) {
        };
        this.joinRequestCell = textCheckCell3;
        textCheckCell3.setBackground(Theme.getSelectorDrawable(true));
        this.joinRequestCell.setTextAndCheck(LocaleController.getString("ChannelSettingsJoinRequest", C1072R.string.ChannelSettingsJoinRequest), this.isJoinRequest, false);
        this.joinRequestCell.setPivotY(0.0f);
        TextCheckCell textCheckCell4 = this.joinRequestCell;
        if (!tLRPC$Chat.creator && ((tLRPC$TL_chatAdminRights = tLRPC$Chat.admin_rights) == null || !tLRPC$TL_chatAdminRights.ban_users)) {
            z = false;
        }
        textCheckCell4.setEnabled(z);
        this.joinRequestCell.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                JoinToSendSettingsView.this.lambda$new$5(view);
            }
        });
        addView(this.joinRequestCell);
        TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context);
        this.joinToSendInfoCell = textInfoPrivacyCell;
        textInfoPrivacyCell.setText(LocaleController.getString("ChannelSettingsJoinToSendInfo", C1072R.string.ChannelSettingsJoinToSendInfo));
        addView(this.joinToSendInfoCell);
        TextInfoPrivacyCell textInfoPrivacyCell2 = new TextInfoPrivacyCell(context);
        this.joinRequestInfoCell = textInfoPrivacyCell2;
        textInfoPrivacyCell2.setText(LocaleController.getString("ChannelSettingsJoinRequestInfo", C1072R.string.ChannelSettingsJoinRequestInfo));
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
                JoinToSendSettingsView.this.lambda$new$1(z3, z);
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
                JoinToSendSettingsView.this.lambda$new$0(z, z2);
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
                JoinToSendSettingsView.this.lambda$new$4(z);
            }
        })) {
            lambda$new$3(z2);
        }
    }

    public void lambda$new$4(final boolean z) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                JoinToSendSettingsView.this.lambda$new$3(z);
            }
        });
    }

    public void setChat(TLRPC$Chat tLRPC$Chat) {
        TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights;
        TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights2;
        this.currentChat = tLRPC$Chat;
        boolean z = false;
        this.joinToSendCell.setEnabled(tLRPC$Chat.creator || ((tLRPC$TL_chatAdminRights2 = tLRPC$Chat.admin_rights) != null && tLRPC$TL_chatAdminRights2.ban_users));
        TextCheckCell textCheckCell = this.joinRequestCell;
        TLRPC$Chat tLRPC$Chat2 = this.currentChat;
        if (tLRPC$Chat2.creator || ((tLRPC$TL_chatAdminRights = tLRPC$Chat2.admin_rights) != null && tLRPC$TL_chatAdminRights.ban_users)) {
            z = true;
        }
        textCheckCell.setEnabled(z);
    }

    private void updateToggleValue(float f) {
        this.toggleValue = f;
        this.joinRequestCell.setAlpha(f);
        float f2 = 1.0f - f;
        this.joinRequestCell.setTranslationY((-AndroidUtilities.m35dp(16.0f)) * f2);
        this.joinRequestCell.setScaleY(1.0f - (0.1f * f2));
        int m35dp = this.joinRequestCell.getMeasuredHeight() <= 0 ? AndroidUtilities.m35dp(50.0f) : this.joinRequestCell.getMeasuredHeight();
        this.joinToSendInfoCell.setAlpha(f2);
        float f3 = (-m35dp) * f2;
        this.joinToSendInfoCell.setTranslationY(((-AndroidUtilities.m35dp(4.0f)) * f) + f3);
        this.joinRequestInfoCell.setAlpha(f);
        this.joinRequestInfoCell.setTranslationY(f3 + (AndroidUtilities.m35dp(4.0f) * f2));
        requestLayout();
    }

    public void showJoinToSend(boolean z) {
        this.joinToSendCell.setVisibility(z ? 0 : 8);
        if (!z) {
            this.isJoinToSend = true;
            this.joinRequestCell.setVisibility(0);
            updateToggleValue(1.0f);
        }
        requestLayout();
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
        float[] fArr = new float[2];
        fArr[0] = this.toggleValue;
        fArr[1] = this.isJoinToSend ? 1.0f : 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        this.toggleAnimator = ofFloat;
        ofFloat.setDuration(200L);
        this.toggleAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.toggleAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                JoinToSendSettingsView.this.lambda$setJoinToSend$6(valueAnimator2);
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

    public void lambda$setJoinToSend$6(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.toggleValue = floatValue;
        updateToggleValue(floatValue);
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        HeaderCell headerCell = this.joinHeaderCell;
        int i5 = i3 - i;
        int measuredHeight = headerCell.getMeasuredHeight() + 0;
        headerCell.layout(0, 0, i5, measuredHeight);
        if (this.joinToSendCell.getVisibility() == 0) {
            TextCheckCell textCheckCell = this.joinToSendCell;
            int measuredHeight2 = textCheckCell.getMeasuredHeight() + measuredHeight;
            textCheckCell.layout(0, measuredHeight, i5, measuredHeight2);
            measuredHeight = measuredHeight2;
        }
        TextCheckCell textCheckCell2 = this.joinRequestCell;
        int measuredHeight3 = textCheckCell2.getMeasuredHeight() + measuredHeight;
        textCheckCell2.layout(0, measuredHeight, i5, measuredHeight3);
        TextInfoPrivacyCell textInfoPrivacyCell = this.joinToSendInfoCell;
        textInfoPrivacyCell.layout(0, measuredHeight3, i5, textInfoPrivacyCell.getMeasuredHeight() + measuredHeight3);
        TextInfoPrivacyCell textInfoPrivacyCell2 = this.joinRequestInfoCell;
        textInfoPrivacyCell2.layout(0, measuredHeight3, i5, textInfoPrivacyCell2.getMeasuredHeight() + measuredHeight3);
    }

    private int calcHeight() {
        float measuredHeight;
        float measuredHeight2 = this.joinHeaderCell.getMeasuredHeight();
        if (this.joinToSendCell.getVisibility() == 0) {
            measuredHeight = this.joinToSendCell.getMeasuredHeight() + (this.joinRequestCell.getMeasuredHeight() * this.toggleValue);
        } else {
            measuredHeight = this.joinRequestCell.getMeasuredHeight();
        }
        return (int) (measuredHeight2 + measuredHeight + AndroidUtilities.lerp(this.joinToSendInfoCell.getMeasuredHeight(), this.joinRequestInfoCell.getMeasuredHeight(), this.toggleValue));
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
