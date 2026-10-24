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
public final class ba extends org.telegram.ui.ActionBar.o2 {
    public aa f35975a;
    public aa f35976b;
    public org.telegram.ui.ActionBar.u0 f35977c;
    public org.telegram.ui.ActionBar.g6 d;

    public static void U(ba baVar) {
        String str;
        TLRPC.User currentUser = UserConfig.getInstance(baVar.currentAccount).getCurrentUser();
        if (currentUser != null && baVar.f35976b.getText() != null && baVar.f35975a.getText() != null) {
            String obj = baVar.f35975a.getText().toString();
            String obj2 = baVar.f35976b.getText().toString();
            String str2 = currentUser.first_name;
            if (str2 == null || !str2.equals(obj) || (str = currentUser.last_name) == null || !str.equals(obj2)) {
                TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                updateprofile.flags = 3;
                updateprofile.first_name = obj;
                currentUser.first_name = obj;
                updateprofile.last_name = obj2;
                currentUser.last_name = obj2;
                TLRPC.User user = MessagesController.getInstance(baVar.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(baVar.currentAccount).getClientUserId()));
                if (user != null) {
                    user.first_name = updateprofile.first_name;
                    user.last_name = updateprofile.last_name;
                }
                UserConfig.getInstance(baVar.currentAccount).saveConfig(true);
                NotificationCenter.getInstance(baVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                NotificationCenter.getInstance(baVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
                ConnectionsManager.getInstance(baVar.currentAccount).sendRequest(updateprofile, new ci.d6(8));
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21482t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21463s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21184d6));
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.g6 g6Var = this.d;
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 3, org.telegram.ui.ActionBar.k6.f21221f8, g6Var);
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 1, org.telegram.ui.ActionBar.k6.f21519v8, g6Var);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.EditName));
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 29));
        this.f35977c = this.actionBar.m().h(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ((LinearLayout) this.fragmentView).setOrientation(1);
        this.fragmentView.setOnTouchListener(new di.d(2));
        aa aaVar = new aa(this, context, 0);
        this.f35975a = aaVar;
        aaVar.setTextSize(1, 18.0f);
        aa aaVar2 = this.f35975a;
        int i12 = org.telegram.ui.ActionBar.k6.H6;
        org.telegram.ui.ActionBar.r6.F(aaVar2, i12, g6Var);
        aa aaVar3 = this.f35975a;
        int i13 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.W(aaVar3, i13, g6Var);
        this.f35975a.setBackgroundDrawable(null);
        aa aaVar4 = this.f35975a;
        int i14 = org.telegram.ui.ActionBar.k6.f21311k6;
        int i15 = org.telegram.ui.ActionBar.k6.f21328l6;
        int i16 = org.telegram.ui.ActionBar.k6.f21405p7;
        org.telegram.ui.ActionBar.r6.H(aaVar4, i14, i15, i16, g6Var);
        this.f35975a.setMaxLines(1);
        this.f35975a.setLines(1);
        this.f35975a.setSingleLine(true);
        aa aaVar5 = this.f35975a;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        aaVar5.setGravity(i10);
        this.f35975a.setInputType(49152);
        this.f35975a.setImeOptions(5);
        this.f35975a.setHint(LocaleController.getString(R.string.FirstName));
        org.telegram.ui.ActionBar.r6.x(this.f35975a, i13, g6Var);
        this.f35975a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f35975a.setCursorWidth(1.5f);
        linearLayout.addView(this.f35975a, w7.z5.k(24.0f, 24.0f, 24.0f, 0.0f, -1, 36));
        this.f35975a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ba f44040b;

            {
                this.f44040b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i17, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i17 == 5) {
                            ba baVar = this.f44040b;
                            baVar.f35976b.requestFocus();
                            aa aaVar6 = baVar.f35976b;
                            aaVar6.setSelection(aaVar6.length());
                            return true;
                        }
                        return false;
                    default:
                        if (i17 == 6) {
                            this.f44040b.f35977c.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        aa aaVar6 = new aa(this, context, 1);
        this.f35976b = aaVar6;
        aaVar6.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.r6.F(this.f35976b, i12, g6Var);
        org.telegram.ui.ActionBar.r6.W(this.f35976b, i13, g6Var);
        this.f35976b.setBackgroundDrawable(null);
        org.telegram.ui.ActionBar.r6.H(this.f35976b, i14, i15, i16, g6Var);
        this.f35976b.setMaxLines(1);
        this.f35976b.setLines(1);
        this.f35976b.setSingleLine(true);
        aa aaVar7 = this.f35976b;
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        aaVar7.setGravity(i11);
        this.f35976b.setInputType(49152);
        this.f35976b.setImeOptions(6);
        this.f35976b.setHint(LocaleController.getString(R.string.LastName));
        org.telegram.ui.ActionBar.r6.x(this.f35976b, i13, g6Var);
        this.f35976b.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f35976b.setCursorWidth(1.5f);
        linearLayout.addView(this.f35976b, w7.z5.k(24.0f, 16.0f, 24.0f, 0.0f, -1, 36));
        this.f35976b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ba f44040b;

            {
                this.f44040b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i17, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i17 == 5) {
                            ba baVar = this.f44040b;
                            baVar.f35976b.requestFocus();
                            aa aaVar62 = baVar.f35976b;
                            aaVar62.setSelection(aaVar62.length());
                            return true;
                        }
                        return false;
                    default:
                        if (i17 == 6) {
                            this.f44040b.f35977c.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        if (user != null) {
            this.f35975a.setText(user.first_name);
            aa aaVar8 = this.f35975a;
            aaVar8.setSelection(aaVar8.length());
            this.f35976b.setText(user.last_name);
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
        aa aaVar = this.f35975a;
        int i10 = org.telegram.ui.ActionBar.k6.f21311k6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(aaVar, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        aa aaVar2 = this.f35975a;
        int i11 = org.telegram.ui.ActionBar.k6.f21328l6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(aaVar2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f35976b, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f35976b, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        return arrayList;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (!MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
            this.f35975a.requestFocus();
            AndroidUtilities.showKeyboard(this.f35975a);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new ut0(this, 18), 100L);
        }
    }
}
