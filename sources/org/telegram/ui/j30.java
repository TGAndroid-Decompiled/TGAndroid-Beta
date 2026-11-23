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
public final class j30 extends org.telegram.ui.ActionBar.j {
    public final Activity f48976a;
    public final e40 f48977b;

    public j30(e40 e40Var, Activity activity) {
        this.f48977b = e40Var;
        this.f48976a = activity;
    }

    @Override
    public final void b(int i7) {
        VoIPService sharedInstance;
        int i10;
        int x02;
        int i11;
        int i12;
        int i13;
        String str;
        e40 e40Var = this.f48977b;
        org.telegram.ui.ActionBar.y0 y0Var = e40Var.f47369m3;
        if (i7 == -1) {
            e40Var.onBackPressed();
        } else if (i7 == 1) {
            e40Var.V2.f27034b.join_muted = false;
            e40.N0(e40Var);
        } else if (i7 == 2) {
            e40Var.V2.f27034b.join_muted = true;
            e40.N0(e40Var);
        } else if (i7 == 3) {
            e40Var.n1(false);
        } else if (i7 == 12) {
            e40.O0(e40Var, true);
        } else if (i7 == 13) {
            e40.O0(e40Var, false);
        } else if (i7 == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e40Var.getContext());
            boolean W = org.telegram.messenger.v3.W(e40Var.U2);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
            if (W) {
                t1Var.S = org.telegram.messenger.gd.N0(2131743232, null);
                t1Var.U = org.telegram.messenger.gd.N0(2131743233, null);
            } else {
                t1Var.S = org.telegram.messenger.gd.N0(2131743131, null);
                t1Var.U = org.telegram.messenger.gd.N0(2131743132, null);
            }
            t1Var.J = org.telegram.ui.ActionBar.n6.f29517gh;
            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131743133, null), new d30(this));
            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
            t1Var.j(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29608lh, false));
            t1Var.show();
            TextView textView = (TextView) t1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29625mh, null);
            }
            t1Var.p(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Yg, false));
        } else if (i7 == 9) {
            e40Var.f47349h3.callOnClick();
        } else if (i7 == 5) {
            org.telegram.messenger.t3 t3Var = e40Var.V2;
            if (t3Var.f27052w) {
                boolean z10 = t3Var.f27034b.record_video_active;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(e40Var.getContext());
                int i14 = org.telegram.ui.ActionBar.n6.f29517gh;
                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28835a;
                t1Var2.J = i14;
                t1Var2.S = org.telegram.messenger.gd.N0(2131743071, null);
                if (org.telegram.messenger.v3.W(e40Var.U2)) {
                    t1Var2.U = org.telegram.messenger.gd.N0(2131743204, null);
                } else {
                    t1Var2.U = org.telegram.messenger.gd.N0(2131743072, null);
                }
                alertDialog$Builder2.k(org.telegram.messenger.gd.N0(2131744600, null), new ab.z(8, this, z10));
                alertDialog$Builder2.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                t1Var2.j(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29608lh, false));
                t1Var2.show();
                t1Var2.p(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29480eh, false));
                return;
            }
            f30 f30Var = new f30(this, e40Var.getContext(), e40Var.U2, e40Var.H4);
            if (e40Var.v1()) {
                f30Var.K0(2);
            } else {
                f30Var.show();
            }
        } else if (i7 == 7) {
            e40Var.f47344g2 = true;
            e40Var.f47401t3.setVisibility(0);
            e40Var.f47406u3.setVisibility(0);
            e40Var.f47353i3.setVisibility(8);
            e40Var.f47416w3.setVisibility(8);
            e40Var.f47421x3.setVisibility(8);
            e40Var.f47411v3.setVisibility(8);
            e40Var.f47387q3.setVisibility(8);
            e40Var.j3.setVisibility(8);
            e40Var.f47392r3.setVisibility(8);
            e40Var.f47397s3.setVisibility(8);
            e40Var.f47340f2.setVisibility(8);
            e40Var.f47360k3.setVisibility(8);
            e40Var.f47364l3.setVisibility(8);
            y0Var.setVisibility(8);
            org.telegram.ui.ActionBar.q0 q0Var = e40Var.f47341f3;
            org.telegram.ui.ActionBar.g1 g1Var = q0Var.d;
            if (g1Var != null && g1Var.isShowing()) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = q0Var.f29959b;
                Point point = org.telegram.messenger.g0.f24226q;
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(org.telegram.messenger.m10.c(40.0f, point.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
                q0Var.X(true, true);
            }
        } else if (i7 == 6) {
            e40Var.f47391r2 = false;
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(e40Var.getContext());
            editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.U(e40Var.getContext()));
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(e40Var.getContext());
            int i15 = org.telegram.ui.ActionBar.n6.f29517gh;
            org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder3.f28835a;
            t1Var3.J = i15;
            if (org.telegram.messenger.v3.W(e40Var.U2)) {
                t1Var3.S = org.telegram.messenger.gd.N0(2131743203, null);
            } else {
                t1Var3.S = org.telegram.messenger.gd.N0(2131743070, null);
            }
            t1Var3.f30113z0 = false;
            alertDialog$Builder3.h(org.telegram.messenger.gd.N0(2131752577, null), new dy(editTextBoldCursor, 1));
            LinearLayout linearLayout = new LinearLayout(e40Var.getContext());
            linearLayout.setOrientation(1);
            alertDialog$Builder3.o(linearLayout);
            editTextBoldCursor.setTextSize(1, 16.0f);
            int i16 = org.telegram.ui.ActionBar.n6.f29480eh;
            org.telegram.ui.ActionBar.u6.U(editTextBoldCursor, i16, null);
            editTextBoldCursor.setMaxLines(1);
            editTextBoldCursor.setLines(1);
            editTextBoldCursor.setInputType(16385);
            editTextBoldCursor.setGravity(51);
            editTextBoldCursor.setSingleLine(true);
            editTextBoldCursor.setImeOptions(6);
            TLRPC.Chat chat = e40Var.U2;
            if (chat != null) {
                str = chat.title;
            } else {
                str = "";
            }
            editTextBoldCursor.setHint(str);
            org.telegram.ui.ActionBar.u6.D(editTextBoldCursor, org.telegram.ui.ActionBar.n6.f29497fh, null);
            org.telegram.ui.ActionBar.u6.l(editTextBoldCursor, 30, i16, null);
            editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
            linearLayout.addView(editTextBoldCursor, c8.na.t(-1, 36, 51, 24, 6, 24, 0));
            editTextBoldCursor.setOnEditorActionListener(new ey(alertDialog$Builder3, 1));
            editTextBoldCursor.addTextChangedListener(new gy(editTextBoldCursor, 1));
            if (!TextUtils.isEmpty(e40Var.V2.f27034b.title)) {
                editTextBoldCursor.setText(e40Var.V2.f27034b.title);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            alertDialog$Builder3.k(org.telegram.messenger.gd.N0(2131745750, null), new a7(this, editTextBoldCursor, alertDialog$Builder3, 15));
            t1Var3.j(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Wg, false));
            t1Var3.setOnShowListener(new e30(this, t1Var3, editTextBoldCursor, 0));
            t1Var3.setOnDismissListener(new fy(editTextBoldCursor, 1));
            t1Var3.show();
            t1Var3.p(org.telegram.ui.ActionBar.n6.x0(null, i16, false));
            editTextBoldCursor.requestFocus();
        } else if (i7 == 8) {
            org.telegram.ui.Components.f70.L0(e40Var.getContext(), -e40Var.m1(), e40Var.f47376o1, null, 2, e40Var.f47410v2, new d30(this));
        } else if (i7 == 14) {
            org.telegram.messenger.mp.g1().edit().putBoolean("asr_live_captions", !ai.j2.a()).apply();
            boolean a10 = ai.j2.a();
            e40Var.f47373n3.a(a10, true);
            if (a10) {
                i13 = 2131745053;
            } else {
                i13 = 2131745054;
            }
            y0Var.setSubtext(org.telegram.messenger.gd.N0(i13, null));
            e40Var.Q1();
        } else if (i7 == 11) {
            org.telegram.messenger.bz.I0 = !org.telegram.messenger.bz.I0;
            SharedPreferences.Editor edit = org.telegram.messenger.mp.g1().edit();
            edit.putBoolean("noiseSupression", org.telegram.messenger.bz.I0);
            edit.apply();
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (sharedInstance2 != null) {
                sharedInstance2.setNoiseSupressionEnabled(org.telegram.messenger.bz.I0);
            }
        } else if (i7 == 10 && (sharedInstance = VoIPService.getSharedInstance()) != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            org.telegram.ui.Cells.c0.v(null, 2131743249, arrayList, 2131232435, arrayList2);
            arrayList3.add(0);
            if (sharedInstance.hasEarpiece()) {
                if (sharedInstance.isHeadsetPlugged()) {
                    i11 = 2131743251;
                } else {
                    i11 = 2131743250;
                }
                arrayList.add(org.telegram.messenger.gd.N0(i11, null));
                if (sharedInstance.isHeadsetPlugged()) {
                    i12 = 2131232431;
                } else {
                    i12 = 2131232433;
                }
                arrayList2.add(Integer.valueOf(i12));
                arrayList3.add(1);
            }
            if (sharedInstance.isBluetoothHeadsetConnected()) {
                String str2 = sharedInstance.currentBluetoothDeviceName;
                if (str2 == null) {
                    str2 = org.telegram.messenger.gd.N0(2131743253, null);
                }
                arrayList.add(str2);
                arrayList2.add(2131232430);
                arrayList3.add(2);
            }
            int size = arrayList.size();
            CharSequence[] charSequenceArr = new CharSequence[size];
            int[] iArr = new int[size];
            for (int i17 = 0; i17 < size; i17++) {
                charSequenceArr[i17] = (CharSequence) arrayList.get(i17);
                iArr[i17] = ((Integer) arrayList2.get(i17)).intValue();
            }
            org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.m10.j(this.f48976a, false, 1, null);
            j3.P = org.telegram.messenger.gd.N0(2131742993, null);
            j3.Q = true;
            og.j jVar = new og.j(8, this, arrayList3);
            j3.M = charSequenceArr;
            j3.N = iArr;
            j3.L = jVar;
            int i18 = org.telegram.ui.ActionBar.n6.f29424bh;
            j3.v0(org.telegram.ui.ActionBar.n6.x0(null, i18, false));
            j3.P(org.telegram.ui.ActionBar.n6.x0(null, i18, false));
            if (sharedInstance.getCurrentAudioRoute() == 1) {
                i10 = 0;
            } else if (sharedInstance.getCurrentAudioRoute() == 0) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            j3.show();
            int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29480eh, false);
            org.telegram.ui.ActionBar.n2 n2Var = j3.m0;
            if (n2Var != null) {
                n2Var.setTextColor(x03);
            }
            for (int i19 = 0; i19 < j3.f30266x0.size(); i19++) {
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) j3.f30266x0.get(i19);
                if (i19 == i10) {
                    x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29517gh, false);
                    p2Var.f29937f = true;
                } else {
                    x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29480eh, false);
                }
                p2Var.setTextColor(x02);
                p2Var.setIconColor(x02);
                int i20 = org.telegram.ui.ActionBar.n6.Yg;
                org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(i0.a.o(org.telegram.ui.ActionBar.n6.x0(null, i20, false), 12), 2, -1);
                org.telegram.ui.ActionBar.q6 g10 = org.telegram.ui.ActionBar.u6.g(i20, 12);
                p2Var.setBackground(h02);
                org.telegram.ui.ActionBar.u6.j(p2Var, h02, null, g10, null);
            }
        }
    }
}
