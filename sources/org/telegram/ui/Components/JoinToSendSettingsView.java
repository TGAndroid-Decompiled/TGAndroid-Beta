package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;

public abstract class JoinToSendSettingsView extends LinearLayout {
    public final int MAXSPEC;
    public TLRPC.Chat currentChat;
    public boolean isJoinRequest;
    public boolean isJoinToSend;
    public final HeaderCell joinHeaderCell;
    public final TextCheckCell joinRequestCell;
    public final TextInfoPrivacyCell joinRequestInfoCell;
    public final TextCheckCell joinToSendCell;
    public final TextInfoPrivacyCell joinToSendInfoCell;
    public ValueAnimator toggleAnimator;
    public float toggleValue;

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
        headerCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
        addView(headerCell);
        TextCheckCell textCheckCell = new TextCheckCell(20, context, null, false);
        this.joinToSendCell = textCheckCell;
        String string = LocaleController.getString(R.string.ChannelSettingsJoinToSend);
        boolean z2 = this.isJoinToSend;
        textCheckCell.setTextAndCheck(string, z2, z2);
        textCheckCell.setEnabled(chat.creator || ((tL_chatAdminRights2 = chat.admin_rights) != null && tL_chatAdminRights2.ban_users));
        final int i = 0;
        textCheckCell.setOnClickListener(new View.OnClickListener(this) {
            public final JoinToSendSettingsView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        JoinToSendSettingsView joinToSendSettingsView = this.f$0;
                        boolean z3 = joinToSendSettingsView.isJoinToSend;
                        boolean z4 = !z3;
                        if (joinToSendSettingsView.onJoinToSendToggle(new JoinToSendSettingsView$$ExternalSyntheticLambda5(joinToSendSettingsView, joinToSendSettingsView.isJoinRequest, z3, 0), z4)) {
                            joinToSendSettingsView.setJoinRequest(false);
                            joinToSendSettingsView.setJoinToSend(z4);
                        }
                        break;
                    default:
                        JoinToSendSettingsView joinToSendSettingsView2 = this.f$0;
                        boolean z5 = joinToSendSettingsView2.isJoinRequest;
                        boolean z6 = !z5;
                        if (joinToSendSettingsView2.onJoinRequestToggle(new JoinToSendSettingsView$$ExternalSyntheticLambda4(joinToSendSettingsView2, z5, 0), z6)) {
                            joinToSendSettingsView2.setJoinRequest(z6);
                        }
                        break;
                }
            }
        });
        addView(textCheckCell);
        TextCheckCell textCheckCell2 = new TextCheckCell(20, context, null, false);
        this.joinRequestCell = textCheckCell2;
        textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.ChannelSettingsJoinRequest), this.isJoinRequest, false);
        textCheckCell2.setPivotY(0.0f);
        if (!chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.ban_users)) {
            z = false;
        }
        textCheckCell2.setEnabled(z);
        final int i2 = 1;
        textCheckCell2.setOnClickListener(new View.OnClickListener(this) {
            public final JoinToSendSettingsView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        JoinToSendSettingsView joinToSendSettingsView = this.f$0;
                        boolean z3 = joinToSendSettingsView.isJoinToSend;
                        boolean z4 = !z3;
                        if (joinToSendSettingsView.onJoinToSendToggle(new JoinToSendSettingsView$$ExternalSyntheticLambda5(joinToSendSettingsView, joinToSendSettingsView.isJoinRequest, z3, 0), z4)) {
                            joinToSendSettingsView.setJoinRequest(false);
                            joinToSendSettingsView.setJoinToSend(z4);
                        }
                        break;
                    default:
                        JoinToSendSettingsView joinToSendSettingsView2 = this.f$0;
                        boolean z5 = joinToSendSettingsView2.isJoinRequest;
                        boolean z6 = !z5;
                        if (joinToSendSettingsView2.onJoinRequestToggle(new JoinToSendSettingsView$$ExternalSyntheticLambda4(joinToSendSettingsView2, z5, 0), z6)) {
                            joinToSendSettingsView2.setJoinRequest(z6);
                        }
                        break;
                }
            }
        });
        addView(textCheckCell2);
        TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context, 12, null);
        this.joinToSendInfoCell = textInfoPrivacyCell;
        textInfoPrivacyCell.setText(LocaleController.getString(R.string.ChannelSettingsJoinToSendInfo));
        addView(textInfoPrivacyCell);
        TextInfoPrivacyCell textInfoPrivacyCell2 = new TextInfoPrivacyCell(context, 12, null);
        this.joinRequestInfoCell = textInfoPrivacyCell2;
        textInfoPrivacyCell2.setText(LocaleController.getString(R.string.ChannelSettingsJoinRequestInfo));
        addView(textInfoPrivacyCell2);
        boolean z3 = this.isJoinToSend;
        this.toggleValue = z3 ? 1.0f : 0.0f;
        textCheckCell2.setVisibility(z3 ? 0 : 8);
        updateToggleValue(this.toggleValue);
    }

    public float getBottomInfoMargin() {
        TextInfoPrivacyCell textInfoPrivacyCell = this.joinToSendInfoCell;
        float alpha = textInfoPrivacyCell.getAlpha() * textInfoPrivacyCell.getHeight();
        TextInfoPrivacyCell textInfoPrivacyCell2 = this.joinRequestInfoCell;
        return (textInfoPrivacyCell2.getAlpha() * textInfoPrivacyCell2.getHeight()) + alpha;
    }

    public abstract boolean onJoinRequestToggle(JoinToSendSettingsView$$ExternalSyntheticLambda4 joinToSendSettingsView$$ExternalSyntheticLambda4, boolean z);

    public boolean onJoinToSendToggle(JoinToSendSettingsView$$ExternalSyntheticLambda5 joinToSendSettingsView$$ExternalSyntheticLambda5, boolean z) {
        return true;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        TextCheckCell textCheckCell = this.joinToSendCell;
        if (textCheckCell.getVisibility() == 0) {
            HeaderCell headerCell = this.joinHeaderCell;
            int i5 = i3 - i;
            int measuredHeight2 = headerCell.getMeasuredHeight();
            headerCell.layout(0, 0, i5, measuredHeight2);
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

    @Override
    public final void onMeasure(int i, int i2) {
        float measuredHeight;
        HeaderCell headerCell = this.joinHeaderCell;
        int i3 = this.MAXSPEC;
        headerCell.measure(i, i3);
        TextCheckCell textCheckCell = this.joinToSendCell;
        textCheckCell.measure(i, i3);
        TextCheckCell textCheckCell2 = this.joinRequestCell;
        textCheckCell2.measure(i, i3);
        TextInfoPrivacyCell textInfoPrivacyCell = this.joinToSendInfoCell;
        textInfoPrivacyCell.measure(i, i3);
        TextInfoPrivacyCell textInfoPrivacyCell2 = this.joinRequestInfoCell;
        textInfoPrivacyCell2.measure(i, i3);
        if (textCheckCell.getVisibility() == 0) {
            measuredHeight = (textCheckCell2.getMeasuredHeight() * this.toggleValue) + textCheckCell.getMeasuredHeight() + headerCell.getMeasuredHeight();
        } else {
            measuredHeight = textCheckCell2.getMeasuredHeight();
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (measuredHeight + AndroidUtilities.lerp(textInfoPrivacyCell.getMeasuredHeight(), textInfoPrivacyCell2.getMeasuredHeight(), this.toggleValue)), 1073741824));
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

    public void setJoinRequest(boolean z) {
        this.isJoinRequest = z;
        this.joinRequestCell.setChecked(z);
    }

    public void setJoinToSend(boolean z) {
        this.isJoinToSend = z;
        TextCheckCell textCheckCell = this.joinToSendCell;
        textCheckCell.setChecked(z);
        textCheckCell.setDivider(this.isJoinToSend);
        TextCheckCell textCheckCell2 = this.joinRequestCell;
        textCheckCell2.setChecked(this.isJoinRequest);
        ValueAnimator valueAnimator = this.toggleAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.toggleValue, this.isJoinToSend ? 1.0f : 0.0f);
        this.toggleAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(200L);
        this.toggleAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.toggleAnimator.addUpdateListener(new ItemOptions$$ExternalSyntheticLambda4(this, 18));
        this.toggleAnimator.addListener(new ItemOptions.AnonymousClass3(this, 5));
        textCheckCell2.setVisibility(0);
        this.toggleAnimator.start();
    }

    public final void updateToggleValue(float f) {
        this.toggleValue = f;
        TextCheckCell textCheckCell = this.joinRequestCell;
        textCheckCell.setAlpha(f);
        float f2 = 1.0f - f;
        textCheckCell.setTranslationY((-AndroidUtilities.dp(16.0f)) * f2);
        textCheckCell.setScaleY(1.0f - (0.1f * f2));
        int iDp = textCheckCell.getMeasuredHeight() <= 0 ? AndroidUtilities.dp(50.0f) : textCheckCell.getMeasuredHeight();
        TextInfoPrivacyCell textInfoPrivacyCell = this.joinToSendInfoCell;
        textInfoPrivacyCell.setAlpha(f2);
        float f3 = (-iDp) * f2;
        textInfoPrivacyCell.setTranslationY(((-AndroidUtilities.dp(4.0f)) * f) + f3);
        TextInfoPrivacyCell textInfoPrivacyCell2 = this.joinRequestInfoCell;
        textInfoPrivacyCell2.setAlpha(f);
        textInfoPrivacyCell2.setTranslationY((AndroidUtilities.dp(4.0f) * f2) + f3);
        requestLayout();
    }
}
