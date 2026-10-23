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
    public aa f35976a;
    public aa f35977b;
    public org.telegram.ui.ActionBar.u0 f35978c;
    public org.telegram.ui.ActionBar.g6 d;

    public static void U(ba baVar) {
        String str;
        TLRPC.User currentUser = UserConfig.getInstance(baVar.currentAccount).getCurrentUser();
        if (currentUser != null && baVar.f35977b.getText() != null && baVar.f35976a.getText() != null) {
            String obj = baVar.f35976a.getText().toString();
            String obj2 = baVar.f35977b.getText().toString();
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21481t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21462s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21183d6));
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.g6 g6Var = this.d;
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 3, org.telegram.ui.ActionBar.k6.f21220f8, g6Var);
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 1, org.telegram.ui.ActionBar.k6.f21518v8, g6Var);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.EditName));
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 29));
        this.f35978c = this.actionBar.m().h(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
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
        this.f35976a = aaVar;
        aaVar.setTextSize(1, 18.0f);
        aa aaVar2 = this.f35976a;
        int i12 = org.telegram.ui.ActionBar.k6.H6;
        org.telegram.ui.ActionBar.r6.F(aaVar2, i12, g6Var);
        aa aaVar3 = this.f35976a;
        int i13 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.W(aaVar3, i13, g6Var);
        this.f35976a.setBackgroundDrawable(null);
        aa aaVar4 = this.f35976a;
        int i14 = org.telegram.ui.ActionBar.k6.f21310k6;
        int i15 = org.telegram.ui.ActionBar.k6.f21327l6;
        int i16 = org.telegram.ui.ActionBar.k6.f21404p7;
        org.telegram.ui.ActionBar.r6.H(aaVar4, i14, i15, i16, g6Var);
        this.f35976a.setMaxLines(1);
        this.f35976a.setLines(1);
        this.f35976a.setSingleLine(true);
        aa aaVar5 = this.f35976a;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        aaVar5.setGravity(i10);
        this.f35976a.setInputType(49152);
        this.f35976a.setImeOptions(5);
        this.f35976a.setHint(LocaleController.getString(R.string.FirstName));
        org.telegram.ui.ActionBar.r6.x(this.f35976a, i13, g6Var);
        this.f35976a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f35976a.setCursorWidth(1.5f);
        linearLayout.addView(this.f35976a, w7.z5.k(24.0f, 24.0f, 24.0f, 0.0f, -1, 36));
        this.f35976a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ba f44090b;

            {
                this.f44090b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i17, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i17 == 5) {
                            ba baVar = this.f44090b;
                            baVar.f35977b.requestFocus();
                            aa aaVar6 = baVar.f35977b;
                            aaVar6.setSelection(aaVar6.length());
                            return true;
                        }
                        return false;
                    default:
                        if (i17 == 6) {
                            this.f44090b.f35978c.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        aa aaVar6 = new aa(this, context, 1);
        this.f35977b = aaVar6;
        aaVar6.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.r6.F(this.f35977b, i12, g6Var);
        org.telegram.ui.ActionBar.r6.W(this.f35977b, i13, g6Var);
        this.f35977b.setBackgroundDrawable(null);
        org.telegram.ui.ActionBar.r6.H(this.f35977b, i14, i15, i16, g6Var);
        this.f35977b.setMaxLines(1);
        this.f35977b.setLines(1);
        this.f35977b.setSingleLine(true);
        aa aaVar7 = this.f35977b;
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        aaVar7.setGravity(i11);
        this.f35977b.setInputType(49152);
        this.f35977b.setImeOptions(6);
        this.f35977b.setHint(LocaleController.getString(R.string.LastName));
        org.telegram.ui.ActionBar.r6.x(this.f35977b, i13, g6Var);
        this.f35977b.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f35977b.setCursorWidth(1.5f);
        linearLayout.addView(this.f35977b, w7.z5.k(24.0f, 16.0f, 24.0f, 0.0f, -1, 36));
        this.f35977b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ba f44090b;

            {
                this.f44090b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i17, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i17 == 5) {
                            ba baVar = this.f44090b;
                            baVar.f35977b.requestFocus();
                            aa aaVar62 = baVar.f35977b;
                            aaVar62.setSelection(aaVar62.length());
                            return true;
                        }
                        return false;
                    default:
                        if (i17 == 6) {
                            this.f44090b.f35978c.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        if (user != null) {
            this.f35976a.setText(user.first_name);
            aa aaVar8 = this.f35976a;
            aaVar8.setSelection(aaVar8.length());
            this.f35977b.setText(user.last_name);
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
        aa aaVar = this.f35976a;
        int i10 = org.telegram.ui.ActionBar.k6.f21310k6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(aaVar, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        aa aaVar2 = this.f35976a;
        int i11 = org.telegram.ui.ActionBar.k6.f21327l6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(aaVar2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f35977b, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f35977b, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        return arrayList;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (!MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
            this.f35976a.requestFocus();
            AndroidUtilities.showKeyboard(this.f35976a);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new vt0(this, 18), 100L);
        }
    }
}
