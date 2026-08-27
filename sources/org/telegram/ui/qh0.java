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

public final class qh0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {

    public static final org.telegram.ui.Components.lb0 f41667n;

    public static final org.telegram.ui.Components.lb0 f41668r;

    public final int f41669a;

    public final org.telegram.ui.Components.n9 f41670b;

    public final org.telegram.ui.ActionBar.h5 f41671c;
    public final TextView d;

    public final org.telegram.ui.Components.y8 f41672e;

    public final org.telegram.ui.Components.uv0 f41673f;
    public TLObject h;

    static {
        int i10 = R.drawable.msg_mini_checks;
        int i11 = org.telegram.ui.ActionBar.g6.f23423y6;
        f41667n = new org.telegram.ui.Components.lb0(i10, i11);
        f41668r = new org.telegram.ui.Components.lb0(R.drawable.mini_checklist_done_outline, i11);
    }

    public qh0(Context context) {
        super(context);
        this.f41669a = UserConfig.selectedAccount;
        this.f41672e = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        this.f41670b = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f41671c = h5Var;
        h5Var.setTextSize(16);
        h5Var.setEllipsizeByGradient(!LocaleController.isRTL);
        h5Var.setImportantForAccessibility(2);
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E8, false));
        h5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        this.f41673f = new org.telegram.ui.Components.uv0(this);
        h5Var.setDrawablePadding(AndroidUtilities.dp(3.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 13.0f);
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23423y6, false));
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        if (LocaleController.isRTL) {
            addView(n9Var, h7.z5.d(34, 34.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
            addView(h5Var, h7.z5.d(-2, -2.0f, 53, 8.0f, 5.33f, 55.0f, 0.0f));
            addView(textView, h7.z5.d(-2, -2.0f, 53, 13.0f, 19.0f, 55.0f, 0.0f));
        } else {
            addView(n9Var, h7.z5.d(34, 34.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            addView(h5Var, h7.z5.d(-2, -2.0f, 51, 55.0f, 5.33f, 8.0f, 0.0f));
            addView(textView, h7.z5.d(-2, -2.0f, 51, 55.0f, 19.0f, 13.0f, 0.0f));
        }
    }

    public final void a(TLObject tLObject, boolean z10, int i10) {
        org.telegram.ui.Components.i5 i5VarA;
        this.h = tLObject;
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23444z9, false);
        boolean z11 = tLObject instanceof TLRPC.User;
        org.telegram.ui.Components.uv0 uv0Var = this.f41673f;
        if (z11) {
            i5VarA = uv0Var.a((TLRPC.User) tLObject, null, iW0, false);
        } else {
            i5VarA = tLObject instanceof TLRPC.Chat ? uv0Var.a(null, (TLRPC.Chat) tLObject, iW0, false) : uv0Var.a(null, null, iW0, false);
        }
        org.telegram.ui.ActionBar.h5 h5Var = this.f41671c;
        h5Var.i(i5VarA);
        if (tLObject != null) {
            org.telegram.ui.Components.y8 y8Var = this.f41672e;
            int i11 = this.f41669a;
            y8Var.j(i11, tLObject);
            this.f41670b.h(ImageLocation.getForUserOrChat(i11, tLObject, 1), "50_50", y8Var, tLObject);
            h5Var.l(ContactsController.formatName(tLObject), false);
        }
        TextView textView = this.d;
        if (i10 <= 0) {
            textView.setVisibility(8);
            h5Var.setTranslationY(AndroidUtilities.dp(9.0f));
        } else {
            textView.setText(TextUtils.concat((z10 ? f41668r : f41667n).a(getContext(), null), LocaleController.formatSeenDate(i10)));
            textView.setVisibility(0);
            h5Var.setTranslationY(0.0f);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.userEmojiStatusUpdated) {
            TLRPC.User user = (TLRPC.User) objArr[0];
            TLObject tLObject = this.h;
            TLRPC.User user2 = tLObject instanceof TLRPC.User ? (TLRPC.User) tLObject : null;
            if (user2 == null || user == null || user2.f22527id != user.f22527id) {
                return;
            }
            this.h = user;
            int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23444z9, false);
            boolean z10 = user instanceof TLRPC.User;
            org.telegram.ui.Components.uv0 uv0Var = this.f41673f;
            this.f41671c.i(z10 ? uv0Var.a(user, null, iW0, true) : uv0Var.a(null, null, iW0, true));
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f41673f.f33217a.a();
        NotificationCenter.getInstance(this.f41669a).addObserver(this, NotificationCenter.userEmojiStatusUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f41673f.f33217a.b();
        NotificationCenter.getInstance(this.f41669a).removeObserver(this, NotificationCenter.userEmojiStatusUpdated);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String string = LocaleController.formatString("AccDescrPersonHasSeen", R.string.AccDescrPersonHasSeen, this.f41671c.getText());
        TextView textView = this.d;
        if (textView.getVisibility() == 0) {
            StringBuilder sbF = s3.c.f(string, " ");
            sbF.append((Object) textView.getText());
            string = sbF.toString();
        }
        accessibilityNodeInfo.setText(string);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
