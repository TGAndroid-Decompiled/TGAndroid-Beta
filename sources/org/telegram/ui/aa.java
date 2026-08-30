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
    public z9 f32497a;
    public z9 f32498b;
    public org.telegram.ui.ActionBar.w0 f32499c;
    public org.telegram.ui.ActionBar.f6 d;

    public static void U(aa aaVar) {
        String str;
        TLRPC.User currentUser = UserConfig.getInstance(aaVar.currentAccount).getCurrentUser();
        if (currentUser != null && aaVar.f32498b.getText() != null && aaVar.f32497a.getText() != null) {
            String obj = aaVar.f32497a.getText().toString();
            String obj2 = aaVar.f32498b.getText().toString();
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
                ConnectionsManager.getInstance(aaVar.currentAccount).sendRequest(updateprofile, new nh.p5(4));
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.j6.f19944f8;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        kVar.B(org.telegram.ui.ActionBar.j6.v0(i12, f6Var), false);
        this.actionBar.C(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20227v8, f6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.EditName));
        this.actionBar.setActionBarMenuOnItemClick(new eg.m1(this, 13));
        this.f32499c = this.actionBar.n().h(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ((LinearLayout) this.fragmentView).setOrientation(1);
        this.fragmentView.setOnTouchListener(new oh.d(2));
        z9 z9Var = new z9(this, context, 0);
        this.f32497a = z9Var;
        z9Var.setTextSize(1, 18.0f);
        z9 z9Var2 = this.f32497a;
        int i13 = org.telegram.ui.ActionBar.j6.H6;
        z9Var2.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
        z9 z9Var3 = this.f32497a;
        int i14 = org.telegram.ui.ActionBar.j6.G6;
        z9Var3.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
        this.f32497a.setBackgroundDrawable(null);
        z9 z9Var4 = this.f32497a;
        int i15 = org.telegram.ui.ActionBar.j6.f20031k6;
        int themedColor = getThemedColor(i15);
        int i16 = org.telegram.ui.ActionBar.j6.f20049l6;
        int themedColor2 = getThemedColor(i16);
        int i17 = org.telegram.ui.ActionBar.j6.f20122p7;
        z9Var4.setLineColors(themedColor, themedColor2, getThemedColor(i17));
        this.f32497a.setMaxLines(1);
        this.f32497a.setLines(1);
        this.f32497a.setSingleLine(true);
        z9 z9Var5 = this.f32497a;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        z9Var5.setGravity(i10);
        this.f32497a.setInputType(49152);
        this.f32497a.setImeOptions(5);
        this.f32497a.setHint(LocaleController.getString(R.string.FirstName));
        this.f32497a.setCursorColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
        this.f32497a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f32497a.setCursorWidth(1.5f);
        linearLayout.addView(this.f32497a, k7.b6.k(24.0f, 24.0f, 24.0f, 0.0f, -1, 36));
        this.f32497a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final aa f40451b;

            {
                this.f40451b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i18, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i18 == 5) {
                            aa aaVar = this.f40451b;
                            aaVar.f32498b.requestFocus();
                            z9 z9Var6 = aaVar.f32498b;
                            z9Var6.setSelection(z9Var6.length());
                            return true;
                        }
                        return false;
                    default:
                        if (i18 == 6) {
                            this.f40451b.f32499c.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        z9 z9Var6 = new z9(this, context, 1);
        this.f32498b = z9Var6;
        z9Var6.setTextSize(1, 18.0f);
        this.f32498b.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
        this.f32498b.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
        this.f32498b.setBackgroundDrawable(null);
        this.f32498b.setLineColors(getThemedColor(i15), getThemedColor(i16), getThemedColor(i17));
        this.f32498b.setMaxLines(1);
        this.f32498b.setLines(1);
        this.f32498b.setSingleLine(true);
        z9 z9Var7 = this.f32498b;
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        z9Var7.setGravity(i11);
        this.f32498b.setInputType(49152);
        this.f32498b.setImeOptions(6);
        this.f32498b.setHint(LocaleController.getString(R.string.LastName));
        this.f32498b.setCursorColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
        this.f32498b.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f32498b.setCursorWidth(1.5f);
        linearLayout.addView(this.f32498b, k7.b6.k(24.0f, 16.0f, 24.0f, 0.0f, -1, 36));
        this.f32498b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final aa f40451b;

            {
                this.f40451b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i18, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i18 == 5) {
                            aa aaVar = this.f40451b;
                            aaVar.f32498b.requestFocus();
                            z9 z9Var62 = aaVar.f32498b;
                            z9Var62.setSelection(z9Var62.length());
                            return true;
                        }
                        return false;
                    default:
                        if (i18 == 6) {
                            this.f40451b.f32499c.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        if (user != null) {
            this.f32497a.setText(user.first_name);
            z9 z9Var8 = this.f32497a;
            z9Var8.setSelection(z9Var8.length());
            this.f32498b.setText(user.last_name);
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
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19906d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f20176s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20227v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20192t8));
        z9 z9Var = this.f32497a;
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(z9Var, 4, null, null, null, null, i10));
        z9 z9Var2 = this.f32497a;
        int i11 = org.telegram.ui.ActionBar.j6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(z9Var2, 8388608, null, null, null, null, i11));
        z9 z9Var3 = this.f32497a;
        int i12 = org.telegram.ui.ActionBar.j6.f20031k6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(z9Var3, 32, null, null, null, null, i12));
        z9 z9Var4 = this.f32497a;
        int i13 = org.telegram.ui.ActionBar.j6.f20049l6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(z9Var4, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32498b, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32498b, 8388608, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32498b, 32, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32498b, 65568, null, null, null, null, i13));
        return arrayList;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (!MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
            this.f32497a.requestFocus();
            AndroidUtilities.showKeyboard(this.f32497a);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (z4) {
            AndroidUtilities.runOnUIThread(new rt0(this, 18), 100L);
        }
    }
}
