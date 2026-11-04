package org.telegram.ui;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class c30 extends org.telegram.ui.ActionBar.j {
    public final Activity f44212a;
    public final x30 f44213b;

    public c30(x30 x30Var, Activity activity) {
        this.f44213b = x30Var;
        this.f44212a = activity;
    }

    @Override
    public final void b(int i3) {
        VoIPService sharedInstance;
        int i10;
        int x02;
        int i11;
        int i12;
        String str;
        x30 x30Var = this.f44213b;
        if (i3 == -1) {
            x30Var.onBackPressed();
        } else if (i3 == 1) {
            x30Var.S2.f25049b.join_muted = false;
            x30.M0(x30Var);
        } else if (i3 == 2) {
            x30Var.S2.f25049b.join_muted = true;
            x30.M0(x30Var);
        } else if (i3 == 3) {
            x30Var.l1(false);
        } else if (i3 == 12) {
            x30.N0(x30Var, true);
        } else if (i3 == 13) {
            x30.N0(x30Var, false);
        } else if (i3 == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(x30Var.getContext());
            boolean W = org.telegram.messenger.t3.W(x30Var.R2);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            if (W) {
                s1Var.S = org.telegram.messenger.bd.M0(2131743492, null);
                s1Var.U = org.telegram.messenger.bd.M0(2131743493, null);
            } else {
                s1Var.S = org.telegram.messenger.bd.M0(2131743391, null);
                s1Var.U = org.telegram.messenger.bd.M0(2131743392, null);
            }
            s1Var.J = org.telegram.ui.ActionBar.k6.f27889dh;
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131743393, null), new v20(this));
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
            s1Var.j(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27980ih, false));
            s1Var.show();
            TextView textView = (TextView) s1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27999jh, null);
            }
            s1Var.p(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Vg, false));
        } else if (i3 == 9) {
            x30Var.f51732e3.callOnClick();
        } else if (i3 == 5) {
            org.telegram.messenger.r3 r3Var = x30Var.S2;
            if (r3Var.f25067w) {
                boolean z10 = r3Var.f25049b.record_video_active;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(x30Var.getContext());
                int i13 = org.telegram.ui.ActionBar.k6.f27889dh;
                org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.f27343a;
                s1Var2.J = i13;
                s1Var2.S = org.telegram.messenger.bd.M0(2131743331, null);
                if (org.telegram.messenger.t3.W(x30Var.R2)) {
                    s1Var2.U = org.telegram.messenger.bd.M0(2131743464, null);
                } else {
                    s1Var2.U = org.telegram.messenger.bd.M0(2131743332, null);
                }
                alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131744851, null), new ei.f(11, this, z10));
                alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                s1Var2.j(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27980ih, false));
                s1Var2.show();
                s1Var2.p(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27853bh, false));
                return;
            }
            x20 x20Var = new x20(this, x30Var.getContext(), x30Var.R2, x30Var.A4);
            if (x30Var.t1()) {
                x20Var.J0(2);
            } else {
                x20Var.show();
            }
        } else if (i3 == 7) {
            x30Var.f51727d2 = true;
            x30Var.f51765m3.setVisibility(0);
            x30Var.f51770n3.setVisibility(0);
            x30Var.f51736f3.setVisibility(8);
            x30Var.f51779p3.setVisibility(8);
            x30Var.f51784q3.setVisibility(8);
            x30Var.f51774o3.setVisibility(8);
            x30Var.f51752j3.setVisibility(8);
            x30Var.f51740g3.setVisibility(8);
            x30Var.f51756k3.setVisibility(8);
            x30Var.f51761l3.setVisibility(8);
            x30Var.c2.setVisibility(8);
            x30Var.f51744h3.setVisibility(8);
            x30Var.i3.setVisibility(8);
            org.telegram.ui.ActionBar.q0 q0Var = x30Var.f51724c3;
            org.telegram.ui.ActionBar.f1 f1Var = q0Var.d;
            if (f1Var != null && f1Var.isShowing()) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = q0Var.f28440b;
                Point point = org.telegram.messenger.g0.f22608q;
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(org.telegram.messenger.camera.q.c(40.0f, point.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
                q0Var.W(true, true);
            }
        } else if (i3 == 6) {
            x30Var.f51773o2 = false;
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(x30Var.getContext());
            editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.U(x30Var.getContext()));
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(x30Var.getContext());
            int i14 = org.telegram.ui.ActionBar.k6.f27889dh;
            org.telegram.ui.ActionBar.s1 s1Var3 = alertDialog$Builder3.f27343a;
            s1Var3.J = i14;
            if (org.telegram.messenger.t3.W(x30Var.R2)) {
                s1Var3.S = org.telegram.messenger.bd.M0(2131743463, null);
            } else {
                s1Var3.S = org.telegram.messenger.bd.M0(2131743330, null);
            }
            s1Var3.B0 = false;
            alertDialog$Builder3.h(org.telegram.messenger.bd.M0(2131752589, null), new vx(editTextBoldCursor, 1));
            LinearLayout linearLayout = new LinearLayout(x30Var.getContext());
            linearLayout.setOrientation(1);
            alertDialog$Builder3.o(linearLayout);
            editTextBoldCursor.setTextSize(1, 16.0f);
            int i15 = org.telegram.ui.ActionBar.k6.f27853bh;
            org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, i15, null);
            editTextBoldCursor.setMaxLines(1);
            editTextBoldCursor.setLines(1);
            editTextBoldCursor.setInputType(16385);
            editTextBoldCursor.setGravity(51);
            editTextBoldCursor.setSingleLine(true);
            editTextBoldCursor.setImeOptions(6);
            TLRPC.Chat chat = x30Var.R2;
            if (chat != null) {
                str = chat.title;
            } else {
                str = "";
            }
            editTextBoldCursor.setHint(str);
            org.telegram.ui.ActionBar.r6.E(editTextBoldCursor, org.telegram.ui.ActionBar.k6.f27870ch, null);
            org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 30, i15, null);
            editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
            linearLayout.addView(editTextBoldCursor, b8.mf.t(-1, 36, 51, 24, 6, 24, 0));
            editTextBoldCursor.setOnEditorActionListener(new wx(alertDialog$Builder3, 1));
            editTextBoldCursor.addTextChangedListener(new yx(editTextBoldCursor, 1));
            if (!TextUtils.isEmpty(x30Var.S2.f25049b.title)) {
                editTextBoldCursor.setText(x30Var.S2.f25049b.title);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            alertDialog$Builder3.k(org.telegram.messenger.bd.M0(2131745956, null), new b7(this, editTextBoldCursor, alertDialog$Builder3, 15));
            s1Var3.j(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Tg, false));
            s1Var3.setOnShowListener(new w20(this, s1Var3, editTextBoldCursor, 0));
            s1Var3.setOnDismissListener(new xx(editTextBoldCursor, 1));
            s1Var3.show();
            s1Var3.p(org.telegram.ui.ActionBar.k6.x0(null, i15, false));
            editTextBoldCursor.requestFocus();
        } else if (i3 == 8) {
            org.telegram.ui.Components.o60.K0(x30Var.getContext(), -x30Var.k1(), x30Var.f51759l1, null, 2, x30Var.f51792s2, new v20(this));
        } else if (i3 == 11) {
            org.telegram.messenger.az.I0 = !org.telegram.messenger.az.I0;
            SharedPreferences.Editor edit = org.telegram.messenger.hp.e1().edit();
            edit.putBoolean("noiseSupression", org.telegram.messenger.az.I0);
            edit.apply();
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (sharedInstance2 != null) {
                sharedInstance2.setNoiseSupressionEnabled(org.telegram.messenger.az.I0);
            }
        } else if (i3 == 10 && (sharedInstance = VoIPService.getSharedInstance()) != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            org.telegram.ui.Cells.f1.x(null, 2131743509, arrayList, 2131232430, arrayList2);
            arrayList3.add(0);
            if (sharedInstance.hasEarpiece()) {
                if (sharedInstance.isHeadsetPlugged()) {
                    i11 = 2131743511;
                } else {
                    i11 = 2131743510;
                }
                arrayList.add(org.telegram.messenger.bd.M0(i11, null));
                if (sharedInstance.isHeadsetPlugged()) {
                    i12 = 2131232426;
                } else {
                    i12 = 2131232428;
                }
                arrayList2.add(Integer.valueOf(i12));
                arrayList3.add(1);
            }
            if (sharedInstance.isBluetoothHeadsetConnected()) {
                String str2 = sharedInstance.currentBluetoothDeviceName;
                if (str2 == null) {
                    str2 = org.telegram.messenger.bd.M0(2131743513, null);
                }
                arrayList.add(str2);
                arrayList2.add(2131232425);
                arrayList3.add(2);
            }
            int size = arrayList.size();
            CharSequence[] charSequenceArr = new CharSequence[size];
            int[] iArr = new int[size];
            for (int i16 = 0; i16 < size; i16++) {
                charSequenceArr[i16] = (CharSequence) arrayList.get(i16);
                iArr[i16] = ((Integer) arrayList2.get(i16)).intValue();
            }
            org.telegram.ui.ActionBar.t2 h = org.telegram.messenger.camera.q.h(this.f44212a, false, 1, null);
            h.P = org.telegram.messenger.bd.M0(2131743253, null);
            h.Q = true;
            u uVar = new u(7, this, arrayList3);
            h.M = charSequenceArr;
            h.N = iArr;
            h.L = uVar;
            int i17 = org.telegram.ui.ActionBar.k6.Yg;
            h.v0(org.telegram.ui.ActionBar.k6.x0(null, i17, false));
            h.O(org.telegram.ui.ActionBar.k6.x0(null, i17, false));
            if (sharedInstance.getCurrentAudioRoute() == 1) {
                i10 = 0;
            } else if (sharedInstance.getCurrentAudioRoute() == 0) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            h.show();
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27853bh, false);
            org.telegram.ui.ActionBar.k2 k2Var = h.m0;
            if (k2Var != null) {
                k2Var.setTextColor(x03);
            }
            for (int i18 = 0; i18 < h.f28623x0.size(); i18++) {
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) h.f28623x0.get(i18);
                if (i18 == i10) {
                    x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27889dh, false);
                    m2Var.f28336f = true;
                } else {
                    x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27853bh, false);
                }
                m2Var.setTextColor(x02);
                m2Var.setIconColor(x02);
                int i19 = org.telegram.ui.ActionBar.k6.Vg;
                org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i19, false), 12), 2, -1);
                org.telegram.ui.ActionBar.n6 h7 = org.telegram.ui.ActionBar.r6.h(i19, 12);
                m2Var.setBackground(h02);
                org.telegram.ui.ActionBar.r6.k(m2Var, h02, null, h7, null);
            }
        }
    }
}
