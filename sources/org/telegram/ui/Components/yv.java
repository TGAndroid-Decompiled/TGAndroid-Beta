package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.SpannableString;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
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
public class yv extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate {
    public static Pattern V;
    public final ol0 E;
    public final cq F;
    public org.telegram.ui.ActionBar.m1 G;
    public final boolean H;
    public boolean I;
    public float J;
    public int K;
    public int L;
    public final d6 M;
    public final gv N;
    public int O;
    public boolean P;
    public long Q;
    public ValueAnimator R;
    public boolean S;
    public PorterDuffColorFilter T;
    public int U;
    public LongSparseArray f33048b;
    public final org.telegram.ui.ActionBar.o2 f33049c;
    public final sn d;
    public final hv e;
    public final ov f33050f;
    public final ei.v h;
    public mv f33051n;
    public final View f33052r;
    public final FrameLayout f33053s;
    public final TextView v;
    public final TextView f33054w;
    public final sg.p0 f33055x;
    public final s4.s f33056y;

    public yv(org.telegram.ui.ActionBar.o2 r21, android.content.Context r22, org.telegram.ui.ActionBar.g6 r23, java.util.ArrayList r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yv.<init>(org.telegram.ui.ActionBar.o2, android.content.Context, org.telegram.ui.ActionBar.g6, java.util.ArrayList):void");
    }

    public static void Z(yv yvVar, int i10) {
        ArrayList arrayList;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        String str;
        Context context;
        org.telegram.ui.ActionBar.o2 o2Var = yvVar.f33049c;
        hv hvVar = yvVar.e;
        if (hvVar != null && (arrayList = hvVar.f32050b) != null && !arrayList.isEmpty()) {
            TLRPC.StickerSet stickerSet = ((TLRPC.TL_messages_stickerSet) hvVar.f32050b.get(0)).set;
            if (stickerSet != null && stickerSet.emojis) {
                str = "https://" + MessagesController.getInstance(yvVar.currentAccount).linkPrefix + "/addemoji/" + tL_messages_stickerSet.set.short_name;
            } else {
                str = "https://" + MessagesController.getInstance(yvVar.currentAccount).linkPrefix + "/addstickers/" + tL_messages_stickerSet.set.short_name;
            }
            String str2 = str;
            if (i10 == 1) {
                if (o2Var != null) {
                    context = o2Var.getParentActivity();
                } else {
                    context = null;
                }
                if (context == null) {
                    context = yvVar.getContext();
                }
                lv lvVar = new lv(yvVar, context, str2, str2, yvVar.resourcesProvider);
                if (o2Var != null) {
                    o2Var.showDialog(lvVar);
                } else {
                    lvVar.show();
                }
            } else if (i10 == 2) {
                try {
                    AndroidUtilities.addToClipboard(str2);
                    new vc((FrameLayout) yvVar.containerView, yvVar.resourcesProvider).k(false).j();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
    }

    public static int e0(yv yvVar) {
        return yvVar.currentAccount;
    }

    public static void g0(final org.telegram.ui.ActionBar.o2 o2Var, TLObject tLObject, final boolean z10, final ai.va vaVar, final xp xpVar) {
        int currentAccount;
        final View fragmentView;
        final TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        if (o2Var == null) {
            currentAccount = UserConfig.selectedAccount;
        } else {
            currentAccount = o2Var.getCurrentAccount();
        }
        final int i10 = currentAccount;
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
                if (MediaDataController.getInstance(i10).cancelRemovingStickerSet(stickerSet2.f20371id)) {
                    if (vaVar != null) {
                        vaVar.run(Boolean.TRUE);
                        return;
                    }
                    return;
                }
                TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                tL_messages_installStickerSet.stickerset = tL_inputStickerSetID;
                tL_inputStickerSetID.f20364id = stickerSet2.f20371id;
                tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                ConnectionsManager.getInstance(i10).sendRequest(tL_messages_installStickerSet, new RequestDelegate() {
                    @Override
                    public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                        final TLRPC.StickerSet stickerSet3 = TLRPC.StickerSet.this;
                        final boolean z11 = z10;
                        final View view = fragmentView;
                        final org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        final TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
                        final int i11 = i10;
                        final Utilities.Callback callback = vaVar;
                        final Runnable runnable = xpVar;
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
                                org.telegram.ui.ActionBar.o2 o2Var3 = o2Var2;
                                int i13 = i11;
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
                                            oc.g(o2Var3, new xx0(context, tLObject3, 1, 2, null, o2Var3.getResourceProvider()), 1500).j();
                                        }
                                        if (tLObject4 instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                                            MediaDataController.getInstance(i13).processStickerSetInstallResultArchive(o2Var3, true, i12, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject4);
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
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                                MediaDataController.getInstance(i13).loadStickers(i12, false, true, false, new x2(runnable, 5));
                            }
                        });
                    }
                });
            }
        }
    }

    public static boolean m(yv yvVar, en enVar, MotionEvent motionEvent) {
        return org.telegram.ui.ht.o().q(motionEvent, yvVar.h, enVar, yvVar.N, yvVar.resourcesProvider);
    }

    public static void n(yv yvVar, ArrayList arrayList, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.g6 g6Var, View view, int i10) {
        hv hvVar = yvVar.e;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
        int i11 = 0;
        if (arrayList != null && arrayList.size() > 1) {
            if (SystemClock.elapsedRealtime() - yvVar.Q >= 250) {
                int i12 = 0;
                while (true) {
                    ArrayList[] arrayListArr = hvVar.f32051c;
                    if (i11 >= arrayListArr.length) {
                        break;
                    }
                    int size = arrayListArr[i11].size();
                    if (hvVar.f32051c.length > 1) {
                        size = Math.min(yvVar.f33056y.J * 2, size);
                    }
                    i12 += size + 2;
                    if (i10 < i12) {
                        break;
                    }
                    i11++;
                }
                ArrayList arrayList2 = hvVar.f32050b;
                if (arrayList2 != null && i11 < arrayList2.size()) {
                    tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) hvVar.f32050b.get(i11);
                }
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                    ArrayList arrayList3 = new ArrayList();
                    TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    tL_inputStickerSetID.f20364id = stickerSet.f20371id;
                    tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                    arrayList3.add(tL_inputStickerSetID);
                    new jv(yvVar, o2Var, yvVar.getContext(), g6Var, arrayList3).show();
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.m1 m1Var = yvVar.G;
        if (m1Var != null) {
            m1Var.d(true);
            yvVar.G = null;
        } else if ((o2Var instanceof org.telegram.ui.sn) && ((org.telegram.ui.sn) o2Var).Y.getVisibility() == 0 && (view instanceof pv)) {
            y5 y5Var = ((pv) view).f29684c;
            try {
                TLRPC.Document document = y5Var.document;
                if (document == null) {
                    document = p5.f(yvVar.currentAccount, y5Var.getDocumentId());
                }
                SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(document));
                spannableString.setSpan(y5Var, 0, spannableString.length(), 33);
                ((org.telegram.ui.sn) o2Var).Y.E0.getText().append((CharSequence) spannableString);
                yvVar.i0();
                yvVar.dismiss();
            } catch (Exception unused) {
            }
            try {
                view.performHapticFeedback(3, 1);
            } catch (Exception unused2) {
            }
        }
    }

    public static void p(yv yvVar, y5 y5Var) {
        org.telegram.ui.ActionBar.m1 m1Var = yvVar.G;
        if (m1Var != null) {
            m1Var.d(true);
            yvVar.G = null;
            SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(p5.f(yvVar.currentAccount, y5Var.getDocumentId())));
            spannableString.setSpan(y5Var, 0, spannableString.length(), 33);
            if (AndroidUtilities.addToClipboard(spannableString)) {
                org.telegram.messenger.tl.p(R.string.EmojiCopied, new vc((FrameLayout) yvVar.containerView, yvVar.resourcesProvider));
            }
        }
    }

    public static void q(yv yvVar, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        yvVar.J = floatValue;
        yvVar.h.setAlpha(floatValue);
        yvVar.v.setAlpha(yvVar.J);
        yvVar.f33054w.setAlpha(yvVar.J);
        yvVar.containerView.invalidate();
    }

    public static boolean r(yv yvVar, Context context, View view) {
        y5 y5Var;
        if (!(view instanceof pv) || (y5Var = ((pv) view).f29684c) == null) {
            return false;
        }
        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(yvVar.getContext(), true, true);
        e1Var.setItemHeight(48);
        e1Var.setPadding(AndroidUtilities.dp(26.0f), 0, AndroidUtilities.dp(26.0f), 0);
        e1Var.setText(LocaleController.getString(R.string.Copy));
        e1Var.getTextView().setTextSize(1, 14.4f);
        e1Var.getTextView().setTypeface(AndroidUtilities.bold());
        e1Var.setOnClickListener(new aa(12, yvVar, y5Var));
        LinearLayout linearLayout = new LinearLayout(context);
        Drawable mutate = yvVar.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
        org.telegram.ui.ActionBar.r6.z(linearLayout, mutate, org.telegram.ui.ActionBar.k6.G8, yvVar.resourcesProvider, PorterDuff.Mode.MULTIPLY);
        linearLayout.setBackground(mutate);
        linearLayout.addView(e1Var);
        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(linearLayout, -2, -2);
        yvVar.G = m1Var;
        m1Var.setClippingEnabled(true);
        yvVar.G.g();
        yvVar.G.setInputMethodMode(2);
        yvVar.G.setSoftInputMode(0);
        yvVar.G.setOutsideTouchable(true);
        yvVar.G.setAnimationStyle(R.style.PopupAnimation);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        yvVar.G.showAtLocation(view, 51, (view.getMeasuredWidth() / 2) + (iArr[0] - AndroidUtilities.dp(49.0f)), iArr[1] - AndroidUtilities.dp(52.0f));
        try {
            view.performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        return true;
    }

    public static ViewGroup t(yv yvVar) {
        return yvVar.containerView;
    }

    public static ViewGroup u(yv yvVar) {
        return yvVar.containerView;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        tv tvVar;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        if (i10 == NotificationCenter.stickersDidLoad) {
            int i12 = 0;
            while (true) {
                ei.v vVar = this.h;
                if (i12 < vVar.getChildCount()) {
                    View childAt = vVar.getChildAt(i12);
                    if ((childAt instanceof tv) && (tL_messages_stickerSet = (tvVar = (tv) childAt).f30896r) != null && tL_messages_stickerSet.set != null) {
                        tvVar.a(MediaDataController.getInstance(this.currentAccount).isStickerPackInstalled(tvVar.f30896r.set.f20371id), true);
                    }
                    i12++;
                } else {
                    k0();
                    return;
                }
            }
        }
    }

    @Override
    public void dismiss() {
        ov ovVar = this.f33050f;
        if (ovVar != null && ovVar.f29400w) {
            ovVar.f29400w = false;
            ovVar.invalidate();
        }
        super.dismiss();
        hv hvVar = this.e;
        if (hvVar != null) {
            NotificationCenter.getInstance(hvVar.d).removeObserver(hvVar, NotificationCenter.groupStickersDidLoad);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
    }

    public final int f0() {
        if (this.containerView == null) {
            return 0;
        }
        ei.v vVar = this.h;
        if (vVar != null && vVar.getChildCount() >= 1) {
            View childAt = vVar.getChildAt(0);
            sn snVar = this.d;
            if (childAt != snVar) {
                return this.containerView.getPaddingTop();
            }
            return snVar.getBottom() + ((int) vVar.getY());
        }
        return this.containerView.getPaddingTop();
    }

    @Override
    public final int getContainerViewHeight() {
        int measuredHeight;
        int i10 = 0;
        ei.v vVar = this.h;
        if (vVar == null) {
            measuredHeight = 0;
        } else {
            measuredHeight = vVar.getMeasuredHeight();
        }
        int f02 = measuredHeight - f0();
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            i10 = viewGroup.getPaddingTop();
        }
        return AndroidUtilities.dp(8.0f) + f02 + i10 + AndroidUtilities.navigationBarHeight;
    }

    public final void j0() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f33049c;
        if (o2Var != null) {
            new sg.y0(o2Var, 11, false).show();
        } else if (getContext() instanceof LaunchActivity) {
            ((LaunchActivity) getContext()).u0(new PremiumPreviewFragment(0, null));
        }
    }

    public final void k0() {
        ArrayList arrayList;
        boolean z10;
        int i10;
        int i11;
        TLRPC.StickerSet stickerSet;
        if (this.f33053s == null) {
            return;
        }
        hv hvVar = this.e;
        if (hvVar.f32050b == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(hvVar.f32050b);
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
                if (!mediaDataController.isStickerPackInstalled(stickerSet.f20371id)) {
                    arrayList3.add(tL_messages_stickerSet);
                } else {
                    arrayList2.add(tL_messages_stickerSet);
                }
            }
        }
        final ArrayList arrayList4 = new ArrayList(arrayList3);
        if (hvVar.f32049a != null && arrayList.size() == hvVar.f32049a.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!this.S && z10 && this.R == null) {
            this.R = ValueAnimator.ofFloat(this.J, 1.0f);
            this.containerView.getY();
            this.R.addUpdateListener(new j6(this, 17));
            this.R.setDuration(250L);
            this.R.setInterpolator(zr.h);
            this.R.start();
        }
        this.S = z10;
        ei.v vVar = this.h;
        if (!z10) {
            vVar.setAlpha(0.0f);
        } else if (this.O >= 0) {
            int L0 = this.f33056y.L0();
            int E = this.f33051n.E(this.O);
            if (Math.abs(L0 - E) > 54) {
                if (L0 < E) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                ol0 ol0Var = this.E;
                ol0Var.f29317b = i11;
                ol0Var.c(E, (AndroidUtilities.displaySize.y / 2) - AndroidUtilities.dp(170.0f), false, false);
            } else {
                vVar.x0(E);
            }
            this.K = this.f33051n.E(this.O);
            mv mvVar = this.f33051n;
            int i14 = this.O;
            yv yvVar = mvVar.f28701c;
            boolean z11 = yvVar.I;
            hv hvVar2 = yvVar.e;
            if (z11) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            int i15 = 0;
            while (true) {
                ArrayList[] arrayListArr = hvVar2.f32051c;
                if (i15 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i15].size();
                if (hvVar2.f32051c.length > 1) {
                    size = Math.min(yvVar.f33056y.J * 2, size);
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
        sg.p0 p0Var = this.f33055x;
        TextView textView = this.f33054w;
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
                        ai.va vaVar;
                        boolean z14;
                        switch (r1) {
                            case 0:
                                ArrayList arrayList5 = arrayList4;
                                int size2 = arrayList5.size();
                                int[] iArr = new int[2];
                                int i16 = 0;
                                while (true) {
                                    int size3 = arrayList5.size();
                                    yv yvVar2 = this;
                                    if (i16 < size3) {
                                        org.telegram.ui.ActionBar.o2 o2Var = yvVar2.f33049c;
                                        TLObject tLObject = (TLObject) arrayList5.get(i16);
                                        if (size2 == 1) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        if (size2 > 1) {
                                            vaVar = new ai.va(yvVar2, iArr, size2, arrayList5);
                                        } else {
                                            vaVar = null;
                                        }
                                        yv.g0(o2Var, tLObject, z13, vaVar, null);
                                        i16++;
                                    } else {
                                        yvVar2.h0(true);
                                        if (size2 <= 1) {
                                            yvVar2.dismiss();
                                            return;
                                        }
                                        return;
                                    }
                                }
                            default:
                                yv yvVar3 = this;
                                yvVar3.dismiss();
                                org.telegram.ui.ActionBar.o2 o2Var2 = yvVar3.f33049c;
                                ArrayList<TLRPC.TL_messages_stickerSet> arrayList6 = arrayList4;
                                if (o2Var2 != null) {
                                    MediaDataController.getInstance(o2Var2.getCurrentAccount()).removeMultipleStickerSets(o2Var2.getContext(), o2Var2, arrayList6);
                                } else {
                                    for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = arrayList6.get(i17);
                                        Context context = yvVar3.getContext();
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
                                yvVar3.h0(false);
                                return;
                        }
                    }
                });
                m0(true);
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
                        ai.va vaVar;
                        boolean z14;
                        switch (r1) {
                            case 0:
                                ArrayList arrayList5 = arrayList2;
                                int size2 = arrayList5.size();
                                int[] iArr = new int[2];
                                int i16 = 0;
                                while (true) {
                                    int size3 = arrayList5.size();
                                    yv yvVar2 = this;
                                    if (i16 < size3) {
                                        org.telegram.ui.ActionBar.o2 o2Var = yvVar2.f33049c;
                                        TLObject tLObject = (TLObject) arrayList5.get(i16);
                                        if (size2 == 1) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        if (size2 > 1) {
                                            vaVar = new ai.va(yvVar2, iArr, size2, arrayList5);
                                        } else {
                                            vaVar = null;
                                        }
                                        yv.g0(o2Var, tLObject, z13, vaVar, null);
                                        i16++;
                                    } else {
                                        yvVar2.h0(true);
                                        if (size2 <= 1) {
                                            yvVar2.dismiss();
                                            return;
                                        }
                                        return;
                                    }
                                }
                            default:
                                yv yvVar3 = this;
                                yvVar3.dismiss();
                                org.telegram.ui.ActionBar.o2 o2Var2 = yvVar3.f33049c;
                                ArrayList<TLRPC.TL_messages_stickerSet> arrayList6 = arrayList2;
                                if (o2Var2 != null) {
                                    MediaDataController.getInstance(o2Var2.getCurrentAccount()).removeMultipleStickerSets(o2Var2.getContext(), o2Var2, arrayList6);
                                } else {
                                    for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = arrayList6.get(i17);
                                        Context context = yvVar3.getContext();
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
                                yvVar3.h0(false);
                                return;
                        }
                    }
                });
                m0(true);
                return;
            } else {
                textView2.setVisibility(8);
                textView.setVisibility(8);
                m0(false);
                return;
            }
        }
        p0Var.setVisibility(8);
        textView2.setVisibility(8);
        textView.setVisibility(8);
        m0(false);
    }

    public final void l0(boolean z10) {
        boolean z11;
        boolean z12 = false;
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(org.telegram.ui.ActionBar.k6.f21255h5)) > 0.721f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.v(getThemedColor(org.telegram.ui.ActionBar.k6.f21463s8), 855638016)) > 0.721f) {
            z12 = true;
        }
        if (!z10) {
            z11 = z12;
        }
        AndroidUtilities.setLightStatusBar(this, z11);
    }

    public final void m0(boolean z10) {
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
        if (this.f33054w.getVisibility() == 0) {
            i10 = AndroidUtilities.dp(19.0f);
        }
        float f13 = i10;
        boolean z12 = this.H;
        ei.v vVar = this.h;
        View view = this.f33052r;
        FrameLayout frameLayout = this.f33053s;
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
            zr zrVar = zr.h;
            duration.setInterpolator(zrVar).start();
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
            translationY2.alpha(f14).setDuration(250L).setInterpolator(zrVar).start();
            ViewPropertyAnimator animate3 = vVar.animate();
            if (!z12 && !z10) {
                f15 = AndroidUtilities.dp(68.0f) - f13;
            }
            animate3.translationY(f15).setDuration(250L).setInterpolator(zrVar).start();
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
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
    }

    @Override
    public final void onBackPressed() {
        if (org.telegram.ui.ht.o().E) {
            org.telegram.ui.ht.o().m();
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
    public final void onThemeColorsChanged() {
        Boolean bool;
        try {
            super.onThemeColorsChanged();
            cq cqVar = this.F;
            if (cqVar != null) {
                cqVar.b(getThemedColor(org.telegram.ui.ActionBar.k6.Oh));
            }
            ov ovVar = this.f33050f;
            if (ovVar != null && (bool = ovVar.f29395c) != null) {
                l0(bool.booleanValue());
            }
            ViewGroup viewGroup = this.containerView;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void show() {
        int currentAccount;
        TLRPC.StickerSet stickerSet;
        super.show();
        mv mvVar = new mv(this);
        this.f33051n = mvVar;
        this.h.setAdapter(mvVar);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4);
        hv hvVar = this.e;
        if (!hvVar.e) {
            hvVar.e = true;
            yv yvVar = hvVar.f32052f;
            int i10 = hvVar.d;
            hvVar.f32050b = new ArrayList(hvVar.f32049a.size());
            hvVar.f32051c = new ArrayList[hvVar.f32049a.size()];
            NotificationCenter.getInstance(i10).addObserver(hvVar, NotificationCenter.groupStickersDidLoad);
            boolean[] zArr = new boolean[1];
            int i11 = 0;
            while (true) {
                if (i11 < hvVar.f32051c.length) {
                    org.telegram.ui.gk gkVar = null;
                    TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(i10).getStickerSet((TLRPC.InputStickerSet) hvVar.f32049a.get(i11), null, false, new org.telegram.ui.ActionBar.m3(27, hvVar, zArr));
                    if (hvVar.f32051c.length == 1 && stickerSet2 != null && (stickerSet = stickerSet2.set) != null && !stickerSet.emojis) {
                        AndroidUtilities.runOnUIThread(new uv(hvVar, 0));
                        Context context = yvVar.getContext();
                        org.telegram.ui.ActionBar.o2 o2Var = yvVar.f33049c;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) hvVar.f32049a.get(i11);
                        org.telegram.ui.ActionBar.o2 o2Var2 = yvVar.f33049c;
                        if (o2Var2 instanceof org.telegram.ui.sn) {
                            gkVar = ((org.telegram.ui.sn) o2Var2).Y;
                        }
                        new sy0(context, o2Var, inputStickerSet, null, gkVar, yvVar.resourcesProvider).show();
                    } else {
                        hvVar.f32050b.add(stickerSet2);
                        hvVar.a(i11, stickerSet2);
                        i11++;
                    }
                } else {
                    yv yvVar2 = hvVar.h;
                    yvVar2.k0();
                    ei.v vVar = yvVar2.h;
                    if (vVar != null && vVar.getAdapter() != null) {
                        vVar.getAdapter().l();
                    }
                }
            }
        }
        k0();
        org.telegram.ui.ActionBar.o2 o2Var3 = this.f33049c;
        if (o2Var3 == null) {
            currentAccount = UserConfig.selectedAccount;
        } else {
            currentAccount = o2Var3.getCurrentAccount();
        }
        MediaDataController.getInstance(currentAccount).checkStickers(5);
    }

    public void h0(boolean z10) {
    }

    public void i0() {
    }
}
