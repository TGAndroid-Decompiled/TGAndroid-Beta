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
public class PasskeysActivity extends org.telegram.ui.ActionBar.d {
    public q7c a;
    public int addPasskeyRow;
    public final ArrayList b;

    public PasskeysActivity(ArrayList arrayList) {
        super(null);
        this.b = arrayList;
    }

    public static void f0(int i, ylb ylbVar, Context context, boolean z) {
        my0 h = hg9.h(1, ylbVar, context, false);
        LinearLayout i2 = hg9.i(context, 1);
        i2.setPadding(gm.L(16.0f), 0, gm.L(16.0f), gm.L(8.0f));
        h.O = i2;
        ?? imageView = new ImageView(context);
        imageView.f(2131624114, gm.L(115.0f), gm.L(115.0f), null);
        imageView.d();
        i2.addView((View) imageView, qoe.t(115, 115, 17, 0, 0, 0, 9));
        int i3 = cmb.i5;
        TextView b = jxe.b(context, 18.0f, i3, true, ylbVar);
        hg9.p(b, 17, null, 2131747369);
        i2.addView(b, qoe.k(32.0f, 0.0f, 32.0f, 6.0f, -1, -2));
        TextView b2 = jxe.b(context, 14.0f, i3, false, ylbVar);
        hg9.p(b2, 17, null, 2131747370);
        i2.addView(b2, qoe.k(32.0f, 0.0f, 32.0f, 24.0f, -1, -2));
        z74 z74Var = new z74(1, ylbVar, context);
        z74Var.a(2131232038, jb6.M0(2131747376, null), jb6.M0(2131747377, null));
        i2.addView(z74Var, qoe.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        z74 z74Var2 = new z74(1, ylbVar, context);
        z74Var2.a(2131231798, jb6.M0(2131747374, null), jb6.M0(2131747375, null));
        i2.addView(z74Var2, qoe.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        z74 z74Var3 = new z74(1, ylbVar, context);
        z74Var3.a(2131231865, jb6.M0(2131747372, null), jb6.M0(2131747373, null));
        i2.addView(z74Var3, qoe.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        b61 i4 = mlb.i(24, ylbVar, context, true);
        i4.i(jb6.M0(2131747371, null), false, true);
        i4.setOnClickListener(new ph(i4, context, i, h, (byte) 5));
        if (z) {
            i2.addView(i4, qoe.k(0.0f, 16.0f, 0.0f, 8.0f, -1, 48));
        }
        h.J();
        h.show();
    }

    public final void Z(TL_account.Passkey passkey) {
        l7c l7cVar;
        this.b.add(passkey);
        q7c q7cVar = this.a;
        if (q7cVar != null && (l7cVar = q7cVar.g3) != null) {
            l7cVar.O(true);
        }
        u31 I = c41.b0(this).I(2131624113, jb6.M0(2131747381, null), jb6.a0(null, null, 2131747382, passkey.name));
        I.j = 5000;
        I.k(true);
    }

    public final void a0() {
        Activity parentActivity = getParentActivity();
        int i = this.currentAccount;
        ylb ylbVar = this.resourceProvider;
        boolean z = true;
        if (this.b.size() + 1 > getMessagesController().l4.D.f()) {
            z = false;
        }
        f0(i, ylbVar, parentActivity, z);
    }

    public final void b0(TL_account.Passkey passkey, String str) {
        if (str != null) {
            if (!"CANCELLED".equalsIgnoreCase(str)) {
                if ("EMPTY".equalsIgnoreCase(str)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String M0 = jb6.M0(2131747365, null);
                    he heVar = alertDialog$Builder.a;
                    heVar.S = M0;
                    heVar.U = jb6.M0(2131747366, null);
                    b10.t(null, 2131747564, alertDialog$Builder, null);
                    return;
                }
                c41.b0(this).f0(str, true);
            }
        } else if (passkey != null) {
            oc7.r1(this.currentAccount).p4(0L, "SETUP_PASSKEY");
            Z(passkey);
        }
    }

    public final void c0(TL_account.Passkey passkey, String str, int i) {
        this.b.remove(passkey);
        this.a.g3.O(true);
        TL_account.deletePasskey deletepasskey = new TL_account.deletePasskey();
        deletepasskey.id = str;
        ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(deletepasskey, new kc((byte) 0), new ro1(this, i, passkey, (byte) 2));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231244);
        this.simpleActionBar.setTitle(jb6.M0(2131747384, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new wl5(this, (byte) 17));
        FrameLayout frameLayout = new FrameLayout(context);
        q7c q7cVar = new q7c(this, new ey7(this, (byte) 0), new cj6(this, (byte) 28), null);
        this.a = q7cVar;
        q7cVar.r1();
        this.a.setSectionsDrawBackground(true);
        q7c q7cVar2 = this.a;
        q7cVar2.g3.r = false;
        frameLayout.addView(q7cVar2, qoe.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0(c6c c6cVar, View view) {
        if (c6cVar.d == -1) {
            ly7.a(getParentActivity(), this.currentAccount, new ey7(this, (byte) 1));
        } else if (c6cVar.H != null) {
            e0(view);
        }
    }

    public final void e0(View view) {
        ArrayList arrayList;
        boolean z = view instanceof ImageView;
        ViewParent viewParent = view;
        if (z) {
            viewParent = view.getParent();
        }
        gy7 gy7Var = (gy7) viewParent;
        String str = gy7Var.w;
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
            bu5 I = bu5.I(this, gy7Var);
            I.b(2131232114, jb6.M0(2131751535, null), new v36(this, (TL_account.Passkey) arrayList.get(i2), str, i2, (byte) 16), true);
            I.X(this.a.V0(gy7Var, false));
            I.a0();
        }
    }

    @Override
    public final r59 getListViewForSimpleGlass() {
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
