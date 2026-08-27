package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

public final class ft implements Runnable {

    public final kt f38203a;

    public ft(kt ktVar) {
        this.f38203a = ktVar;
    }

    @Override
    public final void run() {
        int i10;
        boolean zHasRecentGif;
        TLRPC.InputStickerSet inputStickerSet;
        int i11;
        View childAt;
        boolean z10;
        boolean z11;
        ta1 ta1Var;
        int i12;
        org.telegram.ui.Components.b70 b70VarL;
        kt ktVar = this.f38203a;
        jg.a aVar = ktVar.f39876t;
        if (ktVar.f39878w == null || ktVar.f39869m) {
            return;
        }
        ktVar.R = true;
        ht htVar = ktVar.f39868l;
        int i13 = 16;
        final int i14 = 0;
        if (htVar != null && (b70VarL = htVar.L(ktVar.f39881z)) != null) {
            b70VarL.Q(aVar, ng.c.j(ktVar.f39859c0), true);
            b70VarL.f26993t = false;
            b70VarL.Y();
            b70VarL.f26987p = new ti(this, i13);
            ViewGroup viewGroup = b70VarL.A;
            at atVar = new at(this, viewGroup);
            ktVar.f39867k = atVar;
            atVar.f23684e = true;
            atVar.f23683c = 150;
            atVar.f23686g = true;
            atVar.setOutsideTouchable(true);
            ktVar.f39867k.setClippingEnabled(true);
            ktVar.f39867k.setAnimationStyle(R.style.PopupContextAnimation);
            ktVar.f39867k.setFocusable(true);
            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
            ktVar.f39867k.setInputMethodMode(2);
            ktVar.f39867k.getContentView().setFocusableInTouchMode(true);
            i0.c cVar = ktVar.f39873q;
            int i15 = cVar.d;
            int i16 = cVar.f10490b;
            int i17 = i15 + i16;
            int iMin = (Math.min(ktVar.f39881z.getWidth(), ktVar.f39881z.getHeight() - i17) - AndroidUtilities.dp(40.0f)) / 2;
            int iDp = (int) ((AndroidUtilities.dp(24.0f) - ktVar.f39861e) + ((int) (ktVar.f39861e + Math.max(i16 + iMin + (ktVar.G != null ? AndroidUtilities.dp(40.0f) : 0), ((ktVar.f39881z.getHeight() - i17) - ktVar.I) / 2) + iMin)));
            org.telegram.ui.ActionBar.n1 n1Var = ktVar.f39867k;
            ag.y1 y1Var = ktVar.f39881z;
            n1Var.showAtLocation(y1Var, 0, (int) ((y1Var.getMeasuredWidth() - viewGroup.getMeasuredWidth()) / 2.0f), iDp);
            try {
                ktVar.f39881z.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            float f10 = ktVar.f39861e;
            if (f10 != 0.0f) {
                ktVar.f39863f = f10;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

                    public final ft f45246b;

                    {
                        this.f45246b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i14) {
                            case 0:
                                kt ktVar2 = this.f45246b.f38203a;
                                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ktVar2.f39864g = fFloatValue;
                                float f11 = ktVar2.f39863f;
                                ktVar2.f39861e = com.google.android.recaptcha.internal.a.z(0.0f, f11, fFloatValue, f11);
                                ktVar2.f39881z.invalidate();
                                break;
                            case 1:
                                kt ktVar3 = this.f45246b.f38203a;
                                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ktVar3.f39864g = fFloatValue2;
                                float f12 = ktVar3.f39863f;
                                ktVar3.f39861e = com.google.android.recaptcha.internal.a.z(0.0f, f12, fFloatValue2, f12);
                                ktVar3.f39881z.invalidate();
                                break;
                            default:
                                kt ktVar4 = this.f45246b.f38203a;
                                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ktVar4.f39864g = fFloatValue3;
                                float f13 = ktVar4.f39863f;
                                ktVar4.f39861e = com.google.android.recaptcha.internal.a.z(0.0f, f13, fFloatValue3, f13);
                                ktVar4.f39881z.invalidate();
                                break;
                        }
                    }
                });
                valueAnimatorOfFloat.setDuration(350L);
                valueAnimatorOfFloat.setInterpolator(org.telegram.ui.Components.er.f28122f);
                valueAnimatorOfFloat.start();
            }
            ktVar.K = true;
            return;
        }
        if (ktVar.V == 3) {
            i10 = 1;
        } else {
            ht htVar2 = ktVar.f39868l;
            if (htVar2 != null) {
                TLRPC.TL_messageMediaPoll tL_messageMediaPollD = htVar2.d();
                TLRPC.PollAnswer pollAnswerG = ktVar.f39868l.g();
                if (tL_messageMediaPollD != null && tL_messageMediaPollD.poll != null && pollAnswerG != null) {
                    TLRPC.PollAnswerVoters pollResult = MessageObject.getPollResult(tL_messageMediaPollD, pollAnswerG.option);
                    if (pollResult != null && pollResult.voters > 0) {
                        MessageObject.canShowVotersList(tL_messageMediaPollD);
                    }
                    i10 = 1;
                }
            }
            i10 = 0;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i10, ktVar.f39881z.getContext(), ktVar.f39859c0);
        org.telegram.ui.ActionBar.c6 c6Var = null;
        lg.d dVarC = aVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, true);
        dVarC.n(ng.c.j(ktVar.f39859c0));
        dVarC.p(AndroidUtilities.dp(12.0f));
        dVarC.o(AndroidUtilities.dp(8.0f));
        dVarC.h.f15583e = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(dVarC);
        if (ktVar.V == 3) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            if (ktVar.T == null) {
                ht htVar3 = ktVar.f39868l;
                if (htVar3 == null || !htVar3.z()) {
                    if (ktVar.f39868l.w()) {
                        arrayList.add(LocaleController.getString(R.string.SendStickerPreview));
                        org.telegram.ui.Cells.pa.p(R.drawable.msg_send, arrayList3, arrayList2, 0);
                    }
                    arrayList.add(LocaleController.getString(R.string.AddToFavorites));
                    org.telegram.ui.Cells.pa.p(R.drawable.msg_fave, arrayList3, arrayList2, 1);
                } else {
                    arrayList.add(LocaleController.getString(R.string.SetIntroSticker));
                    org.telegram.ui.Cells.pa.p(R.drawable.menu_sticker_add, arrayList3, arrayList2, 0);
                }
            }
            ht htVar4 = ktVar.f39868l;
            if (htVar4 == null || !htVar4.z()) {
                ht htVar5 = ktVar.f39868l;
                arrayList.add(LocaleController.getString((htVar5 == null || !htVar5.I()) ? R.string.AddToStickerPack : R.string.StickersReplaceSticker));
                ht htVar6 = ktVar.f39868l;
                org.telegram.ui.Cells.pa.p((htVar6 == null || !htVar6.I()) ? R.drawable.menu_sticker_add : R.drawable.msg_replace, arrayList3, arrayList2, 2);
            }
            int i18 = 6;
            int i19 = 7;
            org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, ktVar.f39878w, ktVar.f39859c0, true, false);
            f1Var.setItemHeight(44);
            f1Var.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
            f1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
            FrameLayout frameLayout = new FrameLayout(ktVar.f39881z.getContext());
            LinearLayout linearLayout = new LinearLayout(ktVar.f39881z.getContext());
            linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G8, ktVar.f39859c0));
            linearLayout.setOrientation(1);
            if (ktVar.f39878w == null) {
                ta1Var = null;
                i12 = 5;
            } else {
                ArrayList arrayList4 = new ArrayList();
                arrayList4.add(new TLRPC.TL_stickerSetNoCovered());
                TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = new TLRPC.TL_messages_getMyStickers();
                tL_messages_getMyStickers.limit = 100;
                ConnectionsManager.getInstance(ktVar.f39874r).sendRequest(tL_messages_getMyStickers, new z9(ktVar, arrayList4, tL_messages_getMyStickers, i19));
                ta1Var = new ta1(ktVar.f39878w, i18, c6Var);
                ta1Var.setLayoutManager(new f2.k0());
                i12 = 5;
                ta1Var.i(new cg.h2(arrayList4, i12));
                ta1Var.setAdapter(new gt(ktVar, arrayList4));
            }
            ta1Var.setOnItemClickListener(new i(this, i12));
            frameLayout.addView(f1Var);
            linearLayout.addView(frameLayout);
            linearLayout.addView(new org.telegram.ui.ActionBar.k1(ktVar.f39881z.getContext(), ktVar.f39859c0), h7.z5.n(-1, 8));
            ta1 ta1Var2 = ta1Var;
            jh.b0 b0Var = new jh.b0(this, arrayList2, ta1Var2, linearLayout, actionBarPopupWindow$ActionBarPopupWindowLayout, 12);
            for (int i20 = 0; i20 < arrayList.size(); i20++) {
                org.telegram.ui.ActionBar.f1 f1VarC = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, ((Integer) arrayList3.get(i20)).intValue(), (CharSequence) arrayList.get(i20), false, ktVar.f39859c0);
                f1VarC.setTag(Integer.valueOf(i20));
                f1VarC.setOnClickListener(b0Var);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout;
            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
            linearLayout.addView(ta1Var2, new LinearLayout.LayoutParams(actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() - AndroidUtilities.dp(16.0f), (int) (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() * 1.5f)));
            actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout);
            frameLayout.setOnClickListener(new jf(actionBarPopupWindow$ActionBarPopupWindowLayout, 2));
            i0.c cVar2 = ktVar.f39873q;
            int i21 = cVar2.d;
            int i22 = cVar2.f10490b;
            int i23 = i21 + i22;
            int iMin2 = ((int) (Math.min(ktVar.f39881z.getWidth(), ktVar.f39881z.getHeight() - i23) / 1.8f)) / 2;
            ktVar.f39881z.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, h7.z5.d(-2, -2.0f, 49, 0.0f, (AndroidUtilities.dp(84.0f) + ((int) ((ktVar.f39861e + Math.max(i22 + iMin2, ((ktVar.f39881z.getHeight() - i23) - ktVar.I) / 2)) + iMin2))) / AndroidUtilities.density, 0.0f, 0.0f));
            ktVar.L = actionBarPopupWindow$ActionBarPopupWindowLayout;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(-AndroidUtilities.dp(12.0f));
            ktVar.L.setAlpha(0.0f);
            ktVar.L.setScaleX(0.8f);
            ktVar.L.setScaleY(0.8f);
            ktVar.L.setPivotY(0.0f);
            ktVar.L.setPivotX(ktVar.L.getMeasuredWidth() / 2.0f);
            ktVar.L.animate().translationY(0.0f).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.er.h).start();
            if (ktVar.P == null) {
                org.telegram.ui.Components.nb nbVar = new org.telegram.ui.Components.nb(ktVar, ktVar.f39881z.getContext(), UserConfig.selectedAccount, ktVar.f39859c0);
                ktVar.P = nbVar;
                nbVar.J0 = true;
                nbVar.setPadding(0, AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f));
                ktVar.P.setClipChildren(false);
                ktVar.P.setClipToPadding(false);
                ktVar.P.setVisibility(0);
                ktVar.P.setHint(LocaleController.getString(R.string.StickersSetEmojiForSticker));
                ktVar.P.setBubbleOffset(-AndroidUtilities.dp(105.0f));
                ktVar.P.setMiniBubblesOffset(-AndroidUtilities.dp(14.0f));
                FrameLayout frameLayout2 = new FrameLayout(ktVar.f39881z.getContext());
                ktVar.Q = frameLayout2;
                frameLayout2.addView(ktVar.P, h7.z5.d(-2, 116.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                ktVar.f39881z.addView(ktVar.Q, h7.z5.d(-2, -2.0f, 1, 0.0f, 100.0f, 0.0f, 0.0f));
            }
            ktVar.P.setSelectedEmojis(ktVar.f39871o);
            ktVar.P.setDelegate(new ws(ktVar));
            ktVar.P.p(null, null, false);
            ktVar.Q.setScaleY(0.6f);
            ktVar.Q.setScaleX(0.6f);
            ktVar.Q.setAlpha(0.0f);
            AndroidUtilities.runOnUIThread(new vs(ktVar, 2), 10L);
            ktVar.K = true;
            ktVar.f39881z.invalidate();
        } else {
            int i24 = 1;
            int i25 = 0;
            if (ktVar.V == 0) {
                if (MessageObject.isPremiumSticker(ktVar.W) && !AccountInstance.getInstance(ktVar.f39874r).getUserConfig().isPremium()) {
                    if (ktVar.O == null) {
                        ag1 ag1Var = new ag1(ktVar.f39881z.getContext(), ktVar.f39859c0);
                        ktVar.O = ag1Var;
                        ktVar.f39881z.addView(ag1Var, h7.z5.c(-1.0f, -1));
                        ktVar.O.setOnClickListener(new ys(ktVar, i25));
                        ktVar.O.f36533a.f647r.setOnClickListener(new ys(ktVar, i24));
                    }
                    AndroidUtilities.updateViewVisibilityAnimated(ktVar.O, false, 1.0f, false);
                    AndroidUtilities.updateViewVisibilityAnimated(ktVar.O, true);
                    ktVar.O.setTranslationY(0.0f);
                    ktVar.K = true;
                    ktVar.f39881z.invalidate();
                    try {
                        ktVar.f39881z.performHapticFeedback(0);
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                boolean zIsStickerInFavorites = MediaDataController.getInstance(ktVar.f39874r).isStickerInFavorites(ktVar.W);
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                if (ktVar.f39868l != null) {
                    if (ktVar.f39868l.k(ktVar.V) && !ktVar.f39868l.c()) {
                        arrayList5.add(LocaleController.getString(R.string.SendStickerPreview));
                        org.telegram.ui.Cells.pa.p(R.drawable.msg_send, arrayList7, arrayList6, 0);
                    }
                    if (ktVar.f39868l.k(ktVar.V) && !ktVar.f39868l.c()) {
                        arrayList5.add(LocaleController.getString(R.string.SendWithoutSound));
                        org.telegram.ui.Cells.pa.n(R.drawable.input_notify_off, 6, arrayList7, arrayList6);
                    }
                    if (ktVar.f39868l.b()) {
                        arrayList5.add(LocaleController.getString(R.string.Schedule));
                        org.telegram.ui.Cells.pa.p(R.drawable.msg_autodelete, arrayList7, arrayList6, 3);
                    }
                    if (ktVar.f39868l.f()) {
                        arrayList5.add(LocaleController.getString(R.string.ImportStickersRemoveMenu));
                        org.telegram.ui.Cells.pa.p(R.drawable.msg_delete, arrayList7, arrayList6, 5);
                    }
                }
                if (!MessageObject.isMaskDocument(ktVar.W) && (zIsStickerInFavorites || (MediaDataController.getInstance(ktVar.f39874r).canAddStickerToFavorites() && MessageObject.isStickerHasSet(ktVar.W)))) {
                    arrayList5.add(LocaleController.getString(zIsStickerInFavorites ? R.string.DeleteFromFavorites : R.string.AddToFavorites));
                    org.telegram.ui.Cells.pa.p(zIsStickerInFavorites ? R.drawable.msg_unfave : R.drawable.msg_fave, arrayList7, arrayList6, 2);
                }
                if (ktVar.f39868l != null && (inputStickerSet = ktVar.f39855a0) != null && !(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty) && ktVar.f39868l.Q()) {
                    arrayList5.add(LocaleController.formatString(R.string.ViewPackPreview, new Object[0]));
                    org.telegram.ui.Cells.pa.p(R.drawable.msg_media, arrayList7, arrayList6, 1);
                }
                if (ktVar.f39872p) {
                    arrayList5.add(LocaleController.getString(R.string.DeleteFromRecent));
                    org.telegram.ui.Cells.pa.p(R.drawable.msg_delete, arrayList7, arrayList6, 4);
                }
                if (ktVar.f39855a0 != null && ktVar.W != null) {
                    TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(ktVar.f39874r).getStickerSet(ktVar.f39855a0, true);
                    if (stickerSet != null && ktVar.f39868l != null && ktVar.f39868l.B()) {
                        TLRPC.StickerSet stickerSet2 = stickerSet.set;
                        if (!stickerSet2.emojis && !stickerSet2.masks) {
                            arrayList5.add(LocaleController.getString(R.string.EditSticker));
                            org.telegram.ui.Cells.pa.n(R.drawable.msg_edit, 7, arrayList7, arrayList6);
                        }
                    }
                    if (stickerSet != null && stickerSet.set.creator && ktVar.f39868l != null) {
                        ht htVar7 = ktVar.f39868l;
                        TLRPC.Document unused3 = ktVar.W;
                        if (htVar7.H()) {
                            arrayList5.add(LocaleController.getString(R.string.DeleteSticker));
                            org.telegram.ui.Cells.pa.n(R.drawable.msg_delete, 8, arrayList7, arrayList6);
                        }
                    }
                }
                if (arrayList5.isEmpty()) {
                    return;
                }
                ktVar.K = true;
                ktVar.f39881z.invalidate();
                bt btVar = new bt(this, arrayList6, zIsStickerInFavorites);
                kt.h(ktVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                for (int i26 = 0; i26 < arrayList5.size(); i26++) {
                    org.telegram.ui.ActionBar.f1 f1VarC2 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, ((Integer) arrayList7.get(i26)).intValue(), (CharSequence) arrayList5.get(i26), false, ktVar.f39859c0);
                    f1VarC2.setTag(Integer.valueOf(i26));
                    f1VarC2.setOnClickListener(btVar);
                    if (((Integer) arrayList6.get(i26)).intValue() == 8) {
                        int iD = kt.d(ktVar, org.telegram.ui.ActionBar.g6.f23284q7);
                        f1VarC2.c(iD, iD);
                        f1VarC2.setSelectorColor(org.telegram.ui.ActionBar.g6.l1(0.1f, iD));
                    }
                }
                ct ctVar = new ct(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                ktVar.f39867k = ctVar;
                ctVar.f23684e = true;
                ctVar.f23683c = 100;
                ctVar.f23686g = true;
                ctVar.setOutsideTouchable(true);
                ktVar.f39867k.setClippingEnabled(true);
                ktVar.f39867k.setAnimationStyle(R.style.PopupContextAnimation);
                ktVar.f39867k.setFocusable(true);
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                ktVar.f39867k.setInputMethodMode(2);
                ktVar.f39867k.getContentView().setFocusableInTouchMode(true);
                int i27 = ktVar.f39873q.d + ktVar.f39873q.f10490b;
                int i28 = ktVar.f39873q.f10490b;
                int iMin3 = (ktVar.V == 1 ? Math.min(ktVar.f39881z.getWidth(), ktVar.f39881z.getHeight() - i27) - AndroidUtilities.dp(40.0f) : (int) (ktVar.S ? Math.min(ktVar.f39881z.getWidth(), ktVar.f39881z.getHeight() - i27) - AndroidUtilities.dpf2(40.0f) : Math.min(ktVar.f39881z.getWidth(), ktVar.f39881z.getHeight() - i27) / 1.8f)) / 2;
                int iDp2 = AndroidUtilities.dp(24.0f) + ((int) (ktVar.f39861e + Math.max(i28 + iMin3 + (ktVar.G != null ? AndroidUtilities.dp(40.0f) : 0), ((ktVar.f39881z.getHeight() - i27) - ktVar.I) / 2) + iMin3));
                if (ktVar.S) {
                    iDp2 += AndroidUtilities.dp(24.0f);
                }
                ktVar.f39867k.showAtLocation(ktVar.f39881z, 0, (int) ((ktVar.f39881z.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), iDp2);
                try {
                    ktVar.f39881z.performHapticFeedback(0);
                } catch (Exception unused4) {
                }
            } else {
                if (ktVar.V != 2 || ktVar.f39868l == null) {
                    if (ktVar.f39868l != null) {
                        ArrayList arrayList8 = new ArrayList();
                        ArrayList arrayList9 = new ArrayList();
                        ArrayList arrayList10 = new ArrayList();
                        if (ktVar.f39868l.k(ktVar.V) && !ktVar.f39868l.c()) {
                            arrayList8.add(LocaleController.getString(R.string.SendGifPreview));
                            org.telegram.ui.Cells.pa.p(R.drawable.msg_send, arrayList10, arrayList9, 0);
                        }
                        if (ktVar.f39868l.k(ktVar.V) && !ktVar.f39868l.c()) {
                            arrayList8.add(LocaleController.getString(R.string.SendWithoutSound));
                            org.telegram.ui.Cells.pa.p(R.drawable.input_notify_off, arrayList10, arrayList9, 4);
                        }
                        if (ktVar.f39868l.b()) {
                            arrayList8.add(LocaleController.getString(R.string.Schedule));
                            org.telegram.ui.Cells.pa.p(R.drawable.msg_autodelete, arrayList10, arrayList9, 3);
                        }
                        if (ktVar.W != null && ktVar.f39868l.e(ktVar.W)) {
                            arrayList8.add(LocaleController.getString(R.string.AddACaption));
                            org.telegram.ui.Cells.pa.n(R.drawable.outline_caption_24, 11, arrayList10, arrayList9);
                        }
                        if (ktVar.W != null) {
                            zHasRecentGif = MediaDataController.getInstance(ktVar.f39874r).hasRecentGif(ktVar.W);
                            if (zHasRecentGif) {
                                arrayList8.add(LocaleController.formatString("Delete", R.string.Delete, new Object[0]));
                                org.telegram.ui.Cells.pa.p(R.drawable.msg_delete, arrayList10, arrayList9, 1);
                            } else {
                                arrayList8.add(LocaleController.formatString("SaveToGIFs", R.string.SaveToGIFs, new Object[0]));
                                org.telegram.ui.Cells.pa.p(R.drawable.msg_gif_add, arrayList10, arrayList9, 2);
                            }
                        } else {
                            zHasRecentGif = false;
                        }
                        if (arrayList8.isEmpty()) {
                            return;
                        }
                        ktVar.K = true;
                        ktVar.f39881z.invalidate();
                        int[] iArr = new int[arrayList10.size()];
                        for (int i29 = 0; i29 < arrayList10.size(); i29++) {
                            iArr[i29] = ((Integer) arrayList10.get(i29)).intValue();
                        }
                        org.telegram.ui.Components.xh0 xh0Var = new org.telegram.ui.Components.xh0(16, this, arrayList9);
                        for (int i30 = 0; i30 < arrayList8.size(); i30++) {
                            org.telegram.ui.ActionBar.f1 f1VarC3 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, ((Integer) arrayList10.get(i30)).intValue(), (CharSequence) arrayList8.get(i30), false, ktVar.f39859c0);
                            f1VarC3.setTag(Integer.valueOf(i30));
                            f1VarC3.setOnClickListener(xh0Var);
                            if (zHasRecentGif && i30 == arrayList8.size() - 1) {
                                f1VarC3.c(kt.d(ktVar, org.telegram.ui.ActionBar.g6.f23284q7), kt.d(ktVar, org.telegram.ui.ActionBar.g6.f23269p7));
                            }
                        }
                        et etVar = new et(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                        ktVar.f39867k = etVar;
                        etVar.f23684e = true;
                        etVar.f23683c = 150;
                        etVar.f23686g = true;
                        etVar.setOutsideTouchable(true);
                        ktVar.f39867k.setClippingEnabled(true);
                        ktVar.f39867k.setAnimationStyle(R.style.PopupContextAnimation);
                        ktVar.f39867k.setFocusable(true);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                        ktVar.f39867k.setInputMethodMode(2);
                        ktVar.f39867k.getContentView().setFocusableInTouchMode(true);
                        int i31 = ktVar.f39873q.d + ktVar.f39873q.f10490b;
                        int i32 = ktVar.f39873q.f10490b;
                        int iMin4 = (Math.min(ktVar.f39881z.getWidth(), ktVar.f39881z.getHeight() - i31) - AndroidUtilities.dp(40.0f)) / 2;
                        ktVar.f39867k.showAtLocation(ktVar.f39881z, 0, (int) ((ktVar.f39881z.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), (int) ((AndroidUtilities.dp(24.0f) - ktVar.f39861e) + ((int) (ktVar.f39861e + Math.max(i32 + iMin4 + (ktVar.G != null ? AndroidUtilities.dp(40.0f) : 0), ((ktVar.f39881z.getHeight() - i31) - ktVar.I) / 2) + iMin4))));
                        try {
                            ktVar.f39881z.performHapticFeedback(0);
                        } catch (Exception unused5) {
                        }
                        if (ktVar.f39861e != 0.0f) {
                            ktVar.f39863f = ktVar.f39861e;
                            final int i33 = 2;
                            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

                                public final ft f45246b;

                                {
                                    this.f45246b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (i33) {
                                        case 0:
                                            kt ktVar2 = this.f45246b.f38203a;
                                            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            ktVar2.f39864g = fFloatValue;
                                            float f11 = ktVar2.f39863f;
                                            ktVar2.f39861e = com.google.android.recaptcha.internal.a.z(0.0f, f11, fFloatValue, f11);
                                            ktVar2.f39881z.invalidate();
                                            break;
                                        case 1:
                                            kt ktVar3 = this.f45246b.f38203a;
                                            float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            ktVar3.f39864g = fFloatValue2;
                                            float f12 = ktVar3.f39863f;
                                            ktVar3.f39861e = com.google.android.recaptcha.internal.a.z(0.0f, f12, fFloatValue2, f12);
                                            ktVar3.f39881z.invalidate();
                                            break;
                                        default:
                                            kt ktVar4 = this.f45246b.f38203a;
                                            float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            ktVar4.f39864g = fFloatValue3;
                                            float f13 = ktVar4.f39863f;
                                            ktVar4.f39861e = com.google.android.recaptcha.internal.a.z(0.0f, f13, fFloatValue3, f13);
                                            ktVar4.f39881z.invalidate();
                                            break;
                                    }
                                }
                            });
                            valueAnimatorOfFloat2.setDuration(350L);
                            valueAnimatorOfFloat2.setInterpolator(org.telegram.ui.Components.er.f28122f);
                            valueAnimatorOfFloat2.start();
                        }
                    }
                    for (i11 = 0; i11 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i11++) {
                        childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.ActionBar.f1) {
                            org.telegram.ui.ActionBar.f1 f1Var2 = (org.telegram.ui.ActionBar.f1) childAt;
                            if (i11 == 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (i11 == actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            f1Var2.k(z10, z11);
                        }
                    }
                }
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = new ArrayList();
                ArrayList arrayList13 = new ArrayList();
                if (ktVar.f39868l.k(ktVar.V)) {
                    arrayList11.add(LocaleController.getString(R.string.SendEmojiPreview));
                    org.telegram.ui.Cells.pa.p(R.drawable.msg_send, arrayList13, arrayList12, 0);
                }
                Boolean boolP = ktVar.f39868l.P(ktVar.W);
                if (boolP != null) {
                    if (boolP.booleanValue()) {
                        arrayList11.add(LocaleController.getString(R.string.SetAsEmojiStatus));
                        org.telegram.ui.Cells.pa.p(R.drawable.msg_smile_status, arrayList13, arrayList12, 1);
                    } else {
                        arrayList11.add(LocaleController.getString(R.string.RemoveStatus));
                        org.telegram.ui.Cells.pa.p(R.drawable.msg_smile_status, arrayList13, arrayList12, 2);
                    }
                }
                if (ktVar.f39868l.C(ktVar.W)) {
                    arrayList11.add(LocaleController.getString(R.string.CopyEmojiPreview));
                    org.telegram.ui.Cells.pa.p(R.drawable.msg_copy, arrayList13, arrayList12, 3);
                }
                if (ktVar.f39868l.N(ktVar.W)) {
                    arrayList11.add(LocaleController.getString(R.string.RemoveFromRecent));
                    org.telegram.ui.Cells.pa.p(R.drawable.msg_delete, arrayList13, arrayList12, 4);
                }
                boolean zIsStickerInFavorites2 = MediaDataController.getInstance(ktVar.f39874r).isStickerInFavorites(ktVar.W);
                if (!MessageObject.isAnimatedEmoji(ktVar.W) && !MessageObject.isMaskDocument(ktVar.W) && (zIsStickerInFavorites2 || (MediaDataController.getInstance(ktVar.f39874r).canAddStickerToFavorites() && MessageObject.isStickerHasSet(ktVar.W)))) {
                    arrayList11.add(LocaleController.getString(zIsStickerInFavorites2 ? R.string.DeleteFromFavorites : R.string.AddToFavorites));
                    org.telegram.ui.Cells.pa.p(zIsStickerInFavorites2 ? R.drawable.msg_unfave : R.drawable.msg_fave, arrayList13, arrayList12, 5);
                }
                if (arrayList11.isEmpty()) {
                    return;
                }
                ktVar.K = true;
                ktVar.f39881z.invalidate();
                int[] iArr2 = new int[arrayList13.size()];
                for (int i34 = 0; i34 < arrayList13.size(); i34++) {
                    iArr2[i34] = ((Integer) arrayList13.get(i34)).intValue();
                }
                org.telegram.ui.Components.ib0 ib0Var = new org.telegram.ui.Components.ib0(this, arrayList12, zIsStickerInFavorites2);
                boolean zH = kt.h(ktVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                int i35 = 0;
                while (i35 < arrayList11.size()) {
                    org.telegram.ui.ActionBar.f1 f1VarC4 = org.telegram.ui.ActionBar.v0.c(!zH && i35 == 0, i35 == arrayList11.size() + (-1), actionBarPopupWindow$ActionBarPopupWindowLayout, ((Integer) arrayList13.get(i35)).intValue(), (CharSequence) arrayList11.get(i35), false, ktVar.f39859c0);
                    if (((Integer) arrayList12.get(i35)).intValue() == 4) {
                        f1VarC4.setIconColor(kt.d(ktVar, org.telegram.ui.ActionBar.g6.f23269p7));
                        f1VarC4.setTextColor(kt.d(ktVar, org.telegram.ui.ActionBar.g6.f23284q7));
                    }
                    f1VarC4.setTag(Integer.valueOf(i35));
                    f1VarC4.setOnClickListener(ib0Var);
                    i35++;
                }
                dt dtVar = new dt(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                ktVar.f39867k = dtVar;
                dtVar.f23684e = true;
                dtVar.f23683c = 150;
                dtVar.f23686g = true;
                dtVar.setOutsideTouchable(true);
                ktVar.f39867k.setClippingEnabled(true);
                ktVar.f39867k.setAnimationStyle(R.style.PopupContextAnimation);
                ktVar.f39867k.setFocusable(true);
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                ktVar.f39867k.setInputMethodMode(2);
                ktVar.f39867k.getContentView().setFocusableInTouchMode(true);
                int i36 = ktVar.f39873q.d + ktVar.f39873q.f10490b;
                int i37 = ktVar.f39873q.f10490b;
                int iMin5 = (Math.min(ktVar.f39881z.getWidth(), ktVar.f39881z.getHeight() - i36) - AndroidUtilities.dp(40.0f)) / 2;
                ktVar.f39867k.showAtLocation(ktVar.f39881z, 0, (int) ((ktVar.f39881z.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), (int) ((AndroidUtilities.dp(24.0f) - ktVar.f39861e) + ((int) (ktVar.f39861e + Math.max(i37 + iMin5 + (ktVar.G != null ? AndroidUtilities.dp(40.0f) : 0), ((ktVar.f39881z.getHeight() - i36) - ktVar.I) / 2) + iMin5))));
                org.telegram.ui.ActionBar.n1.i(actionBarPopupWindow$ActionBarPopupWindowLayout);
                try {
                    ktVar.f39881z.performHapticFeedback(0);
                } catch (Exception unused6) {
                }
                if (ktVar.f39861e != 0.0f) {
                    ktVar.f39863f = ktVar.f39861e;
                    ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    final int i38 = 1;
                    valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

                        public final ft f45246b;

                        {
                            this.f45246b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i38) {
                                case 0:
                                    kt ktVar2 = this.f45246b.f38203a;
                                    float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    ktVar2.f39864g = fFloatValue;
                                    float f11 = ktVar2.f39863f;
                                    ktVar2.f39861e = com.google.android.recaptcha.internal.a.z(0.0f, f11, fFloatValue, f11);
                                    ktVar2.f39881z.invalidate();
                                    break;
                                case 1:
                                    kt ktVar3 = this.f45246b.f38203a;
                                    float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    ktVar3.f39864g = fFloatValue2;
                                    float f12 = ktVar3.f39863f;
                                    ktVar3.f39861e = com.google.android.recaptcha.internal.a.z(0.0f, f12, fFloatValue2, f12);
                                    ktVar3.f39881z.invalidate();
                                    break;
                                default:
                                    kt ktVar4 = this.f45246b.f38203a;
                                    float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    ktVar4.f39864g = fFloatValue3;
                                    float f13 = ktVar4.f39863f;
                                    ktVar4.f39861e = com.google.android.recaptcha.internal.a.z(0.0f, f13, fFloatValue3, f13);
                                    ktVar4.f39881z.invalidate();
                                    break;
                            }
                        }
                    });
                    valueAnimatorOfFloat3.setDuration(350L);
                    valueAnimatorOfFloat3.setInterpolator(org.telegram.ui.Components.er.f28122f);
                    valueAnimatorOfFloat3.start();
                }
            }
        }
        while (i11 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
            childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.ActionBar.f1) {
                org.telegram.ui.ActionBar.f1 f1Var3 = (org.telegram.ui.ActionBar.f1) childAt;
                if (i11 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i11 == actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                f1Var3.k(z10, z11);
            }
        }
    }
}
