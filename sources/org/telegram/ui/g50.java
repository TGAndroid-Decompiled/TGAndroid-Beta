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
public final class g50 extends org.telegram.ui.ActionBar.j {
    public final Activity f34448a;
    public final c60 f34449b;

    public g50(c60 c60Var, Activity activity) {
        this.f34449b = c60Var;
        this.f34448a = activity;
    }

    @Override
    public final void b(int i10) {
        VoIPService sharedInstance;
        int i11;
        int w02;
        int i12;
        int i13;
        String str;
        c60 c60Var = this.f34449b;
        if (i10 == -1) {
            c60Var.onBackPressed();
        } else if (i10 == 1) {
            c60Var.X0.call.join_muted = false;
            c60.F0(c60Var);
        } else if (i10 == 2) {
            c60Var.X0.call.join_muted = true;
            c60.F0(c60Var);
        } else if (i10 == 3) {
            c60Var.j1(false);
        } else if (i10 == 12) {
            c60.G0(c60Var, true);
        } else if (i10 == 13) {
            c60.G0(c60Var, false);
        } else if (i10 == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(c60Var.getContext());
            if (ChatObject.isChannelOrGiga(c60Var.W0)) {
                alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.VoipChannelEndAlertTitle);
                alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.VoipChannelEndAlertText);
            } else {
                alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.VoipGroupEndAlertTitle);
                alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.VoipGroupEndAlertText);
            }
            alertDialog$Builder.f19503a.F = org.telegram.ui.ActionBar.j6.f20131pg;
            alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupEnd), new a50(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20217ug, false);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
            d2Var.i(w03);
            d2Var.show();
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20235vg, false));
            }
            d2Var.o(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19987hg, false));
        } else if (i10 == 9) {
            c60Var.f33136j1.callOnClick();
        } else if (i10 == 5) {
            ChatObject.Call call = c60Var.X0;
            if (call.recording) {
                boolean z4 = call.call.record_video_active;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(c60Var.getContext());
                alertDialog$Builder2.f19503a.F = org.telegram.ui.ActionBar.j6.f20131pg;
                alertDialog$Builder2.f19503a.O = LocaleController.getString(R.string.VoipGroupStopRecordingTitle);
                if (ChatObject.isChannelOrGiga(c60Var.W0)) {
                    alertDialog$Builder2.f19503a.Q = LocaleController.getString(R.string.VoipChannelStopRecordingText);
                } else {
                    alertDialog$Builder2.f19503a.Q = LocaleController.getString(R.string.VoipGroupStopRecordingText);
                }
                alertDialog$Builder2.k(LocaleController.getString(R.string.Stop), new ih.q(8, this, z4));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                int w04 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20217ug, false);
                org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f19503a;
                d2Var2.i(w04);
                d2Var2.show();
                d2Var2.o(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20094ng, false));
                return;
            }
            c50 c50Var = new c50(this, c60Var.getContext(), c60Var.W0, c60Var.F2);
            if (c60Var.r1()) {
                c50Var.n(2);
            } else {
                c50Var.show();
            }
        } else if (i10 == 7) {
            c60Var.f33131i0 = true;
            c60Var.f33168r1.setVisibility(0);
            c60Var.f33173s1.setVisibility(0);
            c60Var.f33140k1.setVisibility(8);
            c60Var.f33181u1.setVisibility(8);
            c60Var.f33185v1.setVisibility(8);
            c60Var.f33177t1.setVisibility(8);
            c60Var.f33155o1.setVisibility(8);
            c60Var.l1.setVisibility(8);
            c60Var.f33159p1.setVisibility(8);
            c60Var.f33163q1.setVisibility(8);
            c60Var.f33127h0.setVisibility(8);
            c60Var.f33146m1.setVisibility(8);
            c60Var.f33151n1.setVisibility(8);
            org.telegram.ui.ActionBar.w0 w0Var = c60Var.f33128h1;
            org.telegram.ui.ActionBar.p1 p1Var = w0Var.d;
            if (p1Var != null && p1Var.isShowing()) {
                w0Var.f20649b.measure(b.d(40.0f, AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                w0Var.O(true, true);
            }
        } else if (i10 == 6) {
            c60Var.f33176t0 = false;
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(c60Var.getContext());
            editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.S(c60Var.getContext()));
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(c60Var.getContext());
            alertDialog$Builder3.f19503a.F = org.telegram.ui.ActionBar.j6.f20131pg;
            if (ChatObject.isChannelOrGiga(c60Var.W0)) {
                alertDialog$Builder3.f19503a.O = LocaleController.getString(R.string.VoipChannelTitle);
            } else {
                alertDialog$Builder3.f19503a.O = LocaleController.getString(R.string.VoipGroupTitle);
            }
            alertDialog$Builder3.f19503a.f19611v0 = false;
            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new sz(1, editTextBoldCursor));
            LinearLayout linearLayout = new LinearLayout(c60Var.getContext());
            linearLayout.setOrientation(1);
            alertDialog$Builder3.n(linearLayout);
            editTextBoldCursor.setTextSize(1, 16.0f);
            int i14 = org.telegram.ui.ActionBar.j6.f20094ng;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
            editTextBoldCursor.setMaxLines(1);
            editTextBoldCursor.setLines(1);
            editTextBoldCursor.setInputType(16385);
            editTextBoldCursor.setGravity(51);
            editTextBoldCursor.setSingleLine(true);
            editTextBoldCursor.setImeOptions(6);
            TLRPC.Chat chat = c60Var.W0;
            if (chat != null) {
                str = chat.title;
            } else {
                str = "";
            }
            editTextBoldCursor.setHint(str);
            editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20112og, false));
            editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
            editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
            linearLayout.addView(editTextBoldCursor, k7.b6.t(-1, 36, 51, 24, 6, 24, 0));
            editTextBoldCursor.setOnEditorActionListener(new tz(alertDialog$Builder3, 1));
            editTextBoldCursor.addTextChangedListener(new vz(1, editTextBoldCursor));
            if (!TextUtils.isEmpty(c60Var.X0.call.title)) {
                editTextBoldCursor.setText(c60Var.X0.call.title);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            alertDialog$Builder3.k(LocaleController.getString(R.string.Save), new d7(this, editTextBoldCursor, alertDialog$Builder3, 15));
            int w05 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19951fg, false);
            org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder3.f19503a;
            d2Var3.i(w05);
            d2Var3.setOnShowListener(new b50(this, d2Var3, editTextBoldCursor, 0));
            d2Var3.setOnDismissListener(new uz(1, editTextBoldCursor));
            d2Var3.show();
            d2Var3.o(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
            editTextBoldCursor.requestFocus();
        } else if (i10 == 8) {
            org.telegram.ui.Components.y70.u(c60Var.getContext(), -c60Var.i1(), c60Var.d, null, 2, c60Var.f33194x0, new a50(this));
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
            org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(this.f34448a, null, false, false);
            g3Var.fixNavigationBar();
            g3Var.title = LocaleController.getString(R.string.VoipSelectAudioOutput);
            g3Var.bigTitle = true;
            cg.u1 u1Var = new cg.u1(8, this, arrayList3);
            g3Var.items = charSequenceArr;
            g3Var.itemIcons = iArr;
            g3Var.onClickListener = u1Var;
            int i16 = org.telegram.ui.ActionBar.j6.f20041kg;
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
            g3Var.setTitleColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20094ng, false));
            for (int i17 = 0; i17 < g3Var.getItemViews().size(); i17++) {
                org.telegram.ui.ActionBar.z2 z2Var = g3Var.getItemViews().get(i17);
                if (i17 == i11) {
                    w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20131pg, false);
                    z2Var.f20781f = true;
                } else {
                    w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20094ng, false);
                }
                z2Var.setTextColor(w02);
                z2Var.setIconColor(w02);
                z2Var.setBackground(org.telegram.ui.ActionBar.j6.f0(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19987hg, false), 12), 2, -1));
            }
        }
    }
}
