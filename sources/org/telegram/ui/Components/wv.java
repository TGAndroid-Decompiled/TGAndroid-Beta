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
public class wv extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public static Pattern V;
    public final bl0 E;
    public final wp F;
    public org.telegram.ui.ActionBar.n1 G;
    public final boolean H;
    public boolean I;
    public float J;
    public int K;
    public int L;
    public final e6 M;
    public final fv N;
    public int O;
    public boolean P;
    public long Q;
    public ValueAnimator R;
    public boolean S;
    public PorterDuffColorFilter T;
    public int U;
    public LongSparseArray f32635b;
    public final org.telegram.ui.ActionBar.n2 f32636c;
    public final nn d;
    public final gv f32637e;
    public final mv f32638f;
    public final ci.v h;
    public kv f32639n;
    public final View f32640r;
    public final FrameLayout f32641s;
    public final TextView v;
    public final TextView f32642w;
    public final rg.q0 f32643x;
    public final s4.s f32644y;

    public wv(org.telegram.ui.ActionBar.n2 r21, android.content.Context r22, org.telegram.ui.ActionBar.d6 r23, java.util.ArrayList r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wv.<init>(org.telegram.ui.ActionBar.n2, android.content.Context, org.telegram.ui.ActionBar.d6, java.util.ArrayList):void");
    }

    public static void N(wv wvVar, int i10) {
        ArrayList arrayList;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        String str;
        Context context;
        org.telegram.ui.ActionBar.n2 n2Var = wvVar.f32636c;
        gv gvVar = wvVar.f32637e;
        if (gvVar != null && (arrayList = gvVar.f31177b) != null && !arrayList.isEmpty()) {
            TLRPC.StickerSet stickerSet = ((TLRPC.TL_messages_stickerSet) gvVar.f31177b.get(0)).set;
            if (stickerSet != null && stickerSet.emojis) {
                str = "https://" + MessagesController.getInstance(wvVar.currentAccount).linkPrefix + "/addemoji/" + tL_messages_stickerSet.set.short_name;
            } else {
                str = "https://" + MessagesController.getInstance(wvVar.currentAccount).linkPrefix + "/addstickers/" + tL_messages_stickerSet.set.short_name;
            }
            String str2 = str;
            if (i10 == 1) {
                if (n2Var != null) {
                    context = n2Var.getParentActivity();
                } else {
                    context = null;
                }
                if (context == null) {
                    context = wvVar.getContext();
                }
                jv jvVar = new jv(wvVar, context, str2, str2, wvVar.resourcesProvider);
                if (n2Var != null) {
                    n2Var.showDialog(jvVar);
                } else {
                    jvVar.show();
                }
            } else if (i10 == 2) {
                try {
                    AndroidUtilities.addToClipboard(str2);
                    new yc((FrameLayout) wvVar.containerView, wvVar.resourcesProvider).k(false).j();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
        }
    }

    public static void U(final org.telegram.ui.ActionBar.n2 n2Var, TLObject tLObject, final boolean z10, final fi.m0 m0Var, final aq aqVar) {
        int currentAccount;
        final View fragmentView;
        final TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        if (n2Var == null) {
            currentAccount = UserConfig.selectedAccount;
        } else {
            currentAccount = n2Var.getCurrentAccount();
        }
        final int i10 = currentAccount;
        TLRPC.StickerSet stickerSet = null;
        if (n2Var == null) {
            fragmentView = null;
        } else {
            fragmentView = n2Var.getFragmentView();
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
                if (MediaDataController.getInstance(i10).cancelRemovingStickerSet(stickerSet2.f20069id)) {
                    if (m0Var != null) {
                        m0Var.run(Boolean.TRUE);
                        return;
                    }
                    return;
                }
                TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                tL_messages_installStickerSet.stickerset = tL_inputStickerSetID;
                tL_inputStickerSetID.f20062id = stickerSet2.f20069id;
                tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                ConnectionsManager.getInstance(i10).sendRequest(tL_messages_installStickerSet, new RequestDelegate() {
                    @Override
                    public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                        final TLRPC.StickerSet stickerSet3 = TLRPC.StickerSet.this;
                        final boolean z11 = z10;
                        final View view = fragmentView;
                        final org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        final TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
                        final int i11 = i10;
                        final Utilities.Callback callback = m0Var;
                        final Runnable runnable = aqVar;
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
                                org.telegram.ui.ActionBar.n2 n2Var3 = n2Var2;
                                int i13 = i11;
                                Utilities.Callback callback2 = callback;
                                try {
                                    if (tL_error2 == null) {
                                        if (z11 && view2 != null) {
                                            Context context = n2Var3.getFragmentView().getContext();
                                            TLObject tLObject5 = tL_messages_stickerSet2;
                                            if (tLObject5 == null) {
                                                tLObject3 = stickerSet4;
                                            } else {
                                                tLObject3 = tLObject5;
                                            }
                                            rc.g(n2Var3, new vx0(context, tLObject3, 1, 2, null, n2Var3.getResourceProvider()), 1500).j();
                                        }
                                        if (tLObject4 instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                                            MediaDataController.getInstance(i13).processStickerSetInstallResultArchive(n2Var3, true, i12, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject4);
                                        }
                                        if (callback2 != null) {
                                            callback2.run(Boolean.TRUE);
                                        }
                                    } else if (view2 != null) {
                                        Toast.makeText(n2Var3.getFragmentView().getContext(), LocaleController.getString(R.string.ErrorOccurred), 0).show();
                                        if (callback2 != null) {
                                            callback2.run(Boolean.FALSE);
                                        }
                                    } else if (callback2 != null) {
                                        callback2.run(Boolean.FALSE);
                                    }
                                } catch (Exception e7) {
                                    FileLog.e(e7);
                                }
                                MediaDataController.getInstance(i13).loadStickers(i12, false, true, false, new y2(runnable, 5));
                            }
                        });
                    }
                });
            }
        }
    }

    public static boolean m(wv wvVar, ym ymVar, MotionEvent motionEvent) {
        return org.telegram.ui.rt.q().s(motionEvent, wvVar.h, ymVar, wvVar.N, wvVar.resourcesProvider);
    }

    public static void n(wv wvVar, ArrayList arrayList, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.d6 d6Var, View view, int i10) {
        gv gvVar = wvVar.f32637e;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
        int i11 = 0;
        if (arrayList != null && arrayList.size() > 1) {
            if (SystemClock.elapsedRealtime() - wvVar.Q >= 250) {
                int i12 = 0;
                while (true) {
                    ArrayList[] arrayListArr = gvVar.f31178c;
                    if (i11 >= arrayListArr.length) {
                        break;
                    }
                    int size = arrayListArr[i11].size();
                    if (gvVar.f31178c.length > 1) {
                        size = Math.min(wvVar.f32644y.J * 2, size);
                    }
                    i12 += size + 2;
                    if (i10 < i12) {
                        break;
                    }
                    i11++;
                }
                ArrayList arrayList2 = gvVar.f31177b;
                if (arrayList2 != null && i11 < arrayList2.size()) {
                    tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) gvVar.f31177b.get(i11);
                }
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                    ArrayList arrayList3 = new ArrayList();
                    TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    tL_inputStickerSetID.f20062id = stickerSet.f20069id;
                    tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                    arrayList3.add(tL_inputStickerSetID);
                    new hv(wvVar, n2Var, wvVar.getContext(), d6Var, arrayList3).show();
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.n1 n1Var = wvVar.G;
        if (n1Var != null) {
            n1Var.d(true);
            wvVar.G = null;
        } else if ((n2Var instanceof org.telegram.ui.yn) && ((org.telegram.ui.yn) n2Var).W.getVisibility() == 0 && (view instanceof nv)) {
            z5 z5Var = ((nv) view).f29074c;
            try {
                TLRPC.Document document = z5Var.document;
                if (document == null) {
                    document = q5.f(wvVar.currentAccount, z5Var.getDocumentId());
                }
                SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(document));
                spannableString.setSpan(z5Var, 0, spannableString.length(), 33);
                ((org.telegram.ui.yn) n2Var).W.E0.getText().append((CharSequence) spannableString);
                wvVar.X();
                wvVar.dismiss();
            } catch (Exception unused) {
            }
            try {
                view.performHapticFeedback(3, 1);
            } catch (Exception unused2) {
            }
        }
    }

    public static void o(wv wvVar, z5 z5Var) {
        org.telegram.ui.ActionBar.n1 n1Var = wvVar.G;
        if (n1Var != null) {
            n1Var.d(true);
            wvVar.G = null;
            SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(q5.f(wvVar.currentAccount, z5Var.getDocumentId())));
            spannableString.setSpan(z5Var, 0, spannableString.length(), 33);
            if (AndroidUtilities.addToClipboard(spannableString)) {
                org.telegram.messenger.bi.n(R.string.EmojiCopied, new yc((FrameLayout) wvVar.containerView, wvVar.resourcesProvider));
            }
        }
    }

    public static void p(wv wvVar, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        wvVar.J = floatValue;
        wvVar.h.setAlpha(floatValue);
        wvVar.v.setAlpha(wvVar.J);
        wvVar.f32642w.setAlpha(wvVar.J);
        wvVar.containerView.invalidate();
    }

    public static ViewGroup r(wv wvVar) {
        return wvVar.containerView;
    }

    public static ViewGroup s(wv wvVar) {
        return wvVar.containerView;
    }

    public final int T() {
        if (this.containerView == null) {
            return 0;
        }
        ci.v vVar = this.h;
        if (vVar != null && vVar.getChildCount() >= 1) {
            View childAt = vVar.getChildAt(0);
            nn nnVar = this.d;
            if (childAt != nnVar) {
                return this.containerView.getPaddingTop();
            }
            return nnVar.getBottom() + ((int) vVar.getY());
        }
        return this.containerView.getPaddingTop();
    }

    public final void Y() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f32636c;
        if (n2Var != null) {
            new rg.y0(n2Var, 11, false).show();
        } else if (getContext() instanceof LaunchActivity) {
            ((LaunchActivity) getContext()).p0(new PremiumPreviewFragment(0, null));
        }
    }

    public final void Z() {
        ArrayList arrayList;
        boolean z10;
        int i10;
        int i11;
        TLRPC.StickerSet stickerSet;
        if (this.f32641s == null) {
            return;
        }
        gv gvVar = this.f32637e;
        if (gvVar.f31177b == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(gvVar.f31177b);
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
                if (!mediaDataController.isStickerPackInstalled(stickerSet.f20069id)) {
                    arrayList3.add(tL_messages_stickerSet);
                } else {
                    arrayList2.add(tL_messages_stickerSet);
                }
            }
        }
        final ArrayList arrayList4 = new ArrayList(arrayList3);
        if (gvVar.f31176a != null && arrayList.size() == gvVar.f31176a.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!this.S && z10 && this.R == null) {
            this.R = ValueAnimator.ofFloat(this.J, 1.0f);
            this.containerView.getY();
            this.R.addUpdateListener(new k6(this, 16));
            this.R.setDuration(250L);
            this.R.setInterpolator(tr.h);
            this.R.start();
        }
        this.S = z10;
        ci.v vVar = this.h;
        if (!z10) {
            vVar.setAlpha(0.0f);
        } else if (this.O >= 0) {
            int L0 = this.f32644y.L0();
            int E = this.f32639n.E(this.O);
            if (Math.abs(L0 - E) > 54) {
                if (L0 < E) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                bl0 bl0Var = this.E;
                bl0Var.f24999b = i11;
                bl0Var.d(E, (AndroidUtilities.displaySize.y / 2) - AndroidUtilities.dp(170.0f), false, false);
            } else {
                vVar.y0(E);
            }
            this.K = this.f32639n.E(this.O);
            kv kvVar = this.f32639n;
            int i14 = this.O;
            wv wvVar = kvVar.f28206c;
            boolean z11 = wvVar.I;
            gv gvVar2 = wvVar.f32637e;
            if (z11) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            int i15 = 0;
            while (true) {
                ArrayList[] arrayListArr = gvVar2.f31178c;
                if (i15 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i15].size();
                if (gvVar2.f31178c.length > 1) {
                    size = Math.min(wvVar.f32644y.J * 2, size);
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
        rg.q0 q0Var = this.f32643x;
        TextView textView = this.f32642w;
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
                                    wv wvVar2 = this;
                                    if (i16 < size3) {
                                        org.telegram.ui.ActionBar.n2 n2Var = wvVar2.f32636c;
                                        TLObject tLObject = (TLObject) arrayList5.get(i16);
                                        if (size2 == 1) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        if (size2 > 1) {
                                            m0Var = new fi.m0(wvVar2, iArr, size2, arrayList5);
                                        } else {
                                            m0Var = null;
                                        }
                                        wv.U(n2Var, tLObject, z13, m0Var, null);
                                        i16++;
                                    } else {
                                        wvVar2.W(true);
                                        if (size2 <= 1) {
                                            wvVar2.dismiss();
                                            return;
                                        }
                                        return;
                                    }
                                }
                            default:
                                wv wvVar3 = this;
                                wvVar3.dismiss();
                                org.telegram.ui.ActionBar.n2 n2Var2 = wvVar3.f32636c;
                                ArrayList<TLRPC.TL_messages_stickerSet> arrayList6 = arrayList4;
                                if (n2Var2 != null) {
                                    MediaDataController.getInstance(n2Var2.getCurrentAccount()).removeMultipleStickerSets(n2Var2.getContext(), n2Var2, arrayList6);
                                } else {
                                    for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = arrayList6.get(i17);
                                        Context context = wvVar3.getContext();
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
                                wvVar3.W(false);
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
                                    wv wvVar2 = this;
                                    if (i16 < size3) {
                                        org.telegram.ui.ActionBar.n2 n2Var = wvVar2.f32636c;
                                        TLObject tLObject = (TLObject) arrayList5.get(i16);
                                        if (size2 == 1) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        if (size2 > 1) {
                                            m0Var = new fi.m0(wvVar2, iArr, size2, arrayList5);
                                        } else {
                                            m0Var = null;
                                        }
                                        wv.U(n2Var, tLObject, z13, m0Var, null);
                                        i16++;
                                    } else {
                                        wvVar2.W(true);
                                        if (size2 <= 1) {
                                            wvVar2.dismiss();
                                            return;
                                        }
                                        return;
                                    }
                                }
                            default:
                                wv wvVar3 = this;
                                wvVar3.dismiss();
                                org.telegram.ui.ActionBar.n2 n2Var2 = wvVar3.f32636c;
                                ArrayList<TLRPC.TL_messages_stickerSet> arrayList6 = arrayList2;
                                if (n2Var2 != null) {
                                    MediaDataController.getInstance(n2Var2.getCurrentAccount()).removeMultipleStickerSets(n2Var2.getContext(), n2Var2, arrayList6);
                                } else {
                                    for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = arrayList6.get(i17);
                                        Context context = wvVar3.getContext();
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
                                wvVar3.W(false);
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
        q0Var.setVisibility(8);
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
        if (this.f32642w.getVisibility() == 0) {
            i10 = AndroidUtilities.dp(19.0f);
        }
        float f13 = i10;
        boolean z12 = this.H;
        ci.v vVar = this.h;
        View view = this.f32640r;
        FrameLayout frameLayout = this.f32641s;
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
            tr trVar = tr.h;
            duration.setInterpolator(trVar).start();
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
            translationY2.alpha(f14).setDuration(250L).setInterpolator(trVar).start();
            ViewPropertyAnimator animate3 = vVar.animate();
            if (!z12 && !z10) {
                f15 = AndroidUtilities.dp(68.0f) - f13;
            }
            animate3.translationY(f15).setDuration(250L).setInterpolator(trVar).start();
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
        rv rvVar;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        if (i10 == NotificationCenter.stickersDidLoad) {
            int i12 = 0;
            while (true) {
                ci.v vVar = this.h;
                if (i12 < vVar.getChildCount()) {
                    View childAt = vVar.getChildAt(i12);
                    if ((childAt instanceof rv) && (tL_messages_stickerSet = (rvVar = (rv) childAt).f30518r) != null && tL_messages_stickerSet.set != null) {
                        rvVar.a(MediaDataController.getInstance(this.currentAccount).isStickerPackInstalled(rvVar.f30518r.set.f20069id), true);
                    }
                    i12++;
                } else {
                    Z();
                    return;
                }
            }
        }
    }

    @Override
    public void dismiss() {
        mv mvVar = this.f32638f;
        if (mvVar != null && mvVar.f28730w) {
            mvVar.f28730w = false;
            mvVar.invalidate();
        }
        super.dismiss();
        gv gvVar = this.f32637e;
        if (gvVar != null) {
            NotificationCenter.getInstance(gvVar.d).removeObserver(gvVar, NotificationCenter.groupStickersDidLoad);
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
        int T = measuredHeight - T();
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            i10 = viewGroup.getPaddingTop();
        }
        return AndroidUtilities.dp(8.0f) + T + i10 + AndroidUtilities.navigationBarHeight;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
    }

    @Override
    public final void onBackPressed() {
        if (org.telegram.ui.rt.q().E) {
            org.telegram.ui.rt.q().o();
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
        kv kvVar = new kv(this);
        this.f32639n = kvVar;
        this.h.setAdapter(kvVar);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4);
        gv gvVar = this.f32637e;
        if (!gvVar.f31179e) {
            gvVar.f31179e = true;
            wv wvVar = gvVar.f31180f;
            int i10 = gvVar.d;
            gvVar.f31177b = new ArrayList(gvVar.f31176a.size());
            gvVar.f31178c = new ArrayList[gvVar.f31176a.size()];
            NotificationCenter.getInstance(i10).addObserver(gvVar, NotificationCenter.groupStickersDidLoad);
            boolean[] zArr = new boolean[1];
            int i11 = 0;
            while (true) {
                if (i11 < gvVar.f31178c.length) {
                    org.telegram.ui.jk jkVar = null;
                    TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(i10).getStickerSet((TLRPC.InputStickerSet) gvVar.f31176a.get(i11), null, false, new org.telegram.ui.qc(21, gvVar, zArr));
                    if (gvVar.f31178c.length == 1 && stickerSet2 != null && (stickerSet = stickerSet2.set) != null && !stickerSet.emojis) {
                        AndroidUtilities.runOnUIThread(new sv(gvVar, 0));
                        Context context = wvVar.getContext();
                        org.telegram.ui.ActionBar.n2 n2Var = wvVar.f32636c;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) gvVar.f31176a.get(i11);
                        org.telegram.ui.ActionBar.n2 n2Var2 = wvVar.f32636c;
                        if (n2Var2 instanceof org.telegram.ui.yn) {
                            jkVar = ((org.telegram.ui.yn) n2Var2).W;
                        }
                        new qy0(context, n2Var, inputStickerSet, null, jkVar, wvVar.resourcesProvider).show();
                    } else {
                        gvVar.f31177b.add(stickerSet2);
                        gvVar.a(i11, stickerSet2);
                        i11++;
                    }
                } else {
                    wv wvVar2 = gvVar.h;
                    wvVar2.Z();
                    ci.v vVar = wvVar2.h;
                    if (vVar != null && vVar.getAdapter() != null) {
                        vVar.getAdapter().l();
                    }
                }
            }
        }
        Z();
        org.telegram.ui.ActionBar.n2 n2Var3 = this.f32636c;
        if (n2Var3 == null) {
            currentAccount = UserConfig.selectedAccount;
        } else {
            currentAccount = n2Var3.getCurrentAccount();
        }
        MediaDataController.getInstance(currentAccount).checkStickers(5);
    }

    public void W(boolean z10) {
    }

    public void X() {
    }
}
