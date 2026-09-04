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
public final class fi0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final org.telegram.ui.Components.bc0 f36409n;
    public static final org.telegram.ui.Components.bc0 f36410r;
    public final int f36411a;
    public final org.telegram.ui.Components.x9 f36412b;
    public final org.telegram.ui.ActionBar.j5 f36413c;
    public final TextView d;
    public final org.telegram.ui.Components.i9 f36414e;
    public final org.telegram.ui.Components.jw0 f36415f;
    public TLObject h;

    static {
        int i10 = R.drawable.msg_mini_checks;
        int i11 = org.telegram.ui.ActionBar.j6.f21042y6;
        f36409n = new org.telegram.ui.Components.bc0(i10, i11);
        f36410r = new org.telegram.ui.Components.bc0(R.drawable.mini_checklist_done_outline, i11);
    }

    public fi0(Context context) {
        super(context);
        int i10;
        this.f36411a = UserConfig.selectedAccount;
        this.f36414e = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
        org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(context);
        this.f36412b = x9Var;
        x9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f36413c = j5Var;
        j5Var.setTextSize(16);
        j5Var.setEllipsizeByGradient(!LocaleController.isRTL);
        j5Var.setImportantForAccessibility(2);
        j5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        j5Var.setGravity(i10);
        this.f36415f = new org.telegram.ui.Components.jw0(this);
        j5Var.setDrawablePadding(AndroidUtilities.dp(3.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 13.0f);
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f21042y6, false));
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        if (LocaleController.isRTL) {
            addView(x9Var, w7.x5.d(34, 34.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
            addView(j5Var, w7.x5.d(-2, -2.0f, 53, 8.0f, 5.33f, 55.0f, 0.0f));
            addView(textView, w7.x5.d(-2, -2.0f, 53, 13.0f, 19.0f, 55.0f, 0.0f));
            return;
        }
        addView(x9Var, w7.x5.d(34, 34.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        addView(j5Var, w7.x5.d(-2, -2.0f, 51, 55.0f, 5.33f, 8.0f, 0.0f));
        addView(textView, w7.x5.d(-2, -2.0f, 51, 55.0f, 19.0f, 13.0f, 0.0f));
    }

    public final void a(TLObject tLObject, boolean z10, int i10) {
        org.telegram.ui.Components.o5 a2;
        org.telegram.ui.Components.bc0 bc0Var;
        this.h = tLObject;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f21064z9, false);
        boolean z11 = tLObject instanceof TLRPC.User;
        org.telegram.ui.Components.jw0 jw0Var = this.f36415f;
        if (z11) {
            a2 = jw0Var.a((TLRPC.User) tLObject, null, w02, false);
        } else if (tLObject instanceof TLRPC.Chat) {
            a2 = jw0Var.a(null, (TLRPC.Chat) tLObject, w02, false);
        } else {
            a2 = jw0Var.a(null, null, w02, false);
        }
        org.telegram.ui.ActionBar.j5 j5Var = this.f36413c;
        j5Var.i(a2);
        if (tLObject != null) {
            org.telegram.ui.Components.i9 i9Var = this.f36414e;
            int i11 = this.f36411a;
            i9Var.j(i11, tLObject);
            this.f36412b.h(ImageLocation.getForUserOrChat(i11, tLObject, 1), "50_50", i9Var, tLObject);
            j5Var.l(ContactsController.formatName(tLObject), false);
        }
        TextView textView = this.d;
        if (i10 <= 0) {
            textView.setVisibility(8);
            j5Var.setTranslationY(AndroidUtilities.dp(9.0f));
            return;
        }
        if (z10) {
            bc0Var = f36410r;
        } else {
            bc0Var = f36409n;
        }
        textView.setText(TextUtils.concat(bc0Var.a(getContext(), null), LocaleController.formatSeenDate(i10)));
        textView.setVisibility(0);
        j5Var.setTranslationY(0.0f);
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
            if (user != null && user2 != null && user.f20016id == user2.f20016id) {
                this.h = user2;
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f21064z9, false);
                boolean z10 = user2 instanceof TLRPC.User;
                org.telegram.ui.Components.jw0 jw0Var = this.f36415f;
                if (z10) {
                    a2 = jw0Var.a(user2, null, w02, true);
                } else {
                    a2 = jw0Var.a(null, null, w02, true);
                }
                this.f36413c.i(a2);
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f36415f.f27580a.a();
        NotificationCenter.getInstance(this.f36411a).addObserver(this, NotificationCenter.userEmojiStatusUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f36415f.f27580a.b();
        NotificationCenter.getInstance(this.f36411a).removeObserver(this, NotificationCenter.userEmojiStatusUpdated);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String formatString = LocaleController.formatString("AccDescrPersonHasSeen", R.string.AccDescrPersonHasSeen, this.f36413c.getText());
        TextView textView = this.d;
        if (textView.getVisibility() == 0) {
            StringBuilder g10 = w.f.g(formatString, " ");
            g10.append((Object) textView.getText());
            formatString = g10.toString();
        }
        accessibilityNodeInfo.setText(formatString);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
