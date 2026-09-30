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
public class vv extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate {
    public static Pattern V;
    public final bl0 E;
    public final vp F;
    public org.telegram.ui.ActionBar.m1 G;
    public final boolean H;
    public boolean I;
    public float J;
    public int K;
    public int L;
    public final e6 M;
    public final ev N;
    public int O;
    public boolean P;
    public long Q;
    public ValueAnimator R;
    public boolean S;
    public PorterDuffColorFilter T;
    public int U;
    public LongSparseArray f29734b;
    public final org.telegram.ui.ActionBar.m2 f29735c;
    public final mn d;
    public final fv e;
    public final lv f29736f;
    public final ci.v h;
    public jv f29737n;
    public final View f29738r;
    public final FrameLayout f29739s;
    public final TextView v;
    public final TextView f29740w;
    public final rg.p0 f29741x;
    public final s4.s f29742y;

    public vv(org.telegram.ui.ActionBar.m2 r21, android.content.Context r22, org.telegram.ui.ActionBar.d6 r23, java.util.ArrayList r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vv.<init>(org.telegram.ui.ActionBar.m2, android.content.Context, org.telegram.ui.ActionBar.d6, java.util.ArrayList):void");
    }

    public static void P(vv vvVar, int i10) {
        ArrayList arrayList;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        String str;
        Context context;
        org.telegram.ui.ActionBar.m2 m2Var = vvVar.f29735c;
        fv fvVar = vvVar.e;
        if (fvVar != null && (arrayList = fvVar.f28374b) != null && !arrayList.isEmpty()) {
            TLRPC.StickerSet stickerSet = ((TLRPC.TL_messages_stickerSet) fvVar.f28374b.get(0)).set;
            if (stickerSet != null && stickerSet.emojis) {
                str = "https://" + MessagesController.getInstance(vvVar.currentAccount).linkPrefix + "/addemoji/" + tL_messages_stickerSet.set.short_name;
            } else {
                str = "https://" + MessagesController.getInstance(vvVar.currentAccount).linkPrefix + "/addstickers/" + tL_messages_stickerSet.set.short_name;
            }
            String str2 = str;
            if (i10 == 1) {
                if (m2Var != null) {
                    context = m2Var.getParentActivity();
                } else {
                    context = null;
                }
                if (context == null) {
                    context = vvVar.getContext();
                }
                iv ivVar = new iv(vvVar, context, str2, str2, vvVar.resourcesProvider);
                if (m2Var != null) {
                    m2Var.showDialog(ivVar);
                } else {
                    ivVar.show();
                }
            } else if (i10 == 2) {
                try {
                    AndroidUtilities.addToClipboard(str2);
                    new yc((FrameLayout) vvVar.containerView, vvVar.resourcesProvider).k(false).j();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
    }

    public static int U(vv vvVar) {
        return vvVar.currentAccount;
    }

    public static void W(final org.telegram.ui.ActionBar.m2 m2Var, TLObject tLObject, final boolean z10, final fi.m0 m0Var, final zp zpVar) {
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
                if (MediaDataController.getInstance(i10).cancelRemovingStickerSet(stickerSet2.f18364id)) {
                    if (m0Var != null) {
                        m0Var.run(Boolean.TRUE);
                        return;
                    }
                    return;
                }
                TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                tL_messages_installStickerSet.stickerset = tL_inputStickerSetID;
                tL_inputStickerSetID.f18357id = stickerSet2.f18364id;
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
                        final Runnable runnable = zpVar;
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
                                            qc.g(m2Var3, new mx0(context, tLObject3, 1, 2, null, m2Var3.getResourceProvider()), 1500).j();
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
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                                MediaDataController.getInstance(i13).loadStickers(i12, false, true, false, new y2(runnable, 5));
                            }
                        });
                    }
                });
            }
        }
    }

    public static boolean m(vv vvVar, xm xmVar, MotionEvent motionEvent) {
        return org.telegram.ui.nt.q().s(motionEvent, vvVar.h, xmVar, vvVar.N, vvVar.resourcesProvider);
    }

    public static void n(vv vvVar, ArrayList arrayList, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.d6 d6Var, View view, int i10) {
        fv fvVar = vvVar.e;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
        int i11 = 0;
        if (arrayList != null && arrayList.size() > 1) {
            if (SystemClock.elapsedRealtime() - vvVar.Q >= 250) {
                int i12 = 0;
                while (true) {
                    ArrayList[] arrayListArr = fvVar.f28375c;
                    if (i11 >= arrayListArr.length) {
                        break;
                    }
                    int size = arrayListArr[i11].size();
                    if (fvVar.f28375c.length > 1) {
                        size = Math.min(vvVar.f29742y.J * 2, size);
                    }
                    i12 += size + 2;
                    if (i10 < i12) {
                        break;
                    }
                    i11++;
                }
                ArrayList arrayList2 = fvVar.f28374b;
                if (arrayList2 != null && i11 < arrayList2.size()) {
                    tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) fvVar.f28374b.get(i11);
                }
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                    ArrayList arrayList3 = new ArrayList();
                    TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    tL_inputStickerSetID.f18357id = stickerSet.f18364id;
                    tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                    arrayList3.add(tL_inputStickerSetID);
                    new gv(vvVar, m2Var, vvVar.getContext(), d6Var, arrayList3).show();
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.m1 m1Var = vvVar.G;
        if (m1Var != null) {
            m1Var.d(true);
            vvVar.G = null;
        } else if ((m2Var instanceof org.telegram.ui.wn) && ((org.telegram.ui.wn) m2Var).Y.getVisibility() == 0 && (view instanceof mv)) {
            z5 z5Var = ((mv) view).f26501c;
            try {
                TLRPC.Document document = z5Var.document;
                if (document == null) {
                    document = q5.f(vvVar.currentAccount, z5Var.getDocumentId());
                }
                SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(document));
                spannableString.setSpan(z5Var, 0, spannableString.length(), 33);
                ((org.telegram.ui.wn) m2Var).Y.E0.getText().append((CharSequence) spannableString);
                vvVar.Y();
                vvVar.dismiss();
            } catch (Exception unused) {
            }
            try {
                view.performHapticFeedback(3, 1);
            } catch (Exception unused2) {
            }
        }
    }

    public static void o(vv vvVar, z5 z5Var) {
        org.telegram.ui.ActionBar.m1 m1Var = vvVar.G;
        if (m1Var != null) {
            m1Var.d(true);
            vvVar.G = null;
            SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(q5.f(vvVar.currentAccount, z5Var.getDocumentId())));
            spannableString.setSpan(z5Var, 0, spannableString.length(), 33);
            if (AndroidUtilities.addToClipboard(spannableString)) {
                org.telegram.messenger.ok.o(R.string.EmojiCopied, new yc((FrameLayout) vvVar.containerView, vvVar.resourcesProvider));
            }
        }
    }

    public static void p(vv vvVar, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        vvVar.J = floatValue;
        vvVar.h.setAlpha(floatValue);
        vvVar.v.setAlpha(vvVar.J);
        vvVar.f29740w.setAlpha(vvVar.J);
        vvVar.containerView.invalidate();
    }

    public static ViewGroup r(vv vvVar) {
        return vvVar.containerView;
    }

    public static ViewGroup s(vv vvVar) {
        return vvVar.containerView;
    }

    public final int V() {
        if (this.containerView == null) {
            return 0;
        }
        ci.v vVar = this.h;
        if (vVar != null && vVar.getChildCount() >= 1) {
            View childAt = vVar.getChildAt(0);
            mn mnVar = this.d;
            if (childAt != mnVar) {
                return this.containerView.getPaddingTop();
            }
            return mnVar.getBottom() + ((int) vVar.getY());
        }
        return this.containerView.getPaddingTop();
    }

    public final void Z() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f29735c;
        if (m2Var != null) {
            new rg.x0(m2Var, 11, false).show();
        } else if (getContext() instanceof LaunchActivity) {
            ((LaunchActivity) getContext()).p0(new PremiumPreviewFragment(0, null));
        }
    }

    public final void a0() {
        ArrayList arrayList;
        boolean z10;
        int i10;
        int i11;
        TLRPC.StickerSet stickerSet;
        if (this.f29739s == null) {
            return;
        }
        fv fvVar = this.e;
        if (fvVar.f28374b == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(fvVar.f28374b);
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
                if (!mediaDataController.isStickerPackInstalled(stickerSet.f18364id)) {
                    arrayList3.add(tL_messages_stickerSet);
                } else {
                    arrayList2.add(tL_messages_stickerSet);
                }
            }
        }
        final ArrayList arrayList4 = new ArrayList(arrayList3);
        if (fvVar.f28373a != null && arrayList.size() == fvVar.f28373a.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!this.S && z10 && this.R == null) {
            this.R = ValueAnimator.ofFloat(this.J, 1.0f);
            this.containerView.getY();
            this.R.addUpdateListener(new k6(this, 16));
            this.R.setDuration(250L);
            this.R.setInterpolator(sr.h);
            this.R.start();
        }
        this.S = z10;
        ci.v vVar = this.h;
        if (!z10) {
            vVar.setAlpha(0.0f);
        } else if (this.O >= 0) {
            int L0 = this.f29742y.L0();
            int E = this.f29737n.E(this.O);
            if (Math.abs(L0 - E) > 54) {
                if (L0 < E) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                bl0 bl0Var = this.E;
                bl0Var.f23012b = i11;
                bl0Var.c(E, (AndroidUtilities.displaySize.y / 2) - AndroidUtilities.dp(170.0f), false, false);
            } else {
                vVar.x0(E);
            }
            this.K = this.f29737n.E(this.O);
            jv jvVar = this.f29737n;
            int i14 = this.O;
            vv vvVar = jvVar.f25520c;
            boolean z11 = vvVar.I;
            fv fvVar2 = vvVar.e;
            if (z11) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            int i15 = 0;
            while (true) {
                ArrayList[] arrayListArr = fvVar2.f28375c;
                if (i15 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i15].size();
                if (fvVar2.f28375c.length > 1) {
                    size = Math.min(vvVar.f29742y.J * 2, size);
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
        rg.p0 p0Var = this.f29741x;
        TextView textView = this.f29740w;
        TextView textView2 = this.v;
        if (z12 && !this.H) {
            p0Var.setVisibility(4);
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
                                    vv vvVar2 = this;
                                    if (i16 < size3) {
                                        org.telegram.ui.ActionBar.m2 m2Var = vvVar2.f29735c;
                                        TLObject tLObject = (TLObject) arrayList5.get(i16);
                                        if (size2 == 1) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        if (size2 > 1) {
                                            m0Var = new fi.m0(vvVar2, iArr, size2, arrayList5);
                                        } else {
                                            m0Var = null;
                                        }
                                        vv.W(m2Var, tLObject, z13, m0Var, null);
                                        i16++;
                                    } else {
                                        vvVar2.X(true);
                                        if (size2 <= 1) {
                                            vvVar2.dismiss();
                                            return;
                                        }
                                        return;
                                    }
                                }
                            default:
                                vv vvVar3 = this;
                                vvVar3.dismiss();
                                org.telegram.ui.ActionBar.m2 m2Var2 = vvVar3.f29735c;
                                ArrayList<TLRPC.TL_messages_stickerSet> arrayList6 = arrayList4;
                                if (m2Var2 != null) {
                                    MediaDataController.getInstance(m2Var2.getCurrentAccount()).removeMultipleStickerSets(m2Var2.getContext(), m2Var2, arrayList6);
                                } else {
                                    for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = arrayList6.get(i17);
                                        Context context = vvVar3.getContext();
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
                                vvVar3.X(false);
                                return;
                        }
                    }
                });
                b0(true);
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
                                    vv vvVar2 = this;
                                    if (i16 < size3) {
                                        org.telegram.ui.ActionBar.m2 m2Var = vvVar2.f29735c;
                                        TLObject tLObject = (TLObject) arrayList5.get(i16);
                                        if (size2 == 1) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        if (size2 > 1) {
                                            m0Var = new fi.m0(vvVar2, iArr, size2, arrayList5);
                                        } else {
                                            m0Var = null;
                                        }
                                        vv.W(m2Var, tLObject, z13, m0Var, null);
                                        i16++;
                                    } else {
                                        vvVar2.X(true);
                                        if (size2 <= 1) {
                                            vvVar2.dismiss();
                                            return;
                                        }
                                        return;
                                    }
                                }
                            default:
                                vv vvVar3 = this;
                                vvVar3.dismiss();
                                org.telegram.ui.ActionBar.m2 m2Var2 = vvVar3.f29735c;
                                ArrayList<TLRPC.TL_messages_stickerSet> arrayList6 = arrayList2;
                                if (m2Var2 != null) {
                                    MediaDataController.getInstance(m2Var2.getCurrentAccount()).removeMultipleStickerSets(m2Var2.getContext(), m2Var2, arrayList6);
                                } else {
                                    for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = arrayList6.get(i17);
                                        Context context = vvVar3.getContext();
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
                                vvVar3.X(false);
                                return;
                        }
                    }
                });
                b0(true);
                return;
            } else {
                textView2.setVisibility(8);
                textView.setVisibility(8);
                b0(false);
                return;
            }
        }
        p0Var.setVisibility(8);
        textView2.setVisibility(8);
        textView.setVisibility(8);
        b0(false);
    }

    public final void b0(boolean z10) {
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
        if (this.f29740w.getVisibility() == 0) {
            i10 = AndroidUtilities.dp(19.0f);
        }
        float f13 = i10;
        boolean z12 = this.H;
        ci.v vVar = this.h;
        View view = this.f29738r;
        FrameLayout frameLayout = this.f29739s;
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
            sr srVar = sr.h;
            duration.setInterpolator(srVar).start();
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
            translationY2.alpha(f14).setDuration(250L).setInterpolator(srVar).start();
            ViewPropertyAnimator animate3 = vVar.animate();
            if (!z12 && !z10) {
                f15 = AndroidUtilities.dp(68.0f) - f13;
            }
            animate3.translationY(f15).setDuration(250L).setInterpolator(srVar).start();
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
        qv qvVar;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        if (i10 == NotificationCenter.stickersDidLoad) {
            int i12 = 0;
            while (true) {
                ci.v vVar = this.h;
                if (i12 < vVar.getChildCount()) {
                    View childAt = vVar.getChildAt(i12);
                    if ((childAt instanceof qv) && (tL_messages_stickerSet = (qvVar = (qv) childAt).f27835r) != null && tL_messages_stickerSet.set != null) {
                        qvVar.a(MediaDataController.getInstance(this.currentAccount).isStickerPackInstalled(qvVar.f27835r.set.f18364id), true);
                    }
                    i12++;
                } else {
                    a0();
                    return;
                }
            }
        }
    }

    @Override
    public void dismiss() {
        lv lvVar = this.f29736f;
        if (lvVar != null && lvVar.f26099w) {
            lvVar.f26099w = false;
            lvVar.invalidate();
        }
        super.dismiss();
        fv fvVar = this.e;
        if (fvVar != null) {
            NotificationCenter.getInstance(fvVar.d).removeObserver(fvVar, NotificationCenter.groupStickersDidLoad);
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
        int V2 = measuredHeight - V();
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            i10 = viewGroup.getPaddingTop();
        }
        return AndroidUtilities.dp(8.0f) + V2 + i10 + AndroidUtilities.navigationBarHeight;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
    }

    @Override
    public final void onBackPressed() {
        if (org.telegram.ui.nt.q().E) {
            org.telegram.ui.nt.q().o();
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
        jv jvVar = new jv(this);
        this.f29737n = jvVar;
        this.h.setAdapter(jvVar);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4);
        fv fvVar = this.e;
        if (!fvVar.e) {
            fvVar.e = true;
            vv vvVar = fvVar.f28376f;
            int i10 = fvVar.d;
            fvVar.f28374b = new ArrayList(fvVar.f28373a.size());
            fvVar.f28375c = new ArrayList[fvVar.f28373a.size()];
            NotificationCenter.getInstance(i10).addObserver(fvVar, NotificationCenter.groupStickersDidLoad);
            boolean[] zArr = new boolean[1];
            int i11 = 0;
            while (true) {
                if (i11 < fvVar.f28375c.length) {
                    org.telegram.ui.jk jkVar = null;
                    TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(i10).getStickerSet((TLRPC.InputStickerSet) fvVar.f28373a.get(i11), null, false, new org.telegram.ui.oc(21, fvVar, zArr));
                    if (fvVar.f28375c.length == 1 && stickerSet2 != null && (stickerSet = stickerSet2.set) != null && !stickerSet.emojis) {
                        AndroidUtilities.runOnUIThread(new rv(fvVar, 0));
                        Context context = vvVar.getContext();
                        org.telegram.ui.ActionBar.m2 m2Var = vvVar.f29735c;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) fvVar.f28373a.get(i11);
                        org.telegram.ui.ActionBar.m2 m2Var2 = vvVar.f29735c;
                        if (m2Var2 instanceof org.telegram.ui.wn) {
                            jkVar = ((org.telegram.ui.wn) m2Var2).Y;
                        }
                        new hy0(context, m2Var, inputStickerSet, null, jkVar, vvVar.resourcesProvider).show();
                    } else {
                        fvVar.f28374b.add(stickerSet2);
                        fvVar.a(i11, stickerSet2);
                        i11++;
                    }
                } else {
                    vv vvVar2 = fvVar.h;
                    vvVar2.a0();
                    ci.v vVar = vvVar2.h;
                    if (vVar != null && vVar.getAdapter() != null) {
                        vVar.getAdapter().l();
                    }
                }
            }
        }
        a0();
        org.telegram.ui.ActionBar.m2 m2Var3 = this.f29735c;
        if (m2Var3 == null) {
            currentAccount = UserConfig.selectedAccount;
        } else {
            currentAccount = m2Var3.getCurrentAccount();
        }
        MediaDataController.getInstance(currentAccount).checkStickers(5);
    }

    public void X(boolean z10) {
    }

    public void Y() {
    }
}
