package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class a50 extends org.telegram.ui.ActionBar.j {
    public final Activity f37694a;
    public final x50 f37695b;

    public a50(x50 x50Var, Activity activity) {
        this.f37695b = x50Var;
        this.f37694a = activity;
    }

    @Override
    public final void b(int i10) {
        VoIPService sharedInstance;
        int i11;
        int x02;
        int i12;
        int i13;
        String str;
        x50 x50Var = this.f37695b;
        if (i10 == -1) {
            x50Var.onBackPressed();
        } else if (i10 == 1) {
            x50Var.f45491a1.call.join_muted = false;
            x50.F0(x50Var);
        } else if (i10 == 2) {
            x50Var.f45491a1.call.join_muted = true;
            x50.F0(x50Var);
        } else if (i10 == 3) {
            x50Var.j1(false);
        } else if (i10 == 12) {
            x50.G0(x50Var, true);
        } else if (i10 == 13) {
            x50.G0(x50Var, false);
        } else if (i10 == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(x50Var.getContext());
            if (ChatObject.isChannelOrGiga(x50Var.Z0)) {
                alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.VoipChannelEndAlertTitle);
                alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.VoipChannelEndAlertText);
            } else {
                alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.VoipGroupEndAlertTitle);
                alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.VoipGroupEndAlertText);
            }
            alertDialog$Builder.f22369a.I = org.telegram.ui.ActionBar.y6.f23589pg;
            alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupEnd), new u40(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23684ug, false);
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
            e2Var.j(x03);
            e2Var.show();
            TextView textView = (TextView) e2Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23702vg, null);
            }
            e2Var.p(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23439hg, false));
        } else if (i10 == 9) {
            x50Var.f45539m1.callOnClick();
        } else if (i10 == 5) {
            ChatObject.Call call = x50Var.f45491a1;
            if (call.recording) {
                boolean z10 = call.call.record_video_active;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(x50Var.getContext());
                alertDialog$Builder2.f22369a.I = org.telegram.ui.ActionBar.y6.f23589pg;
                alertDialog$Builder2.f22369a.R = LocaleController.getString(R.string.VoipGroupStopRecordingTitle);
                if (ChatObject.isChannelOrGiga(x50Var.Z0)) {
                    alertDialog$Builder2.f22369a.T = LocaleController.getString(R.string.VoipChannelStopRecordingText);
                } else {
                    alertDialog$Builder2.f22369a.T = LocaleController.getString(R.string.VoipGroupStopRecordingText);
                }
                alertDialog$Builder2.k(LocaleController.getString(R.string.Stop), new di.f(11, this, z10));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                int x04 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23684ug, false);
                org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.f22369a;
                e2Var2.j(x04);
                e2Var2.show();
                e2Var2.p(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23551ng, false));
                return;
            }
            w40 w40Var = new w40(this, x50Var.getContext(), x50Var.Z0, x50Var.I2);
            if (x50Var.r1()) {
                w40Var.n(2);
            } else {
                w40Var.show();
            }
        } else if (i10 == 7) {
            x50Var.f45536l0 = true;
            x50Var.f45574u1.setVisibility(0);
            x50Var.f45578v1.setVisibility(0);
            x50Var.f45544n1.setVisibility(8);
            x50Var.f45588x1.setVisibility(8);
            x50Var.f45593y1.setVisibility(8);
            x50Var.f45583w1.setVisibility(8);
            x50Var.f45561r1.setVisibility(8);
            x50Var.f45548o1.setVisibility(8);
            x50Var.f45566s1.setVisibility(8);
            x50Var.f45570t1.setVisibility(8);
            x50Var.f45532k0.setVisibility(8);
            x50Var.f45552p1.setVisibility(8);
            x50Var.f45556q1.setVisibility(8);
            org.telegram.ui.ActionBar.w0 w0Var = x50Var.f45533k1;
            org.telegram.ui.ActionBar.o1 o1Var = w0Var.d;
            if (o1Var != null && o1Var.isShowing()) {
                w0Var.f23177b.measure(org.telegram.messenger.wh.x(40.0f, AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                w0Var.W(true, true);
            }
        } else if (i10 == 6) {
            x50Var.f45582w0 = false;
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(x50Var.getContext());
            editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.T(x50Var.getContext()));
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(x50Var.getContext());
            alertDialog$Builder3.f22369a.I = org.telegram.ui.ActionBar.y6.f23589pg;
            if (ChatObject.isChannelOrGiga(x50Var.Z0)) {
                alertDialog$Builder3.f22369a.R = LocaleController.getString(R.string.VoipChannelTitle);
            } else {
                alertDialog$Builder3.f22369a.R = LocaleController.getString(R.string.VoipGroupTitle);
            }
            alertDialog$Builder3.f22369a.A0 = false;
            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new hz(editTextBoldCursor, 1));
            LinearLayout linearLayout = new LinearLayout(x50Var.getContext());
            linearLayout.setOrientation(1);
            alertDialog$Builder3.o(linearLayout);
            editTextBoldCursor.setTextSize(1, 16.0f);
            int i14 = org.telegram.ui.ActionBar.y6.f23551ng;
            org.telegram.ui.ActionBar.f7.V(editTextBoldCursor, i14, null);
            editTextBoldCursor.setMaxLines(1);
            editTextBoldCursor.setLines(1);
            editTextBoldCursor.setInputType(16385);
            editTextBoldCursor.setGravity(51);
            editTextBoldCursor.setSingleLine(true);
            editTextBoldCursor.setImeOptions(6);
            TLRPC.Chat chat = x50Var.Z0;
            if (chat != null) {
                str = chat.title;
            } else {
                str = "";
            }
            editTextBoldCursor.setHint(str);
            org.telegram.ui.ActionBar.f7.E(editTextBoldCursor, org.telegram.ui.ActionBar.y6.f23571og, null);
            org.telegram.ui.ActionBar.f7.m(editTextBoldCursor, 30, i14, null);
            editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
            linearLayout.addView(editTextBoldCursor, org.telegram.ui.Components.kb1.x(-1, 36, 51, 24, 6, 24, 0));
            editTextBoldCursor.setOnEditorActionListener(new iz(alertDialog$Builder3, 1));
            editTextBoldCursor.addTextChangedListener(new lz(editTextBoldCursor, 1));
            if (!TextUtils.isEmpty(x50Var.f45491a1.call.title)) {
                editTextBoldCursor.setText(x50Var.f45491a1.call.title);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            alertDialog$Builder3.k(LocaleController.getString(R.string.Save), new e7(this, editTextBoldCursor, alertDialog$Builder3, 15));
            int x05 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23403fg, false);
            org.telegram.ui.ActionBar.e2 e2Var3 = alertDialog$Builder3.f22369a;
            e2Var3.j(x05);
            e2Var3.setOnShowListener(new v40(this, e2Var3, editTextBoldCursor, 0));
            e2Var3.setOnDismissListener(new jz(editTextBoldCursor, 1));
            e2Var3.show();
            e2Var3.p(org.telegram.ui.ActionBar.y6.x0(null, i14, false));
            editTextBoldCursor.requestFocus();
        } else if (i10 == 8) {
            org.telegram.ui.Components.u80.u(x50Var.getContext(), -x50Var.i1(), x50Var.d, null, 2, x50Var.A0, new u40(this));
        } else if (i10 == 11) {
            SharedConfig.toggleNoiseSupression();
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (sharedInstance2 != null) {
                sharedInstance2.setNoiseSupressionEnabled(SharedConfig.noiseSupression);
            }
        } else if (i10 == 10 && (sharedInstance = VoIPService.getSharedInstance()) != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.VoipAudioRoutingSpeaker));
            arrayList2.add(Integer.valueOf(R.drawable.msg_voice_speaker));
            arrayList3.add(0);
            if (sharedInstance.hasEarpiece()) {
                if (sharedInstance.isHeadsetPlugged()) {
                    i12 = R.string.VoipAudioRoutingHeadset;
                } else {
                    i12 = R.string.VoipAudioRoutingPhone;
                }
                arrayList.add(LocaleController.getString(i12));
                if (sharedInstance.isHeadsetPlugged()) {
                    i13 = R.drawable.msg_voice_headphones;
                } else {
                    i13 = R.drawable.msg_voice_phone;
                }
                d3.n(i13, 1, arrayList2, arrayList3);
            }
            if (sharedInstance.isBluetoothHeadsetConnected()) {
                String str2 = sharedInstance.currentBluetoothDeviceName;
                if (str2 == null) {
                    str2 = LocaleController.getString(R.string.VoipAudioRoutingBluetooth);
                }
                arrayList.add(str2);
                d3.n(R.drawable.msg_voice_bluetooth, 2, arrayList2, arrayList3);
            }
            int size = arrayList.size();
            CharSequence[] charSequenceArr = new CharSequence[size];
            int[] iArr = new int[size];
            for (int i15 = 0; i15 < size; i15++) {
                charSequenceArr[i15] = (CharSequence) arrayList.get(i15);
                iArr[i15] = ((Integer) arrayList2.get(i15)).intValue();
            }
            org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(1, (Context) this.f37694a, (org.telegram.ui.ActionBar.u6) null, false);
            k3Var.fixNavigationBar();
            k3Var.title = LocaleController.getString(R.string.VoipSelectAudioOutput);
            k3Var.bigTitle = true;
            ng.j jVar = new ng.j(8, this, arrayList3);
            k3Var.items = charSequenceArr;
            k3Var.itemIcons = iArr;
            k3Var.onClickListener = jVar;
            int i16 = org.telegram.ui.ActionBar.y6.f23495kg;
            k3Var.setBackgroundColor(org.telegram.ui.ActionBar.y6.x0(null, i16, false));
            k3Var.fixNavigationBar(org.telegram.ui.ActionBar.y6.x0(null, i16, false));
            if (sharedInstance.getCurrentAudioRoute() == 1) {
                i11 = 0;
            } else if (sharedInstance.getCurrentAudioRoute() == 0) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            k3Var.show();
            k3Var.setTitleColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23551ng, false));
            for (int i17 = 0; i17 < k3Var.getItemViews().size(); i17++) {
                org.telegram.ui.ActionBar.c3 c3Var = k3Var.getItemViews().get(i17);
                if (i17 == i11) {
                    x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23589pg, false);
                    c3Var.f22502f = true;
                } else {
                    x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23551ng, false);
                }
                c3Var.setTextColor(x02);
                c3Var.setIconColor(x02);
                int i18 = org.telegram.ui.ActionBar.y6.f23439hg;
                org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(i0.a.o(org.telegram.ui.ActionBar.y6.x0(null, i18, false), 12), 2, -1);
                org.telegram.ui.ActionBar.b7 h = org.telegram.ui.ActionBar.f7.h(i18, 12);
                c3Var.setBackground(g02);
                org.telegram.ui.ActionBar.f7.k(c3Var, g02, null, h, null);
            }
        }
    }
}
