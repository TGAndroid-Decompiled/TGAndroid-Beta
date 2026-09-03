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
public final class i50 extends org.telegram.ui.ActionBar.j {
    public final Activity f34802a;
    public final e60 f34803b;

    public i50(e60 e60Var, Activity activity) {
        this.f34803b = e60Var;
        this.f34802a = activity;
    }

    @Override
    public final void b(int i10) {
        VoIPService sharedInstance;
        int i11;
        int w02;
        int i12;
        int i13;
        String str;
        e60 e60Var = this.f34803b;
        if (i10 == -1) {
            e60Var.onBackPressed();
        } else if (i10 == 1) {
            e60Var.X0.call.join_muted = false;
            e60.F0(e60Var);
        } else if (i10 == 2) {
            e60Var.X0.call.join_muted = true;
            e60.F0(e60Var);
        } else if (i10 == 3) {
            e60Var.j1(false);
        } else if (i10 == 12) {
            e60.G0(e60Var, true);
        } else if (i10 == 13) {
            e60.G0(e60Var, false);
        } else if (i10 == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e60Var.getContext());
            if (ChatObject.isChannelOrGiga(e60Var.W0)) {
                alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.VoipChannelEndAlertTitle);
                alertDialog$Builder.f19478a.Q = LocaleController.getString(R.string.VoipChannelEndAlertText);
            } else {
                alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.VoipGroupEndAlertTitle);
                alertDialog$Builder.f19478a.Q = LocaleController.getString(R.string.VoipGroupEndAlertText);
            }
            alertDialog$Builder.f19478a.F = org.telegram.ui.ActionBar.j6.f20106pg;
            alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupEnd), new c50(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20192ug, false);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
            d2Var.i(w03);
            d2Var.show();
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20210vg, false));
            }
            d2Var.o(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19962hg, false));
        } else if (i10 == 9) {
            e60Var.f33655j1.callOnClick();
        } else if (i10 == 5) {
            ChatObject.Call call = e60Var.X0;
            if (call.recording) {
                boolean z4 = call.call.record_video_active;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(e60Var.getContext());
                alertDialog$Builder2.f19478a.F = org.telegram.ui.ActionBar.j6.f20106pg;
                alertDialog$Builder2.f19478a.O = LocaleController.getString(R.string.VoipGroupStopRecordingTitle);
                if (ChatObject.isChannelOrGiga(e60Var.W0)) {
                    alertDialog$Builder2.f19478a.Q = LocaleController.getString(R.string.VoipChannelStopRecordingText);
                } else {
                    alertDialog$Builder2.f19478a.Q = LocaleController.getString(R.string.VoipGroupStopRecordingText);
                }
                alertDialog$Builder2.k(LocaleController.getString(R.string.Stop), new ih.q(8, this, z4));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                int w04 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20192ug, false);
                org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f19478a;
                d2Var2.i(w04);
                d2Var2.show();
                d2Var2.o(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20069ng, false));
                return;
            }
            e50 e50Var = new e50(this, e60Var.getContext(), e60Var.W0, e60Var.F2);
            if (e60Var.r1()) {
                e50Var.n(2);
            } else {
                e50Var.show();
            }
        } else if (i10 == 7) {
            e60Var.f33650i0 = true;
            e60Var.f33687r1.setVisibility(0);
            e60Var.f33692s1.setVisibility(0);
            e60Var.f33659k1.setVisibility(8);
            e60Var.f33700u1.setVisibility(8);
            e60Var.f33704v1.setVisibility(8);
            e60Var.f33696t1.setVisibility(8);
            e60Var.f33674o1.setVisibility(8);
            e60Var.l1.setVisibility(8);
            e60Var.f33678p1.setVisibility(8);
            e60Var.f33682q1.setVisibility(8);
            e60Var.f33646h0.setVisibility(8);
            e60Var.f33665m1.setVisibility(8);
            e60Var.f33670n1.setVisibility(8);
            org.telegram.ui.ActionBar.w0 w0Var = e60Var.f33647h1;
            org.telegram.ui.ActionBar.p1 p1Var = w0Var.d;
            if (p1Var != null && p1Var.isShowing()) {
                w0Var.f20624b.measure(b.d(40.0f, AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                w0Var.O(true, true);
            }
        } else if (i10 == 6) {
            e60Var.f33695t0 = false;
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(e60Var.getContext());
            editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.S(e60Var.getContext()));
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(e60Var.getContext());
            alertDialog$Builder3.f19478a.F = org.telegram.ui.ActionBar.j6.f20106pg;
            if (ChatObject.isChannelOrGiga(e60Var.W0)) {
                alertDialog$Builder3.f19478a.O = LocaleController.getString(R.string.VoipChannelTitle);
            } else {
                alertDialog$Builder3.f19478a.O = LocaleController.getString(R.string.VoipGroupTitle);
            }
            alertDialog$Builder3.f19478a.f19586v0 = false;
            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new uz(1, editTextBoldCursor));
            LinearLayout linearLayout = new LinearLayout(e60Var.getContext());
            linearLayout.setOrientation(1);
            alertDialog$Builder3.n(linearLayout);
            editTextBoldCursor.setTextSize(1, 16.0f);
            int i14 = org.telegram.ui.ActionBar.j6.f20069ng;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
            editTextBoldCursor.setMaxLines(1);
            editTextBoldCursor.setLines(1);
            editTextBoldCursor.setInputType(16385);
            editTextBoldCursor.setGravity(51);
            editTextBoldCursor.setSingleLine(true);
            editTextBoldCursor.setImeOptions(6);
            TLRPC.Chat chat = e60Var.W0;
            if (chat != null) {
                str = chat.title;
            } else {
                str = "";
            }
            editTextBoldCursor.setHint(str);
            editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20087og, false));
            editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
            editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
            linearLayout.addView(editTextBoldCursor, k7.b6.t(-1, 36, 51, 24, 6, 24, 0));
            editTextBoldCursor.setOnEditorActionListener(new vz(alertDialog$Builder3, 1));
            editTextBoldCursor.addTextChangedListener(new xz(1, editTextBoldCursor));
            if (!TextUtils.isEmpty(e60Var.X0.call.title)) {
                editTextBoldCursor.setText(e60Var.X0.call.title);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            alertDialog$Builder3.k(LocaleController.getString(R.string.Save), new f7(this, editTextBoldCursor, alertDialog$Builder3, 15));
            int w05 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19926fg, false);
            org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder3.f19478a;
            d2Var3.i(w05);
            d2Var3.setOnShowListener(new d50(this, d2Var3, editTextBoldCursor, 0));
            d2Var3.setOnDismissListener(new wz(1, editTextBoldCursor));
            d2Var3.show();
            d2Var3.o(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
            editTextBoldCursor.requestFocus();
        } else if (i10 == 8) {
            org.telegram.ui.Components.z70.u(e60Var.getContext(), -e60Var.i1(), e60Var.d, null, 2, e60Var.f33713x0, new c50(this));
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
            org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(this.f34802a, null, false, false);
            g3Var.fixNavigationBar();
            g3Var.title = LocaleController.getString(R.string.VoipSelectAudioOutput);
            g3Var.bigTitle = true;
            cg.u1 u1Var = new cg.u1(8, this, arrayList3);
            g3Var.items = charSequenceArr;
            g3Var.itemIcons = iArr;
            g3Var.onClickListener = u1Var;
            int i16 = org.telegram.ui.ActionBar.j6.f20016kg;
            g3Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
            g3Var.fixNavigationBar(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
            if (sharedInstance.getCurrentAudioRoute() == 1) {
                i11 = 0;
            } else if (sharedInstance.getCurrentAudioRoute() == 0) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            g3Var.show();
            g3Var.setTitleColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20069ng, false));
            for (int i17 = 0; i17 < g3Var.getItemViews().size(); i17++) {
                org.telegram.ui.ActionBar.z2 z2Var = g3Var.getItemViews().get(i17);
                if (i17 == i11) {
                    w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20106pg, false);
                    z2Var.f20756f = true;
                } else {
                    w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20069ng, false);
                }
                z2Var.setTextColor(w02);
                z2Var.setIconColor(w02);
                z2Var.setBackground(org.telegram.ui.ActionBar.j6.f0(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19962hg, false), 12), 2, -1));
            }
        }
    }
}
