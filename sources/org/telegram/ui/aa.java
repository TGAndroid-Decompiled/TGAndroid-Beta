package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class aa extends org.telegram.ui.ActionBar.p2 {
    public z9 f35095a;
    public z9 f35096b;
    public org.telegram.ui.ActionBar.w0 f35097c;
    public org.telegram.ui.ActionBar.g6 d;

    public static void U(aa aaVar) {
        String str;
        TLRPC.User currentUser = UserConfig.getInstance(aaVar.currentAccount).getCurrentUser();
        if (currentUser != null && aaVar.f35096b.getText() != null && aaVar.f35095a.getText() != null) {
            String obj = aaVar.f35095a.getText().toString();
            String obj2 = aaVar.f35096b.getText().toString();
            String str2 = currentUser.first_name;
            if (str2 == null || !str2.equals(obj) || (str = currentUser.last_name) == null || !str.equals(obj2)) {
                TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                updateprofile.flags = 3;
                updateprofile.first_name = obj;
                currentUser.first_name = obj;
                updateprofile.last_name = obj2;
                currentUser.last_name = obj2;
                TLRPC.User user = MessagesController.getInstance(aaVar.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(aaVar.currentAccount).getClientUserId()));
                if (user != null) {
                    user.first_name = updateprofile.first_name;
                    user.last_name = updateprofile.last_name;
                }
                UserConfig.getInstance(aaVar.currentAccount).saveConfig(true);
                NotificationCenter.getInstance(aaVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                NotificationCenter.getInstance(aaVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
                ConnectionsManager.getInstance(aaVar.currentAccount).sendRequest(updateprofile, new oh.p5(4));
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.k6.f21700f8;
        org.telegram.ui.ActionBar.g6 g6Var = this.d;
        kVar.B(org.telegram.ui.ActionBar.k6.v0(i12, g6Var), false);
        this.actionBar.C(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21983v8, g6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.EditName));
        this.actionBar.setActionBarMenuOnItemClick(new fg.l1(this, 13));
        this.f35097c = this.actionBar.n().h(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ((LinearLayout) this.fragmentView).setOrientation(1);
        this.fragmentView.setOnTouchListener(new org.telegram.ui.ActionBar.s2(1));
        z9 z9Var = new z9(this, context, 0);
        this.f35095a = z9Var;
        z9Var.setTextSize(1, 18.0f);
        z9 z9Var2 = this.f35095a;
        int i13 = org.telegram.ui.ActionBar.k6.H6;
        z9Var2.setHintTextColor(org.telegram.ui.ActionBar.k6.v0(i13, g6Var));
        z9 z9Var3 = this.f35095a;
        int i14 = org.telegram.ui.ActionBar.k6.G6;
        z9Var3.setTextColor(org.telegram.ui.ActionBar.k6.v0(i14, g6Var));
        this.f35095a.setBackgroundDrawable(null);
        z9 z9Var4 = this.f35095a;
        int i15 = org.telegram.ui.ActionBar.k6.f21787k6;
        int themedColor = getThemedColor(i15);
        int i16 = org.telegram.ui.ActionBar.k6.f21805l6;
        int themedColor2 = getThemedColor(i16);
        int i17 = org.telegram.ui.ActionBar.k6.f21878p7;
        z9Var4.setLineColors(themedColor, themedColor2, getThemedColor(i17));
        this.f35095a.setMaxLines(1);
        this.f35095a.setLines(1);
        this.f35095a.setSingleLine(true);
        z9 z9Var5 = this.f35095a;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        z9Var5.setGravity(i10);
        this.f35095a.setInputType(49152);
        this.f35095a.setImeOptions(5);
        this.f35095a.setHint(LocaleController.getString(R.string.FirstName));
        this.f35095a.setCursorColor(org.telegram.ui.ActionBar.k6.v0(i14, g6Var));
        this.f35095a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f35095a.setCursorWidth(1.5f);
        linearLayout.addView(this.f35095a, k7.c6.k(24.0f, 24.0f, 24.0f, 0.0f, -1, 36));
        this.f35095a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final aa f43579b;

            {
                this.f43579b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i18, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i18 == 5) {
                            aa aaVar = this.f43579b;
                            aaVar.f35096b.requestFocus();
                            z9 z9Var6 = aaVar.f35096b;
                            z9Var6.setSelection(z9Var6.length());
                            return true;
                        }
                        return false;
                    default:
                        if (i18 == 6) {
                            this.f43579b.f35097c.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        z9 z9Var6 = new z9(this, context, 1);
        this.f35096b = z9Var6;
        z9Var6.setTextSize(1, 18.0f);
        this.f35096b.setHintTextColor(org.telegram.ui.ActionBar.k6.v0(i13, g6Var));
        this.f35096b.setTextColor(org.telegram.ui.ActionBar.k6.v0(i14, g6Var));
        this.f35096b.setBackgroundDrawable(null);
        this.f35096b.setLineColors(getThemedColor(i15), getThemedColor(i16), getThemedColor(i17));
        this.f35096b.setMaxLines(1);
        this.f35096b.setLines(1);
        this.f35096b.setSingleLine(true);
        z9 z9Var7 = this.f35096b;
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        z9Var7.setGravity(i11);
        this.f35096b.setInputType(49152);
        this.f35096b.setImeOptions(6);
        this.f35096b.setHint(LocaleController.getString(R.string.LastName));
        this.f35096b.setCursorColor(org.telegram.ui.ActionBar.k6.v0(i14, g6Var));
        this.f35096b.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f35096b.setCursorWidth(1.5f);
        linearLayout.addView(this.f35096b, k7.c6.k(24.0f, 16.0f, 24.0f, 0.0f, -1, 36));
        this.f35096b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final aa f43579b;

            {
                this.f43579b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i18, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i18 == 5) {
                            aa aaVar = this.f43579b;
                            aaVar.f35096b.requestFocus();
                            z9 z9Var62 = aaVar.f35096b;
                            z9Var62.setSelection(z9Var62.length());
                            return true;
                        }
                        return false;
                    default:
                        if (i18 == 6) {
                            this.f43579b.f35097c.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        if (user != null) {
            this.f35095a.setText(user.first_name);
            z9 z9Var8 = this.f35095a;
            z9Var8.setSelection(z9Var8.length());
            this.f35096b.setText(user.last_name);
        }
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.ActionBar.g6 getResourceProvider() {
        return this.d;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21661d6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21932s8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.f21983v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.f21948t8));
        z9 z9Var = this.f35095a;
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(z9Var, 4, null, null, null, null, i10));
        z9 z9Var2 = this.f35095a;
        int i11 = org.telegram.ui.ActionBar.k6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(z9Var2, 8388608, null, null, null, null, i11));
        z9 z9Var3 = this.f35095a;
        int i12 = org.telegram.ui.ActionBar.k6.f21787k6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(z9Var3, 32, null, null, null, null, i12));
        z9 z9Var4 = this.f35095a;
        int i13 = org.telegram.ui.ActionBar.k6.f21805l6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(z9Var4, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f35096b, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f35096b, 8388608, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f35096b, 32, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f35096b, 65568, null, null, null, null, i13));
        return arrayList;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (!MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
            this.f35095a.requestFocus();
            AndroidUtilities.showKeyboard(this.f35095a);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (z4) {
            AndroidUtilities.runOnUIThread(new yt0(this, 18), 100L);
        }
    }
}
