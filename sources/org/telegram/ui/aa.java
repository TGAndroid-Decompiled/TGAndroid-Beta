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
public final class aa extends org.telegram.ui.ActionBar.n2 {
    public z9 f32037a;
    public z9 f32038b;
    public org.telegram.ui.ActionBar.v0 f32039c;
    public org.telegram.ui.ActionBar.f6 d;

    public static void U(aa aaVar) {
        String str;
        TLRPC.User currentUser = UserConfig.getInstance(aaVar.currentAccount).getCurrentUser();
        if (currentUser != null && aaVar.f32038b.getText() != null && aaVar.f32037a.getText() != null) {
            String obj = aaVar.f32037a.getText().toString();
            String obj2 = aaVar.f32038b.getText().toString();
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
                ConnectionsManager.getInstance(aaVar.currentAccount).sendRequest(updateprofile, new ai.t7(8));
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.j6.f19146f8;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        kVar.A(org.telegram.ui.ActionBar.j6.v0(i12, f6Var), false);
        this.actionBar.B(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19442v8, f6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.EditName));
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 26));
        this.f32039c = this.actionBar.n().h(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ((LinearLayout) this.fragmentView).setOrientation(1);
        this.fragmentView.setOnTouchListener(new bi.d(2));
        z9 z9Var = new z9(this, context, 0);
        this.f32037a = z9Var;
        z9Var.setTextSize(1, 18.0f);
        z9 z9Var2 = this.f32037a;
        int i13 = org.telegram.ui.ActionBar.j6.H6;
        z9Var2.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
        z9 z9Var3 = this.f32037a;
        int i14 = org.telegram.ui.ActionBar.j6.G6;
        z9Var3.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
        this.f32037a.setBackgroundDrawable(null);
        z9 z9Var4 = this.f32037a;
        int i15 = org.telegram.ui.ActionBar.j6.f19237k6;
        int themedColor = getThemedColor(i15);
        int i16 = org.telegram.ui.ActionBar.j6.f19255l6;
        int themedColor2 = getThemedColor(i16);
        int i17 = org.telegram.ui.ActionBar.j6.f19330p7;
        z9Var4.setLineColors(themedColor, themedColor2, getThemedColor(i17));
        this.f32037a.setMaxLines(1);
        this.f32037a.setLines(1);
        this.f32037a.setSingleLine(true);
        z9 z9Var5 = this.f32037a;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        z9Var5.setGravity(i10);
        this.f32037a.setInputType(49152);
        this.f32037a.setImeOptions(5);
        this.f32037a.setHint(LocaleController.getString(R.string.FirstName));
        this.f32037a.setCursorColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
        this.f32037a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f32037a.setCursorWidth(1.5f);
        linearLayout.addView(this.f32037a, w7.y5.k(24.0f, 24.0f, 24.0f, 0.0f, -1, 36));
        this.f32037a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final aa f39855b;

            {
                this.f39855b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i18, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i18 == 5) {
                            aa aaVar = this.f39855b;
                            aaVar.f32038b.requestFocus();
                            z9 z9Var6 = aaVar.f32038b;
                            z9Var6.setSelection(z9Var6.length());
                            return true;
                        }
                        return false;
                    default:
                        if (i18 == 6) {
                            this.f39855b.f32039c.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        z9 z9Var6 = new z9(this, context, 1);
        this.f32038b = z9Var6;
        z9Var6.setTextSize(1, 18.0f);
        this.f32038b.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
        this.f32038b.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
        this.f32038b.setBackgroundDrawable(null);
        this.f32038b.setLineColors(getThemedColor(i15), getThemedColor(i16), getThemedColor(i17));
        this.f32038b.setMaxLines(1);
        this.f32038b.setLines(1);
        this.f32038b.setSingleLine(true);
        z9 z9Var7 = this.f32038b;
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        z9Var7.setGravity(i11);
        this.f32038b.setInputType(49152);
        this.f32038b.setImeOptions(6);
        this.f32038b.setHint(LocaleController.getString(R.string.LastName));
        this.f32038b.setCursorColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
        this.f32038b.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f32038b.setCursorWidth(1.5f);
        linearLayout.addView(this.f32038b, w7.y5.k(24.0f, 16.0f, 24.0f, 0.0f, -1, 36));
        this.f32038b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final aa f39855b;

            {
                this.f39855b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i18, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i18 == 5) {
                            aa aaVar = this.f39855b;
                            aaVar.f32038b.requestFocus();
                            z9 z9Var62 = aaVar.f32038b;
                            z9Var62.setSelection(z9Var62.length());
                            return true;
                        }
                        return false;
                    default:
                        if (i18 == 6) {
                            this.f39855b.f32039c.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        if (user != null) {
            this.f32037a.setText(user.first_name);
            z9 z9Var8 = this.f32037a;
            z9Var8.setSelection(z9Var8.length());
            this.f32038b.setText(user.last_name);
        }
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        return this.d;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19109d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19387s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f19442v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f19406t8));
        z9 z9Var = this.f32037a;
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(z9Var, 4, null, null, null, null, i10));
        z9 z9Var2 = this.f32037a;
        int i11 = org.telegram.ui.ActionBar.j6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(z9Var2, 8388608, null, null, null, null, i11));
        z9 z9Var3 = this.f32037a;
        int i12 = org.telegram.ui.ActionBar.j6.f19237k6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(z9Var3, 32, null, null, null, null, i12));
        z9 z9Var4 = this.f32037a;
        int i13 = org.telegram.ui.ActionBar.j6.f19255l6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(z9Var4, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32038b, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32038b, 8388608, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32038b, 32, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32038b, 65568, null, null, null, null, i13));
        return arrayList;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (!MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
            this.f32037a.requestFocus();
            AndroidUtilities.showKeyboard(this.f32037a);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new mu0(this, 18), 100L);
        }
    }
}
