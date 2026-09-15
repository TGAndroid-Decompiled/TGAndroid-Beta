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
public final class l50 extends org.telegram.ui.ActionBar.j {
    public final Activity f35340a;
    public final i60 f35341b;

    public l50(i60 i60Var, Activity activity) {
        this.f35341b = i60Var;
        this.f35340a = activity;
    }

    @Override
    public final void b(int i10) {
        VoIPService sharedInstance;
        int i11;
        int w02;
        int i12;
        int i13;
        String str;
        i60 i60Var = this.f35341b;
        if (i10 == -1) {
            i60Var.onBackPressed();
        } else if (i10 == 1) {
            i60Var.f34410a1.call.join_muted = false;
            i60.F0(i60Var);
        } else if (i10 == 2) {
            i60Var.f34410a1.call.join_muted = true;
            i60.F0(i60Var);
        } else if (i10 == 3) {
            i60Var.j1(false);
        } else if (i10 == 12) {
            i60.G0(i60Var, true);
        } else if (i10 == 13) {
            i60.G0(i60Var, false);
        } else if (i10 == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i60Var.getContext());
            if (ChatObject.isChannelOrGiga(i60Var.Z0)) {
                alertDialog$Builder.f18437a.R = LocaleController.getString(R.string.VoipChannelEndAlertTitle);
                alertDialog$Builder.f18437a.T = LocaleController.getString(R.string.VoipChannelEndAlertText);
            } else {
                alertDialog$Builder.f18437a.R = LocaleController.getString(R.string.VoipGroupEndAlertTitle);
                alertDialog$Builder.f18437a.T = LocaleController.getString(R.string.VoipGroupEndAlertText);
            }
            alertDialog$Builder.f18437a.I = org.telegram.ui.ActionBar.i6.f19065pg;
            alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupEnd), new f50(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            int w03 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19158ug, false);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18437a;
            b2Var.i(w03);
            b2Var.show();
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19175vg, false));
            }
            b2Var.o(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18916hg, false));
        } else if (i10 == 9) {
            i60Var.f34457m1.callOnClick();
        } else if (i10 == 5) {
            ChatObject.Call call = i60Var.f34410a1;
            if (call.recording) {
                boolean z10 = call.call.record_video_active;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(i60Var.getContext());
                alertDialog$Builder2.f18437a.I = org.telegram.ui.ActionBar.i6.f19065pg;
                alertDialog$Builder2.f18437a.R = LocaleController.getString(R.string.VoipGroupStopRecordingTitle);
                if (ChatObject.isChannelOrGiga(i60Var.Z0)) {
                    alertDialog$Builder2.f18437a.T = LocaleController.getString(R.string.VoipChannelStopRecordingText);
                } else {
                    alertDialog$Builder2.f18437a.T = LocaleController.getString(R.string.VoipGroupStopRecordingText);
                }
                alertDialog$Builder2.k(LocaleController.getString(R.string.Stop), new ai.k(10, this, z10));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                int w04 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19158ug, false);
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f18437a;
                b2Var2.i(w04);
                b2Var2.show();
                b2Var2.o(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19028ng, false));
                return;
            }
            h50 h50Var = new h50(this, i60Var.getContext(), i60Var.Z0, i60Var.I2);
            if (i60Var.r1()) {
                h50Var.n(2);
            } else {
                h50Var.show();
            }
        } else if (i10 == 7) {
            i60Var.f34454l0 = true;
            i60Var.f34492u1.setVisibility(0);
            i60Var.f34496v1.setVisibility(0);
            i60Var.f34462n1.setVisibility(8);
            i60Var.f34506x1.setVisibility(8);
            i60Var.f34511y1.setVisibility(8);
            i60Var.f34501w1.setVisibility(8);
            i60Var.f34479r1.setVisibility(8);
            i60Var.f34466o1.setVisibility(8);
            i60Var.f34484s1.setVisibility(8);
            i60Var.f34488t1.setVisibility(8);
            i60Var.f34450k0.setVisibility(8);
            i60Var.f34470p1.setVisibility(8);
            i60Var.f34474q1.setVisibility(8);
            org.telegram.ui.ActionBar.v0 v0Var = i60Var.f34451k1;
            org.telegram.ui.ActionBar.n1 n1Var = v0Var.d;
            if (n1Var != null && n1Var.isShowing()) {
                v0Var.f19578b.measure(org.telegram.messenger.wl.d(40.0f, AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                v0Var.O(true, true);
            }
        } else if (i10 == 6) {
            i60Var.f34500w0 = false;
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(i60Var.getContext());
            editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.S(i60Var.getContext()));
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(i60Var.getContext());
            alertDialog$Builder3.f18437a.I = org.telegram.ui.ActionBar.i6.f19065pg;
            if (ChatObject.isChannelOrGiga(i60Var.Z0)) {
                alertDialog$Builder3.f18437a.R = LocaleController.getString(R.string.VoipChannelTitle);
            } else {
                alertDialog$Builder3.f18437a.R = LocaleController.getString(R.string.VoipGroupTitle);
            }
            alertDialog$Builder3.f18437a.f18496y0 = false;
            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new wz(1, editTextBoldCursor));
            LinearLayout linearLayout = new LinearLayout(i60Var.getContext());
            linearLayout.setOrientation(1);
            alertDialog$Builder3.n(linearLayout);
            editTextBoldCursor.setTextSize(1, 16.0f);
            int i14 = org.telegram.ui.ActionBar.i6.f19028ng;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i14, false));
            editTextBoldCursor.setMaxLines(1);
            editTextBoldCursor.setLines(1);
            editTextBoldCursor.setInputType(16385);
            editTextBoldCursor.setGravity(51);
            editTextBoldCursor.setSingleLine(true);
            editTextBoldCursor.setImeOptions(6);
            TLRPC.Chat chat = i60Var.Z0;
            if (chat != null) {
                str = chat.title;
            } else {
                str = "";
            }
            editTextBoldCursor.setHint(str);
            editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19047og, false));
            editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.i6.w0(null, i14, false));
            editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
            linearLayout.addView(editTextBoldCursor, w7.x5.t(-1, 36, 51, 24, 6, 24, 0));
            editTextBoldCursor.setOnEditorActionListener(new xz(alertDialog$Builder3, 1));
            editTextBoldCursor.addTextChangedListener(new zz(1, editTextBoldCursor));
            if (!TextUtils.isEmpty(i60Var.f34410a1.call.title)) {
                editTextBoldCursor.setText(i60Var.f34410a1.call.title);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            alertDialog$Builder3.k(LocaleController.getString(R.string.Save), new b7(this, editTextBoldCursor, alertDialog$Builder3, 15));
            int w05 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18880fg, false);
            org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.f18437a;
            b2Var3.i(w05);
            b2Var3.setOnShowListener(new g50(this, b2Var3, editTextBoldCursor, 0));
            b2Var3.setOnDismissListener(new yz(1, editTextBoldCursor));
            b2Var3.show();
            b2Var3.o(org.telegram.ui.ActionBar.i6.w0(null, i14, false));
            editTextBoldCursor.requestFocus();
        } else if (i10 == 8) {
            org.telegram.ui.Components.w70.u(i60Var.getContext(), -i60Var.i1(), i60Var.d, null, 2, i60Var.A0, new f50(this));
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
                org.telegram.ui.Cells.p6.n(i13, 1, arrayList2, arrayList3);
            }
            if (sharedInstance.isBluetoothHeadsetConnected()) {
                String str2 = sharedInstance.currentBluetoothDeviceName;
                if (str2 == null) {
                    str2 = LocaleController.getString(R.string.VoipAudioRoutingBluetooth);
                }
                arrayList.add(str2);
                org.telegram.ui.Cells.p6.n(R.drawable.msg_voice_bluetooth, 2, arrayList2, arrayList3);
            }
            int size = arrayList.size();
            CharSequence[] charSequenceArr = new CharSequence[size];
            int[] iArr = new int[size];
            for (int i15 = 0; i15 < size; i15++) {
                charSequenceArr[i15] = (CharSequence) arrayList.get(i15);
                iArr[i15] = ((Integer) arrayList2.get(i15)).intValue();
            }
            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) this.f35340a, (org.telegram.ui.ActionBar.e6) null, false);
            f3Var.fixNavigationBar();
            f3Var.title = LocaleController.getString(R.string.VoipSelectAudioOutput);
            f3Var.bigTitle = true;
            lg.j jVar = new lg.j(8, this, arrayList3);
            f3Var.items = charSequenceArr;
            f3Var.itemIcons = iArr;
            f3Var.onClickListener = jVar;
            int i16 = org.telegram.ui.ActionBar.i6.f18974kg;
            f3Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, i16, false));
            f3Var.fixNavigationBar(org.telegram.ui.ActionBar.i6.w0(null, i16, false));
            if (sharedInstance.getCurrentAudioRoute() == 1) {
                i11 = 0;
            } else if (sharedInstance.getCurrentAudioRoute() == 0) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            f3Var.show();
            f3Var.setTitleColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19028ng, false));
            for (int i17 = 0; i17 < f3Var.getItemViews().size(); i17++) {
                org.telegram.ui.ActionBar.y2 y2Var = f3Var.getItemViews().get(i17);
                if (i17 == i11) {
                    w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19065pg, false);
                    y2Var.f19731f = true;
                } else {
                    w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19028ng, false);
                }
                y2Var.setTextColor(w02);
                y2Var.setIconColor(w02);
                y2Var.setBackground(org.telegram.ui.ActionBar.i6.f0(i0.a.k(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18916hg, false), 12), 2, -1));
            }
        }
    }
}
