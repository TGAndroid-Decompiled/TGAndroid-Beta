package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ci0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final org.telegram.ui.Components.oc0 f35477n;
    public static final org.telegram.ui.Components.oc0 f35478r;
    public final int f35479a;
    public final org.telegram.ui.Components.w9 f35480b;
    public final org.telegram.ui.ActionBar.i5 f35481c;
    public final TextView d;
    public final org.telegram.ui.Components.h9 f35482e;
    public final org.telegram.ui.Components.gx0 f35483f;
    public TLObject h;

    static {
        int i10 = R.drawable.msg_mini_checks;
        int i11 = org.telegram.ui.ActionBar.i6.f21204y6;
        f35477n = new org.telegram.ui.Components.oc0(i10, i11);
        f35478r = new org.telegram.ui.Components.oc0(R.drawable.mini_checklist_done_outline, i11);
    }

    public ci0(Context context) {
        super(context);
        int i10;
        this.f35479a = UserConfig.selectedAccount;
        this.f35482e = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f35480b = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
        org.telegram.ui.ActionBar.i5 i5Var = new org.telegram.ui.ActionBar.i5(context);
        this.f35481c = i5Var;
        i5Var.setTextSize(16);
        i5Var.setEllipsizeByGradient(!LocaleController.isRTL);
        i5Var.setImportantForAccessibility(2);
        i5Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.E8, false));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        i5Var.setGravity(i10);
        this.f35483f = new org.telegram.ui.Components.gx0(this);
        i5Var.setDrawablePadding(AndroidUtilities.dp(3.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 13.0f);
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21204y6, false));
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        if (LocaleController.isRTL) {
            addView(w9Var, w7.z5.d(34, 34.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
            addView(i5Var, w7.z5.d(-2, -2.0f, 53, 8.0f, 5.33f, 55.0f, 0.0f));
            addView(textView, w7.z5.d(-2, -2.0f, 53, 13.0f, 19.0f, 55.0f, 0.0f));
            return;
        }
        addView(w9Var, w7.z5.d(34, 34.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        addView(i5Var, w7.z5.d(-2, -2.0f, 51, 55.0f, 5.33f, 8.0f, 0.0f));
        addView(textView, w7.z5.d(-2, -2.0f, 51, 55.0f, 19.0f, 13.0f, 0.0f));
    }

    public final void a(TLObject tLObject, boolean z10, int i10) {
        org.telegram.ui.Components.o5 a2;
        org.telegram.ui.Components.oc0 oc0Var;
        this.h = tLObject;
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21226z9, false);
        boolean z11 = tLObject instanceof TLRPC.User;
        org.telegram.ui.Components.gx0 gx0Var = this.f35483f;
        if (z11) {
            a2 = gx0Var.a((TLRPC.User) tLObject, null, w02, false);
        } else if (tLObject instanceof TLRPC.Chat) {
            a2 = gx0Var.a(null, (TLRPC.Chat) tLObject, w02, false);
        } else {
            a2 = gx0Var.a(null, null, w02, false);
        }
        org.telegram.ui.ActionBar.i5 i5Var = this.f35481c;
        i5Var.i(a2);
        if (tLObject != null) {
            org.telegram.ui.Components.h9 h9Var = this.f35482e;
            int i11 = this.f35479a;
            h9Var.j(i11, tLObject);
            this.f35480b.h(ImageLocation.getForUserOrChat(i11, tLObject, 1), "50_50", h9Var, tLObject);
            i5Var.l(ContactsController.formatName(tLObject), false);
        }
        TextView textView = this.d;
        if (i10 <= 0) {
            textView.setVisibility(8);
            i5Var.setTranslationY(AndroidUtilities.dp(9.0f));
            return;
        }
        if (z10) {
            oc0Var = f35478r;
        } else {
            oc0Var = f35477n;
        }
        textView.setText(TextUtils.concat(oc0Var.a(getContext(), null), LocaleController.formatSeenDate(i10)));
        textView.setVisibility(0);
        i5Var.setTranslationY(0.0f);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.User user;
        org.telegram.ui.Components.o5 a2;
        if (i10 == NotificationCenter.userEmojiStatusUpdated) {
            TLRPC.User user2 = (TLRPC.User) objArr[0];
            TLObject tLObject = this.h;
            if (tLObject instanceof TLRPC.User) {
                user = (TLRPC.User) tLObject;
            } else {
                user = null;
            }
            if (user != null && user2 != null && user.f20184id == user2.f20184id) {
                this.h = user2;
                int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21226z9, false);
                boolean z10 = user2 instanceof TLRPC.User;
                org.telegram.ui.Components.gx0 gx0Var = this.f35483f;
                if (z10) {
                    a2 = gx0Var.a(user2, null, w02, true);
                } else {
                    a2 = gx0Var.a(null, null, w02, true);
                }
                this.f35481c.i(a2);
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f35483f.f26942a.a();
        NotificationCenter.getInstance(this.f35479a).addObserver(this, NotificationCenter.userEmojiStatusUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f35483f.f26942a.b();
        NotificationCenter.getInstance(this.f35479a).removeObserver(this, NotificationCenter.userEmojiStatusUpdated);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String formatString = LocaleController.formatString("AccDescrPersonHasSeen", R.string.AccDescrPersonHasSeen, this.f35481c.getText());
        TextView textView = this.d;
        if (textView.getVisibility() == 0) {
            StringBuilder j3 = t8.b.j(formatString, " ");
            j3.append((Object) textView.getText());
            formatString = j3.toString();
        }
        accessibilityNodeInfo.setText(formatString);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
