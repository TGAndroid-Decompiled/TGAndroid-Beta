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
public final class m50 extends org.telegram.ui.ActionBar.j {
    public final Activity f38573a;
    public final j60 f38574b;

    public m50(j60 j60Var, Activity activity) {
        this.f38574b = j60Var;
        this.f38573a = activity;
    }

    @Override
    public final void b(int i10) {
        VoIPService sharedInstance;
        int i11;
        int w02;
        int i12;
        int i13;
        String str;
        j60 j60Var = this.f38574b;
        if (i10 == -1) {
            j60Var.onBackPressed();
        } else if (i10 == 1) {
            j60Var.f37513a1.call.join_muted = false;
            j60.F0(j60Var);
        } else if (i10 == 2) {
            j60Var.f37513a1.call.join_muted = true;
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
                alertDialog$Builder.f20198a.R = LocaleController.getString(R.string.VoipChannelEndAlertTitle);
                alertDialog$Builder.f20198a.T = LocaleController.getString(R.string.VoipChannelEndAlertText);
            } else {
                alertDialog$Builder.f20198a.R = LocaleController.getString(R.string.VoipGroupEndAlertTitle);
                alertDialog$Builder.f20198a.T = LocaleController.getString(R.string.VoipGroupEndAlertText);
            }
            alertDialog$Builder.f20198a.I = org.telegram.ui.ActionBar.j6.f20889pg;
            alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupEnd), new g50(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20982ug, false);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20198a;
            b2Var.i(w03);
            b2Var.show();
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20999vg, false));
            }
            b2Var.o(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20743hg, false));
        } else if (i10 == 9) {
            j60Var.f37561m1.callOnClick();
        } else if (i10 == 5) {
            ChatObject.Call call = j60Var.f37513a1;
            if (call.recording) {
                boolean z10 = call.call.record_video_active;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(j60Var.getContext());
                alertDialog$Builder2.f20198a.I = org.telegram.ui.ActionBar.j6.f20889pg;
                alertDialog$Builder2.f20198a.R = LocaleController.getString(R.string.VoipGroupStopRecordingTitle);
                if (ChatObject.isChannelOrGiga(j60Var.Z0)) {
                    alertDialog$Builder2.f20198a.T = LocaleController.getString(R.string.VoipChannelStopRecordingText);
                } else {
                    alertDialog$Builder2.f20198a.T = LocaleController.getString(R.string.VoipGroupStopRecordingText);
                }
                alertDialog$Builder2.k(LocaleController.getString(R.string.Stop), new bi.h(10, this, z10));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                int w04 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20982ug, false);
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20198a;
                b2Var2.i(w04);
                b2Var2.show();
                b2Var2.o(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20853ng, false));
                return;
            }
            i50 i50Var = new i50(this, j60Var.getContext(), j60Var.Z0, j60Var.I2);
            if (j60Var.r1()) {
                i50Var.n(2);
            } else {
                i50Var.show();
            }
        } else if (i10 == 7) {
            j60Var.f37558l0 = true;
            j60Var.f37596u1.setVisibility(0);
            j60Var.f37600v1.setVisibility(0);
            j60Var.f37566n1.setVisibility(8);
            j60Var.f37610x1.setVisibility(8);
            j60Var.f37615y1.setVisibility(8);
            j60Var.f37605w1.setVisibility(8);
            j60Var.f37583r1.setVisibility(8);
            j60Var.f37570o1.setVisibility(8);
            j60Var.f37588s1.setVisibility(8);
            j60Var.f37592t1.setVisibility(8);
            j60Var.f37554k0.setVisibility(8);
            j60Var.f37574p1.setVisibility(8);
            j60Var.f37578q1.setVisibility(8);
            org.telegram.ui.ActionBar.v0 v0Var = j60Var.f37555k1;
            org.telegram.ui.ActionBar.n1 n1Var = v0Var.d;
            if (n1Var != null && n1Var.isShowing()) {
                v0Var.f21378b.measure(org.telegram.messenger.vl.d(40.0f, AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                v0Var.O(true, true);
            }
        } else if (i10 == 6) {
            j60Var.f37604w0 = false;
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(j60Var.getContext());
            editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.S(j60Var.getContext()));
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(j60Var.getContext());
            alertDialog$Builder3.f20198a.I = org.telegram.ui.ActionBar.j6.f20889pg;
            if (ChatObject.isChannelOrGiga(j60Var.Z0)) {
                alertDialog$Builder3.f20198a.R = LocaleController.getString(R.string.VoipChannelTitle);
            } else {
                alertDialog$Builder3.f20198a.R = LocaleController.getString(R.string.VoipGroupTitle);
            }
            alertDialog$Builder3.f20198a.f20260y0 = false;
            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new wz(1, editTextBoldCursor));
            LinearLayout linearLayout = new LinearLayout(j60Var.getContext());
            linearLayout.setOrientation(1);
            alertDialog$Builder3.n(linearLayout);
            editTextBoldCursor.setTextSize(1, 16.0f);
            int i14 = org.telegram.ui.ActionBar.j6.f20853ng;
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
            editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20871og, false));
            editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
            editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
            linearLayout.addView(editTextBoldCursor, w7.x5.t(-1, 36, 51, 24, 6, 24, 0));
            editTextBoldCursor.setOnEditorActionListener(new xz(alertDialog$Builder3, 1));
            editTextBoldCursor.addTextChangedListener(new zz(1, editTextBoldCursor));
            if (!TextUtils.isEmpty(j60Var.f37513a1.call.title)) {
                editTextBoldCursor.setText(j60Var.f37513a1.call.title);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            alertDialog$Builder3.k(LocaleController.getString(R.string.Save), new b7(this, editTextBoldCursor, alertDialog$Builder3, 15));
            int w05 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20708fg, false);
            org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.f20198a;
            b2Var3.i(w05);
            b2Var3.setOnShowListener(new h50(this, b2Var3, editTextBoldCursor, 0));
            b2Var3.setOnDismissListener(new yz(1, editTextBoldCursor));
            b2Var3.show();
            b2Var3.o(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
            editTextBoldCursor.requestFocus();
        } else if (i10 == 8) {
            org.telegram.ui.Components.w70.u(j60Var.getContext(), -j60Var.i1(), j60Var.d, null, 2, j60Var.A0, new g50(this));
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
            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) this.f38573a, (org.telegram.ui.ActionBar.f6) null, false);
            f3Var.fixNavigationBar();
            f3Var.title = LocaleController.getString(R.string.VoipSelectAudioOutput);
            f3Var.bigTitle = true;
            mg.j jVar = new mg.j(8, this, arrayList3);
            f3Var.items = charSequenceArr;
            f3Var.itemIcons = iArr;
            f3Var.onClickListener = jVar;
            int i16 = org.telegram.ui.ActionBar.j6.f20801kg;
            f3Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
            f3Var.fixNavigationBar(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
            if (sharedInstance.getCurrentAudioRoute() == 1) {
                i11 = 0;
            } else if (sharedInstance.getCurrentAudioRoute() == 0) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            f3Var.show();
            f3Var.setTitleColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20853ng, false));
            for (int i17 = 0; i17 < f3Var.getItemViews().size(); i17++) {
                org.telegram.ui.ActionBar.y2 y2Var = f3Var.getItemViews().get(i17);
                if (i17 == i11) {
                    w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20889pg, false);
                    y2Var.f21541f = true;
                } else {
                    w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20853ng, false);
                }
                y2Var.setTextColor(w02);
                y2Var.setIconColor(w02);
                y2Var.setBackground(org.telegram.ui.ActionBar.j6.f0(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20743hg, false), 12), 2, -1));
            }
        }
    }
}
