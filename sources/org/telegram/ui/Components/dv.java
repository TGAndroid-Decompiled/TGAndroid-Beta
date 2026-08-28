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
public class dv extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public static Pattern R;
    public final c2.y A;
    public final jp B;
    public org.telegram.ui.ActionBar.o1 C;
    public final boolean D;
    public boolean E;
    public float F;
    public int G;
    public int H;
    public final y5 I;
    public final mu J;
    public int K;
    public boolean L;
    public long M;
    public ValueAnimator N;
    public boolean O;
    public PorterDuffColorFilter P;
    public int Q;
    public LongSparseArray f27814b;
    public final org.telegram.ui.ActionBar.o2 f27815c;
    public final an d;
    public final nu f27816e;
    public final tu f27817f;
    public final kh.w h;
    public ru f27818n;
    public final View f27819r;
    public final FrameLayout f27820s;
    public final TextView v;
    public final TextView f27821w;
    public final zf.p0 f27822x;
    public final f2.y f27823y;

    public dv(org.telegram.ui.ActionBar.o2 r21, android.content.Context r22, org.telegram.ui.ActionBar.b6 r23, java.util.ArrayList r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dv.<init>(org.telegram.ui.ActionBar.o2, android.content.Context, org.telegram.ui.ActionBar.b6, java.util.ArrayList):void");
    }

    public static void O(dv dvVar, int i9) {
        ArrayList arrayList;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        String str;
        Context context;
        org.telegram.ui.ActionBar.o2 o2Var = dvVar.f27815c;
        nu nuVar = dvVar.f27816e;
        if (nuVar != null && (arrayList = nuVar.f26909b) != null && !arrayList.isEmpty()) {
            TLRPC.StickerSet stickerSet = ((TLRPC.TL_messages_stickerSet) nuVar.f26909b.get(0)).set;
            if (stickerSet != null && stickerSet.emojis) {
                str = "https://" + MessagesController.getInstance(dvVar.currentAccount).linkPrefix + "/addemoji/" + tL_messages_stickerSet.set.short_name;
            } else {
                str = "https://" + MessagesController.getInstance(dvVar.currentAccount).linkPrefix + "/addstickers/" + tL_messages_stickerSet.set.short_name;
            }
            String str2 = str;
            if (i9 == 1) {
                if (o2Var != null) {
                    context = o2Var.getParentActivity();
                } else {
                    context = null;
                }
                if (context == null) {
                    context = dvVar.getContext();
                }
                qu quVar = new qu(dvVar, context, str2, str2, dvVar.resourcesProvider);
                if (o2Var != null) {
                    o2Var.showDialog(quVar);
                } else {
                    quVar.show();
                }
            } else if (i9 == 2) {
                try {
                    AndroidUtilities.addToClipboard(str2);
                    new oc((FrameLayout) dvVar.containerView, dvVar.resourcesProvider).k(false).j();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        }
    }

    public static int T(dv dvVar) {
        return dvVar.currentAccount;
    }

    public static void V(final org.telegram.ui.ActionBar.o2 o2Var, TLObject tLObject, final boolean z10, final gh.g8 g8Var, final np npVar) {
        int currentAccount;
        final View fragmentView;
        final TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        if (o2Var == null) {
            currentAccount = UserConfig.selectedAccount;
        } else {
            currentAccount = o2Var.getCurrentAccount();
        }
        final int i9 = currentAccount;
        TLRPC.StickerSet stickerSet = null;
        if (o2Var == null) {
            fragmentView = null;
        } else {
            fragmentView = o2Var.getFragmentView();
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
                if (MediaDataController.getInstance(i9).cancelRemovingStickerSet(stickerSet2.f22407id)) {
                    if (g8Var != null) {
                        g8Var.run(Boolean.TRUE);
                        return;
                    }
                    return;
                }
                TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                tL_messages_installStickerSet.stickerset = tL_inputStickerSetID;
                tL_inputStickerSetID.f22400id = stickerSet2.f22407id;
                tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                ConnectionsManager.getInstance(i9).sendRequest(tL_messages_installStickerSet, new RequestDelegate() {
                    @Override
                    public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                        final TLRPC.StickerSet stickerSet3 = TLRPC.StickerSet.this;
                        final boolean z11 = z10;
                        final View view = fragmentView;
                        final org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        final TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
                        final int i10 = i9;
                        final Utilities.Callback callback = g8Var;
                        final Runnable runnable = npVar;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                int i11;
                                TLObject tLObject3;
                                TLObject tLObject4 = tLObject2;
                                TLRPC.StickerSet stickerSet4 = TLRPC.StickerSet.this;
                                if (stickerSet4.masks) {
                                    i11 = 1;
                                } else if (stickerSet4.emojis) {
                                    i11 = 5;
                                } else {
                                    i11 = 0;
                                }
                                TLRPC.TL_error tL_error2 = tL_error;
                                View view2 = view;
                                org.telegram.ui.ActionBar.o2 o2Var3 = o2Var2;
                                int i12 = i10;
                                Utilities.Callback callback2 = callback;
                                try {
                                    if (tL_error2 == null) {
                                        if (z11 && view2 != null) {
                                            Context context = o2Var3.getFragmentView().getContext();
                                            TLObject tLObject5 = tL_messages_stickerSet2;
                                            if (tLObject5 == null) {
                                                tLObject3 = stickerSet4;
                                            } else {
                                                tLObject3 = tLObject5;
                                            }
                                            gc.g(o2Var3, new iw0(context, tLObject3, 1, 2, null, o2Var3.getResourceProvider()), 1500).j();
                                        }
                                        if (tLObject4 instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                                            MediaDataController.getInstance(i12).processStickerSetInstallResultArchive(o2Var3, true, i11, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject4);
                                        }
                                        if (callback2 != null) {
                                            callback2.run(Boolean.TRUE);
                                        }
                                    } else if (view2 != null) {
                                        Toast.makeText(o2Var3.getFragmentView().getContext(), LocaleController.getString(R.string.ErrorOccurred), 0).show();
                                        if (callback2 != null) {
                                            callback2.run(Boolean.FALSE);
                                        }
                                    } else if (callback2 != null) {
                                        callback2.run(Boolean.FALSE);
                                    }
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                }
                                MediaDataController.getInstance(i12).loadStickers(i11, false, true, false, new v2(runnable, 5));
                            }
                        });
                    }
                });
            }
        }
    }

    public static boolean m(dv dvVar, mm mmVar, MotionEvent motionEvent) {
        return org.telegram.ui.ht.q().s(motionEvent, dvVar.h, mmVar, dvVar.J, dvVar.resourcesProvider);
    }

    public static void n(dv dvVar, ArrayList arrayList, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.b6 b6Var, View view, int i9) {
        nu nuVar = dvVar.f27816e;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
        int i10 = 0;
        if (arrayList != null && arrayList.size() > 1) {
            if (SystemClock.elapsedRealtime() - dvVar.M >= 250) {
                int i11 = 0;
                while (true) {
                    ArrayList[] arrayListArr = nuVar.f26910c;
                    if (i10 >= arrayListArr.length) {
                        break;
                    }
                    int size = arrayListArr[i10].size();
                    if (nuVar.f26910c.length > 1) {
                        size = Math.min(dvVar.f27823y.J * 2, size);
                    }
                    i11 += size + 2;
                    if (i9 < i11) {
                        break;
                    }
                    i10++;
                }
                ArrayList arrayList2 = nuVar.f26909b;
                if (arrayList2 != null && i10 < arrayList2.size()) {
                    tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) nuVar.f26909b.get(i10);
                }
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                    ArrayList arrayList3 = new ArrayList();
                    TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    tL_inputStickerSetID.f22400id = stickerSet.f22407id;
                    tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                    arrayList3.add(tL_inputStickerSetID);
                    new ou(dvVar, o2Var, dvVar.getContext(), b6Var, arrayList3).show();
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.o1 o1Var = dvVar.C;
        if (o1Var != null) {
            o1Var.d(true);
            dvVar.C = null;
        } else if ((o2Var instanceof org.telegram.ui.qn) && ((org.telegram.ui.qn) o2Var).U.getVisibility() == 0 && (view instanceof uu)) {
            t5 t5Var = ((uu) view).f33145c;
            try {
                TLRPC.Document document = t5Var.document;
                if (document == null) {
                    document = k5.f(dvVar.currentAccount, t5Var.getDocumentId());
                }
                SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(document));
                spannableString.setSpan(t5Var, 0, spannableString.length(), 33);
                ((org.telegram.ui.qn) o2Var).U.A0.getText().append((CharSequence) spannableString);
                dvVar.X();
                dvVar.dismiss();
            } catch (Exception unused) {
            }
            try {
                view.performHapticFeedback(3, 1);
            } catch (Exception unused2) {
            }
        }
    }

    public static void o(dv dvVar, t5 t5Var) {
        org.telegram.ui.ActionBar.o1 o1Var = dvVar.C;
        if (o1Var != null) {
            o1Var.d(true);
            dvVar.C = null;
            SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(k5.f(dvVar.currentAccount, t5Var.getDocumentId())));
            spannableString.setSpan(t5Var, 0, spannableString.length(), 33);
            if (AndroidUtilities.addToClipboard(spannableString)) {
                org.telegram.messenger.ll.o(R.string.EmojiCopied, new oc((FrameLayout) dvVar.containerView, dvVar.resourcesProvider));
            }
        }
    }

    public static void p(dv dvVar, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        dvVar.F = floatValue;
        dvVar.h.setAlpha(floatValue);
        dvVar.v.setAlpha(dvVar.F);
        dvVar.f27821w.setAlpha(dvVar.F);
        dvVar.containerView.invalidate();
    }

    public static ViewGroup r(dv dvVar) {
        return dvVar.containerView;
    }

    public static ViewGroup s(dv dvVar) {
        return dvVar.containerView;
    }

    public final int U() {
        if (this.containerView == null) {
            return 0;
        }
        kh.w wVar = this.h;
        if (wVar != null && wVar.getChildCount() >= 1) {
            View childAt = wVar.getChildAt(0);
            an anVar = this.d;
            if (childAt != anVar) {
                return this.containerView.getPaddingTop();
            }
            return anVar.getBottom() + ((int) wVar.getY());
        }
        return this.containerView.getPaddingTop();
    }

    public final void Y() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f27815c;
        if (o2Var != null) {
            new zf.x0(o2Var, 11, false).show();
        } else if (getContext() instanceof LaunchActivity) {
            ((LaunchActivity) getContext()).p0(new PremiumPreviewFragment(0, null));
        }
    }

    public final void Z() {
        ArrayList arrayList;
        boolean z10;
        int i9;
        int i10;
        TLRPC.StickerSet stickerSet;
        if (this.f27820s == null) {
            return;
        }
        nu nuVar = this.f27816e;
        if (nuVar.f26909b == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(nuVar.f26909b);
        }
        int i11 = 0;
        while (i11 < arrayList.size()) {
            if (arrayList.get(i11) == null) {
                arrayList.remove(i11);
                i11--;
            }
            i11++;
        }
        MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
        final ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i12);
            if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null) {
                if (!mediaDataController.isStickerPackInstalled(stickerSet.f22407id)) {
                    arrayList3.add(tL_messages_stickerSet);
                } else {
                    arrayList2.add(tL_messages_stickerSet);
                }
            }
        }
        final ArrayList arrayList4 = new ArrayList(arrayList3);
        if (nuVar.f26908a != null && arrayList.size() == nuVar.f26908a.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!this.O && z10 && this.N == null) {
            this.N = ValueAnimator.ofFloat(this.F, 1.0f);
            this.containerView.getY();
            this.N.addUpdateListener(new e6(this, 16));
            this.N.setDuration(250L);
            this.N.setInterpolator(gr.h);
            this.N.start();
        }
        this.O = z10;
        kh.w wVar = this.h;
        if (!z10) {
            wVar.setAlpha(0.0f);
        } else if (this.K >= 0) {
            int L0 = this.f27823y.L0();
            int E = this.f27818n.E(this.K);
            if (Math.abs(L0 - E) > 54) {
                if (L0 < E) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                c2.y yVar = this.A;
                yVar.f2255b = i10;
                yVar.c(E, (AndroidUtilities.displaySize.y / 2) - AndroidUtilities.dp(170.0f), false, false);
            } else {
                wVar.x0(E);
            }
            this.G = this.f27818n.E(this.K);
            ru ruVar = this.f27818n;
            int i13 = this.K;
            dv dvVar = ruVar.f32289c;
            boolean z11 = dvVar.E;
            nu nuVar2 = dvVar.f27816e;
            if (z11) {
                i9 = 2;
            } else {
                i9 = 1;
            }
            int i14 = 0;
            while (true) {
                ArrayList[] arrayListArr = nuVar2.f26910c;
                if (i14 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i14].size();
                if (nuVar2.f26910c.length > 1) {
                    size = Math.min(dvVar.f27823y.J * 2, size);
                }
                if (i14 == i13) {
                    i9 = i9 + size + 1;
                    break;
                } else {
                    i9 += size + 2;
                    i14++;
                }
            }
            this.H = i9;
            this.I.d(1.0f, true);
            wVar.invalidate();
            this.K = -1;
        }
        boolean z12 = this.O;
        zf.p0 p0Var = this.f27822x;
        TextView textView = this.f27821w;
        TextView textView2 = this.v;
        if (z12 && !this.D) {
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
                        gh.g8 g8Var;
                        boolean z14;
                        switch (r1) {
                            case 0:
                                ArrayList arrayList5 = arrayList4;
                                int size2 = arrayList5.size();
                                int[] iArr = new int[2];
                                int i15 = 0;
                                while (true) {
                                    int size3 = arrayList5.size();
                                    dv dvVar2 = this;
                                    if (i15 < size3) {
                                        org.telegram.ui.ActionBar.o2 o2Var = dvVar2.f27815c;
                                        TLObject tLObject = (TLObject) arrayList5.get(i15);
                                        if (size2 == 1) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        if (size2 > 1) {
                                            g8Var = new gh.g8(dvVar2, iArr, size2, arrayList5);
                                        } else {
                                            g8Var = null;
                                        }
                                        dv.V(o2Var, tLObject, z13, g8Var, null);
                                        i15++;
                                    } else {
                                        dvVar2.W(true);
                                        if (size2 <= 1) {
                                            dvVar2.dismiss();
                                            return;
                                        }
                                        return;
                                    }
                                }
                            default:
                                dv dvVar3 = this;
                                dvVar3.dismiss();
                                org.telegram.ui.ActionBar.o2 o2Var2 = dvVar3.f27815c;
                                ArrayList<TLRPC.TL_messages_stickerSet> arrayList6 = arrayList4;
                                if (o2Var2 != null) {
                                    MediaDataController.getInstance(o2Var2.getCurrentAccount()).removeMultipleStickerSets(o2Var2.getContext(), o2Var2, arrayList6);
                                } else {
                                    for (int i16 = 0; i16 < arrayList6.size(); i16++) {
                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = arrayList6.get(i16);
                                        Context context = dvVar3.getContext();
                                        if (i16 == 0) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        if (tL_messages_stickerSet2 != null) {
                                            MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(context, tL_messages_stickerSet2, 0, null, true, z14, null, true);
                                        }
                                    }
                                }
                                dvVar3.W(false);
                                return;
                        }
                    }
                });
                a0(true);
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
                        gh.g8 g8Var;
                        boolean z14;
                        switch (r1) {
                            case 0:
                                ArrayList arrayList5 = arrayList2;
                                int size2 = arrayList5.size();
                                int[] iArr = new int[2];
                                int i15 = 0;
                                while (true) {
                                    int size3 = arrayList5.size();
                                    dv dvVar2 = this;
                                    if (i15 < size3) {
                                        org.telegram.ui.ActionBar.o2 o2Var = dvVar2.f27815c;
                                        TLObject tLObject = (TLObject) arrayList5.get(i15);
                                        if (size2 == 1) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        if (size2 > 1) {
                                            g8Var = new gh.g8(dvVar2, iArr, size2, arrayList5);
                                        } else {
                                            g8Var = null;
                                        }
                                        dv.V(o2Var, tLObject, z13, g8Var, null);
                                        i15++;
                                    } else {
                                        dvVar2.W(true);
                                        if (size2 <= 1) {
                                            dvVar2.dismiss();
                                            return;
                                        }
                                        return;
                                    }
                                }
                            default:
                                dv dvVar3 = this;
                                dvVar3.dismiss();
                                org.telegram.ui.ActionBar.o2 o2Var2 = dvVar3.f27815c;
                                ArrayList<TLRPC.TL_messages_stickerSet> arrayList6 = arrayList2;
                                if (o2Var2 != null) {
                                    MediaDataController.getInstance(o2Var2.getCurrentAccount()).removeMultipleStickerSets(o2Var2.getContext(), o2Var2, arrayList6);
                                } else {
                                    for (int i16 = 0; i16 < arrayList6.size(); i16++) {
                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = arrayList6.get(i16);
                                        Context context = dvVar3.getContext();
                                        if (i16 == 0) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        if (tL_messages_stickerSet2 != null) {
                                            MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(context, tL_messages_stickerSet2, 0, null, true, z14, null, true);
                                        }
                                    }
                                }
                                dvVar3.W(false);
                                return;
                        }
                    }
                });
                a0(true);
                return;
            } else {
                textView2.setVisibility(8);
                textView.setVisibility(8);
                a0(false);
                return;
            }
        }
        p0Var.setVisibility(8);
        textView2.setVisibility(8);
        textView.setVisibility(8);
        a0(false);
    }

    public final void a0(boolean z10) {
        boolean z11;
        float f10;
        float dp;
        float f11;
        float dp2;
        float f12;
        float f13;
        int i9 = 0;
        if (!this.L && z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f27821w.getVisibility() == 0) {
            i9 = AndroidUtilities.dp(19.0f);
        }
        float f14 = i9;
        boolean z12 = this.D;
        kh.w wVar = this.h;
        View view = this.f27819r;
        FrameLayout frameLayout = this.f27820s;
        float f15 = 1.0f;
        float f16 = 0.0f;
        if (z11) {
            ViewPropertyAnimator animate = frameLayout.animate();
            if (z10) {
                dp2 = f14;
            } else {
                dp2 = AndroidUtilities.dp(16.0f);
            }
            ViewPropertyAnimator translationY = animate.translationY(dp2);
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ViewPropertyAnimator duration = translationY.alpha(f12).setDuration(250L);
            gr grVar = gr.h;
            duration.setInterpolator(grVar).start();
            ViewPropertyAnimator animate2 = view.animate();
            if (z10) {
                f13 = -(AndroidUtilities.dp(68.0f) - f14);
            } else {
                f13 = 0.0f;
            }
            ViewPropertyAnimator translationY2 = animate2.translationY(f13);
            if (!z10) {
                f15 = 0.0f;
            }
            translationY2.alpha(f15).setDuration(250L).setInterpolator(grVar).start();
            ViewPropertyAnimator animate3 = wVar.animate();
            if (!z12 && !z10) {
                f16 = AndroidUtilities.dp(68.0f) - f14;
            }
            animate3.translationY(f16).setDuration(250L).setInterpolator(grVar).start();
        } else {
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            frameLayout.setAlpha(f10);
            if (z10) {
                dp = f14;
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            frameLayout.setTranslationY(dp);
            if (!z10) {
                f15 = 0.0f;
            }
            view.setAlpha(f15);
            if (z10) {
                f11 = -(AndroidUtilities.dp(68.0f) - f14);
            } else {
                f11 = 0.0f;
            }
            view.setTranslationY(f11);
            if (!z12 && !z10) {
                f16 = AndroidUtilities.dp(68.0f) - f14;
            }
            wVar.setTranslationY(f16);
        }
        this.L = z10;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        yu yuVar;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        if (i9 == NotificationCenter.stickersDidLoad) {
            int i11 = 0;
            while (true) {
                kh.w wVar = this.h;
                if (i11 < wVar.getChildCount()) {
                    View childAt = wVar.getChildAt(i11);
                    if ((childAt instanceof yu) && (tL_messages_stickerSet = (yuVar = (yu) childAt).f35075r) != null && tL_messages_stickerSet.set != null) {
                        yuVar.a(MediaDataController.getInstance(this.currentAccount).isStickerPackInstalled(yuVar.f35075r.set.f22407id), true);
                    }
                    i11++;
                } else {
                    Z();
                    return;
                }
            }
        }
    }

    @Override
    public void dismiss() {
        tu tuVar = this.f27817f;
        if (tuVar != null && tuVar.f32817w) {
            tuVar.f32817w = false;
            tuVar.invalidate();
        }
        super.dismiss();
        nu nuVar = this.f27816e;
        if (nuVar != null) {
            NotificationCenter.getInstance(nuVar.d).removeObserver(nuVar, NotificationCenter.groupStickersDidLoad);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
    }

    @Override
    public final int getContainerViewHeight() {
        int measuredHeight;
        int i9 = 0;
        kh.w wVar = this.h;
        if (wVar == null) {
            measuredHeight = 0;
        } else {
            measuredHeight = wVar.getMeasuredHeight();
        }
        int U = measuredHeight - U();
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            i9 = viewGroup.getPaddingTop();
        }
        return AndroidUtilities.dp(8.0f) + U + i9 + AndroidUtilities.navigationBarHeight;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
    }

    @Override
    public final void onBackPressed() {
        if (org.telegram.ui.ht.q().E) {
            org.telegram.ui.ht.q().o();
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
        ru ruVar = new ru(this);
        this.f27818n = ruVar;
        this.h.setAdapter(ruVar);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4);
        nu nuVar = this.f27816e;
        if (!nuVar.f26911e) {
            nuVar.f26911e = true;
            dv dvVar = nuVar.f26912f;
            int i9 = nuVar.d;
            nuVar.f26909b = new ArrayList(nuVar.f26908a.size());
            nuVar.f26910c = new ArrayList[nuVar.f26908a.size()];
            NotificationCenter.getInstance(i9).addObserver(nuVar, NotificationCenter.groupStickersDidLoad);
            boolean[] zArr = new boolean[1];
            int i10 = 0;
            while (true) {
                if (i10 < nuVar.f26910c.length) {
                    org.telegram.ui.ak akVar = null;
                    TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(i9).getStickerSet((TLRPC.InputStickerSet) nuVar.f26908a.get(i10), null, false, new org.telegram.ui.df(16, nuVar, zArr));
                    if (nuVar.f26910c.length == 1 && stickerSet2 != null && (stickerSet = stickerSet2.set) != null && !stickerSet.emojis) {
                        AndroidUtilities.runOnUIThread(new zu(nuVar, 0));
                        Context context = dvVar.getContext();
                        org.telegram.ui.ActionBar.o2 o2Var = dvVar.f27815c;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) nuVar.f26908a.get(i10);
                        org.telegram.ui.ActionBar.o2 o2Var2 = dvVar.f27815c;
                        if (o2Var2 instanceof org.telegram.ui.qn) {
                            akVar = ((org.telegram.ui.qn) o2Var2).U;
                        }
                        new cx0(context, o2Var, inputStickerSet, null, akVar, dvVar.resourcesProvider).show();
                    } else {
                        nuVar.f26909b.add(stickerSet2);
                        nuVar.a(i10, stickerSet2);
                        i10++;
                    }
                } else {
                    dv dvVar2 = nuVar.h;
                    dvVar2.Z();
                    kh.w wVar = dvVar2.h;
                    if (wVar != null && wVar.getAdapter() != null) {
                        wVar.getAdapter().l();
                    }
                }
            }
        }
        Z();
        org.telegram.ui.ActionBar.o2 o2Var3 = this.f27815c;
        if (o2Var3 == null) {
            currentAccount = UserConfig.selectedAccount;
        } else {
            currentAccount = o2Var3.getCurrentAccount();
        }
        MediaDataController.getInstance(currentAccount).checkStickers(5);
    }

    public void W(boolean z10) {
    }

    public void X() {
    }
}
