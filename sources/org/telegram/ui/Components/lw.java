package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuffColorFilter;
import android.os.SystemClock;
import android.text.SpannableString;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public class lw extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate {
    public static Pattern V;
    public final zl0 E;
    public final lq F;
    public org.telegram.ui.ActionBar.m1 G;
    public final boolean H;
    public boolean I;
    public float J;
    public int K;
    public int L;
    public final g6 M;
    public final uv N;
    public int O;
    public boolean P;
    public long Q;
    public ValueAnimator R;
    public boolean S;
    public PorterDuffColorFilter T;
    public int U;
    public LongSparseArray f28292b;
    public final org.telegram.ui.ActionBar.m2 f28293c;
    public final co d;
    public final vv f28294e;
    public final bw f28295f;
    public final ci.v h;
    public zv f28296n;
    public final View f28297r;
    public final FrameLayout f28298s;
    public final TextView v;
    public final TextView f28299w;
    public final rg.q0 f28300x;
    public final s4.s f28301y;

    public lw(org.telegram.ui.ActionBar.m2 r21, android.content.Context r22, org.telegram.ui.ActionBar.c6 r23, java.util.ArrayList r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lw.<init>(org.telegram.ui.ActionBar.m2, android.content.Context, org.telegram.ui.ActionBar.c6, java.util.ArrayList):void");
    }

    public static void Q(lw lwVar, int i10) {
        ArrayList arrayList;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        String str;
        Context context;
        org.telegram.ui.ActionBar.m2 m2Var = lwVar.f28293c;
        vv vvVar = lwVar.f28294e;
        if (vvVar != null && (arrayList = vvVar.f27294b) != null && !arrayList.isEmpty()) {
            TLRPC.StickerSet stickerSet = ((TLRPC.TL_messages_stickerSet) vvVar.f27294b.get(0)).set;
            if (stickerSet != null && stickerSet.emojis) {
                str = "https://" + MessagesController.getInstance(lwVar.currentAccount).linkPrefix + "/addemoji/" + tL_messages_stickerSet.set.short_name;
            } else {
                str = "https://" + MessagesController.getInstance(lwVar.currentAccount).linkPrefix + "/addstickers/" + tL_messages_stickerSet.set.short_name;
            }
            String str2 = str;
            if (i10 == 1) {
                if (m2Var != null) {
                    context = m2Var.getParentActivity();
                } else {
                    context = null;
                }
                if (context == null) {
                    context = lwVar.getContext();
                }
                yv yvVar = new yv(lwVar, context, str2, str2, lwVar.resourcesProvider);
                if (m2Var != null) {
                    m2Var.showDialog(yvVar);
                } else {
                    yvVar.show();
                }
            } else if (i10 == 2) {
                try {
                    AndroidUtilities.addToClipboard(str2);
                    new zc((FrameLayout) lwVar.containerView, lwVar.resourcesProvider).k(false).j();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
        }
    }

    public static int V(lw lwVar) {
        return lwVar.currentAccount;
    }

    public static void X(final org.telegram.ui.ActionBar.m2 m2Var, TLObject tLObject, final boolean z10, final fi.m0 m0Var, final pq pqVar) {
        int currentAccount;
        final View fragmentView;
        final TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        if (m2Var == null) {
            currentAccount = UserConfig.selectedAccount;
        } else {
            currentAccount = m2Var.getCurrentAccount();
        }
        final int i10 = currentAccount;
        TLRPC.StickerSet stickerSet = null;
        if (m2Var == null) {
            fragmentView = null;
        } else {
            fragmentView = m2Var.getFragmentView();
        }
        if (tLObject != null) {
            if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            } else {
                tL_messages_stickerSet = null;
            }
            if (tL_messages_stickerSet != null) {
                stickerSet = tL_messages_stickerSet.set;
            } else if (tLObject instanceof TLRPC.StickerSet) {
                stickerSet = (TLRPC.StickerSet) tLObject;
            }
            final TLRPC.StickerSet stickerSet2 = stickerSet;
            if (stickerSet2 != null) {
                if (MediaDataController.getInstance(i10).cancelRemovingStickerSet(stickerSet2.f19829id)) {
                    if (m0Var != null) {
                        m0Var.run(Boolean.TRUE);
                        return;
                    }
                    return;
                }
                TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                tL_messages_installStickerSet.stickerset = tL_inputStickerSetID;
                tL_inputStickerSetID.f19822id = stickerSet2.f19829id;
                tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                ConnectionsManager.getInstance(i10).sendRequest(tL_messages_installStickerSet, new RequestDelegate() {
                    @Override
                    public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                        final TLRPC.StickerSet stickerSet3 = TLRPC.StickerSet.this;
                        final boolean z11 = z10;
                        final View view = fragmentView;
                        final org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        final TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
                        final int i11 = i10;
                        final Utilities.Callback callback = m0Var;
                        final Runnable runnable = pqVar;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                int i12;
                                TLObject tLObject3;
                                TLObject tLObject4 = tLObject2;
                                TLRPC.StickerSet stickerSet4 = TLRPC.StickerSet.this;
                                if (stickerSet4.masks) {
                                    i12 = 1;
                                } else if (stickerSet4.emojis) {
                                    i12 = 5;
                                } else {
                                    i12 = 0;
                                }
                                TLRPC.TL_error tL_error2 = tL_error;
                                View view2 = view;
                                org.telegram.ui.ActionBar.m2 m2Var3 = m2Var2;
                                int i13 = i11;
                                Utilities.Callback callback2 = callback;
                                try {
                                    if (tL_error2 == null) {
                                        if (z11 && view2 != null) {
                                            Context context = m2Var3.getFragmentView().getContext();
                                            TLObject tLObject5 = tL_messages_stickerSet2;
                                            if (tLObject5 == null) {
                                                tLObject3 = stickerSet4;
                                            } else {
                                                tLObject3 = tLObject5;
                                            }
                                            sc.g(m2Var3, new iy0(context, tLObject3, 1, 2, null, m2Var3.getResourceProvider()), 1500).j();
                                        }
                                        if (tLObject4 instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                                            MediaDataController.getInstance(i13).processStickerSetInstallResultArchive(m2Var3, true, i12, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject4);
                                        }
                                        if (callback2 != null) {
                                            callback2.run(Boolean.TRUE);
                                        }
                                    } else if (view2 != null) {
                                        Toast.makeText(m2Var3.getFragmentView().getContext(), LocaleController.getString(R.string.ErrorOccurred), 0).show();
                                        if (callback2 != null) {
                                            callback2.run(Boolean.FALSE);
                                        }
                                    } else if (callback2 != null) {
                                        callback2.run(Boolean.FALSE);
                                    }
                                } catch (Exception e7) {
                                    FileLog.e(e7);
                                }
                                MediaDataController.getInstance(i13).loadStickers(i12, false, true, false, new a3(runnable, 5));
                            }
                        });
                    }
                });
            }
        }
    }

    public static boolean o(lw lwVar, on onVar, MotionEvent motionEvent) {
        return org.telegram.ui.ut.q().s(motionEvent, lwVar.h, onVar, lwVar.N, lwVar.resourcesProvider);
    }

    public static void p(lw lwVar, ArrayList arrayList, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.c6 c6Var, View view, int i10) {
        vv vvVar = lwVar.f28294e;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
        int i11 = 0;
        if (arrayList != null && arrayList.size() > 1) {
            if (SystemClock.elapsedRealtime() - lwVar.Q >= 250) {
                int i12 = 0;
                while (true) {
                    ArrayList[] arrayListArr = vvVar.f27295c;
                    if (i11 >= arrayListArr.length) {
                        break;
                    }
                    int size = arrayListArr[i11].size();
                    if (vvVar.f27295c.length > 1) {
                        size = Math.min(lwVar.f28301y.J * 2, size);
                    }
                    i12 += size + 2;
                    if (i10 < i12) {
                        break;
                    }
                    i11++;
                }
                ArrayList arrayList2 = vvVar.f27294b;
                if (arrayList2 != null && i11 < arrayList2.size()) {
                    tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) vvVar.f27294b.get(i11);
                }
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                    ArrayList arrayList3 = new ArrayList();
                    TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    tL_inputStickerSetID.f19822id = stickerSet.f19829id;
                    tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                    arrayList3.add(tL_inputStickerSetID);
                    new wv(lwVar, m2Var, lwVar.getContext(), c6Var, arrayList3).show();
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.m1 m1Var = lwVar.G;
        if (m1Var != null) {
            m1Var.d(true);
            lwVar.G = null;
        } else if ((m2Var instanceof org.telegram.ui.eo) && ((org.telegram.ui.eo) m2Var).Y.getVisibility() == 0 && (view instanceof cw)) {
            b6 b6Var = ((cw) view).f25037c;
            try {
                TLRPC.Document document = b6Var.document;
                if (document == null) {
                    document = s5.f(lwVar.currentAccount, b6Var.getDocumentId());
                }
                SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(document));
                spannableString.setSpan(b6Var, 0, spannableString.length(), 33);
                ((org.telegram.ui.eo) m2Var).Y.E0.getText().append((CharSequence) spannableString);
                lwVar.Z();
                lwVar.dismiss();
            } catch (Exception unused) {
            }
            try {
                view.performHapticFeedback(3, 1);
            } catch (Exception unused2) {
            }
        }
    }

    public static void q(lw lwVar, b6 b6Var) {
        org.telegram.ui.ActionBar.m1 m1Var = lwVar.G;
        if (m1Var != null) {
            m1Var.d(true);
            lwVar.G = null;
            SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(s5.f(lwVar.currentAccount, b6Var.getDocumentId())));
            spannableString.setSpan(b6Var, 0, spannableString.length(), 33);
            if (AndroidUtilities.addToClipboard(spannableString)) {
                org.telegram.messenger.am.p(R.string.EmojiCopied, new zc((FrameLayout) lwVar.containerView, lwVar.resourcesProvider));
            }
        }
    }

    public static void r(lw lwVar, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        lwVar.J = floatValue;
        lwVar.h.setAlpha(floatValue);
        lwVar.v.setAlpha(lwVar.J);
        lwVar.f28299w.setAlpha(lwVar.J);
        lwVar.containerView.invalidate();
    }

    public static ViewGroup t(lw lwVar) {
        return lwVar.containerView;
    }

    public static ViewGroup u(lw lwVar) {
        return lwVar.containerView;
    }

    public final int W() {
        if (this.containerView == null) {
            return 0;
        }
        ci.v vVar = this.h;
        if (vVar != null && vVar.getChildCount() >= 1) {
            View childAt = vVar.getChildAt(0);
            co coVar = this.d;
            if (childAt != coVar) {
                return this.containerView.getPaddingTop();
            }
            return coVar.getBottom() + ((int) vVar.getY());
        }
        return this.containerView.getPaddingTop();
    }

    public final void a0() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f28293c;
        if (m2Var != null) {
            new rg.y0(m2Var, 11, false).show();
        } else if (getContext() instanceof LaunchActivity) {
            ((LaunchActivity) getContext()).p0(new PremiumPreviewFragment(0, null));
        }
    }

    public final void b0() {
        ArrayList arrayList;
        boolean z10;
        int i10;
        int i11;
        TLRPC.StickerSet stickerSet;
        if (this.f28298s == null) {
            return;
        }
        vv vvVar = this.f28294e;
        if (vvVar.f27294b == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(vvVar.f27294b);
        }
        int i12 = 0;
        while (i12 < arrayList.size()) {
            if (arrayList.get(i12) == null) {
                arrayList.remove(i12);
                i12--;
            }
            i12++;
        }
        MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
        final ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i13);
            if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null) {
                if (!mediaDataController.isStickerPackInstalled(stickerSet.f19829id)) {
                    arrayList3.add(tL_messages_stickerSet);
                } else {
                    arrayList2.add(tL_messages_stickerSet);
                }
            }
        }
        final ArrayList arrayList4 = new ArrayList(arrayList3);
        if (vvVar.f27293a != null && arrayList.size() == vvVar.f27293a.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!this.S && z10 && this.R == null) {
            this.R = ValueAnimator.ofFloat(this.J, 1.0f);
            this.containerView.getY();
            this.R.addUpdateListener(new m6(this, 17));
            this.R.setDuration(250L);
            this.R.setInterpolator(js.h);
            this.R.start();
        }
        this.S = z10;
        ci.v vVar = this.h;
        if (!z10) {
            vVar.setAlpha(0.0f);
        } else if (this.O >= 0) {
            int L0 = this.f28301y.L0();
            int E = this.f28296n.E(this.O);
            if (Math.abs(L0 - E) > 54) {
                if (L0 < E) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                zl0 zl0Var = this.E;
                zl0Var.f33430b = i11;
                zl0Var.d(E, (AndroidUtilities.displaySize.y / 2) - AndroidUtilities.dp(170.0f), false, false);
            } else {
                vVar.x0(E);
            }
            this.K = this.f28296n.E(this.O);
            zv zvVar = this.f28296n;
            int i14 = this.O;
            lw lwVar = zvVar.f33495c;
            boolean z11 = lwVar.I;
            vv vvVar2 = lwVar.f28294e;
            if (z11) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            int i15 = 0;
            while (true) {
                ArrayList[] arrayListArr = vvVar2.f27295c;
                if (i15 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i15].size();
                if (vvVar2.f27295c.length > 1) {
                    size = Math.min(lwVar.f28301y.J * 2, size);
                }
                if (i15 == i14) {
                    i10 = i10 + size + 1;
                    break;
                } else {
                    i10 += size + 2;
                    i15++;
                }
            }
            this.L = i10;
            this.M.d(1.0f, true);
            vVar.invalidate();
            this.O = -1;
        }
        boolean z12 = this.S;
        rg.q0 q0Var = this.f28300x;
        TextView textView = this.f28299w;
        TextView textView2 = this.v;
        if (z12 && !this.H) {
            q0Var.setVisibility(4);
            if (arrayList4.size() > 0) {
                textView2.setVisibility(0);
                textView.setVisibility(8);
                if (arrayList4.size() == 1) {
                    textView2.setText(LocaleController.formatPluralString("AddManyEmojiCount", ((TLRPC.TL_messages_stickerSet) arrayList4.get(0)).documents.size(), new Object[0]));
                } else {
                    textView2.setText(LocaleController.formatPluralString("AddManyEmojiPacksCount", arrayList4.size(), new Object[0]));
                }
                textView2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        boolean z13;
                        fi.m0 m0Var;
                        boolean z14;
                        switch (r1) {
                            case 0:
                                ArrayList arrayList5 = arrayList4;
                                int size2 = arrayList5.size();
                                int[] iArr = new int[2];
                                int i16 = 0;
                                while (true) {
                                    int size3 = arrayList5.size();
                                    lw lwVar2 = this;
                                    if (i16 < size3) {
                                        org.telegram.ui.ActionBar.m2 m2Var = lwVar2.f28293c;
                                        TLObject tLObject = (TLObject) arrayList5.get(i16);
                                        if (size2 == 1) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        if (size2 > 1) {
                                            m0Var = new fi.m0(lwVar2, iArr, size2, arrayList5);
                                        } else {
                                            m0Var = null;
                                        }
                                        lw.X(m2Var, tLObject, z13, m0Var, null);
                                        i16++;
                                    } else {
                                        lwVar2.Y(true);
                                        if (size2 <= 1) {
                                            lwVar2.dismiss();
                                            return;
                                        }
                                        return;
                                    }
                                }
                            default:
                                lw lwVar3 = this;
                                lwVar3.dismiss();
                                org.telegram.ui.ActionBar.m2 m2Var2 = lwVar3.f28293c;
                                ArrayList<TLRPC.TL_messages_stickerSet> arrayList6 = arrayList4;
                                if (m2Var2 != null) {
                                    MediaDataController.getInstance(m2Var2.getCurrentAccount()).removeMultipleStickerSets(m2Var2.getContext(), m2Var2, arrayList6);
                                } else {
                                    for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = arrayList6.get(i17);
                                        Context context = lwVar3.getContext();
                                        if (i17 == 0) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        if (tL_messages_stickerSet2 != null) {
                                            MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(context, tL_messages_stickerSet2, 0, null, true, z14, null, true);
                                        }
                                    }
                                }
                                lwVar3.Y(false);
                                return;
                        }
                    }
                });
                c0(true);
                return;
            } else if (arrayList2.size() > 0) {
                textView2.setVisibility(8);
                textView.setVisibility(0);
                if (arrayList2.size() == 1) {
                    textView.setText(LocaleController.formatPluralString("RemoveManyEmojiCount", ((TLRPC.TL_messages_stickerSet) arrayList2.get(0)).documents.size(), new Object[0]));
                } else {
                    textView.setText(LocaleController.formatPluralString("RemoveManyEmojiPacksCount", arrayList2.size(), new Object[0]));
                }
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        boolean z13;
                        fi.m0 m0Var;
                        boolean z14;
                        switch (r1) {
                            case 0:
                                ArrayList arrayList5 = arrayList2;
                                int size2 = arrayList5.size();
                                int[] iArr = new int[2];
                                int i16 = 0;
                                while (true) {
                                    int size3 = arrayList5.size();
                                    lw lwVar2 = this;
                                    if (i16 < size3) {
                                        org.telegram.ui.ActionBar.m2 m2Var = lwVar2.f28293c;
                                        TLObject tLObject = (TLObject) arrayList5.get(i16);
                                        if (size2 == 1) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        if (size2 > 1) {
                                            m0Var = new fi.m0(lwVar2, iArr, size2, arrayList5);
                                        } else {
                                            m0Var = null;
                                        }
                                        lw.X(m2Var, tLObject, z13, m0Var, null);
                                        i16++;
                                    } else {
                                        lwVar2.Y(true);
                                        if (size2 <= 1) {
                                            lwVar2.dismiss();
                                            return;
                                        }
                                        return;
                                    }
                                }
                            default:
                                lw lwVar3 = this;
                                lwVar3.dismiss();
                                org.telegram.ui.ActionBar.m2 m2Var2 = lwVar3.f28293c;
                                ArrayList<TLRPC.TL_messages_stickerSet> arrayList6 = arrayList2;
                                if (m2Var2 != null) {
                                    MediaDataController.getInstance(m2Var2.getCurrentAccount()).removeMultipleStickerSets(m2Var2.getContext(), m2Var2, arrayList6);
                                } else {
                                    for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = arrayList6.get(i17);
                                        Context context = lwVar3.getContext();
                                        if (i17 == 0) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        if (tL_messages_stickerSet2 != null) {
                                            MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(context, tL_messages_stickerSet2, 0, null, true, z14, null, true);
                                        }
                                    }
                                }
                                lwVar3.Y(false);
                                return;
                        }
                    }
                });
                c0(true);
                return;
            } else {
                textView2.setVisibility(8);
                textView.setVisibility(8);
                c0(false);
                return;
            }
        }
        q0Var.setVisibility(8);
        textView2.setVisibility(8);
        textView.setVisibility(8);
        c0(false);
    }

    public final void c0(boolean z10) {
        boolean z11;
        float f7;
        float dp;
        float f10;
        float dp2;
        float f11;
        float f12;
        int i10 = 0;
        if (!this.P && z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f28299w.getVisibility() == 0) {
            i10 = AndroidUtilities.dp(19.0f);
        }
        float f13 = i10;
        boolean z12 = this.H;
        ci.v vVar = this.h;
        View view = this.f28297r;
        FrameLayout frameLayout = this.f28298s;
        float f14 = 1.0f;
        float f15 = 0.0f;
        if (z11) {
            ViewPropertyAnimator animate = frameLayout.animate();
            if (z10) {
                dp2 = f13;
            } else {
                dp2 = AndroidUtilities.dp(16.0f);
            }
            ViewPropertyAnimator translationY = animate.translationY(dp2);
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator duration = translationY.alpha(f11).setDuration(250L);
            js jsVar = js.h;
            duration.setInterpolator(jsVar).start();
            ViewPropertyAnimator animate2 = view.animate();
            if (z10) {
                f12 = -(AndroidUtilities.dp(68.0f) - f13);
            } else {
                f12 = 0.0f;
            }
            ViewPropertyAnimator translationY2 = animate2.translationY(f12);
            if (!z10) {
                f14 = 0.0f;
            }
            translationY2.alpha(f14).setDuration(250L).setInterpolator(jsVar).start();
            ViewPropertyAnimator animate3 = vVar.animate();
            if (!z12 && !z10) {
                f15 = AndroidUtilities.dp(68.0f) - f13;
            }
            animate3.translationY(f15).setDuration(250L).setInterpolator(jsVar).start();
        } else {
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            frameLayout.setAlpha(f7);
            if (z10) {
                dp = f13;
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            frameLayout.setTranslationY(dp);
            if (!z10) {
                f14 = 0.0f;
            }
            view.setAlpha(f14);
            if (z10) {
                f10 = -(AndroidUtilities.dp(68.0f) - f13);
            } else {
                f10 = 0.0f;
            }
            view.setTranslationY(f10);
            if (!z12 && !z10) {
                f15 = AndroidUtilities.dp(68.0f) - f13;
            }
            vVar.setTranslationY(f15);
        }
        this.P = z10;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        gw gwVar;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        if (i10 == NotificationCenter.stickersDidLoad) {
            int i12 = 0;
            while (true) {
                ci.v vVar = this.h;
                if (i12 < vVar.getChildCount()) {
                    View childAt = vVar.getChildAt(i12);
                    if ((childAt instanceof gw) && (tL_messages_stickerSet = (gwVar = (gw) childAt).f26535r) != null && tL_messages_stickerSet.set != null) {
                        gwVar.a(MediaDataController.getInstance(this.currentAccount).isStickerPackInstalled(gwVar.f26535r.set.f19829id), true);
                    }
                    i12++;
                } else {
                    b0();
                    return;
                }
            }
        }
    }

    @Override
    public void dismiss() {
        bw bwVar = this.f28295f;
        if (bwVar != null && bwVar.f24763w) {
            bwVar.f24763w = false;
            bwVar.invalidate();
        }
        super.dismiss();
        vv vvVar = this.f28294e;
        if (vvVar != null) {
            NotificationCenter.getInstance(vvVar.d).removeObserver(vvVar, NotificationCenter.groupStickersDidLoad);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
    }

    @Override
    public final int getContainerViewHeight() {
        int measuredHeight;
        int i10 = 0;
        ci.v vVar = this.h;
        if (vVar == null) {
            measuredHeight = 0;
        } else {
            measuredHeight = vVar.getMeasuredHeight();
        }
        int W = measuredHeight - W();
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            i10 = viewGroup.getPaddingTop();
        }
        return AndroidUtilities.dp(8.0f) + W + i10 + AndroidUtilities.navigationBarHeight;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
    }

    @Override
    public final void onBackPressed() {
        if (org.telegram.ui.ut.q().E) {
            org.telegram.ui.ut.q().o();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
    }

    @Override
    public final void show() {
        int currentAccount;
        TLRPC.StickerSet stickerSet;
        super.show();
        zv zvVar = new zv(this);
        this.f28296n = zvVar;
        this.h.setAdapter(zvVar);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4);
        vv vvVar = this.f28294e;
        if (!vvVar.f27296e) {
            vvVar.f27296e = true;
            lw lwVar = vvVar.f27297f;
            int i10 = vvVar.d;
            vvVar.f27294b = new ArrayList(vvVar.f27293a.size());
            vvVar.f27295c = new ArrayList[vvVar.f27293a.size()];
            NotificationCenter.getInstance(i10).addObserver(vvVar, NotificationCenter.groupStickersDidLoad);
            boolean[] zArr = new boolean[1];
            int i11 = 0;
            while (true) {
                if (i11 < vvVar.f27295c.length) {
                    org.telegram.ui.sk skVar = null;
                    TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(i10).getStickerSet((TLRPC.InputStickerSet) vvVar.f27293a.get(i11), null, false, new org.telegram.ui.tc(21, vvVar, zArr));
                    if (vvVar.f27295c.length == 1 && stickerSet2 != null && (stickerSet = stickerSet2.set) != null && !stickerSet.emojis) {
                        AndroidUtilities.runOnUIThread(new hw(vvVar, 0));
                        Context context = lwVar.getContext();
                        org.telegram.ui.ActionBar.m2 m2Var = lwVar.f28293c;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) vvVar.f27293a.get(i11);
                        org.telegram.ui.ActionBar.m2 m2Var2 = lwVar.f28293c;
                        if (m2Var2 instanceof org.telegram.ui.eo) {
                            skVar = ((org.telegram.ui.eo) m2Var2).Y;
                        }
                        new dz0(context, m2Var, inputStickerSet, null, skVar, lwVar.resourcesProvider).show();
                    } else {
                        vvVar.f27294b.add(stickerSet2);
                        vvVar.a(i11, stickerSet2);
                        i11++;
                    }
                } else {
                    lw lwVar2 = vvVar.h;
                    lwVar2.b0();
                    ci.v vVar = lwVar2.h;
                    if (vVar != null && vVar.getAdapter() != null) {
                        vVar.getAdapter().l();
                    }
                }
            }
        }
        b0();
        org.telegram.ui.ActionBar.m2 m2Var3 = this.f28293c;
        if (m2Var3 == null) {
            currentAccount = UserConfig.selectedAccount;
        } else {
            currentAccount = m2Var3.getCurrentAccount();
        }
        MediaDataController.getInstance(currentAccount).checkStickers(5);
    }

    public void Y(boolean z10) {
    }

    public void Z() {
    }
}
