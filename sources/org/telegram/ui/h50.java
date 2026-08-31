package org.telegram.ui;

import android.app.Activity;
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
public final class h50 extends org.telegram.ui.ActionBar.j {
    public final Activity f37328a;
    public final d60 f37329b;

    public h50(d60 d60Var, Activity activity) {
        this.f37329b = d60Var;
        this.f37328a = activity;
    }

    @Override
    public final void b(int i10) {
        VoIPService sharedInstance;
        int i11;
        int w02;
        int i12;
        int i13;
        String str;
        d60 d60Var = this.f37329b;
        if (i10 == -1) {
            d60Var.onBackPressed();
        } else if (i10 == 1) {
            d60Var.X0.call.join_muted = false;
            d60.F0(d60Var);
        } else if (i10 == 2) {
            d60Var.X0.call.join_muted = true;
            d60.F0(d60Var);
        } else if (i10 == 3) {
            d60Var.j1(false);
        } else if (i10 == 12) {
            d60.G0(d60Var, true);
        } else if (i10 == 13) {
            d60.G0(d60Var, false);
        } else if (i10 == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(d60Var.getContext());
            if (ChatObject.isChannelOrGiga(d60Var.W0)) {
                alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.VoipChannelEndAlertTitle);
                alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.VoipChannelEndAlertText);
            } else {
                alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.VoipGroupEndAlertTitle);
                alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.VoipGroupEndAlertText);
            }
            alertDialog$Builder.f21166a.F = org.telegram.ui.ActionBar.k6.f21885pg;
            alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupEnd), new b50(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            int w03 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21971ug, false);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
            d2Var.i(w03);
            d2Var.show();
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21989vg, false));
            }
            d2Var.o(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21741hg, false));
        } else if (i10 == 9) {
            d60Var.f36050j1.callOnClick();
        } else if (i10 == 5) {
            ChatObject.Call call = d60Var.X0;
            if (call.recording) {
                boolean z4 = call.call.record_video_active;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(d60Var.getContext());
                alertDialog$Builder2.f21166a.F = org.telegram.ui.ActionBar.k6.f21885pg;
                alertDialog$Builder2.f21166a.O = LocaleController.getString(R.string.VoipGroupStopRecordingTitle);
                if (ChatObject.isChannelOrGiga(d60Var.W0)) {
                    alertDialog$Builder2.f21166a.Q = LocaleController.getString(R.string.VoipChannelStopRecordingText);
                } else {
                    alertDialog$Builder2.f21166a.Q = LocaleController.getString(R.string.VoipGroupStopRecordingText);
                }
                alertDialog$Builder2.k(LocaleController.getString(R.string.Stop), new jh.q(8, this, z4));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                int w04 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21971ug, false);
                org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f21166a;
                d2Var2.i(w04);
                d2Var2.show();
                d2Var2.o(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21848ng, false));
                return;
            }
            d50 d50Var = new d50(this, d60Var.getContext(), d60Var.W0, d60Var.F2);
            if (d60Var.r1()) {
                d50Var.n(2);
            } else {
                d50Var.show();
            }
        } else if (i10 == 7) {
            d60Var.f36045i0 = true;
            d60Var.f36082r1.setVisibility(0);
            d60Var.f36087s1.setVisibility(0);
            d60Var.f36054k1.setVisibility(8);
            d60Var.f36095u1.setVisibility(8);
            d60Var.f36099v1.setVisibility(8);
            d60Var.f36091t1.setVisibility(8);
            d60Var.f36069o1.setVisibility(8);
            d60Var.l1.setVisibility(8);
            d60Var.f36073p1.setVisibility(8);
            d60Var.f36077q1.setVisibility(8);
            d60Var.f36041h0.setVisibility(8);
            d60Var.f36060m1.setVisibility(8);
            d60Var.f36065n1.setVisibility(8);
            org.telegram.ui.ActionBar.w0 w0Var = d60Var.f36042h1;
            org.telegram.ui.ActionBar.p1 p1Var = w0Var.d;
            if (p1Var != null && p1Var.isShowing()) {
                w0Var.f22344b.measure(b.d(40.0f, AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                w0Var.O(true, true);
            }
        } else if (i10 == 6) {
            d60Var.f36090t0 = false;
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(d60Var.getContext());
            editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.S(d60Var.getContext()));
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(d60Var.getContext());
            alertDialog$Builder3.f21166a.F = org.telegram.ui.ActionBar.k6.f21885pg;
            if (ChatObject.isChannelOrGiga(d60Var.W0)) {
                alertDialog$Builder3.f21166a.O = LocaleController.getString(R.string.VoipChannelTitle);
            } else {
                alertDialog$Builder3.f21166a.O = LocaleController.getString(R.string.VoipGroupTitle);
            }
            alertDialog$Builder3.f21166a.f21263v0 = false;
            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new tz(1, editTextBoldCursor));
            LinearLayout linearLayout = new LinearLayout(d60Var.getContext());
            linearLayout.setOrientation(1);
            alertDialog$Builder3.n(linearLayout);
            editTextBoldCursor.setTextSize(1, 16.0f);
            int i14 = org.telegram.ui.ActionBar.k6.f21848ng;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i14, false));
            editTextBoldCursor.setMaxLines(1);
            editTextBoldCursor.setLines(1);
            editTextBoldCursor.setInputType(16385);
            editTextBoldCursor.setGravity(51);
            editTextBoldCursor.setSingleLine(true);
            editTextBoldCursor.setImeOptions(6);
            TLRPC.Chat chat = d60Var.W0;
            if (chat != null) {
                str = chat.title;
            } else {
                str = "";
            }
            editTextBoldCursor.setHint(str);
            editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21866og, false));
            editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.k6.w0(null, i14, false));
            editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
            linearLayout.addView(editTextBoldCursor, k7.c6.t(-1, 36, 51, 24, 6, 24, 0));
            editTextBoldCursor.setOnEditorActionListener(new uz(alertDialog$Builder3, 1));
            editTextBoldCursor.addTextChangedListener(new wz(1, editTextBoldCursor));
            if (!TextUtils.isEmpty(d60Var.X0.call.title)) {
                editTextBoldCursor.setText(d60Var.X0.call.title);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            alertDialog$Builder3.k(LocaleController.getString(R.string.Save), new d7(this, editTextBoldCursor, alertDialog$Builder3, 15));
            int w05 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21705fg, false);
            org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder3.f21166a;
            d2Var3.i(w05);
            d2Var3.setOnShowListener(new c50(this, d2Var3, editTextBoldCursor, 0));
            d2Var3.setOnDismissListener(new vz(1, editTextBoldCursor));
            d2Var3.show();
            d2Var3.o(org.telegram.ui.ActionBar.k6.w0(null, i14, false));
            editTextBoldCursor.requestFocus();
        } else if (i10 == 8) {
            org.telegram.ui.Components.a80.u(d60Var.getContext(), -d60Var.i1(), d60Var.d, null, 2, d60Var.f36108x0, new b50(this));
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
                b.h(i13, 1, arrayList2, arrayList3);
            }
            if (sharedInstance.isBluetoothHeadsetConnected()) {
                String str2 = sharedInstance.currentBluetoothDeviceName;
                if (str2 == null) {
                    str2 = LocaleController.getString(R.string.VoipAudioRoutingBluetooth);
                }
                arrayList.add(str2);
                b.h(R.drawable.msg_voice_bluetooth, 2, arrayList2, arrayList3);
            }
            int size = arrayList.size();
            CharSequence[] charSequenceArr = new CharSequence[size];
            int[] iArr = new int[size];
            for (int i15 = 0; i15 < size; i15++) {
                charSequenceArr[i15] = (CharSequence) arrayList.get(i15);
                iArr[i15] = ((Integer) arrayList2.get(i15)).intValue();
            }
            org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(this.f37328a, null, false, false);
            h3Var.fixNavigationBar();
            h3Var.title = LocaleController.getString(R.string.VoipSelectAudioOutput);
            h3Var.bigTitle = true;
            dg.t1 t1Var = new dg.t1(8, this, arrayList3);
            h3Var.items = charSequenceArr;
            h3Var.itemIcons = iArr;
            h3Var.onClickListener = t1Var;
            int i16 = org.telegram.ui.ActionBar.k6.f21795kg;
            h3Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i16, false));
            h3Var.fixNavigationBar(org.telegram.ui.ActionBar.k6.w0(null, i16, false));
            if (sharedInstance.getCurrentAudioRoute() == 1) {
                i11 = 0;
            } else if (sharedInstance.getCurrentAudioRoute() == 0) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            h3Var.show();
            h3Var.setTitleColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21848ng, false));
            for (int i17 = 0; i17 < h3Var.getItemViews().size(); i17++) {
                org.telegram.ui.ActionBar.a3 a3Var = h3Var.getItemViews().get(i17);
                if (i17 == i11) {
                    w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21885pg, false);
                    a3Var.f21179f = true;
                } else {
                    w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21848ng, false);
                }
                a3Var.setTextColor(w02);
                a3Var.setIconColor(w02);
                a3Var.setBackground(org.telegram.ui.ActionBar.k6.f0(i0.a.k(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21741hg, false), 12), 2, -1));
            }
        }
    }
}
