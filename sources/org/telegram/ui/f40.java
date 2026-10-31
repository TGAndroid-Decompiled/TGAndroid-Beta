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
public final class f40 extends org.telegram.ui.ActionBar.k {
    public final Activity f37175a;
    public final b50 f37176b;

    public f40(b50 b50Var, Activity activity) {
        this.f37176b = b50Var;
        this.f37175a = activity;
    }

    @Override
    public final void b(int i10) {
        VoIPService sharedInstance;
        int i11;
        int x02;
        int i12;
        int i13;
        String str;
        b50 b50Var = this.f37176b;
        if (i10 == -1) {
            b50Var.onBackPressed();
        } else if (i10 == 1) {
            b50Var.R2.f18228b.join_muted = false;
            b50.M0(b50Var);
        } else if (i10 == 2) {
            b50Var.R2.f18228b.join_muted = true;
            b50.M0(b50Var);
        } else if (i10 == 3) {
            b50Var.l1(false);
        } else if (i10 == 12) {
            b50.N0(b50Var, true);
        } else if (i10 == 13) {
            b50.N0(b50Var, false);
        } else if (i10 == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b50Var.getContext());
            boolean W = org.telegram.messenger.w3.W(b50Var.Q2);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
            if (W) {
                x1Var.R = org.telegram.messenger.cd.L0(2131743508, null);
                x1Var.T = org.telegram.messenger.cd.L0(2131743509, null);
            } else {
                x1Var.R = org.telegram.messenger.cd.L0(2131743407, null);
                x1Var.T = org.telegram.messenger.cd.L0(2131743408, null);
            }
            x1Var.I = org.telegram.ui.ActionBar.t6.f20940dh;
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131743409, null), new z30(this));
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
            x1Var.j(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21029ih, false));
            x1Var.show();
            TextView textView = (TextView) x1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21049jh, null);
            }
            x1Var.p(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Vg, false));
        } else if (i10 == 9) {
            b50Var.f36007d3.callOnClick();
        } else if (i10 == 5) {
            org.telegram.messenger.u3 u3Var = b50Var.R2;
            if (u3Var.f18245w) {
                boolean z10 = u3Var.f18228b.record_video_active;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(b50Var.getContext());
                int i14 = org.telegram.ui.ActionBar.t6.f20940dh;
                org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20134a;
                x1Var2.I = i14;
                x1Var2.R = org.telegram.messenger.cd.L0(2131743347, null);
                if (org.telegram.messenger.w3.W(b50Var.Q2)) {
                    x1Var2.T = org.telegram.messenger.cd.L0(2131743480, null);
                } else {
                    x1Var2.T = org.telegram.messenger.cd.L0(2131743348, null);
                }
                alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131744859, null), new ag.w0(11, this, z10));
                alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                x1Var2.j(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21029ih, false));
                x1Var2.show();
                x1Var2.p(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20901bh, false));
                return;
            }
            b40 b40Var = new b40(this, b50Var.getContext(), b50Var.Q2, b50Var.f36105z4);
            if (b50Var.t1()) {
                b40Var.J0(2);
            } else {
                b40Var.show();
            }
        } else if (i10 == 7) {
            b50Var.f36002c2 = true;
            b50Var.f36042l3.setVisibility(0);
            b50Var.f36046m3.setVisibility(0);
            b50Var.f36011e3.setVisibility(8);
            b50Var.f36056o3.setVisibility(8);
            b50Var.f36061p3.setVisibility(8);
            b50Var.f36051n3.setVisibility(8);
            b50Var.f36028i3.setVisibility(8);
            b50Var.f36015f3.setVisibility(8);
            b50Var.f36033j3.setVisibility(8);
            b50Var.f36038k3.setVisibility(8);
            b50Var.f35998b2.setVisibility(8);
            b50Var.f36019g3.setVisibility(8);
            b50Var.f36023h3.setVisibility(8);
            org.telegram.ui.ActionBar.t0 t0Var = b50Var.f35999b3;
            org.telegram.ui.ActionBar.k1 k1Var = t0Var.d;
            if (k1Var != null && k1Var.isShowing()) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = t0Var.f20826b;
                Point point = org.telegram.messenger.i0.f16026q;
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(org.telegram.messenger.z20.c(40.0f, point.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
                t0Var.W(true, true);
            }
        } else if (i10 == 6) {
            b50Var.f36050n2 = false;
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(b50Var.getContext());
            editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.U(b50Var.getContext()));
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(b50Var.getContext());
            int i15 = org.telegram.ui.ActionBar.t6.f20940dh;
            org.telegram.ui.ActionBar.x1 x1Var3 = alertDialog$Builder3.f20134a;
            x1Var3.I = i15;
            if (org.telegram.messenger.w3.W(b50Var.Q2)) {
                x1Var3.R = org.telegram.messenger.cd.L0(2131743479, null);
            } else {
                x1Var3.R = org.telegram.messenger.cd.L0(2131743346, null);
            }
            x1Var3.A0 = false;
            alertDialog$Builder3.h(org.telegram.messenger.cd.L0(2131752589, null), new cz(editTextBoldCursor, 1));
            LinearLayout linearLayout = new LinearLayout(b50Var.getContext());
            linearLayout.setOrientation(1);
            alertDialog$Builder3.o(linearLayout);
            editTextBoldCursor.setTextSize(1, 16.0f);
            int i16 = org.telegram.ui.ActionBar.t6.f20901bh;
            org.telegram.ui.ActionBar.a7.V(editTextBoldCursor, i16, null);
            editTextBoldCursor.setMaxLines(1);
            editTextBoldCursor.setLines(1);
            editTextBoldCursor.setInputType(16385);
            editTextBoldCursor.setGravity(51);
            editTextBoldCursor.setSingleLine(true);
            editTextBoldCursor.setImeOptions(6);
            TLRPC.Chat chat = b50Var.Q2;
            if (chat != null) {
                str = chat.title;
            } else {
                str = "";
            }
            editTextBoldCursor.setHint(str);
            org.telegram.ui.ActionBar.a7.E(editTextBoldCursor, org.telegram.ui.ActionBar.t6.f20921ch, null);
            org.telegram.ui.ActionBar.a7.m(editTextBoldCursor, 30, i16, null);
            editTextBoldCursor.setCursorSize(org.telegram.messenger.i0.L(20.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setPadding(0, org.telegram.messenger.i0.L(4.0f), 0, 0);
            linearLayout.addView(editTextBoldCursor, w7.b6.t(-1, 36, 51, 24, 6, 24, 0));
            editTextBoldCursor.setOnEditorActionListener(new dz(alertDialog$Builder3, 1));
            editTextBoldCursor.addTextChangedListener(new fz(editTextBoldCursor, 1));
            if (!TextUtils.isEmpty(b50Var.R2.f18228b.title)) {
                editTextBoldCursor.setText(b50Var.R2.f18228b.title);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            alertDialog$Builder3.k(org.telegram.messenger.cd.L0(2131745963, null), new a7(this, editTextBoldCursor, alertDialog$Builder3, 15));
            x1Var3.j(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Tg, false));
            x1Var3.setOnShowListener(new a40(this, x1Var3, editTextBoldCursor, 0));
            x1Var3.setOnDismissListener(new ez(editTextBoldCursor, 1));
            x1Var3.show();
            x1Var3.p(org.telegram.ui.ActionBar.t6.x0(null, i16, false));
            editTextBoldCursor.requestFocus();
        } else if (i10 == 8) {
            org.telegram.ui.Components.k70.K0(b50Var.getContext(), -b50Var.k1(), b50Var.f36036k1, null, 2, b50Var.f36069r2, new z30(this));
        } else if (i10 == 11) {
            org.telegram.messenger.tz.I0 = !org.telegram.messenger.tz.I0;
            SharedPreferences.Editor edit = org.telegram.messenger.vp.d1().edit();
            edit.putBoolean("noiseSupression", org.telegram.messenger.tz.I0);
            edit.apply();
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (sharedInstance2 != null) {
                sharedInstance2.setNoiseSupressionEnabled(org.telegram.messenger.tz.I0);
            }
        } else if (i10 == 10 && (sharedInstance = VoIPService.getSharedInstance()) != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            org.telegram.ui.Cells.f1.t(null, 2131743525, arrayList, 2131232429, arrayList2);
            arrayList3.add(0);
            if (sharedInstance.hasEarpiece()) {
                if (sharedInstance.isHeadsetPlugged()) {
                    i12 = 2131743527;
                } else {
                    i12 = 2131743526;
                }
                arrayList.add(org.telegram.messenger.cd.L0(i12, null));
                if (sharedInstance.isHeadsetPlugged()) {
                    i13 = 2131232425;
                } else {
                    i13 = 2131232427;
                }
                arrayList2.add(Integer.valueOf(i13));
                arrayList3.add(1);
            }
            if (sharedInstance.isBluetoothHeadsetConnected()) {
                String str2 = sharedInstance.currentBluetoothDeviceName;
                if (str2 == null) {
                    str2 = org.telegram.messenger.cd.L0(2131743529, null);
                }
                arrayList.add(str2);
                arrayList2.add(2131232424);
                arrayList3.add(2);
            }
            int size = arrayList.size();
            CharSequence[] charSequenceArr = new CharSequence[size];
            int[] iArr = new int[size];
            for (int i17 = 0; i17 < size; i17++) {
                charSequenceArr[i17] = (CharSequence) arrayList.get(i17);
                iArr[i17] = ((Integer) arrayList2.get(i17)).intValue();
            }
            org.telegram.ui.ActionBar.z2 h = org.telegram.messenger.z20.h(this.f37175a, false, 1, null);
            h.O = org.telegram.messenger.cd.L0(2131743269, null);
            h.P = true;
            eg.j jVar = new eg.j(9, this, arrayList3);
            h.L = charSequenceArr;
            h.M = iArr;
            h.K = jVar;
            int i18 = org.telegram.ui.ActionBar.t6.Yg;
            h.v0(org.telegram.ui.ActionBar.t6.x0(null, i18, false));
            h.P(org.telegram.ui.ActionBar.t6.x0(null, i18, false));
            if (sharedInstance.getCurrentAudioRoute() == 1) {
                i11 = 0;
            } else if (sharedInstance.getCurrentAudioRoute() == 0) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            h.show();
            int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20901bh, false);
            org.telegram.ui.ActionBar.q2 q2Var = h.f21605l0;
            if (q2Var != null) {
                q2Var.setTextColor(x03);
            }
            for (int i19 = 0; i19 < h.f21619w0.size(); i19++) {
                org.telegram.ui.ActionBar.s2 s2Var = (org.telegram.ui.ActionBar.s2) h.f21619w0.get(i19);
                if (i19 == i11) {
                    x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20940dh, false);
                    s2Var.f20767f = true;
                } else {
                    x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20901bh, false);
                }
                s2Var.setTextColor(x02);
                s2Var.setIconColor(x02);
                int i20 = org.telegram.ui.ActionBar.t6.Vg;
                org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, i20, false), 12), 2, -1);
                org.telegram.ui.ActionBar.w6 h10 = org.telegram.ui.ActionBar.a7.h(i20, 12);
                s2Var.setBackground(h02);
                org.telegram.ui.ActionBar.a7.k(s2Var, h02, null, h10, null);
            }
        }
    }
}
