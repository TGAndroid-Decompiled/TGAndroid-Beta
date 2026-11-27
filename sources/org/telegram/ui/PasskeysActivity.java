package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public class PasskeysActivity extends org.telegram.ui.ActionBar.e {
    public q9c a;
    public int addPasskeyRow;
    public final ArrayList b;

    public PasskeysActivity(ArrayList arrayList) {
        super(null);
        this.b = arrayList;
    }

    public static void e0(int i, vnb vnbVar, Context context, boolean z) {
        nx0 h = uh9.h(1, vnbVar, context, false);
        LinearLayout j = uh9.j(context, 1);
        j.setPadding(hl.L(16.0f), 0, hl.L(16.0f), hl.L(8.0f));
        h.O = j;
        ?? imageView = new ImageView(context);
        imageView.f(2131624114, hl.L(115.0f), hl.L(115.0f), null);
        imageView.d();
        j.addView((View) imageView, tre.t(115, 115, 17, 0, 0, 0, 9));
        int i2 = aob.j5;
        TextView b = zze.b(context, 18.0f, i2, true, vnbVar);
        uh9.q(b, 17, null, 2131747363);
        j.addView(b, tre.k(32.0f, 0.0f, 32.0f, 6.0f, -1, -2));
        TextView b2 = zze.b(context, 14.0f, i2, false, vnbVar);
        uh9.q(b2, 17, null, 2131747364);
        j.addView(b2, tre.k(32.0f, 0.0f, 32.0f, 24.0f, -1, -2));
        k74 k74Var = new k74(1, vnbVar, context);
        k74Var.a(2131232037, ob6.M0(2131747370, null), ob6.M0(2131747371, null));
        j.addView(k74Var, tre.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        k74 k74Var2 = new k74(1, vnbVar, context);
        k74Var2.a(2131231797, ob6.M0(2131747368, null), ob6.M0(2131747369, null));
        j.addView(k74Var2, tre.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        k74 k74Var3 = new k74(1, vnbVar, context);
        k74Var3.a(2131231864, ob6.M0(2131747366, null), ob6.M0(2131747367, null));
        j.addView(k74Var3, tre.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        c51 i3 = xnb.i(24, vnbVar, context, true);
        i3.i(ob6.M0(2131747365, null), false, true);
        i3.setOnClickListener(new jf(i3, context, i, h, (byte) 5));
        if (z) {
            j.addView(i3, tre.k(0.0f, 16.0f, 0.0f, 8.0f, -1, 48));
        }
        h.J();
        h.show();
    }

    public final void Y(TL_account.Passkey passkey) {
        l9c l9cVar;
        this.b.add(passkey);
        q9c q9cVar = this.a;
        if (q9cVar != null && (l9cVar = q9cVar.g3) != null) {
            l9cVar.O(true);
        }
        v21 I = d31.b0(this).I(2131624113, ob6.M0(2131747375, null), ob6.a0(null, null, 2131747376, passkey.name));
        I.j = 5000;
        I.k(true);
    }

    public final void Z() {
        Activity parentActivity = getParentActivity();
        int i = this.currentAccount;
        vnb vnbVar = this.resourceProvider;
        boolean z = true;
        if (this.b.size() + 1 > getMessagesController().l4.F.f()) {
            z = false;
        }
        e0(i, vnbVar, parentActivity, z);
    }

    public final void a0(TL_account.Passkey passkey, String str) {
        if (str != null) {
            if (!"CANCELLED".equalsIgnoreCase(str)) {
                if ("EMPTY".equalsIgnoreCase(str)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String M0 = ob6.M0(2131747359, null);
                    id idVar = alertDialog$Builder.a;
                    idVar.S = M0;
                    idVar.U = ob6.M0(2131747360, null);
                    c00.u(null, 2131747558, alertDialog$Builder, null);
                    return;
                }
                d31.b0(this).f0(str, true);
            }
        } else if (passkey != null) {
            uc7.s1(this.currentAccount).v4(0L, "SETUP_PASSKEY");
            Y(passkey);
        }
    }

    public final void b0(TL_account.Passkey passkey, String str, int i) {
        this.b.remove(passkey);
        this.a.g3.O(true);
        TL_account.deletePasskey deletepasskey = new TL_account.deletePasskey();
        deletepasskey.id = str;
        ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(deletepasskey, new ic((byte) 0), new pn1(this, i, passkey, (byte) 2));
    }

    public final void c0(b8c b8cVar, View view) {
        if (b8cVar.d == -1) {
            qz7.a(getParentActivity(), this.currentAccount, new iz7(this, (byte) 1));
        } else if (b8cVar.H != null) {
            d0(view);
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(ob6.M0(2131747378, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new zl5(this, (byte) 18));
        FrameLayout frameLayout = new FrameLayout(context);
        q9c q9cVar = new q9c(this, new iz7(this, (byte) 0), new jz7(this, (byte) 0), null);
        this.a = q9cVar;
        q9cVar.s1();
        this.a.setSectionsDrawBackground(true);
        q9c q9cVar2 = this.a;
        q9cVar2.g3.r = false;
        frameLayout.addView(q9cVar2, tre.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0(View view) {
        ArrayList arrayList;
        boolean z = view instanceof ImageView;
        ViewParent viewParent = view;
        if (z) {
            viewParent = view.getParent();
        }
        lz7 lz7Var = (lz7) viewParent;
        String str = lz7Var.w;
        int i = 0;
        while (true) {
            arrayList = this.b;
            if (i < arrayList.size()) {
                if (str.equals(((TL_account.Passkey) arrayList.get(i)).id)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        int i2 = i;
        if (i2 >= 0 && i2 < arrayList.size()) {
            fu5 I = fu5.I(this, lz7Var);
            I.b(2131232113, ob6.M0(2131751563, null), new y36(this, (TL_account.Passkey) arrayList.get(i2), str, i2, (byte) 17), true);
            I.X(this.a.W0(lz7Var, false));
            I.a0();
        }
    }

    @Override
    public final d79 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
