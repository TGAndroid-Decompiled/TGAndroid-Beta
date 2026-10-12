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
public final class q50 extends org.telegram.ui.ActionBar.j {
    public final Activity f39343a;
    public final n60 f39344b;

    public q50(n60 n60Var, Activity activity) {
        this.f39344b = n60Var;
        this.f39343a = activity;
    }

    @Override
    public final void b(int i10) {
        VoIPService sharedInstance;
        int i11;
        int x02;
        int i12;
        int i13;
        String str;
        n60 n60Var = this.f39344b;
        if (i10 == -1) {
            n60Var.onBackPressed();
        } else if (i10 == 1) {
            n60Var.f38442a1.call.join_muted = false;
            n60.G0(n60Var);
        } else if (i10 == 2) {
            n60Var.f38442a1.call.join_muted = true;
            n60.G0(n60Var);
        } else if (i10 == 3) {
            n60Var.k1(false);
        } else if (i10 == 12) {
            n60.H0(n60Var, true);
        } else if (i10 == 13) {
            n60.H0(n60Var, false);
        } else if (i10 == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n60Var.getContext());
            if (ChatObject.isChannelOrGiga(n60Var.Z0)) {
                alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.VoipChannelEndAlertTitle);
                alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.VoipChannelEndAlertText);
            } else {
                alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.VoipGroupEndAlertTitle);
                alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.VoipGroupEndAlertText);
            }
            alertDialog$Builder.f19548a.I = org.telegram.ui.ActionBar.g6.f20129pg;
            alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupEnd), new k50(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            int x03 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20225ug, false);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
            a2Var.i(x03);
            a2Var.show();
            TextView textView = (TextView) a2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20243vg, false));
            }
            a2Var.o(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19980hg, false));
        } else if (i10 == 9) {
            n60Var.f38490m1.callOnClick();
        } else if (i10 == 5) {
            ChatObject.Call call = n60Var.f38442a1;
            if (call.recording) {
                boolean z10 = call.call.record_video_active;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(n60Var.getContext());
                alertDialog$Builder2.f19548a.I = org.telegram.ui.ActionBar.g6.f20129pg;
                alertDialog$Builder2.f19548a.R = LocaleController.getString(R.string.VoipGroupStopRecordingTitle);
                if (ChatObject.isChannelOrGiga(n60Var.Z0)) {
                    alertDialog$Builder2.f19548a.T = LocaleController.getString(R.string.VoipChannelStopRecordingText);
                } else {
                    alertDialog$Builder2.f19548a.T = LocaleController.getString(R.string.VoipGroupStopRecordingText);
                }
                alertDialog$Builder2.k(LocaleController.getString(R.string.Stop), new bi.h(11, this, z10));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                int x04 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20225ug, false);
                org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.f19548a;
                a2Var2.i(x04);
                a2Var2.show();
                a2Var2.o(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20094ng, false));
                return;
            }
            m50 m50Var = new m50(this, n60Var.getContext(), n60Var.Z0, n60Var.I2);
            if (n60Var.s1()) {
                m50Var.o(2);
            } else {
                m50Var.show();
            }
        } else if (i10 == 7) {
            n60Var.f38487l0 = true;
            n60Var.f38525u1.setVisibility(0);
            n60Var.f38529v1.setVisibility(0);
            n60Var.f38495n1.setVisibility(8);
            n60Var.f38539x1.setVisibility(8);
            n60Var.f38544y1.setVisibility(8);
            n60Var.f38534w1.setVisibility(8);
            n60Var.f38512r1.setVisibility(8);
            n60Var.f38499o1.setVisibility(8);
            n60Var.f38517s1.setVisibility(8);
            n60Var.f38521t1.setVisibility(8);
            n60Var.f38483k0.setVisibility(8);
            n60Var.f38503p1.setVisibility(8);
            n60Var.f38507q1.setVisibility(8);
            org.telegram.ui.ActionBar.u0 u0Var = n60Var.f38484k1;
            org.telegram.ui.ActionBar.m1 m1Var = u0Var.d;
            if (m1Var != null && m1Var.isShowing()) {
                u0Var.f20675b.measure(org.telegram.messenger.yh.z(40.0f, AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                u0Var.O(true, true);
            }
        } else if (i10 == 6) {
            n60Var.f38533w0 = false;
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(n60Var.getContext());
            editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.T(n60Var.getContext()));
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(n60Var.getContext());
            alertDialog$Builder3.f19548a.I = org.telegram.ui.ActionBar.g6.f20129pg;
            if (ChatObject.isChannelOrGiga(n60Var.Z0)) {
                alertDialog$Builder3.f19548a.R = LocaleController.getString(R.string.VoipChannelTitle);
            } else {
                alertDialog$Builder3.f19548a.R = LocaleController.getString(R.string.VoipGroupTitle);
            }
            alertDialog$Builder3.f19548a.f19592y0 = false;
            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new b00(1, editTextBoldCursor));
            LinearLayout linearLayout = new LinearLayout(n60Var.getContext());
            linearLayout.setOrientation(1);
            alertDialog$Builder3.n(linearLayout);
            editTextBoldCursor.setTextSize(1, 16.0f);
            int i14 = org.telegram.ui.ActionBar.g6.f20094ng;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i14, false));
            editTextBoldCursor.setMaxLines(1);
            editTextBoldCursor.setLines(1);
            editTextBoldCursor.setInputType(16385);
            editTextBoldCursor.setGravity(51);
            editTextBoldCursor.setSingleLine(true);
            editTextBoldCursor.setImeOptions(6);
            TLRPC.Chat chat = n60Var.Z0;
            if (chat != null) {
                str = chat.title;
            } else {
                str = "";
            }
            editTextBoldCursor.setHint(str);
            editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20112og, false));
            editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.g6.x0(null, i14, false));
            editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
            linearLayout.addView(editTextBoldCursor, w7.a6.t(-1, 36, 51, 24, 6, 24, 0));
            editTextBoldCursor.setOnEditorActionListener(new c00(alertDialog$Builder3, 1));
            editTextBoldCursor.addTextChangedListener(new e00(1, editTextBoldCursor));
            if (!TextUtils.isEmpty(n60Var.f38442a1.call.title)) {
                editTextBoldCursor.setText(n60Var.f38442a1.call.title);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            alertDialog$Builder3.k(LocaleController.getString(R.string.Save), new f7(this, editTextBoldCursor, alertDialog$Builder3, 15));
            int x05 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.fg, false);
            org.telegram.ui.ActionBar.a2 a2Var3 = alertDialog$Builder3.f19548a;
            a2Var3.i(x05);
            a2Var3.setOnShowListener(new l50(this, a2Var3, editTextBoldCursor, 0));
            a2Var3.setOnDismissListener(new d00(1, editTextBoldCursor));
            a2Var3.show();
            a2Var3.o(org.telegram.ui.ActionBar.g6.x0(null, i14, false));
            editTextBoldCursor.requestFocus();
        } else if (i10 == 8) {
            org.telegram.ui.Components.w80.w(n60Var.getContext(), -n60Var.j1(), n60Var.d, null, 2, n60Var.A0, new k50(this));
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
                org.telegram.ui.Cells.d0.m(i13, 1, arrayList2, arrayList3);
            }
            if (sharedInstance.isBluetoothHeadsetConnected()) {
                String str2 = sharedInstance.currentBluetoothDeviceName;
                if (str2 == null) {
                    str2 = LocaleController.getString(R.string.VoipAudioRoutingBluetooth);
                }
                arrayList.add(str2);
                org.telegram.ui.Cells.d0.m(R.drawable.msg_voice_bluetooth, 2, arrayList2, arrayList3);
            }
            int size = arrayList.size();
            CharSequence[] charSequenceArr = new CharSequence[size];
            int[] iArr = new int[size];
            for (int i15 = 0; i15 < size; i15++) {
                charSequenceArr[i15] = (CharSequence) arrayList.get(i15);
                iArr[i15] = ((Integer) arrayList2.get(i15)).intValue();
            }
            org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, (Context) this.f39343a, (org.telegram.ui.ActionBar.c6) null, false);
            e3Var.fixNavigationBar();
            e3Var.title = LocaleController.getString(R.string.VoipSelectAudioOutput);
            e3Var.bigTitle = true;
            mg.j jVar = new mg.j(8, this, arrayList3);
            e3Var.items = charSequenceArr;
            e3Var.itemIcons = iArr;
            e3Var.onClickListener = jVar;
            int i16 = org.telegram.ui.ActionBar.g6.f20037kg;
            e3Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, i16, false));
            e3Var.fixNavigationBar(org.telegram.ui.ActionBar.g6.x0(null, i16, false));
            if (sharedInstance.getCurrentAudioRoute() == 1) {
                i11 = 0;
            } else if (sharedInstance.getCurrentAudioRoute() == 0) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            e3Var.show();
            e3Var.setTitleColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20094ng, false));
            for (int i17 = 0; i17 < e3Var.getItemViews().size(); i17++) {
                org.telegram.ui.ActionBar.x2 x2Var = e3Var.getItemViews().get(i17);
                if (i17 == i11) {
                    x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20129pg, false);
                    x2Var.f20808f = true;
                } else {
                    x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20094ng, false);
                }
                x2Var.setTextColor(x02);
                x2Var.setIconColor(x02);
                x2Var.setBackground(org.telegram.ui.ActionBar.g6.g0(i0.a.k(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19980hg, false), 12), 2, -1));
            }
        }
    }
}
