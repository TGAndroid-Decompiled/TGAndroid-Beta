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
public final class h30 extends org.telegram.ui.ActionBar.j {
    public final Activity f46185a;
    public final c40 f46186b;

    public h30(c40 c40Var, Activity activity) {
        this.f46186b = c40Var;
        this.f46185a = activity;
    }

    @Override
    public final void b(int i7) {
        VoIPService sharedInstance;
        int i10;
        int x02;
        int i11;
        int i12;
        String str;
        c40 c40Var = this.f46186b;
        if (i7 == -1) {
            c40Var.onBackPressed();
        } else if (i7 == 1) {
            c40Var.R2.f25201b.join_muted = false;
            c40.M0(c40Var);
        } else if (i7 == 2) {
            c40Var.R2.f25201b.join_muted = true;
            c40.M0(c40Var);
        } else if (i7 == 3) {
            c40Var.m1(false);
        } else if (i7 == 12) {
            c40.N0(c40Var, true);
        } else if (i7 == 13) {
            c40.N0(c40Var, false);
        } else if (i7 == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(c40Var.getContext());
            boolean W = org.telegram.messenger.t3.W(c40Var.Q2);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
            if (W) {
                u1Var.R = org.telegram.messenger.hd.M0(2131743483, null);
                u1Var.T = org.telegram.messenger.hd.M0(2131743484, null);
            } else {
                u1Var.R = org.telegram.messenger.hd.M0(2131743382, null);
                u1Var.T = org.telegram.messenger.hd.M0(2131743383, null);
            }
            u1Var.I = org.telegram.ui.ActionBar.k6.f27858dh;
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131743384, null), new a30(this));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
            u1Var.j(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27949ih, false));
            u1Var.show();
            TextView textView = (TextView) u1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27968jh, null);
            }
            u1Var.p(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Vg, false));
        } else if (i7 == 9) {
            c40Var.f44537d3.callOnClick();
        } else if (i7 == 5) {
            org.telegram.messenger.r3 r3Var = c40Var.R2;
            if (r3Var.f25219w) {
                boolean z9 = r3Var.f25201b.record_video_active;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(c40Var.getContext());
                int i13 = org.telegram.ui.ActionBar.k6.f27858dh;
                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27292a;
                u1Var2.I = i13;
                u1Var2.R = org.telegram.messenger.hd.M0(2131743322, null);
                if (org.telegram.messenger.t3.W(c40Var.Q2)) {
                    u1Var2.T = org.telegram.messenger.hd.M0(2131743455, null);
                } else {
                    u1Var2.T = org.telegram.messenger.hd.M0(2131743323, null);
                }
                alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131744842, null), new ab.y(8, this, z9));
                alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                u1Var2.j(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27949ih, false));
                u1Var2.show();
                u1Var2.p(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27821bh, false));
                return;
            }
            c30 c30Var = new c30(this, c40Var.getContext(), c40Var.Q2, c40Var.f44634z4);
            if (c40Var.u1()) {
                c30Var.J0(2);
            } else {
                c30Var.show();
            }
        } else if (i7 == 7) {
            c40Var.f44533c2 = true;
            c40Var.f44571l3.setVisibility(0);
            c40Var.f44576m3.setVisibility(0);
            c40Var.f44541e3.setVisibility(8);
            c40Var.f44585o3.setVisibility(8);
            c40Var.f44589p3.setVisibility(8);
            c40Var.f44580n3.setVisibility(8);
            c40Var.f44558i3.setVisibility(8);
            c40Var.f44545f3.setVisibility(8);
            c40Var.j3.setVisibility(8);
            c40Var.f44567k3.setVisibility(8);
            c40Var.f44529b2.setVisibility(8);
            c40Var.f44549g3.setVisibility(8);
            c40Var.f44553h3.setVisibility(8);
            org.telegram.ui.ActionBar.r0 r0Var = c40Var.f44530b3;
            org.telegram.ui.ActionBar.g1 g1Var = r0Var.d;
            if (g1Var != null && g1Var.isShowing()) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = r0Var.f28420b;
                Point point = org.telegram.messenger.g0.f22537q;
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(org.telegram.messenger.camera.q.c(40.0f, point.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
                r0Var.W(true, true);
            }
        } else if (i7 == 6) {
            c40Var.f44579n2 = false;
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(c40Var.getContext());
            editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.U(c40Var.getContext()));
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(c40Var.getContext());
            int i14 = org.telegram.ui.ActionBar.k6.f27858dh;
            org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder3.f27292a;
            u1Var3.I = i14;
            if (org.telegram.messenger.t3.W(c40Var.Q2)) {
                u1Var3.R = org.telegram.messenger.hd.M0(2131743454, null);
            } else {
                u1Var3.R = org.telegram.messenger.hd.M0(2131743321, null);
            }
            u1Var3.f28590y0 = false;
            alertDialog$Builder3.h(org.telegram.messenger.hd.M0(2131752589, null), new zx(editTextBoldCursor, 1));
            LinearLayout linearLayout = new LinearLayout(c40Var.getContext());
            linearLayout.setOrientation(1);
            alertDialog$Builder3.o(linearLayout);
            editTextBoldCursor.setTextSize(1, 16.0f);
            int i15 = org.telegram.ui.ActionBar.k6.f27821bh;
            org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, i15, null);
            editTextBoldCursor.setMaxLines(1);
            editTextBoldCursor.setLines(1);
            editTextBoldCursor.setInputType(16385);
            editTextBoldCursor.setGravity(51);
            editTextBoldCursor.setSingleLine(true);
            editTextBoldCursor.setImeOptions(6);
            TLRPC.Chat chat = c40Var.Q2;
            if (chat != null) {
                str = chat.title;
            } else {
                str = "";
            }
            editTextBoldCursor.setHint(str);
            org.telegram.ui.ActionBar.r6.E(editTextBoldCursor, org.telegram.ui.ActionBar.k6.f27841ch, null);
            org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 30, i15, null);
            editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
            linearLayout.addView(editTextBoldCursor, c8.ha.t(-1, 36, 51, 24, 6, 24, 0));
            editTextBoldCursor.setOnEditorActionListener(new ay(alertDialog$Builder3, 1));
            editTextBoldCursor.addTextChangedListener(new dy(editTextBoldCursor, 1));
            if (!TextUtils.isEmpty(c40Var.R2.f25201b.title)) {
                editTextBoldCursor.setText(c40Var.R2.f25201b.title);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            alertDialog$Builder3.k(org.telegram.messenger.hd.M0(2131745947, null), new a7(this, editTextBoldCursor, alertDialog$Builder3, 15));
            u1Var3.j(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Tg, false));
            u1Var3.setOnShowListener(new b30(this, u1Var3, editTextBoldCursor, 0));
            u1Var3.setOnDismissListener(new cy(editTextBoldCursor, 1));
            u1Var3.show();
            u1Var3.p(org.telegram.ui.ActionBar.k6.x0(null, i15, false));
            editTextBoldCursor.requestFocus();
        } else if (i7 == 8) {
            org.telegram.ui.Components.t60.K0(c40Var.getContext(), -c40Var.l1(), c40Var.f44565k1, null, 2, c40Var.f44598r2, new a30(this));
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
            org.telegram.ui.Cells.f1.t(null, 2131743500, arrayList, 2131232430, arrayList2);
            arrayList3.add(0);
            if (sharedInstance.hasEarpiece()) {
                if (sharedInstance.isHeadsetPlugged()) {
                    i11 = 2131743502;
                } else {
                    i11 = 2131743501;
                }
                arrayList.add(org.telegram.messenger.hd.M0(i11, null));
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
                    str2 = org.telegram.messenger.hd.M0(2131743504, null);
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
            org.telegram.ui.ActionBar.v2 h = org.telegram.messenger.camera.q.h(this.f46185a, false, 1, null);
            h.O = org.telegram.messenger.hd.M0(2131743244, null);
            h.P = true;
            og.j jVar = new og.j(8, this, arrayList3);
            h.L = charSequenceArr;
            h.M = iArr;
            h.K = jVar;
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
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27821bh, false);
            org.telegram.ui.ActionBar.m2 m2Var = h.f28635l0;
            if (m2Var != null) {
                m2Var.setTextColor(x03);
            }
            for (int i18 = 0; i18 < h.f28649w0.size(); i18++) {
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) h.f28649w0.get(i18);
                if (i18 == i10) {
                    x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27858dh, false);
                    o2Var.f28334f = true;
                } else {
                    x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27821bh, false);
                }
                o2Var.setTextColor(x02);
                o2Var.setIconColor(x02);
                int i19 = org.telegram.ui.ActionBar.k6.Vg;
                org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i19, false), 12), 2, -1);
                org.telegram.ui.ActionBar.n6 h7 = org.telegram.ui.ActionBar.r6.h(i19, 12);
                o2Var.setBackground(h02);
                org.telegram.ui.ActionBar.r6.k(o2Var, h02, null, h7, null);
            }
        }
    }
}
