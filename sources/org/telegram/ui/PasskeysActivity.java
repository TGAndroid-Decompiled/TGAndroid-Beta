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
    public q5c a;
    public int addPasskeyRow;
    public final ArrayList b;

    public PasskeysActivity(ArrayList arrayList) {
        super(null);
        this.b = arrayList;
    }

    public static void e0(int i, wjb wjbVar, Context context, boolean z) {
        fx0 h = de9.h(1, wjbVar, context, false);
        LinearLayout j = de9.j(context, 1);
        j.setPadding(gl.L(16.0f), 0, gl.L(16.0f), gl.L(8.0f));
        h.O = j;
        ?? imageView = new ImageView(context);
        imageView.f(2131624114, gl.L(115.0f), gl.L(115.0f), null);
        imageView.d();
        j.addView((View) imageView, nme.t(115, 115, 17, 0, 0, 0, 9));
        int i2 = bkb.i5;
        TextView b = hve.b(context, 18.0f, i2, true, wjbVar);
        de9.q(b, 17, null, 2131747443);
        j.addView(b, nme.k(32.0f, 0.0f, 32.0f, 6.0f, -1, -2));
        TextView b2 = hve.b(context, 14.0f, i2, false, wjbVar);
        de9.q(b2, 17, null, 2131747444);
        j.addView(b2, nme.k(32.0f, 0.0f, 32.0f, 24.0f, -1, -2));
        q64 q64Var = new q64(1, wjbVar, context);
        q64Var.a(2131232037, k96.M0(2131747450, null), k96.M0(2131747451, null));
        j.addView(q64Var, nme.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        q64 q64Var2 = new q64(1, wjbVar, context);
        q64Var2.a(2131231797, k96.M0(2131747448, null), k96.M0(2131747449, null));
        j.addView(q64Var2, nme.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        q64 q64Var3 = new q64(1, wjbVar, context);
        q64Var3.a(2131231864, k96.M0(2131747446, null), k96.M0(2131747447, null));
        j.addView(q64Var3, nme.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        u41 i3 = yjb.i(24, wjbVar, context, true);
        i3.i(k96.M0(2131747445, null), false, true);
        i3.setOnClickListener(new pg(i3, context, i, h, (byte) 5));
        if (z) {
            j.addView(i3, nme.k(0.0f, 16.0f, 0.0f, 8.0f, -1, 48));
        }
        h.K();
        h.show();
    }

    public final void Y(TL_account.Passkey passkey) {
        l5c l5cVar;
        this.b.add(passkey);
        q5c q5cVar = this.a;
        if (q5cVar != null && (l5cVar = q5cVar.g3) != null) {
            l5cVar.O(true);
        }
        m21 I = u21.b0(this).I(2131624113, k96.M0(2131747455, null), k96.a0(null, null, 2131747456, passkey.name));
        I.j = 5000;
        I.k(true);
    }

    public final void Z() {
        Activity parentActivity = getParentActivity();
        int i = this.currentAccount;
        wjb wjbVar = this.resourceProvider;
        boolean z = true;
        if (this.b.size() + 1 > getMessagesController().k4.D.f()) {
            z = false;
        }
        e0(i, wjbVar, parentActivity, z);
    }

    public final void a0(TL_account.Passkey passkey, String str) {
        if (str != null) {
            if (!"CANCELLED".equalsIgnoreCase(str)) {
                if ("EMPTY".equalsIgnoreCase(str)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String M0 = k96.M0(2131747439, null);
                    hd hdVar = alertDialog$Builder.a;
                    hdVar.S = M0;
                    hdVar.U = k96.M0(2131747440, null);
                    b00.t(null, 2131747638, alertDialog$Builder, null);
                    return;
                }
                u21.b0(this).f0(str, true);
            }
        } else if (passkey != null) {
            na7.q1(this.currentAccount).n4(0L, "SETUP_PASSKEY");
            Y(passkey);
        }
    }

    public final void b0(TL_account.Passkey passkey, String str, int i) {
        this.b.remove(passkey);
        this.a.g3.O(true);
        TL_account.deletePasskey deletepasskey = new TL_account.deletePasskey();
        deletepasskey.id = str;
        ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(deletepasskey, new hc((byte) 0), new wm1(this, i, passkey, (byte) 2));
    }

    public final void c0(c4c c4cVar, View view) {
        if (c4cVar.d == -1) {
            iw7.a(getParentActivity(), this.currentAccount, new bw7(this, (byte) 1));
        } else if (c4cVar.H != null) {
            d0(view);
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(k96.M0(2131747458, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bq5(this, (byte) 16));
        FrameLayout frameLayout = new FrameLayout(context);
        q5c q5cVar = new q5c(this, new bw7(this, (byte) 0), new im6(this, (byte) 25), null);
        this.a = q5cVar;
        q5cVar.r1();
        this.a.setSectionsDrawBackground(true);
        q5c q5cVar2 = this.a;
        q5cVar2.g3.r = false;
        frameLayout.addView(q5cVar2, nme.c(-1.0f, -1));
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
        dw7 dw7Var = (dw7) viewParent;
        String str = dw7Var.w;
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
            cs5 I = cs5.I(this, dw7Var);
            I.b(2131232113, k96.M0(2131751586, null), new q76(this, (TL_account.Passkey) arrayList.get(i2), str, i2, (byte) 15), true);
            I.X(this.a.V0(dw7Var, false));
            I.a0();
        }
    }

    @Override
    public final o39 getListViewForSimpleGlass() {
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
