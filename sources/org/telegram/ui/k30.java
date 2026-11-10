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
public final class k30 extends org.telegram.ui.ActionBar.k {
    public final Activity f47152a;
    public final f40 f47153b;

    public k30(f40 f40Var, Activity activity) {
        this.f47153b = f40Var;
        this.f47152a = activity;
    }

    @Override
    public final void b(int i7) {
        VoIPService sharedInstance;
        int i10;
        int x02;
        int i11;
        int i12;
        String str;
        f40 f40Var = this.f47153b;
        if (i7 == -1) {
            f40Var.onBackPressed();
        } else if (i7 == 1) {
            f40Var.U2.f25226b.join_muted = false;
            f40.M0(f40Var);
        } else if (i7 == 2) {
            f40Var.U2.f25226b.join_muted = true;
            f40.M0(f40Var);
        } else if (i7 == 3) {
            f40Var.m1(false);
        } else if (i7 == 12) {
            f40.N0(f40Var, true);
        } else if (i7 == 13) {
            f40.N0(f40Var, false);
        } else if (i7 == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f40Var.getContext());
            boolean W = org.telegram.messenger.t3.W(f40Var.T2);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
            if (W) {
                u1Var.R = org.telegram.messenger.id.M0(2131743482, null);
                u1Var.T = org.telegram.messenger.id.M0(2131743483, null);
            } else {
                u1Var.R = org.telegram.messenger.id.M0(2131743381, null);
                u1Var.T = org.telegram.messenger.id.M0(2131743382, null);
            }
            u1Var.I = org.telegram.ui.ActionBar.m6.f27900dh;
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131743383, null), new d30(this));
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
            u1Var.j(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27991ih, false));
            u1Var.show();
            TextView textView = (TextView) u1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28010jh, null);
            }
            u1Var.p(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Vg, false));
        } else if (i7 == 9) {
            f40Var.f45528g3.callOnClick();
        } else if (i7 == 5) {
            org.telegram.messenger.r3 r3Var = f40Var.U2;
            if (r3Var.f25244w) {
                boolean z9 = r3Var.f25226b.record_video_active;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(f40Var.getContext());
                int i13 = org.telegram.ui.ActionBar.m6.f27900dh;
                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27300a;
                u1Var2.I = i13;
                u1Var2.R = org.telegram.messenger.id.M0(2131743321, null);
                if (org.telegram.messenger.t3.W(f40Var.T2)) {
                    u1Var2.T = org.telegram.messenger.id.M0(2131743454, null);
                } else {
                    u1Var2.T = org.telegram.messenger.id.M0(2131743322, null);
                }
                alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131744841, null), new ab.y(8, this, z9));
                alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), null);
                u1Var2.j(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27991ih, false));
                u1Var2.show();
                u1Var2.p(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27863bh, false));
                return;
            }
            f30 f30Var = new f30(this, f40Var.getContext(), f40Var.T2, f40Var.C4);
            if (f40Var.u1()) {
                f30Var.J0(2);
            } else {
                f30Var.show();
            }
        } else if (i7 == 7) {
            f40Var.f45523f2 = true;
            f40Var.f45561o3.setVisibility(0);
            f40Var.f45565p3.setVisibility(0);
            f40Var.f45532h3.setVisibility(8);
            f40Var.f45575r3.setVisibility(8);
            f40Var.f45580s3.setVisibility(8);
            f40Var.f45570q3.setVisibility(8);
            f40Var.f45547l3.setVisibility(8);
            f40Var.f45536i3.setVisibility(8);
            f40Var.f45552m3.setVisibility(8);
            f40Var.f45556n3.setVisibility(8);
            f40Var.f45519e2.setVisibility(8);
            f40Var.j3.setVisibility(8);
            f40Var.f45543k3.setVisibility(8);
            org.telegram.ui.ActionBar.r0 r0Var = f40Var.f45520e3;
            org.telegram.ui.ActionBar.g1 g1Var = r0Var.d;
            if (g1Var != null && g1Var.isShowing()) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = r0Var.f28430b;
                Point point = org.telegram.messenger.g0.f22567q;
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(org.telegram.messenger.camera.q.c(40.0f, point.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
                r0Var.W(true, true);
            }
        } else if (i7 == 6) {
            f40Var.f45569q2 = false;
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(f40Var.getContext());
            editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.U(f40Var.getContext()));
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(f40Var.getContext());
            int i14 = org.telegram.ui.ActionBar.m6.f27900dh;
            org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder3.f27300a;
            u1Var3.I = i14;
            if (org.telegram.messenger.t3.W(f40Var.T2)) {
                u1Var3.R = org.telegram.messenger.id.M0(2131743453, null);
            } else {
                u1Var3.R = org.telegram.messenger.id.M0(2131743320, null);
            }
            u1Var3.f28580y0 = false;
            alertDialog$Builder3.h(org.telegram.messenger.id.M0(2131752589, null), new dy(editTextBoldCursor, 1));
            LinearLayout linearLayout = new LinearLayout(f40Var.getContext());
            linearLayout.setOrientation(1);
            alertDialog$Builder3.o(linearLayout);
            editTextBoldCursor.setTextSize(1, 16.0f);
            int i15 = org.telegram.ui.ActionBar.m6.f27863bh;
            org.telegram.ui.ActionBar.t6.U(editTextBoldCursor, i15, null);
            editTextBoldCursor.setMaxLines(1);
            editTextBoldCursor.setLines(1);
            editTextBoldCursor.setInputType(16385);
            editTextBoldCursor.setGravity(51);
            editTextBoldCursor.setSingleLine(true);
            editTextBoldCursor.setImeOptions(6);
            TLRPC.Chat chat = f40Var.T2;
            if (chat != null) {
                str = chat.title;
            } else {
                str = "";
            }
            editTextBoldCursor.setHint(str);
            org.telegram.ui.ActionBar.t6.D(editTextBoldCursor, org.telegram.ui.ActionBar.m6.f27883ch, null);
            org.telegram.ui.ActionBar.t6.l(editTextBoldCursor, 30, i15, null);
            editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
            linearLayout.addView(editTextBoldCursor, c8.ha.t(-1, 36, 51, 24, 6, 24, 0));
            editTextBoldCursor.setOnEditorActionListener(new ey(alertDialog$Builder3, 1));
            editTextBoldCursor.addTextChangedListener(new gy(editTextBoldCursor, 1));
            if (!TextUtils.isEmpty(f40Var.U2.f25226b.title)) {
                editTextBoldCursor.setText(f40Var.U2.f25226b.title);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            alertDialog$Builder3.k(org.telegram.messenger.id.M0(2131745946, null), new a7(this, editTextBoldCursor, alertDialog$Builder3, 15));
            u1Var3.j(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Tg, false));
            u1Var3.setOnShowListener(new e30(this, u1Var3, editTextBoldCursor, 0));
            u1Var3.setOnDismissListener(new fy(editTextBoldCursor, 1));
            u1Var3.show();
            u1Var3.p(org.telegram.ui.ActionBar.m6.x0(null, i15, false));
            editTextBoldCursor.requestFocus();
        } else if (i7 == 8) {
            org.telegram.ui.Components.t60.K0(f40Var.getContext(), -f40Var.l1(), f40Var.n1, null, 2, f40Var.f45588u2, new d30(this));
        } else if (i7 == 11) {
            org.telegram.messenger.iz.I0 = !org.telegram.messenger.iz.I0;
            SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
            edit.putBoolean("noiseSupression", org.telegram.messenger.iz.I0);
            edit.apply();
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (sharedInstance2 != null) {
                sharedInstance2.setNoiseSupressionEnabled(org.telegram.messenger.iz.I0);
            }
        } else if (i7 == 10 && (sharedInstance = VoIPService.getSharedInstance()) != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            org.telegram.ui.Cells.f1.t(null, 2131743499, arrayList, 2131232430, arrayList2);
            arrayList3.add(0);
            if (sharedInstance.hasEarpiece()) {
                if (sharedInstance.isHeadsetPlugged()) {
                    i11 = 2131743501;
                } else {
                    i11 = 2131743500;
                }
                arrayList.add(org.telegram.messenger.id.M0(i11, null));
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
                    str2 = org.telegram.messenger.id.M0(2131743503, null);
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
            org.telegram.ui.ActionBar.w2 h = org.telegram.messenger.camera.q.h(this.f47152a, false, 1, null);
            h.O = org.telegram.messenger.id.M0(2131743243, null);
            h.P = true;
            og.j jVar = new og.j(8, this, arrayList3);
            h.L = charSequenceArr;
            h.M = iArr;
            h.K = jVar;
            int i17 = org.telegram.ui.ActionBar.m6.Yg;
            h.v0(org.telegram.ui.ActionBar.m6.x0(null, i17, false));
            h.O(org.telegram.ui.ActionBar.m6.x0(null, i17, false));
            if (sharedInstance.getCurrentAudioRoute() == 1) {
                i10 = 0;
            } else if (sharedInstance.getCurrentAudioRoute() == 0) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            h.show();
            int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27863bh, false);
            org.telegram.ui.ActionBar.n2 n2Var = h.f28695l0;
            if (n2Var != null) {
                n2Var.setTextColor(x03);
            }
            for (int i18 = 0; i18 < h.f28709w0.size(); i18++) {
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) h.f28709w0.get(i18);
                if (i18 == i10) {
                    x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27900dh, false);
                    p2Var.f28375f = true;
                } else {
                    x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27863bh, false);
                }
                p2Var.setTextColor(x02);
                p2Var.setIconColor(x02);
                int i19 = org.telegram.ui.ActionBar.m6.Vg;
                org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, i19, false), 12), 2, -1);
                org.telegram.ui.ActionBar.p6 g10 = org.telegram.ui.ActionBar.t6.g(i19, 12);
                p2Var.setBackground(h02);
                org.telegram.ui.ActionBar.t6.j(p2Var, h02, null, g10, null);
            }
        }
    }
}
