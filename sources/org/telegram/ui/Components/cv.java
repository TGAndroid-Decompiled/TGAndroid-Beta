package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuffColorFilter;
import android.os.SystemClock;
import android.text.SpannableString;
import android.util.LongSparseArray;
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

public class cv extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate {
    public static Pattern R;
    public final c2.x A;
    public final hp B;
    public org.telegram.ui.ActionBar.n1 C;
    public final boolean D;
    public boolean E;
    public float F;
    public int G;
    public int H;
    public final y5 I;
    public final lu J;
    public int K;
    public boolean L;
    public long M;
    public ValueAnimator N;
    public boolean O;
    public PorterDuffColorFilter P;
    public int Q;

    public LongSparseArray f27547b;

    public final org.telegram.ui.ActionBar.n2 f27548c;
    public final zm d;

    public final mu f27549e;

    public final su f27550f;
    public final lh.w h;

    public qu f27551n;

    public final View f27552r;

    public final FrameLayout f27553s;
    public final TextView v;

    public final TextView f27554w;

    public final ag.s1 f27555x;

    public final f2.x f27556y;

    public cv(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, ArrayList arrayList) {
        org.telegram.ui.ActionBar.c6 resourceProvider = (n2Var == null || n2Var.getResourceProvider() == null) ? c6Var : n2Var.getResourceProvider();
        super(context, resourceProvider, false, false);
        this.G = -1;
        this.H = -1;
        this.J = new lu(this);
        this.K = -1;
        this.L = false;
        this.O = true;
        this.f27548c = n2Var;
        fixNavigationBar();
        if (arrayList != null) {
            this.D = arrayList.size() > 1;
        }
        this.f27549e = new mu(this.currentAccount, arrayList, this);
        float fDp = AndroidUtilities.dp(32.0f);
        float fDp2 = AndroidUtilities.dp(3.5f);
        int i10 = org.telegram.ui.ActionBar.g6.Oh;
        this.B = new hp(fDp, fDp2, getThemedColor(i10));
        su suVar = new su(this, context);
        this.f27550f = suVar;
        this.containerView = suVar;
        this.d = new zm(context, 10);
        lh.w wVar = new lh.w(this, context, this.resourcesProvider);
        this.h = wVar;
        this.I = new y5(0.0f, wVar, 0L, 1250L, er.f28124i);
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i11, AndroidUtilities.statusBarHeight, i11, 0);
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        this.containerView.setWillNotDraw(false);
        wVar.setWillNotDraw(false);
        wVar.setSelectorRadius(AndroidUtilities.dp(6.0f));
        wVar.setSelectorDrawableColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23144i6, resourceProvider));
        wVar.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(this.D ? 8.0f : 68.0f));
        f2.x xVar = new f2.x(8);
        this.f27556y = xVar;
        wVar.setLayoutManager(xVar);
        int i12 = 3;
        wVar.i(new cg.h2(this, i12));
        wVar.j(new xm(this, i12));
        jm jmVar = new jm(this, arrayList, n2Var, resourceProvider);
        wVar.setOnItemClickListener(jmVar);
        wVar.setOnItemLongClickListener((rk0) new g1(20, this, context));
        wVar.setOnTouchListener(new lh.p1(i12, this, jmVar));
        xVar.k1(false);
        xVar.O = new ou(this);
        this.A = new c2.x(wVar, xVar);
        this.containerView.addView(wVar, h7.z5.e(-1, -1, 51));
        View view = new View(context);
        this.f27552r = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.V5, false));
        this.containerView.addView(view, h7.z5.a(-1.0f, 1.0f / AndroidUtilities.density, 80));
        view.setTranslationY(-AndroidUtilities.dp(68.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f27553s = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23124h5));
        this.containerView.addView(frameLayout, h7.z5.e(-1, 68, 87));
        TextView textView = new TextView(context);
        this.v = textView;
        textView.setVisibility(8);
        textView.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{24.0f}, getThemedColor(i10)));
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Sh));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        h7.b6.b(textView, 0.02f, 1.2f);
        TextView textViewH = org.telegram.ui.Cells.pa.h(frameLayout, textView, h7.z5.d(-1, 48.0f, 80, 12.0f, 10.0f, 12.0f, 10.0f), context);
        this.f27554w = textViewH;
        textViewH.setVisibility(8);
        int i13 = org.telegram.ui.ActionBar.g6.f23284q7;
        textViewH.setBackground(org.telegram.ui.ActionBar.g6.Y(getThemedColor(i13) & 268435455, 0, 0));
        textViewH.setTextColor(getThemedColor(i13));
        textViewH.setTypeface(AndroidUtilities.bold());
        textViewH.setGravity(17);
        textViewH.setClickable(true);
        frameLayout.addView(textViewH, h7.z5.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 19.0f));
        ag.s1 s1Var = new ag.s1(context, this.resourcesProvider, false);
        this.f27555x = s1Var;
        s1Var.a(LocaleController.getString(R.string.UnlockPremiumEmoji), new f0(this, 12), false);
        s1Var.setIcon(R.raw.unlock_icon);
        s1Var.f647r.setClickable(true);
        frameLayout.addView(s1Var, h7.z5.d(-1, 48.0f, 80, 12.0f, 10.0f, 12.0f, 10.0f));
    }

    public static void P(cv cvVar, int i10) {
        ArrayList arrayList;
        String str;
        org.telegram.ui.ActionBar.n2 n2Var = cvVar.f27548c;
        mu muVar = cvVar.f27549e;
        if (muVar == null || (arrayList = muVar.f35360b) == null || arrayList.isEmpty()) {
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) muVar.f35360b.get(0);
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        if (stickerSet == null || !stickerSet.emojis) {
            str = "https://" + MessagesController.getInstance(cvVar.currentAccount).linkPrefix + "/addstickers/" + tL_messages_stickerSet.set.short_name;
        } else {
            str = "https://" + MessagesController.getInstance(cvVar.currentAccount).linkPrefix + "/addemoji/" + tL_messages_stickerSet.set.short_name;
        }
        String str2 = str;
        if (i10 != 1) {
            if (i10 == 2) {
                try {
                    AndroidUtilities.addToClipboard(str2);
                    new mc((FrameLayout) cvVar.containerView, cvVar.resourcesProvider).k(false).j();
                    return;
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
            }
            return;
        }
        Context parentActivity = n2Var != null ? n2Var.getParentActivity() : null;
        if (parentActivity == null) {
            parentActivity = cvVar.getContext();
        }
        pu puVar = new pu(cvVar, parentActivity, str2, str2, cvVar.resourcesProvider);
        if (n2Var != null) {
            n2Var.showDialog(puVar);
        } else {
            puVar.show();
        }
    }

    public static void W(final org.telegram.ui.ActionBar.n2 n2Var, TLObject tLObject, final boolean z10, final hh.f8 f8Var, final lp lpVar) {
        final int currentAccount = n2Var == null ? UserConfig.selectedAccount : n2Var.getCurrentAccount();
        TLRPC.StickerSet stickerSet = null;
        final View fragmentView = n2Var == null ? null : n2Var.getFragmentView();
        if (tLObject == null) {
            return;
        }
        final TLRPC.TL_messages_stickerSet tL_messages_stickerSet = tLObject instanceof TLRPC.TL_messages_stickerSet ? (TLRPC.TL_messages_stickerSet) tLObject : null;
        if (tL_messages_stickerSet != null) {
            stickerSet = tL_messages_stickerSet.set;
        } else if (tLObject instanceof TLRPC.StickerSet) {
            stickerSet = (TLRPC.StickerSet) tLObject;
        }
        final TLRPC.StickerSet stickerSet2 = stickerSet;
        if (stickerSet2 == null) {
            return;
        }
        if (MediaDataController.getInstance(currentAccount).cancelRemovingStickerSet(stickerSet2.f22407id)) {
            if (f8Var != null) {
                f8Var.run(Boolean.TRUE);
            }
        } else {
            TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_messages_installStickerSet.stickerset = tL_inputStickerSetID;
            tL_inputStickerSetID.f22400id = stickerSet2.f22407id;
            tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
            ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_installStickerSet, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                    final TLRPC.StickerSet stickerSet3 = stickerSet2;
                    final boolean z11 = z10;
                    final View view = fragmentView;
                    final org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                    final TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
                    final int i10 = currentAccount;
                    final Utilities.Callback callback = f8Var;
                    final Runnable runnable = lpVar;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            int i11;
                            TLObject tLObject3 = tLObject2;
                            TLRPC.StickerSet stickerSet4 = stickerSet3;
                            if (stickerSet4.masks) {
                                i11 = 1;
                            } else {
                                i11 = stickerSet4.emojis ? 5 : 0;
                            }
                            TLRPC.TL_error tL_error2 = tL_error;
                            View view2 = view;
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var2;
                            int i12 = i10;
                            Utilities.Callback callback2 = callback;
                            try {
                                if (tL_error2 == null) {
                                    if (z11 && view2 != null) {
                                        Context context = n2Var3.getFragmentView().getContext();
                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = tL_messages_stickerSet2;
                                        ec.g(n2Var3, new kw0(context, tL_messages_stickerSet3 == null ? stickerSet4 : tL_messages_stickerSet3, 1, 2, null, n2Var3.getResourceProvider()), 1500).j();
                                    }
                                    if (tLObject3 instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                                        MediaDataController.getInstance(i12).processStickerSetInstallResultArchive(n2Var3, true, i11, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject3);
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
                            } catch (Exception e9) {
                                FileLog.e(e9);
                            }
                            MediaDataController.getInstance(i12).loadStickers(i11, false, true, false, new v2(runnable, 5));
                        }
                    });
                }
            });
        }
    }

    public static void n(cv cvVar, ArrayList arrayList, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.c6 c6Var, View view, int i10) {
        mu muVar = cvVar.f27549e;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
        int i11 = 0;
        if (arrayList == null || arrayList.size() <= 1) {
            org.telegram.ui.ActionBar.n1 n1Var = cvVar.C;
            if (n1Var != null) {
                n1Var.d(true);
                cvVar.C = null;
                return;
            }
            if ((n2Var instanceof org.telegram.ui.rn) && ((org.telegram.ui.rn) n2Var).U.getVisibility() == 0 && (view instanceof tu)) {
                t5 t5Var = ((tu) view).f32891c;
                try {
                    TLRPC.Document documentF = t5Var.document;
                    if (documentF == null) {
                        documentF = k5.f(cvVar.currentAccount, t5Var.getDocumentId());
                    }
                    SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(documentF));
                    spannableString.setSpan(t5Var, 0, spannableString.length(), 33);
                    ((org.telegram.ui.rn) n2Var).U.A0.getText().append((CharSequence) spannableString);
                    cvVar.Y();
                    cvVar.dismiss();
                } catch (Exception unused) {
                }
                try {
                    view.performHapticFeedback(3, 1);
                    return;
                } catch (Exception unused2) {
                    return;
                }
            }
            return;
        }
        if (SystemClock.elapsedRealtime() - cvVar.M < 250) {
            return;
        }
        int i12 = 0;
        while (true) {
            ArrayList[] arrayListArr = muVar.f35361c;
            if (i11 >= arrayListArr.length) {
                break;
            }
            int size = arrayListArr[i11].size();
            if (muVar.f35361c.length > 1) {
                size = Math.min(cvVar.f27556y.J * 2, size);
            }
            i12 += size + 2;
            if (i10 < i12) {
                break;
            } else {
                i11++;
            }
        }
        ArrayList arrayList2 = muVar.f35360b;
        if (arrayList2 != null && i11 < arrayList2.size()) {
            tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) muVar.f35360b.get(i11);
        }
        if (tL_messages_stickerSet == null || tL_messages_stickerSet.set == null) {
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        tL_inputStickerSetID.f22400id = stickerSet.f22407id;
        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
        arrayList3.add(tL_inputStickerSetID);
        new nu(cvVar, n2Var, cvVar.getContext(), c6Var, arrayList3).show();
    }

    public static void p(cv cvVar, t5 t5Var) {
        org.telegram.ui.ActionBar.n1 n1Var = cvVar.C;
        if (n1Var == null) {
            return;
        }
        n1Var.d(true);
        cvVar.C = null;
        SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(k5.f(cvVar.currentAccount, t5Var.getDocumentId())));
        spannableString.setSpan(t5Var, 0, spannableString.length(), 33);
        if (AndroidUtilities.addToClipboard(spannableString)) {
            org.telegram.messenger.rl.m(R.string.EmojiCopied, new mc((FrameLayout) cvVar.containerView, cvVar.resourcesProvider));
        }
    }

    public static void q(cv cvVar, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        cvVar.F = fFloatValue;
        cvVar.h.setAlpha(fFloatValue);
        cvVar.v.setAlpha(cvVar.F);
        cvVar.f27554w.setAlpha(cvVar.F);
        cvVar.containerView.invalidate();
    }

    public final int V() {
        if (this.containerView == null) {
            return 0;
        }
        lh.w wVar = this.h;
        if (wVar == null || wVar.getChildCount() < 1) {
            return this.containerView.getPaddingTop();
        }
        View childAt = wVar.getChildAt(0);
        zm zmVar = this.d;
        return childAt != zmVar ? this.containerView.getPaddingTop() : zmVar.getBottom() + ((int) wVar.getY());
    }

    public final void Z() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f27548c;
        if (n2Var != null) {
            new ag.g2(n2Var, 11, false).show();
        } else if (getContext() instanceof LaunchActivity) {
            ((LaunchActivity) getContext()).p0(new PremiumPreviewFragment(0, null));
        }
    }

    public final void a0() {
        final int i10;
        TLRPC.StickerSet stickerSet;
        if (this.f27553s == null) {
            return;
        }
        mu muVar = this.f27549e;
        ArrayList arrayList = muVar.f35360b == null ? new ArrayList() : new ArrayList(muVar.f35360b);
        final int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = 1;
            if (i12 >= arrayList.size()) {
                break;
            }
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
                if (mediaDataController.isStickerPackInstalled(stickerSet.f22407id)) {
                    arrayList2.add(tL_messages_stickerSet);
                } else {
                    arrayList3.add(tL_messages_stickerSet);
                }
            }
        }
        final ArrayList arrayList4 = new ArrayList(arrayList3);
        boolean z10 = muVar.f35359a != null && arrayList.size() == muVar.f35359a.size();
        if (!this.O && z10 && this.N == null) {
            this.N = ValueAnimator.ofFloat(this.F, 1.0f);
            this.containerView.getY();
            this.N.addUpdateListener(new e6(this, 16));
            this.N.setDuration(250L);
            this.N.setInterpolator(er.h);
            this.N.start();
        }
        this.O = z10;
        lh.w wVar = this.h;
        if (!z10) {
            wVar.setAlpha(0.0f);
        } else if (this.K >= 0) {
            int iL0 = this.f27556y.L0();
            int iE = this.f27551n.E(this.K);
            if (Math.abs(iL0 - iE) > 54) {
                int i14 = iL0 < iE ? 0 : 1;
                c2.x xVar = this.A;
                xVar.f2367b = i14;
                xVar.d(iE, (AndroidUtilities.displaySize.y / 2) - AndroidUtilities.dp(170.0f), false, false);
            } else {
                wVar.x0(iE);
            }
            this.G = this.f27551n.E(this.K);
            qu quVar = this.f27551n;
            int i15 = this.K;
            cv cvVar = quVar.f31981c;
            boolean z11 = cvVar.E;
            mu muVar2 = cvVar.f27549e;
            int i16 = z11 ? 2 : 1;
            int i17 = 0;
            while (true) {
                ArrayList[] arrayListArr = muVar2.f35361c;
                if (i17 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i17].size();
                if (muVar2.f35361c.length > 1) {
                    size = Math.min(cvVar.f27556y.J * 2, size);
                }
                if (i17 == i15) {
                    i16 = i16 + size + 1;
                    break;
                } else {
                    i16 += size + 2;
                    i17++;
                }
            }
            this.H = i16;
            this.I.d(1.0f, true);
            wVar.invalidate();
            this.K = -1;
        }
        boolean z12 = this.O;
        ag.s1 s1Var = this.f27555x;
        TextView textView = this.f27554w;
        TextView textView2 = this.v;
        if (!z12 || this.D) {
            s1Var.setVisibility(8);
            textView2.setVisibility(8);
            textView.setVisibility(8);
            b0(false);
            return;
        }
        s1Var.setVisibility(4);
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
                    switch (i11) {
                        case 0:
                            ArrayList arrayList5 = arrayList4;
                            int size2 = arrayList5.size();
                            int[] iArr = new int[2];
                            int i18 = 0;
                            while (true) {
                                int size3 = arrayList5.size();
                                cv cvVar2 = this;
                                if (i18 >= size3) {
                                    cvVar2.X(true);
                                    if (size2 <= 1) {
                                        cvVar2.dismiss();
                                    }
                                } else {
                                    cv.W(cvVar2.f27548c, (TLObject) arrayList5.get(i18), size2 == 1, size2 > 1 ? new hh.f8(cvVar2, iArr, size2, arrayList5) : null, null);
                                    i18++;
                                }
                                break;
                            }
                            break;
                        default:
                            cv cvVar3 = this;
                            cvVar3.dismiss();
                            org.telegram.ui.ActionBar.n2 n2Var = cvVar3.f27548c;
                            ArrayList<TLRPC.TL_messages_stickerSet> arrayList6 = arrayList4;
                            if (n2Var != null) {
                                MediaDataController.getInstance(n2Var.getCurrentAccount()).removeMultipleStickerSets(n2Var.getContext(), n2Var, arrayList6);
                            } else {
                                int i19 = 0;
                                while (i19 < arrayList6.size()) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = arrayList6.get(i19);
                                    Context context = cvVar3.getContext();
                                    boolean z13 = i19 == 0;
                                    if (tL_messages_stickerSet2 != null) {
                                        MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(context, tL_messages_stickerSet2, 0, null, true, z13, null, true);
                                    }
                                    i19++;
                                }
                            }
                            cvVar3.X(false);
                            break;
                    }
                }
            });
            b0(true);
            return;
        }
        if (arrayList2.size() <= 0) {
            textView2.setVisibility(8);
            textView.setVisibility(8);
            b0(false);
            return;
        }
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
                switch (i10) {
                    case 0:
                        ArrayList arrayList5 = arrayList2;
                        int size2 = arrayList5.size();
                        int[] iArr = new int[2];
                        int i18 = 0;
                        while (true) {
                            int size3 = arrayList5.size();
                            cv cvVar2 = this;
                            if (i18 >= size3) {
                                cvVar2.X(true);
                                if (size2 <= 1) {
                                    cvVar2.dismiss();
                                }
                            } else {
                                cv.W(cvVar2.f27548c, (TLObject) arrayList5.get(i18), size2 == 1, size2 > 1 ? new hh.f8(cvVar2, iArr, size2, arrayList5) : null, null);
                                i18++;
                            }
                            break;
                        }
                        break;
                    default:
                        cv cvVar3 = this;
                        cvVar3.dismiss();
                        org.telegram.ui.ActionBar.n2 n2Var = cvVar3.f27548c;
                        ArrayList<TLRPC.TL_messages_stickerSet> arrayList6 = arrayList2;
                        if (n2Var != null) {
                            MediaDataController.getInstance(n2Var.getCurrentAccount()).removeMultipleStickerSets(n2Var.getContext(), n2Var, arrayList6);
                        } else {
                            int i19 = 0;
                            while (i19 < arrayList6.size()) {
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = arrayList6.get(i19);
                                Context context = cvVar3.getContext();
                                boolean z13 = i19 == 0;
                                if (tL_messages_stickerSet2 != null) {
                                    MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(context, tL_messages_stickerSet2, 0, null, true, z13, null, true);
                                }
                                i19++;
                            }
                        }
                        cvVar3.X(false);
                        break;
                }
            }
        });
        b0(true);
    }

    public final void b0(boolean z10) {
        boolean z11 = !this.L && z10;
        float fDp = this.f27554w.getVisibility() == 0 ? AndroidUtilities.dp(19.0f) : 0;
        boolean z12 = this.D;
        lh.w wVar = this.h;
        View view = this.f27552r;
        FrameLayout frameLayout = this.f27553s;
        float fDp2 = 0.0f;
        if (z11) {
            ViewPropertyAnimator duration = frameLayout.animate().translationY(z10 ? fDp : AndroidUtilities.dp(16.0f)).alpha(z10 ? 1.0f : 0.0f).setDuration(250L);
            er erVar = er.h;
            duration.setInterpolator(erVar).start();
            view.animate().translationY(z10 ? -(AndroidUtilities.dp(68.0f) - fDp) : 0.0f).alpha(z10 ? 1.0f : 0.0f).setDuration(250L).setInterpolator(erVar).start();
            ViewPropertyAnimator viewPropertyAnimatorAnimate = wVar.animate();
            if (!z12 && !z10) {
                fDp2 = AndroidUtilities.dp(68.0f) - fDp;
            }
            viewPropertyAnimatorAnimate.translationY(fDp2).setDuration(250L).setInterpolator(erVar).start();
        } else {
            frameLayout.setAlpha(z10 ? 1.0f : 0.0f);
            frameLayout.setTranslationY(z10 ? fDp : AndroidUtilities.dp(16.0f));
            view.setAlpha(z10 ? 1.0f : 0.0f);
            view.setTranslationY(z10 ? -(AndroidUtilities.dp(68.0f) - fDp) : 0.0f);
            if (!z12 && !z10) {
                fDp2 = AndroidUtilities.dp(68.0f) - fDp;
            }
            wVar.setTranslationY(fDp2);
        }
        this.L = z10;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        xu xuVar;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        if (i10 != NotificationCenter.stickersDidLoad) {
            return;
        }
        int i12 = 0;
        while (true) {
            lh.w wVar = this.h;
            if (i12 >= wVar.getChildCount()) {
                a0();
                return;
            }
            View childAt = wVar.getChildAt(i12);
            if ((childAt instanceof xu) && (tL_messages_stickerSet = (xuVar = (xu) childAt).f34717r) != null && tL_messages_stickerSet.set != null) {
                xuVar.a(MediaDataController.getInstance(this.currentAccount).isStickerPackInstalled(xuVar.f34717r.set.f22407id), true);
            }
            i12++;
        }
    }

    @Override
    public void dismiss() {
        su suVar = this.f27550f;
        if (suVar != null && suVar.f32575w) {
            suVar.f32575w = false;
            suVar.invalidate();
        }
        super.dismiss();
        mu muVar = this.f27549e;
        if (muVar != null) {
            NotificationCenter.getInstance(muVar.d).removeObserver(muVar, NotificationCenter.groupStickersDidLoad);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
    }

    @Override
    public final int getContainerViewHeight() {
        lh.w wVar = this.h;
        int measuredHeight = (wVar == null ? 0 : wVar.getMeasuredHeight()) - V();
        ViewGroup viewGroup = this.containerView;
        return AndroidUtilities.dp(8.0f) + measuredHeight + (viewGroup != null ? viewGroup.getPaddingTop() : 0) + AndroidUtilities.navigationBarHeight;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
    }

    @Override
    public final void onBackPressed() {
        if (org.telegram.ui.kt.q().E) {
            org.telegram.ui.kt.q().o();
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
        TLRPC.StickerSet stickerSet;
        super.show();
        qu quVar = new qu(this);
        this.f27551n = quVar;
        this.h.setAdapter(quVar);
        int i10 = 0;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4);
        mu muVar = this.f27549e;
        if (!muVar.f35362e) {
            muVar.f35362e = true;
            cv cvVar = muVar.f35363f;
            int i11 = muVar.d;
            muVar.f35360b = new ArrayList(muVar.f35359a.size());
            muVar.f35361c = new ArrayList[muVar.f35359a.size()];
            NotificationCenter.getInstance(i11).addObserver(muVar, NotificationCenter.groupStickersDidLoad);
            boolean[] zArr = new boolean[1];
            int i12 = 0;
            while (true) {
                if (i12 >= muVar.f35361c.length) {
                    cv cvVar2 = muVar.h;
                    cvVar2.a0();
                    lh.w wVar = cvVar2.h;
                    if (wVar != null && wVar.getAdapter() != null) {
                        wVar.getAdapter().l();
                        break;
                    } else {
                        break;
                        break;
                    }
                }
                TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(i11).getStickerSet((TLRPC.InputStickerSet) muVar.f35359a.get(i12), null, false, new org.telegram.ui.df(16, muVar, zArr));
                if (muVar.f35361c.length == 1 && stickerSet2 != null && (stickerSet = stickerSet2.set) != null && !stickerSet.emojis) {
                    AndroidUtilities.runOnUIThread(new yu(muVar, i10));
                    Context context = cvVar.getContext();
                    org.telegram.ui.ActionBar.n2 n2Var = cvVar.f27548c;
                    TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) muVar.f35359a.get(i12);
                    org.telegram.ui.ActionBar.n2 n2Var2 = cvVar.f27548c;
                    new ex0(context, n2Var, inputStickerSet, null, n2Var2 instanceof org.telegram.ui.rn ? ((org.telegram.ui.rn) n2Var2).U : null, cvVar.resourcesProvider).show();
                    break;
                }
                muVar.f35360b.add(stickerSet2);
                muVar.a(i12, stickerSet2);
                i12++;
            }
        }
        a0();
        org.telegram.ui.ActionBar.n2 n2Var3 = this.f27548c;
        MediaDataController.getInstance(n2Var3 == null ? UserConfig.selectedAccount : n2Var3.getCurrentAccount()).checkStickers(5);
    }

    public void X(boolean z10) {
    }

    public void Y() {
    }
}
