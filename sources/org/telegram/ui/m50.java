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
public final class m50 extends org.telegram.ui.ActionBar.k {
    public final Activity f34846a;
    public final j60 f34847b;

    public m50(j60 j60Var, Activity activity) {
        this.f34847b = j60Var;
        this.f34846a = activity;
    }

    @Override
    public final void b(int i10) {
        VoIPService sharedInstance;
        int i11;
        int w02;
        int i12;
        int i13;
        String str;
        j60 j60Var = this.f34847b;
        if (i10 == -1) {
            j60Var.onBackPressed();
        } else if (i10 == 1) {
            j60Var.f33936a1.call.join_muted = false;
            j60.F0(j60Var);
        } else if (i10 == 2) {
            j60Var.f33936a1.call.join_muted = true;
            j60.F0(j60Var);
        } else if (i10 == 3) {
            j60Var.j1(false);
        } else if (i10 == 12) {
            j60.G0(j60Var, true);
        } else if (i10 == 13) {
            j60.G0(j60Var, false);
        } else if (i10 == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(j60Var.getContext());
            if (ChatObject.isChannelOrGiga(j60Var.Z0)) {
                alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.VoipChannelEndAlertTitle);
                alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.VoipChannelEndAlertText);
            } else {
                alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.VoipGroupEndAlertTitle);
                alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.VoipGroupEndAlertText);
            }
            alertDialog$Builder.f17528a.I = org.telegram.ui.ActionBar.j6.f18153pg;
            alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupEnd), new g50(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18246ug, false);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
            d2Var.i(w03);
            d2Var.show();
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18262vg, false));
            }
            d2Var.o(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18007hg, false));
        } else if (i10 == 9) {
            j60Var.f33983m1.callOnClick();
        } else if (i10 == 5) {
            ChatObject.Call call = j60Var.f33936a1;
            if (call.recording) {
                boolean z10 = call.call.record_video_active;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(j60Var.getContext());
                alertDialog$Builder2.f17528a.I = org.telegram.ui.ActionBar.j6.f18153pg;
                alertDialog$Builder2.f17528a.R = LocaleController.getString(R.string.VoipGroupStopRecordingTitle);
                if (ChatObject.isChannelOrGiga(j60Var.Z0)) {
                    alertDialog$Builder2.f17528a.T = LocaleController.getString(R.string.VoipChannelStopRecordingText);
                } else {
                    alertDialog$Builder2.f17528a.T = LocaleController.getString(R.string.VoipGroupStopRecordingText);
                }
                alertDialog$Builder2.k(LocaleController.getString(R.string.Stop), new gg.d0(9, this, z10));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                int w04 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18246ug, false);
                org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f17528a;
                d2Var2.i(w04);
                d2Var2.show();
                d2Var2.o(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18117ng, false));
                return;
            }
            i50 i50Var = new i50(this, j60Var.getContext(), j60Var.Z0, j60Var.I2);
            if (j60Var.r1()) {
                i50Var.n(2);
            } else {
                i50Var.show();
            }
        } else if (i10 == 7) {
            j60Var.f33980l0 = true;
            j60Var.f34018u1.setVisibility(0);
            j60Var.f34022v1.setVisibility(0);
            j60Var.f33988n1.setVisibility(8);
            j60Var.f34032x1.setVisibility(8);
            j60Var.f34037y1.setVisibility(8);
            j60Var.f34027w1.setVisibility(8);
            j60Var.f34005r1.setVisibility(8);
            j60Var.f33992o1.setVisibility(8);
            j60Var.f34010s1.setVisibility(8);
            j60Var.f34014t1.setVisibility(8);
            j60Var.f33976k0.setVisibility(8);
            j60Var.f33996p1.setVisibility(8);
            j60Var.f34000q1.setVisibility(8);
            org.telegram.ui.ActionBar.w0 w0Var = j60Var.f33977k1;
            org.telegram.ui.ActionBar.p1 p1Var = w0Var.d;
            if (p1Var != null && p1Var.isShowing()) {
                w0Var.f18686b.measure(org.telegram.messenger.em.d(40.0f, AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                w0Var.O(true, true);
            }
        } else if (i10 == 6) {
            j60Var.f34026w0 = false;
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(j60Var.getContext());
            editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.S(j60Var.getContext()));
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(j60Var.getContext());
            alertDialog$Builder3.f17528a.I = org.telegram.ui.ActionBar.j6.f18153pg;
            if (ChatObject.isChannelOrGiga(j60Var.Z0)) {
                alertDialog$Builder3.f17528a.R = LocaleController.getString(R.string.VoipChannelTitle);
            } else {
                alertDialog$Builder3.f17528a.R = LocaleController.getString(R.string.VoipGroupTitle);
            }
            alertDialog$Builder3.f17528a.f17644y0 = false;
            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new yz(1, editTextBoldCursor));
            LinearLayout linearLayout = new LinearLayout(j60Var.getContext());
            linearLayout.setOrientation(1);
            alertDialog$Builder3.n(linearLayout);
            editTextBoldCursor.setTextSize(1, 16.0f);
            int i14 = org.telegram.ui.ActionBar.j6.f18117ng;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
            editTextBoldCursor.setMaxLines(1);
            editTextBoldCursor.setLines(1);
            editTextBoldCursor.setInputType(16385);
            editTextBoldCursor.setGravity(51);
            editTextBoldCursor.setSingleLine(true);
            editTextBoldCursor.setImeOptions(6);
            TLRPC.Chat chat = j60Var.Z0;
            if (chat != null) {
                str = chat.title;
            } else {
                str = "";
            }
            editTextBoldCursor.setHint(str);
            editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18135og, false));
            editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
            editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
            linearLayout.addView(editTextBoldCursor, w7.a6.t(-1, 36, 51, 24, 6, 24, 0));
            editTextBoldCursor.setOnEditorActionListener(new zz(alertDialog$Builder3, 1));
            editTextBoldCursor.addTextChangedListener(new b00(1, editTextBoldCursor));
            if (!TextUtils.isEmpty(j60Var.f33936a1.call.title)) {
                editTextBoldCursor.setText(j60Var.f33936a1.call.title);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            alertDialog$Builder3.k(LocaleController.getString(R.string.Save), new a7(this, editTextBoldCursor, alertDialog$Builder3, 15));
            int w05 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17972fg, false);
            org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder3.f17528a;
            d2Var3.i(w05);
            d2Var3.setOnShowListener(new h50(this, d2Var3, editTextBoldCursor, 0));
            d2Var3.setOnDismissListener(new a00(1, editTextBoldCursor));
            d2Var3.show();
            d2Var3.o(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
            editTextBoldCursor.requestFocus();
        } else if (i10 == 8) {
            org.telegram.ui.Components.f80.u(j60Var.getContext(), -j60Var.i1(), j60Var.d, null, 2, j60Var.A0, new g50(this));
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
                org.telegram.ui.Cells.r6.n(i13, 1, arrayList2, arrayList3);
            }
            if (sharedInstance.isBluetoothHeadsetConnected()) {
                String str2 = sharedInstance.currentBluetoothDeviceName;
                if (str2 == null) {
                    str2 = LocaleController.getString(R.string.VoipAudioRoutingBluetooth);
                }
                arrayList.add(str2);
                org.telegram.ui.Cells.r6.n(R.drawable.msg_voice_bluetooth, 2, arrayList2, arrayList3);
            }
            int size = arrayList.size();
            CharSequence[] charSequenceArr = new CharSequence[size];
            int[] iArr = new int[size];
            for (int i15 = 0; i15 < size; i15++) {
                charSequenceArr[i15] = (CharSequence) arrayList.get(i15);
                iArr[i15] = ((Integer) arrayList2.get(i15)).intValue();
            }
            org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, (Context) this.f34846a, (org.telegram.ui.ActionBar.f6) null, false);
            h3Var.fixNavigationBar();
            h3Var.title = LocaleController.getString(R.string.VoipSelectAudioOutput);
            h3Var.bigTitle = true;
            kg.j jVar = new kg.j(9, this, arrayList3);
            h3Var.items = charSequenceArr;
            h3Var.itemIcons = iArr;
            h3Var.onClickListener = jVar;
            int i16 = org.telegram.ui.ActionBar.j6.f18065kg;
            h3Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
            h3Var.fixNavigationBar(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
            if (sharedInstance.getCurrentAudioRoute() == 1) {
                i11 = 0;
            } else if (sharedInstance.getCurrentAudioRoute() == 0) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            h3Var.show();
            h3Var.setTitleColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18117ng, false));
            for (int i17 = 0; i17 < h3Var.getItemViews().size(); i17++) {
                org.telegram.ui.ActionBar.a3 a3Var = h3Var.getItemViews().get(i17);
                if (i17 == i11) {
                    w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18153pg, false);
                    a3Var.f17540f = true;
                } else {
                    w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18117ng, false);
                }
                a3Var.setTextColor(w02);
                a3Var.setIconColor(w02);
                a3Var.setBackground(org.telegram.ui.ActionBar.j6.f0(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18007hg, false), 12), 2, -1));
            }
        }
    }
}
