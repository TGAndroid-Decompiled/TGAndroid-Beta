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
public final class i50 extends org.telegram.ui.ActionBar.j {
    public final Activity f34028a;
    public final f60 f34029b;

    public i50(f60 f60Var, Activity activity) {
        this.f34029b = f60Var;
        this.f34028a = activity;
    }

    @Override
    public final void b(int i10) {
        VoIPService sharedInstance;
        int i11;
        int w02;
        int i12;
        int i13;
        String str;
        f60 f60Var = this.f34029b;
        if (i10 == -1) {
            f60Var.onBackPressed();
        } else if (i10 == 1) {
            f60Var.f33099a1.call.join_muted = false;
            f60.F0(f60Var);
        } else if (i10 == 2) {
            f60Var.f33099a1.call.join_muted = true;
            f60.F0(f60Var);
        } else if (i10 == 3) {
            f60Var.j1(false);
        } else if (i10 == 12) {
            f60.G0(f60Var, true);
        } else if (i10 == 13) {
            f60.G0(f60Var, false);
        } else if (i10 == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f60Var.getContext());
            if (ChatObject.isChannelOrGiga(f60Var.Z0)) {
                alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.VoipChannelEndAlertTitle);
                alertDialog$Builder.f18409a.T = LocaleController.getString(R.string.VoipChannelEndAlertText);
            } else {
                alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.VoipGroupEndAlertTitle);
                alertDialog$Builder.f18409a.T = LocaleController.getString(R.string.VoipGroupEndAlertText);
            }
            alertDialog$Builder.f18409a.I = org.telegram.ui.ActionBar.h6.f19017pg;
            alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupEnd), new c50(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            int w03 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19110ug, false);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
            b2Var.i(w03);
            b2Var.show();
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19127vg, false));
            }
            b2Var.o(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18868hg, false));
        } else if (i10 == 9) {
            f60Var.f33146m1.callOnClick();
        } else if (i10 == 5) {
            ChatObject.Call call = f60Var.f33099a1;
            if (call.recording) {
                boolean z10 = call.call.record_video_active;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(f60Var.getContext());
                alertDialog$Builder2.f18409a.I = org.telegram.ui.ActionBar.h6.f19017pg;
                alertDialog$Builder2.f18409a.R = LocaleController.getString(R.string.VoipGroupStopRecordingTitle);
                if (ChatObject.isChannelOrGiga(f60Var.Z0)) {
                    alertDialog$Builder2.f18409a.T = LocaleController.getString(R.string.VoipChannelStopRecordingText);
                } else {
                    alertDialog$Builder2.f18409a.T = LocaleController.getString(R.string.VoipGroupStopRecordingText);
                }
                alertDialog$Builder2.k(LocaleController.getString(R.string.Stop), new ai.k(11, this, z10));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                int w04 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19110ug, false);
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f18409a;
                b2Var2.i(w04);
                b2Var2.show();
                b2Var2.o(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18980ng, false));
                return;
            }
            e50 e50Var = new e50(this, f60Var.getContext(), f60Var.Z0, f60Var.I2);
            if (f60Var.r1()) {
                e50Var.n(2);
            } else {
                e50Var.show();
            }
        } else if (i10 == 7) {
            f60Var.f33143l0 = true;
            f60Var.f33181u1.setVisibility(0);
            f60Var.f33185v1.setVisibility(0);
            f60Var.f33151n1.setVisibility(8);
            f60Var.f33195x1.setVisibility(8);
            f60Var.f33200y1.setVisibility(8);
            f60Var.f33190w1.setVisibility(8);
            f60Var.f33168r1.setVisibility(8);
            f60Var.f33155o1.setVisibility(8);
            f60Var.f33173s1.setVisibility(8);
            f60Var.f33177t1.setVisibility(8);
            f60Var.f33139k0.setVisibility(8);
            f60Var.f33159p1.setVisibility(8);
            f60Var.f33163q1.setVisibility(8);
            org.telegram.ui.ActionBar.v0 v0Var = f60Var.f33140k1;
            org.telegram.ui.ActionBar.n1 n1Var = v0Var.d;
            if (n1Var != null && n1Var.isShowing()) {
                v0Var.f19561b.measure(org.telegram.messenger.ul.d(40.0f, AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                v0Var.O(true, true);
            }
        } else if (i10 == 6) {
            f60Var.f33189w0 = false;
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(f60Var.getContext());
            editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.S(f60Var.getContext()));
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(f60Var.getContext());
            alertDialog$Builder3.f18409a.I = org.telegram.ui.ActionBar.h6.f19017pg;
            if (ChatObject.isChannelOrGiga(f60Var.Z0)) {
                alertDialog$Builder3.f18409a.R = LocaleController.getString(R.string.VoipChannelTitle);
            } else {
                alertDialog$Builder3.f18409a.R = LocaleController.getString(R.string.VoipGroupTitle);
            }
            alertDialog$Builder3.f18409a.f18482y0 = false;
            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new tz(1, editTextBoldCursor));
            LinearLayout linearLayout = new LinearLayout(f60Var.getContext());
            linearLayout.setOrientation(1);
            alertDialog$Builder3.n(linearLayout);
            editTextBoldCursor.setTextSize(1, 16.0f);
            int i14 = org.telegram.ui.ActionBar.h6.f18980ng;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i14, false));
            editTextBoldCursor.setMaxLines(1);
            editTextBoldCursor.setLines(1);
            editTextBoldCursor.setInputType(16385);
            editTextBoldCursor.setGravity(51);
            editTextBoldCursor.setSingleLine(true);
            editTextBoldCursor.setImeOptions(6);
            TLRPC.Chat chat = f60Var.Z0;
            if (chat != null) {
                str = chat.title;
            } else {
                str = "";
            }
            editTextBoldCursor.setHint(str);
            editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18999og, false));
            editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.h6.w0(null, i14, false));
            editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
            linearLayout.addView(editTextBoldCursor, w7.x5.t(-1, 36, 51, 24, 6, 24, 0));
            editTextBoldCursor.setOnEditorActionListener(new uz(alertDialog$Builder3, 1));
            editTextBoldCursor.addTextChangedListener(new wz(1, editTextBoldCursor));
            if (!TextUtils.isEmpty(f60Var.f33099a1.call.title)) {
                editTextBoldCursor.setText(f60Var.f33099a1.call.title);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            alertDialog$Builder3.k(LocaleController.getString(R.string.Save), new b7(this, editTextBoldCursor, alertDialog$Builder3, 15));
            int w05 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18833fg, false);
            org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.f18409a;
            b2Var3.i(w05);
            b2Var3.setOnShowListener(new d50(this, b2Var3, editTextBoldCursor, 0));
            b2Var3.setOnDismissListener(new vz(1, editTextBoldCursor));
            b2Var3.show();
            b2Var3.o(org.telegram.ui.ActionBar.h6.w0(null, i14, false));
            editTextBoldCursor.requestFocus();
        } else if (i10 == 8) {
            org.telegram.ui.Components.x70.u(f60Var.getContext(), -f60Var.i1(), f60Var.d, null, 2, f60Var.A0, new c50(this));
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
                org.telegram.ui.Cells.q3.n(i13, 1, arrayList2, arrayList3);
            }
            if (sharedInstance.isBluetoothHeadsetConnected()) {
                String str2 = sharedInstance.currentBluetoothDeviceName;
                if (str2 == null) {
                    str2 = LocaleController.getString(R.string.VoipAudioRoutingBluetooth);
                }
                arrayList.add(str2);
                org.telegram.ui.Cells.q3.n(R.drawable.msg_voice_bluetooth, 2, arrayList2, arrayList3);
            }
            int size = arrayList.size();
            CharSequence[] charSequenceArr = new CharSequence[size];
            int[] iArr = new int[size];
            for (int i15 = 0; i15 < size; i15++) {
                charSequenceArr[i15] = (CharSequence) arrayList.get(i15);
                iArr[i15] = ((Integer) arrayList2.get(i15)).intValue();
            }
            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) this.f34028a, (org.telegram.ui.ActionBar.d6) null, false);
            f3Var.fixNavigationBar();
            f3Var.title = LocaleController.getString(R.string.VoipSelectAudioOutput);
            f3Var.bigTitle = true;
            lg.j jVar = new lg.j(8, this, arrayList3);
            f3Var.items = charSequenceArr;
            f3Var.itemIcons = iArr;
            f3Var.onClickListener = jVar;
            int i16 = org.telegram.ui.ActionBar.h6.f18926kg;
            f3Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i16, false));
            f3Var.fixNavigationBar(org.telegram.ui.ActionBar.h6.w0(null, i16, false));
            if (sharedInstance.getCurrentAudioRoute() == 1) {
                i11 = 0;
            } else if (sharedInstance.getCurrentAudioRoute() == 0) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            f3Var.show();
            f3Var.setTitleColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18980ng, false));
            for (int i17 = 0; i17 < f3Var.getItemViews().size(); i17++) {
                org.telegram.ui.ActionBar.y2 y2Var = f3Var.getItemViews().get(i17);
                if (i17 == i11) {
                    w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19017pg, false);
                    y2Var.f19692f = true;
                } else {
                    w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18980ng, false);
                }
                y2Var.setTextColor(w02);
                y2Var.setIconColor(w02);
                y2Var.setBackground(org.telegram.ui.ActionBar.h6.f0(i0.a.k(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18868hg, false), 12), 2, -1));
            }
        }
    }
}
