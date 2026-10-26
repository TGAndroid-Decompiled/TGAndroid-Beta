package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class da extends org.telegram.ui.ActionBar.r2 {
    public ca f38805a;
    public ca f38806b;
    public org.telegram.ui.ActionBar.w0 f38807c;
    public org.telegram.ui.ActionBar.u6 d;

    public static void V(da daVar) {
        String str;
        TLRPC.User currentUser = UserConfig.getInstance(daVar.currentAccount).getCurrentUser();
        if (currentUser != null && daVar.f38806b.getText() != null && daVar.f38805a.getText() != null) {
            String obj = daVar.f38805a.getText().toString();
            String obj2 = daVar.f38806b.getText().toString();
            String str2 = currentUser.first_name;
            if (str2 == null || !str2.equals(obj) || (str = currentUser.last_name) == null || !str.equals(obj2)) {
                TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                updateprofile.flags = 3;
                updateprofile.first_name = obj;
                currentUser.first_name = obj;
                updateprofile.last_name = obj2;
                currentUser.last_name = obj2;
                TLRPC.User user = MessagesController.getInstance(daVar.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(daVar.currentAccount).getClientUserId()));
                if (user != null) {
                    user.first_name = updateprofile.first_name;
                    user.last_name = updateprofile.last_name;
                }
                UserConfig.getInstance(daVar.currentAccount).saveConfig(true);
                NotificationCenter.getInstance(daVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                NotificationCenter.getInstance(daVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
                ConnectionsManager.getInstance(daVar.currentAccount).sendRequest(updateprofile, new di.d6(8));
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23656t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23636s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23356d6));
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.u6 u6Var = this.d;
        org.telegram.ui.ActionBar.f7.m(this.actionBar, 3, org.telegram.ui.ActionBar.y6.f23394f8, u6Var);
        org.telegram.ui.ActionBar.f7.m(this.actionBar, 1, org.telegram.ui.ActionBar.y6.f23694v8, u6Var);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.EditName));
        this.actionBar.setActionBarMenuOnItemClick(new bh.m(this, 29));
        this.f38807c = this.actionBar.l().h(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ((LinearLayout) this.fragmentView).setOrientation(1);
        this.fragmentView.setOnTouchListener(new ei.d(2));
        ca caVar = new ca(this, context, 0);
        this.f38805a = caVar;
        caVar.setTextSize(1, 18.0f);
        ca caVar2 = this.f38805a;
        int i12 = org.telegram.ui.ActionBar.y6.H6;
        org.telegram.ui.ActionBar.f7.E(caVar2, i12, u6Var);
        ca caVar3 = this.f38805a;
        int i13 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.V(caVar3, i13, u6Var);
        this.f38805a.setBackgroundDrawable(null);
        ca caVar4 = this.f38805a;
        int i14 = org.telegram.ui.ActionBar.y6.f23484k6;
        int i15 = org.telegram.ui.ActionBar.y6.f23502l6;
        int i16 = org.telegram.ui.ActionBar.y6.f23581p7;
        org.telegram.ui.ActionBar.f7.G(caVar4, i14, i15, i16, u6Var);
        this.f38805a.setMaxLines(1);
        this.f38805a.setLines(1);
        this.f38805a.setSingleLine(true);
        ca caVar5 = this.f38805a;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        caVar5.setGravity(i10);
        this.f38805a.setInputType(49152);
        this.f38805a.setImeOptions(5);
        this.f38805a.setHint(LocaleController.getString(R.string.FirstName));
        org.telegram.ui.ActionBar.f7.w(this.f38805a, i13, u6Var);
        this.f38805a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f38805a.setCursorWidth(1.5f);
        linearLayout.addView(this.f38805a, org.telegram.ui.Components.gb1.o(24.0f, 24.0f, 24.0f, 0.0f, -1, 36));
        this.f38805a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final da f38022b;

            {
                this.f38022b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i17, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i17 == 5) {
                            da daVar = this.f38022b;
                            daVar.f38806b.requestFocus();
                            ca caVar6 = daVar.f38806b;
                            caVar6.setSelection(caVar6.length());
                            return true;
                        }
                        return false;
                    default:
                        if (i17 == 6) {
                            this.f38022b.f38807c.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        ca caVar6 = new ca(this, context, 1);
        this.f38806b = caVar6;
        caVar6.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.f7.E(this.f38806b, i12, u6Var);
        org.telegram.ui.ActionBar.f7.V(this.f38806b, i13, u6Var);
        this.f38806b.setBackgroundDrawable(null);
        org.telegram.ui.ActionBar.f7.G(this.f38806b, i14, i15, i16, u6Var);
        this.f38806b.setMaxLines(1);
        this.f38806b.setLines(1);
        this.f38806b.setSingleLine(true);
        ca caVar7 = this.f38806b;
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        caVar7.setGravity(i11);
        this.f38806b.setInputType(49152);
        this.f38806b.setImeOptions(6);
        this.f38806b.setHint(LocaleController.getString(R.string.LastName));
        org.telegram.ui.ActionBar.f7.w(this.f38806b, i13, u6Var);
        this.f38806b.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f38806b.setCursorWidth(1.5f);
        linearLayout.addView(this.f38806b, org.telegram.ui.Components.gb1.o(24.0f, 16.0f, 24.0f, 0.0f, -1, 36));
        this.f38806b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final da f38022b;

            {
                this.f38022b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i17, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i17 == 5) {
                            da daVar = this.f38022b;
                            daVar.f38806b.requestFocus();
                            ca caVar62 = daVar.f38806b;
                            caVar62.setSelection(caVar62.length());
                            return true;
                        }
                        return false;
                    default:
                        if (i17 == 6) {
                            this.f38022b.f38807c.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        if (user != null) {
            this.f38805a.setText(user.first_name);
            ca caVar8 = this.f38805a;
            caVar8.setSelection(caVar8.length());
            this.f38806b.setText(user.last_name);
        }
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.ActionBar.u6 getResourceProvider() {
        return this.d;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        ca caVar = this.f38805a;
        int i10 = org.telegram.ui.ActionBar.y6.f23484k6;
        arrayList.add(new org.telegram.ui.ActionBar.h7(caVar, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        ca caVar2 = this.f38805a;
        int i11 = org.telegram.ui.ActionBar.y6.f23502l6;
        arrayList.add(new org.telegram.ui.ActionBar.h7(caVar2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f38806b, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f38806b, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        return arrayList;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (!MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
            this.f38805a.requestFocus();
            AndroidUtilities.showKeyboard(this.f38805a);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new zt0(this, 18), 100L);
        }
    }
}
