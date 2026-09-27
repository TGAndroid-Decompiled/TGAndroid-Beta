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
public final class j50 extends org.telegram.ui.ActionBar.j {
    public final Activity f34636a;
    public final g60 f34637b;

    public j50(g60 g60Var, Activity activity) {
        this.f34637b = g60Var;
        this.f34636a = activity;
    }

    @Override
    public final void b(int i10) {
        VoIPService sharedInstance;
        int i11;
        int w02;
        int i12;
        int i13;
        String str;
        g60 g60Var = this.f34637b;
        if (i10 == -1) {
            g60Var.onBackPressed();
        } else if (i10 == 1) {
            g60Var.f33726a1.call.join_muted = false;
            g60.F0(g60Var);
        } else if (i10 == 2) {
            g60Var.f33726a1.call.join_muted = true;
            g60.F0(g60Var);
        } else if (i10 == 3) {
            g60Var.j1(false);
        } else if (i10 == 12) {
            g60.G0(g60Var, true);
        } else if (i10 == 13) {
            g60.G0(g60Var, false);
        } else if (i10 == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g60Var.getContext());
            if (ChatObject.isChannelOrGiga(g60Var.Z0)) {
                alertDialog$Builder.f18655a.R = LocaleController.getString(R.string.VoipChannelEndAlertTitle);
                alertDialog$Builder.f18655a.T = LocaleController.getString(R.string.VoipChannelEndAlertText);
            } else {
                alertDialog$Builder.f18655a.R = LocaleController.getString(R.string.VoipGroupEndAlertTitle);
                alertDialog$Builder.f18655a.T = LocaleController.getString(R.string.VoipGroupEndAlertText);
            }
            alertDialog$Builder.f18655a.I = org.telegram.ui.ActionBar.i6.f19287pg;
            alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupEnd), new d50(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            int w03 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19382ug, false);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
            c2Var.i(w03);
            c2Var.show();
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19399vg, false));
            }
            c2Var.o(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19137hg, false));
        } else if (i10 == 9) {
            g60Var.f33773m1.callOnClick();
        } else if (i10 == 5) {
            ChatObject.Call call = g60Var.f33726a1;
            if (call.recording) {
                boolean z10 = call.call.record_video_active;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(g60Var.getContext());
                alertDialog$Builder2.f18655a.I = org.telegram.ui.ActionBar.i6.f19287pg;
                alertDialog$Builder2.f18655a.R = LocaleController.getString(R.string.VoipGroupStopRecordingTitle);
                if (ChatObject.isChannelOrGiga(g60Var.Z0)) {
                    alertDialog$Builder2.f18655a.T = LocaleController.getString(R.string.VoipChannelStopRecordingText);
                } else {
                    alertDialog$Builder2.f18655a.T = LocaleController.getString(R.string.VoipGroupStopRecordingText);
                }
                alertDialog$Builder2.k(LocaleController.getString(R.string.Stop), new ai.k(11, this, z10));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                int w04 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19382ug, false);
                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f18655a;
                c2Var2.i(w04);
                c2Var2.show();
                c2Var2.o(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19249ng, false));
                return;
            }
            f50 f50Var = new f50(this, g60Var.getContext(), g60Var.Z0, g60Var.I2);
            if (g60Var.r1()) {
                f50Var.n(2);
            } else {
                f50Var.show();
            }
        } else if (i10 == 7) {
            g60Var.f33770l0 = true;
            g60Var.f33808u1.setVisibility(0);
            g60Var.f33812v1.setVisibility(0);
            g60Var.f33778n1.setVisibility(8);
            g60Var.f33822x1.setVisibility(8);
            g60Var.f33827y1.setVisibility(8);
            g60Var.f33817w1.setVisibility(8);
            g60Var.f33795r1.setVisibility(8);
            g60Var.f33782o1.setVisibility(8);
            g60Var.f33800s1.setVisibility(8);
            g60Var.f33804t1.setVisibility(8);
            g60Var.f33766k0.setVisibility(8);
            g60Var.f33786p1.setVisibility(8);
            g60Var.f33790q1.setVisibility(8);
            org.telegram.ui.ActionBar.w0 w0Var = g60Var.f33767k1;
            org.telegram.ui.ActionBar.o1 o1Var = w0Var.d;
            if (o1Var != null && o1Var.isShowing()) {
                w0Var.f19838b.measure(org.telegram.messenger.qk.c(40.0f, AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                w0Var.O(true, true);
            }
        } else if (i10 == 6) {
            g60Var.f33816w0 = false;
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(g60Var.getContext());
            editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.S(g60Var.getContext()));
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(g60Var.getContext());
            alertDialog$Builder3.f18655a.I = org.telegram.ui.ActionBar.i6.f19287pg;
            if (ChatObject.isChannelOrGiga(g60Var.Z0)) {
                alertDialog$Builder3.f18655a.R = LocaleController.getString(R.string.VoipChannelTitle);
            } else {
                alertDialog$Builder3.f18655a.R = LocaleController.getString(R.string.VoipGroupTitle);
            }
            alertDialog$Builder3.f18655a.f18752y0 = false;
            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new vz(1, editTextBoldCursor));
            LinearLayout linearLayout = new LinearLayout(g60Var.getContext());
            linearLayout.setOrientation(1);
            alertDialog$Builder3.n(linearLayout);
            editTextBoldCursor.setTextSize(1, 16.0f);
            int i14 = org.telegram.ui.ActionBar.i6.f19249ng;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i14, false));
            editTextBoldCursor.setMaxLines(1);
            editTextBoldCursor.setLines(1);
            editTextBoldCursor.setInputType(16385);
            editTextBoldCursor.setGravity(51);
            editTextBoldCursor.setSingleLine(true);
            editTextBoldCursor.setImeOptions(6);
            TLRPC.Chat chat = g60Var.Z0;
            if (chat != null) {
                str = chat.title;
            } else {
                str = "";
            }
            editTextBoldCursor.setHint(str);
            editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19268og, false));
            editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.i6.w0(null, i14, false));
            editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
            linearLayout.addView(editTextBoldCursor, w7.y5.t(-1, 36, 51, 24, 6, 24, 0));
            editTextBoldCursor.setOnEditorActionListener(new wz(alertDialog$Builder3, 1));
            editTextBoldCursor.addTextChangedListener(new yz(1, editTextBoldCursor));
            if (!TextUtils.isEmpty(g60Var.f33726a1.call.title)) {
                editTextBoldCursor.setText(g60Var.f33726a1.call.title);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            alertDialog$Builder3.k(LocaleController.getString(R.string.Save), new d7(this, editTextBoldCursor, alertDialog$Builder3, 15));
            int w05 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19101fg, false);
            org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder3.f18655a;
            c2Var3.i(w05);
            c2Var3.setOnShowListener(new e50(this, c2Var3, editTextBoldCursor, 0));
            c2Var3.setOnDismissListener(new xz(1, editTextBoldCursor));
            c2Var3.show();
            c2Var3.o(org.telegram.ui.ActionBar.i6.w0(null, i14, false));
            editTextBoldCursor.requestFocus();
        } else if (i10 == 8) {
            org.telegram.ui.Components.j80.u(g60Var.getContext(), -g60Var.i1(), g60Var.d, null, 2, g60Var.A0, new d50(this));
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
                org.telegram.ui.Cells.c1.n(i13, 1, arrayList2, arrayList3);
            }
            if (sharedInstance.isBluetoothHeadsetConnected()) {
                String str2 = sharedInstance.currentBluetoothDeviceName;
                if (str2 == null) {
                    str2 = LocaleController.getString(R.string.VoipAudioRoutingBluetooth);
                }
                arrayList.add(str2);
                org.telegram.ui.Cells.c1.n(R.drawable.msg_voice_bluetooth, 2, arrayList2, arrayList3);
            }
            int size = arrayList.size();
            CharSequence[] charSequenceArr = new CharSequence[size];
            int[] iArr = new int[size];
            for (int i15 = 0; i15 < size; i15++) {
                charSequenceArr[i15] = (CharSequence) arrayList.get(i15);
                iArr[i15] = ((Integer) arrayList2.get(i15)).intValue();
            }
            org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(1, (Context) this.f34636a, (org.telegram.ui.ActionBar.e6) null, false);
            g3Var.fixNavigationBar();
            g3Var.title = LocaleController.getString(R.string.VoipSelectAudioOutput);
            g3Var.bigTitle = true;
            lg.j jVar = new lg.j(8, this, arrayList3);
            g3Var.items = charSequenceArr;
            g3Var.itemIcons = iArr;
            g3Var.onClickListener = jVar;
            int i16 = org.telegram.ui.ActionBar.i6.f19195kg;
            g3Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, i16, false));
            g3Var.fixNavigationBar(org.telegram.ui.ActionBar.i6.w0(null, i16, false));
            if (sharedInstance.getCurrentAudioRoute() == 1) {
                i11 = 0;
            } else if (sharedInstance.getCurrentAudioRoute() == 0) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            g3Var.show();
            g3Var.setTitleColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19249ng, false));
            for (int i17 = 0; i17 < g3Var.getItemViews().size(); i17++) {
                org.telegram.ui.ActionBar.z2 z2Var = g3Var.getItemViews().get(i17);
                if (i17 == i11) {
                    w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19287pg, false);
                    z2Var.f19969f = true;
                } else {
                    w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19249ng, false);
                }
                z2Var.setTextColor(w02);
                z2Var.setIconColor(w02);
                z2Var.setBackground(org.telegram.ui.ActionBar.i6.f0(i0.a.k(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19137hg, false), 12), 2, -1));
            }
        }
    }
}
