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
public final class k30 extends org.telegram.ui.ActionBar.j {
    public final Activity f49168a;
    public final f40 f49169b;

    public k30(f40 f40Var, Activity activity) {
        this.f49169b = f40Var;
        this.f49168a = activity;
    }

    @Override
    public final void b(int i7) {
        VoIPService sharedInstance;
        int i10;
        int x02;
        int i11;
        int i12;
        String str;
        f40 f40Var = this.f49169b;
        if (i7 == -1) {
            f40Var.onBackPressed();
        } else if (i7 == 1) {
            f40Var.V2.f26937b.join_muted = false;
            f40.N0(f40Var);
        } else if (i7 == 2) {
            f40Var.V2.f26937b.join_muted = true;
            f40.N0(f40Var);
        } else if (i7 == 3) {
            f40Var.n1(false);
        } else if (i7 == 12) {
            f40.O0(f40Var, true);
        } else if (i7 == 13) {
            f40.O0(f40Var, false);
        } else if (i7 == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f40Var.getContext());
            boolean W = org.telegram.messenger.v3.W(f40Var.U2);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
            if (W) {
                u1Var.S = org.telegram.messenger.gd.M0(2131743245, null);
                u1Var.U = org.telegram.messenger.gd.M0(2131743246, null);
            } else {
                u1Var.S = org.telegram.messenger.gd.M0(2131743144, null);
                u1Var.U = org.telegram.messenger.gd.M0(2131743145, null);
            }
            u1Var.J = org.telegram.ui.ActionBar.n6.f29462gh;
            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131743146, null), new e30(this));
            alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
            u1Var.j(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29553lh, false));
            u1Var.show();
            TextView textView = (TextView) u1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29570mh, null);
            }
            u1Var.p(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Yg, false));
        } else if (i7 == 9) {
            f40Var.f47471h3.callOnClick();
        } else if (i7 == 5) {
            org.telegram.messenger.t3 t3Var = f40Var.V2;
            if (t3Var.f26955w) {
                boolean z10 = t3Var.f26937b.record_video_active;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(f40Var.getContext());
                int i13 = org.telegram.ui.ActionBar.n6.f29462gh;
                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f28746a;
                u1Var2.J = i13;
                u1Var2.S = org.telegram.messenger.gd.M0(2131743084, null);
                if (org.telegram.messenger.v3.W(f40Var.U2)) {
                    u1Var2.U = org.telegram.messenger.gd.M0(2131743217, null);
                } else {
                    u1Var2.U = org.telegram.messenger.gd.M0(2131743085, null);
                }
                alertDialog$Builder2.k(org.telegram.messenger.gd.M0(2131744606, null), new ab.z(8, this, z10));
                alertDialog$Builder2.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                u1Var2.j(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29553lh, false));
                u1Var2.show();
                u1Var2.p(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29425eh, false));
                return;
            }
            g30 g30Var = new g30(this, f40Var.getContext(), f40Var.U2, f40Var.H4);
            if (f40Var.v1()) {
                g30Var.K0(2);
            } else {
                g30Var.show();
            }
        } else if (i7 == 7) {
            f40Var.f47466g2 = true;
            f40Var.f47523t3.setVisibility(0);
            f40Var.f47528u3.setVisibility(0);
            f40Var.f47475i3.setVisibility(8);
            f40Var.f47538w3.setVisibility(8);
            f40Var.f47543x3.setVisibility(8);
            f40Var.f47533v3.setVisibility(8);
            f40Var.f47509q3.setVisibility(8);
            f40Var.j3.setVisibility(8);
            f40Var.f47514r3.setVisibility(8);
            f40Var.f47519s3.setVisibility(8);
            f40Var.f47462f2.setVisibility(8);
            f40Var.f47482k3.setVisibility(8);
            f40Var.f47486l3.setVisibility(8);
            f40Var.f47491m3.setVisibility(8);
            org.telegram.ui.ActionBar.r0 r0Var = f40Var.f47463f3;
            org.telegram.ui.ActionBar.h1 h1Var = r0Var.d;
            if (h1Var != null && h1Var.isShowing()) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = r0Var.f29918b;
                Point point = org.telegram.messenger.g0.f24121q;
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(org.telegram.messenger.n10.c(40.0f, point.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
                r0Var.X(true, true);
            }
        } else if (i7 == 6) {
            f40Var.f47513r2 = false;
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(f40Var.getContext());
            editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.U(f40Var.getContext()));
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(f40Var.getContext());
            int i14 = org.telegram.ui.ActionBar.n6.f29462gh;
            org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder3.f28746a;
            u1Var3.J = i14;
            if (org.telegram.messenger.v3.W(f40Var.U2)) {
                u1Var3.S = org.telegram.messenger.gd.M0(2131743216, null);
            } else {
                u1Var3.S = org.telegram.messenger.gd.M0(2131743083, null);
            }
            u1Var3.f30071z0 = false;
            alertDialog$Builder3.h(org.telegram.messenger.gd.M0(2131752578, null), new ey(editTextBoldCursor, 1));
            LinearLayout linearLayout = new LinearLayout(f40Var.getContext());
            linearLayout.setOrientation(1);
            alertDialog$Builder3.o(linearLayout);
            editTextBoldCursor.setTextSize(1, 16.0f);
            int i15 = org.telegram.ui.ActionBar.n6.f29425eh;
            org.telegram.ui.ActionBar.u6.U(editTextBoldCursor, i15, null);
            editTextBoldCursor.setMaxLines(1);
            editTextBoldCursor.setLines(1);
            editTextBoldCursor.setInputType(16385);
            editTextBoldCursor.setGravity(51);
            editTextBoldCursor.setSingleLine(true);
            editTextBoldCursor.setImeOptions(6);
            TLRPC.Chat chat = f40Var.U2;
            if (chat != null) {
                str = chat.title;
            } else {
                str = "";
            }
            editTextBoldCursor.setHint(str);
            org.telegram.ui.ActionBar.u6.D(editTextBoldCursor, org.telegram.ui.ActionBar.n6.f29442fh, null);
            org.telegram.ui.ActionBar.u6.l(editTextBoldCursor, 30, i15, null);
            editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
            linearLayout.addView(editTextBoldCursor, c8.ma.t(-1, 36, 51, 24, 6, 24, 0));
            editTextBoldCursor.setOnEditorActionListener(new fy(alertDialog$Builder3, 1));
            editTextBoldCursor.addTextChangedListener(new hy(editTextBoldCursor, 1));
            if (!TextUtils.isEmpty(f40Var.V2.f26937b.title)) {
                editTextBoldCursor.setText(f40Var.V2.f26937b.title);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            alertDialog$Builder3.k(org.telegram.messenger.gd.M0(2131745751, null), new z6(this, editTextBoldCursor, alertDialog$Builder3, 15));
            u1Var3.j(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Wg, false));
            u1Var3.setOnShowListener(new f30(this, u1Var3, editTextBoldCursor, 0));
            u1Var3.setOnDismissListener(new gy(editTextBoldCursor, 1));
            u1Var3.show();
            u1Var3.p(org.telegram.ui.ActionBar.n6.x0(null, i15, false));
            editTextBoldCursor.requestFocus();
        } else if (i7 == 8) {
            org.telegram.ui.Components.g70.L0(f40Var.getContext(), -f40Var.m1(), f40Var.f47498o1, null, 2, f40Var.f47532v2, new e30(this));
        } else if (i7 == 14) {
            org.telegram.messenger.mp.g1().edit().putBoolean("asr_live_captions", !ai.p2.a()).apply();
            f40Var.R1(true);
            f40Var.Q1();
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
            org.telegram.ui.Cells.c0.v(null, 2131743262, arrayList, 2131232432, arrayList2);
            arrayList3.add(0);
            if (sharedInstance.hasEarpiece()) {
                if (sharedInstance.isHeadsetPlugged()) {
                    i11 = 2131743264;
                } else {
                    i11 = 2131743263;
                }
                arrayList.add(org.telegram.messenger.gd.M0(i11, null));
                if (sharedInstance.isHeadsetPlugged()) {
                    i12 = 2131232428;
                } else {
                    i12 = 2131232430;
                }
                arrayList2.add(Integer.valueOf(i12));
                arrayList3.add(1);
            }
            if (sharedInstance.isBluetoothHeadsetConnected()) {
                String str2 = sharedInstance.currentBluetoothDeviceName;
                if (str2 == null) {
                    str2 = org.telegram.messenger.gd.M0(2131743266, null);
                }
                arrayList.add(str2);
                arrayList2.add(2131232427);
                arrayList3.add(2);
            }
            int size = arrayList.size();
            CharSequence[] charSequenceArr = new CharSequence[size];
            int[] iArr = new int[size];
            for (int i16 = 0; i16 < size; i16++) {
                charSequenceArr[i16] = (CharSequence) arrayList.get(i16);
                iArr[i16] = ((Integer) arrayList2.get(i16)).intValue();
            }
            org.telegram.ui.ActionBar.x2 j3 = org.telegram.messenger.n10.j(this.f49168a, false, 1, null);
            j3.P = org.telegram.messenger.gd.M0(2131743006, null);
            j3.Q = true;
            og.j jVar = new og.j(8, this, arrayList3);
            j3.M = charSequenceArr;
            j3.N = iArr;
            j3.L = jVar;
            int i17 = org.telegram.ui.ActionBar.n6.f29369bh;
            j3.v0(org.telegram.ui.ActionBar.n6.x0(null, i17, false));
            j3.P(org.telegram.ui.ActionBar.n6.x0(null, i17, false));
            if (sharedInstance.getCurrentAudioRoute() == 1) {
                i10 = 0;
            } else if (sharedInstance.getCurrentAudioRoute() == 0) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            j3.show();
            int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29425eh, false);
            org.telegram.ui.ActionBar.o2 o2Var = j3.m0;
            if (o2Var != null) {
                o2Var.setTextColor(x03);
            }
            for (int i18 = 0; i18 < j3.f30232x0.size(); i18++) {
                org.telegram.ui.ActionBar.q2 q2Var = (org.telegram.ui.ActionBar.q2) j3.f30232x0.get(i18);
                if (i18 == i10) {
                    x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29462gh, false);
                    q2Var.f29899f = true;
                } else {
                    x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29425eh, false);
                }
                q2Var.setTextColor(x02);
                q2Var.setIconColor(x02);
                int i19 = org.telegram.ui.ActionBar.n6.Yg;
                org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(i0.a.o(org.telegram.ui.ActionBar.n6.x0(null, i19, false), 12), 2, -1);
                org.telegram.ui.ActionBar.q6 g10 = org.telegram.ui.ActionBar.u6.g(i19, 12);
                q2Var.setBackground(h02);
                org.telegram.ui.ActionBar.u6.j(q2Var, h02, null, g10, null);
            }
        }
    }
}
