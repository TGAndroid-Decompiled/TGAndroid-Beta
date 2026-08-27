package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.transition.TransitionManager;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FileRefController;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public class ex0 extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate {

    public static final int f28169q0 = 0;
    public View A;
    public n9 B;
    public TextView C;
    public j D;
    public final AnimatorSet[] E;
    public final View[] F;
    public ag.p1 G;
    public final org.telegram.ui.ActionBar.n2 H;
    public kh.l I;
    public final Activity J;
    public int K;
    public int L;
    public boolean M;
    public boolean N;
    public TLRPC.TL_messages_stickerSet O;
    public TLRPC.Document P;
    public SendMessagesHelper.ImportingSticker Q;
    public TLRPC.InputStickerSet R;
    public ArrayList S;
    public final ArrayList T;
    public ArrayList U;
    public HashMap V;
    public final String W;
    public final bx0 X;
    public cx0 Y;
    public org.telegram.ui.x60 Z;

    public int f28170a0;

    public Pattern f28171b;

    public int f28172b0;

    public hh.f1 f28173c;

    public boolean f28174c0;
    public ax0 d;

    public boolean f28175d0;

    public f2.f0 f28176e;

    public boolean f28177e0;

    public TLRPC.Document f28178f;

    public boolean f28179f0;

    public int f28180g0;
    public p80 h;

    public final com.google.firebase.messaging.m f28181h0;

    public final tw0 f28182i0;

    public gs0 f28183j0;

    public String f28184k0;

    public int f28185l0;
    public boolean m0;

    public org.telegram.ui.ActionBar.v0 f28186n;

    public String f28187n0;

    public Runnable f28188o0;

    public ArrayList f28189p0;

    public org.telegram.ui.ActionBar.f1 f28190r;

    public j6 f28191s;
    public ag.s1 v;

    public FrameLayout f28192w;

    public FrameLayout f28193x;

    public TextView f28194y;

    public ex0(Context context, Object obj, TLObject tLObject, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, false, false);
        this.E = new AnimatorSet[2];
        this.F = new View[2];
        this.f28179f0 = true;
        this.f28181h0 = new com.google.firebase.messaging.m(8);
        this.f28182i0 = new tw0(this);
        this.resourcesProvider = c6Var;
        fixNavigationBar();
        this.J = (Activity) context;
        TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = new TLRPC.TL_messages_getAttachedStickers();
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.Photo photo = (TLRPC.Photo) tLObject;
            TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = new TLRPC.TL_inputStickeredMediaPhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_inputStickeredMediaPhoto.f22450id = tL_inputPhoto;
            tL_inputPhoto.f22399id = photo.f22404id;
            tL_inputPhoto.access_hash = photo.access_hash;
            byte[] bArr = photo.file_reference;
            tL_inputPhoto.file_reference = bArr;
            if (bArr == null) {
                tL_inputPhoto.file_reference = new byte[0];
            }
            tL_messages_getAttachedStickers.media = tL_inputStickeredMediaPhoto;
        } else if (tLObject instanceof TLRPC.Document) {
            TLRPC.Document document = (TLRPC.Document) tLObject;
            TLRPC.TL_inputStickeredMediaDocument tL_inputStickeredMediaDocument = new TLRPC.TL_inputStickeredMediaDocument();
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_inputStickeredMediaDocument.f22449id = tL_inputDocument;
            tL_inputDocument.f22392id = document.f22386id;
            tL_inputDocument.access_hash = document.access_hash;
            byte[] bArr2 = document.file_reference;
            tL_inputDocument.file_reference = bArr2;
            if (bArr2 == null) {
                tL_inputDocument.file_reference = new byte[0];
            }
            tL_messages_getAttachedStickers.media = tL_inputStickeredMediaDocument;
        }
        org.telegram.ui.pr0 pr0Var = (org.telegram.ui.pr0) this;
        this.f28172b0 = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getAttachedStickers, new gh.f1(pr0Var, obj, tL_messages_getAttachedStickers, new org.telegram.ui.gg(19, pr0Var, tL_messages_getAttachedStickers), 11));
        r0(context);
    }

    public static void B(ex0 ex0Var) {
        ex0Var.dismiss();
        MediaDataController.getInstance(ex0Var.currentAccount).toggleStickerSet(ex0Var.getContext(), ex0Var.O, 1, ex0Var.H, true, ex0Var.f28179f0);
    }

    public static void C(ex0 ex0Var) {
        ex0Var.dismiss();
        cx0 cx0Var = ex0Var.Y;
        if (cx0Var != null) {
            cx0Var.a();
        }
        if (ex0Var.R == null || MediaDataController.getInstance(ex0Var.currentAccount).cancelRemovingStickerSet(ex0Var.R.f22400id)) {
            return;
        }
        TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
        tL_messages_installStickerSet.stickerset = ex0Var.R;
        ConnectionsManager.getInstance(ex0Var.currentAccount).sendRequest(tL_messages_installStickerSet, new w1(ex0Var, 13));
    }

    public static void D(ex0 ex0Var, int i10) {
        String str;
        org.telegram.ui.ActionBar.n2 n2Var = ex0Var.H;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = ex0Var.O;
        if (tL_messages_stickerSet == null) {
            return;
        }
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        if (stickerSet == null || !stickerSet.emojis) {
            str = "https://" + MessagesController.getInstance(ex0Var.currentAccount).linkPrefix + "/addstickers/" + ex0Var.O.set.short_name;
        } else {
            str = "https://" + MessagesController.getInstance(ex0Var.currentAccount).linkPrefix + "/addemoji/" + ex0Var.O.set.short_name;
        }
        String str2 = str;
        if (i10 == 1) {
            Context context = ex0Var.J;
            if (context == null && n2Var != null) {
                context = n2Var.getParentActivity();
            }
            if (context == null) {
                context = ex0Var.getContext();
            }
            rw0 rw0Var = new rw0(ex0Var, context, str2, str2, ex0Var.resourcesProvider);
            if (n2Var == null) {
                rw0Var.show();
                return;
            }
            n2Var.showDialog(rw0Var);
            if (n2Var instanceof org.telegram.ui.rn) {
                rw0Var.setCalcMandatoryInsets(((org.telegram.ui.rn) n2Var).x9());
                return;
            }
            return;
        }
        if (i10 == 2) {
            try {
                AndroidUtilities.addToClipboard(str2);
                new mc((FrameLayout) ex0Var.containerView, ex0Var.resourcesProvider).k(false).j();
                return;
            } catch (Exception e9) {
                FileLog.e(e9);
                return;
            }
        }
        if (i10 == 3) {
            if (ex0Var.N) {
                ex0Var.n0();
                return;
            } else {
                ex0Var.p0();
                return;
            }
        }
        if (i10 == 4) {
            kx0.c(ex0Var.O.set, ex0Var.resourcesProvider, ex0Var.getContext(), new d(ex0Var, 20));
        } else if (i10 == 5) {
            kx0.b(ex0Var.O.set, ex0Var.resourcesProvider, ex0Var.getContext(), new qw0(ex0Var, 2));
        }
    }

    public static void E(ex0 ex0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        int i10;
        org.telegram.ui.ActionBar.n2 n2Var = ex0Var.H;
        TLRPC.StickerSet stickerSet = ex0Var.O.set;
        if (stickerSet.masks) {
            i10 = 1;
        } else {
            i10 = stickerSet.emojis ? 5 : 0;
        }
        try {
            if (tL_error == null) {
                if (ex0Var.f28179f0) {
                    ec.g(n2Var, new kw0(ex0Var.f28192w.getContext(), ex0Var.O, 1, 2, null, ex0Var.resourcesProvider), 1500).j();
                }
                if (tLObject instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                    MediaDataController.getInstance(ex0Var.currentAccount).processStickerSetInstallResultArchive(n2Var, true, i10, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject);
                }
            } else {
                Toast.makeText(ex0Var.getContext(), LocaleController.getString(R.string.ErrorOccurred), 0).show();
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        MediaDataController.getInstance(ex0Var.currentAccount).loadStickers(i10, false, true);
    }

    public static void F(ex0 ex0Var, TLRPC.TL_error tL_error, TLObject tLObject, MediaDataController mediaDataController) {
        TLRPC.StickerSet stickerSet;
        boolean z10 = false;
        ex0Var.f28172b0 = 0;
        if (tL_error != null) {
            ex0Var.dismiss();
            org.telegram.ui.ActionBar.n2 n2Var = ex0Var.H;
            if (n2Var != null) {
                org.telegram.messenger.y1.r(R.string.AddStickersNotFound, mc.a0(n2Var), null);
                return;
            }
            return;
        }
        sl0 sl0Var = new sl0(ex0Var, 1);
        sl0Var.addTarget(ex0Var.containerView);
        TransitionManager.beginDelayedTransition(ex0Var.container, sl0Var);
        ex0Var.f28186n.setVisibility(0);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
        ex0Var.O = tL_messages_stickerSet;
        mediaDataController.putStickerSet(tL_messages_stickerSet, false);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = ex0Var.O;
        if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.documents.isEmpty()) {
            ex0Var.dismiss();
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = ex0Var.O;
        if (tL_messages_stickerSet3 != null && (stickerSet = tL_messages_stickerSet3.set) != null && !stickerSet.masks) {
            z10 = true;
        }
        ex0Var.f28175d0 = z10;
        ex0Var.l0();
        mediaDataController.preloadStickerSetThumb(ex0Var.O);
        ex0Var.C0();
        ex0Var.B0();
        ex0Var.A0();
        ex0Var.d.l();
    }

    public static void G(ex0 ex0Var, String str, TextView textView) {
        TLRPC.TL_stickers_checkShortName tL_stickers_checkShortName = new TLRPC.TL_stickers_checkShortName();
        tL_stickers_checkShortName.short_name = str;
        ex0Var.f28185l0 = ConnectionsManager.getInstance(ex0Var.currentAccount).sendRequest(tL_stickers_checkShortName, new cg.y(ex0Var, str, textView, 20), 2);
    }

    public static void H(ex0 ex0Var) {
        TLRPC.StickerSet stickerSet;
        MediaDataController mediaDataController = MediaDataController.getInstance(ex0Var.currentAccount);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = ex0Var.O;
        boolean z10 = tL_messages_stickerSet == null || !mediaDataController.isStickerPackInstalled(tL_messages_stickerSet.set.f22407id);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = ex0Var.O;
        if (tL_messages_stickerSet2 != null && (stickerSet = tL_messages_stickerSet2.set) != null && stickerSet.creator && ex0Var.f28190r == null) {
            ex0Var.f28186n.e(3, R.drawable.tabs_reorder, LocaleController.getString(R.string.StickersReorder));
            ex0Var.f28186n.e(4, R.drawable.msg_edit, LocaleController.getString(R.string.EditName));
            if (z10) {
                ex0Var.f28190r = ex0Var.f28186n.e(5, R.drawable.msg_delete, LocaleController.getString(R.string.Delete));
            } else {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, ex0Var.getContext(), ex0Var.resourcesProvider);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
                org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, ex0Var.resourcesProvider).setOnClickListener(new ow0(ex0Var, 4));
                org.telegram.ui.ActionBar.f1 f1VarC = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.StickersDeleteForEveryone), false, ex0Var.resourcesProvider);
                int themedColor = ex0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23284q7);
                f1VarC.c(themedColor, themedColor);
                f1VarC.setSelectorColor(org.telegram.ui.ActionBar.g6.l1(0.1f, themedColor));
                org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.StickersRemoveForMe), false, ex0Var.resourcesProvider).setOnClickListener(new ow0(ex0Var, 6));
                f1VarC.setOnClickListener(new ow0(ex0Var, 7));
                ex0Var.f28190r = ex0Var.f28186n.i(R.drawable.msg_delete, null, LocaleController.getString(R.string.Delete), actionBarPopupWindow$ActionBarPopupWindowLayout);
            }
            ex0Var.f28186n.a(-1);
            ga0 ga0Var = new ga0(ex0Var.currentAccount, ex0Var.getContext(), ex0Var.resourcesProvider, new ArrayList(), 4);
            ga0Var.setOnClickListener(new ow0(ex0Var, 8));
            ga0Var.setTag(R.id.fit_width_tag, 1);
            org.telegram.ui.ActionBar.v0 v0Var = ex0Var.f28186n;
            v0Var.o();
            v0Var.f23854b.a(ga0Var, new LinearLayout.LayoutParams(-1, -2));
            int themedColor2 = ex0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23284q7);
            ex0Var.f28190r.c(themedColor2, themedColor2);
            ex0Var.f28190r.setSelectorColor(org.telegram.ui.ActionBar.g6.l1(0.1f, themedColor2));
            if (ex0Var.f28190r.getRightIcon() != null) {
                ex0Var.f28190r.getRightIcon().setColorFilter(themedColor2);
            }
        }
        if (ex0Var.f28186n.getPopupLayout() != null) {
            ex0Var.f28186n.getPopupLayout().requestLayout();
        }
        ex0Var.f28186n.M(null, null);
    }

    public static void O(ex0 ex0Var) {
        if (ex0Var.f28173c.getChildCount() <= 0) {
            ex0Var.y0(ex0Var.f28173c.getPaddingTop());
            return;
        }
        int i10 = 0;
        View view = null;
        int i11 = -1;
        for (int i12 = 0; i12 < ex0Var.f28173c.getChildCount(); i12++) {
            View childAt = ex0Var.f28173c.getChildAt(i12);
            ex0Var.f28173c.getClass();
            int iR = RecyclerView.R(childAt);
            if (i11 == -1 || i11 > iR) {
                view = childAt;
                i11 = iR;
            }
        }
        if (view == null || view.getTop() < 0) {
            ex0Var.v0(0, true);
        } else {
            int top = view.getTop();
            ex0Var.v0(0, false);
            i10 = top;
        }
        ex0Var.v0(1, true);
        if (ex0Var.f28170a0 != i10) {
            ex0Var.y0(i10);
        }
    }

    public static void m(ex0 ex0Var, View view, int i10) {
        TLRPC.StickerSet stickerSet;
        if (view instanceof yw0) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = ex0Var.O;
            org.telegram.ui.ActionBar.n2 n2Var = ex0Var.H;
            org.telegram.ui.ActionBar.c6 c6Var = ex0Var.resourcesProvider;
            if (n2Var == null) {
                return;
            }
            Context context = n2Var.getContext();
            if (!(n2Var instanceof org.telegram.ui.rn)) {
                kx0.a(tL_messages_stickerSet, n2Var, c6Var);
                return;
            }
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert3, 0, context, c6Var);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.StickersCreateNewSticker));
            org.telegram.ui.Cells.pa.n(R.drawable.menu_sticker_add, 0, arrayList3, arrayList2);
            arrayList.add(LocaleController.getString(R.string.StickersAddAnExistingSticker));
            arrayList3.add(Integer.valueOf(R.drawable.menu_sticker_select));
            arrayList2.add(1);
            org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
            jh.b0 b0Var = new jh.b0(n1Var, arrayList2, tL_messages_stickerSet, n2Var, c6Var, 10);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                org.telegram.ui.ActionBar.f1 f1VarC = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, ((Integer) arrayList3.get(i11)).intValue(), (CharSequence) arrayList.get(i11), false, c6Var);
                f1VarC.setTag(Integer.valueOf(i11));
                f1VarC.setOnClickListener(b0Var);
            }
            n1Var.f23683c = 100;
            n1Var.f23686g = true;
            n1Var.setOutsideTouchable(true);
            n1Var.setClippingEnabled(true);
            n1Var.setAnimationStyle(R.style.PopupContextAnimation);
            n1Var.setFocusable(true);
            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
            n1Var.setInputMethodMode(2);
            n1Var.getContentView().setFocusableInTouchMode(true);
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            n1Var.showAtLocation(view, 0, ((view.getMeasuredWidth() / 2) + iArr[0]) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() / 2), ((view.getMeasuredHeight() / 2) + iArr[1]) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() / 2));
            n1Var.b();
            return;
        }
        if (ex0Var.N) {
            return;
        }
        if (ex0Var.S != null) {
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) ex0Var.d.f26836f.get(i10);
            if (stickerSetCovered != null) {
                ex0Var.dismiss();
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
                tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                tL_inputStickerSetID.f22400id = stickerSet2.f22407id;
                new ex0(ex0Var.J, ex0Var.H, tL_inputStickerSetID, null, null, ex0Var.resourcesProvider).show();
                return;
            }
            return;
        }
        ArrayList arrayList4 = ex0Var.U;
        if (arrayList4 != null) {
            if (i10 < 0 || i10 >= arrayList4.size()) {
                return;
            }
            SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) ex0Var.U.get(i10);
            ex0Var.Q = importingSticker;
            if (importingSticker.validated) {
                TextView textView = ex0Var.C;
                textView.setText(Emoji.replaceEmoji(importingSticker.emoji, textView.getPaint().getFontMetricsInt(), false));
                ex0Var.B.m(ImageLocation.getForPath(ex0Var.Q.path), null, null, null, null, ex0Var.Q.animated ? "tgs" : null, 0, null);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ex0Var.f28193x.getLayoutParams();
                layoutParams.topMargin = ex0Var.f28170a0;
                ex0Var.f28193x.setLayoutParams(layoutParams);
                ex0Var.f28193x.setVisibility(0);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(ex0Var.f28193x, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
                animatorSet.setDuration(200L);
                animatorSet.start();
                return;
            }
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = ex0Var.O;
        if (tL_messages_stickerSet2 == null || i10 < 0 || i10 >= tL_messages_stickerSet2.documents.size()) {
            return;
        }
        ex0Var.P = ex0Var.O.documents.get(i10);
        int i12 = 0;
        while (true) {
            if (i12 < ex0Var.P.attributes.size()) {
                TLRPC.DocumentAttribute documentAttribute = ex0Var.P.attributes.get(i12);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                    String str = documentAttribute.alt;
                    if (str != null && str.length() > 0) {
                        TextView textView2 = ex0Var.C;
                        textView2.setText(Emoji.replaceEmoji(documentAttribute.alt, textView2.getPaint().getFontMetricsInt(), false));
                        break;
                    }
                    break;
                }
                i12++;
            }
            ex0Var.C.setText(Emoji.replaceEmoji(MediaDataController.getInstance(ex0Var.currentAccount).getEmojiForSticker(ex0Var.P.f22386id), ex0Var.C.getPaint().getFontMetricsInt(), false));
            break;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = ex0Var.O;
        if ((tL_messages_stickerSet3 == null || (stickerSet = tL_messages_stickerSet3.set) == null || !stickerSet.emojis) && !org.telegram.ui.kt.q().y(view)) {
            ex0Var.B.getImageReceiver().setImage(ImageLocation.getForDocument(ex0Var.P), (String) null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(ex0Var.P.thumbs, 90), ex0Var.P), (String) null, "webp", ex0Var.O, 1);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ex0Var.f28193x.getLayoutParams();
            layoutParams2.topMargin = ex0Var.f28170a0;
            ex0Var.f28193x.setLayoutParams(layoutParams2);
            ex0Var.f28193x.setVisibility(0);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(ObjectAnimator.ofFloat(ex0Var.f28193x, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
            animatorSet2.setDuration(200L);
            animatorSet2.start();
        }
    }

    public static void n(ex0 ex0Var) {
        ex0Var.f28186n.n();
        kx0.b(ex0Var.O.set, ex0Var.resourcesProvider, ex0Var.getContext(), new qw0(ex0Var, 4));
    }

    public static void o0(org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, TLRPC.Document document) {
        TLRPC.StickerSet stickerSet;
        if (n2Var == null) {
            return;
        }
        org.telegram.ui.rn rnVar = n2Var instanceof org.telegram.ui.rn ? (org.telegram.ui.rn) n2Var : null;
        boolean z10 = (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.creator) ? false : true;
        if (!MessageObject.isStaticStickerDocument(document)) {
            AndroidUtilities.runOnUIThread(new cg.j(n2Var, (Object) tL_messages_stickerSet, (Object) document, (Object) rnVar, z10, 17), 300L);
            return;
        }
        ArrayList arrayList = new ArrayList();
        File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true);
        if (pathToAttach == null || !pathToAttach.exists()) {
            return;
        }
        AndroidUtilities.runOnUIThread(new fh.h(pathToAttach, arrayList, n2Var, rnVar, document, z10, tL_messages_stickerSet), 300L);
    }

    public static void p(org.telegram.ui.pr0 pr0Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers) {
        pr0Var.f28172b0 = 0;
        if (tL_error != null || !(tLObject instanceof Vector)) {
            y4.f0(pr0Var.currentAccount, tL_error, pr0Var.H, tL_messages_getAttachedStickers, new Object[0]);
            pr0Var.dismiss();
            return;
        }
        Vector vector = (Vector) tLObject;
        if (vector.objects.isEmpty()) {
            pr0Var.dismiss();
            return;
        }
        if (vector.objects.size() == 1) {
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vector.objects.get(0);
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            pr0Var.R = tL_inputStickerSetID;
            TLRPC.StickerSet stickerSet = stickerSetCovered.set;
            tL_inputStickerSetID.f22400id = stickerSet.f22407id;
            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
            pr0Var.t0();
            return;
        }
        ArrayList arrayList = new ArrayList();
        pr0Var.S = arrayList;
        arrayList.addAll(vector.objects);
        pr0Var.f28173c.setLayoutParams(h7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        pr0Var.h.setVisibility(8);
        pr0Var.F[0].setVisibility(8);
        pr0Var.d.l();
    }

    public static void q(org.telegram.ui.pr0 pr0Var, Object obj, TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers, org.telegram.ui.gg ggVar, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null || !FileRefController.isFileRefError(tL_error.text) || obj == null) {
            ggVar.run(tLObject, tL_error);
        } else {
            FileRefController.getInstance(pr0Var.currentAccount).requestReference(obj, tL_messages_getAttachedStickers, ggVar);
        }
    }

    public static void r(ex0 ex0Var) {
        ex0Var.dismiss();
        MediaDataController.getInstance(ex0Var.currentAccount).toggleStickerSet(ex0Var.getContext(), ex0Var.O, 0, ex0Var.H, true, ex0Var.f28179f0);
    }

    public static void s(ex0 ex0Var) {
        ex0Var.f28186n.n();
        ex0Var.dismiss();
        MediaDataController.getInstance(ex0Var.currentAccount).toggleStickerSet(ex0Var.getContext(), ex0Var.O, 1, ex0Var.H, true, true);
    }

    public static void t(ex0 ex0Var) {
        ex0Var.dismiss();
        MediaDataController.getInstance(ex0Var.currentAccount).toggleStickerSet(ex0Var.getContext(), ex0Var.O, 1, ex0Var.H, false, false);
    }

    public static void u(ex0 ex0Var) {
        ex0Var.dismiss();
        MediaDataController.getInstance(ex0Var.currentAccount).toggleStickerSet(ex0Var.getContext(), ex0Var.O, 1, ex0Var.H, false, false);
    }

    public static boolean w(ex0 ex0Var, MotionEvent motionEvent) {
        if (ex0Var.N) {
            return false;
        }
        return org.telegram.ui.kt.q().s(motionEvent, ex0Var.f28173c, ex0Var.D, ex0Var.f28182i0, ex0Var.resourcesProvider);
    }

    public static void x(ex0 ex0Var, ArrayList arrayList, Boolean bool) {
        ex0Var.U = arrayList;
        if (arrayList.isEmpty()) {
            ex0Var.dismiss();
            return;
        }
        ex0Var.d.l();
        if (bool.booleanValue()) {
            ex0Var.V = new HashMap();
            int size = ex0Var.U.size();
            for (int i10 = 0; i10 < size; i10++) {
                SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) ex0Var.U.get(i10);
                ex0Var.V.put(importingSticker.path, importingSticker);
                FileLoader.getInstance(ex0Var.currentAccount).uploadFile(importingSticker.path, false, true, 67108864);
            }
        }
        ex0Var.B0();
    }

    public static void y(ex0 ex0Var, int[] iArr, EditTextBoldCursor editTextBoldCursor, TextView textView, TextView textView2, AlertDialog$Builder alertDialog$Builder) {
        int i10 = iArr[0];
        if (i10 == 1) {
            return;
        }
        if (i10 == 0) {
            iArr[0] = 1;
            TLRPC.TL_stickers_suggestShortName tL_stickers_suggestShortName = new TLRPC.TL_stickers_suggestShortName();
            String string = editTextBoldCursor.getText().toString();
            ex0Var.f28187n0 = string;
            tL_stickers_suggestShortName.title = string;
            ConnectionsManager.getInstance(ex0Var.currentAccount).sendRequest(tL_stickers_suggestShortName, new cg.e0(ex0Var, editTextBoldCursor, textView, textView2, iArr, 9));
            return;
        }
        if (i10 == 2) {
            iArr[0] = 3;
            if (!ex0Var.m0) {
                AndroidUtilities.shakeView(editTextBoldCursor);
                try {
                    editTextBoldCursor.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
            }
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
            SendMessagesHelper.getInstance(ex0Var.currentAccount).prepareImportStickers(ex0Var.f28187n0, ex0Var.f28184k0, ex0Var.W, ex0Var.U, new pw0(ex0Var));
            alertDialog$Builder.f22702a.H0.run();
            ex0Var.dismiss();
        }
    }

    public final void A0() {
        if (this.containerView == null || UserConfig.getInstance(this.currentAccount).isPremium()) {
            return;
        }
        MessageObject.isPremiumEmojiPack(this.O);
    }

    public final void B0() {
        ArrayList<TLRPC.Document> arrayList;
        boolean z10;
        TLRPC.StickerSet stickerSet;
        String pluralString;
        String pluralString2;
        ArrayList<TLRPC.Document> arrayList2;
        TLRPC.StickerSet stickerSet2;
        TLRPC.StickerSet stickerSet3;
        TLRPC.StickerSet stickerSet4;
        TLRPC.StickerSet stickerSet5;
        TLRPC.StickerSet stickerSet6;
        boolean z11;
        TLRPC.StickerSet stickerSet7;
        if (this.h == null) {
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.O;
        int i10 = 1;
        int i11 = 0;
        if (tL_messages_stickerSet == null || (arrayList = tL_messages_stickerSet.documents) == null || arrayList.isEmpty()) {
            ArrayList arrayList3 = this.T;
            if (arrayList3 == null) {
                w0(new ow0(this, 14), LocaleController.getString(R.string.Close), org.telegram.ui.ActionBar.g6.f23233n5);
                return;
            }
            p80 p80Var = this.h;
            ArrayList arrayList4 = this.U;
            p80Var.setText(LocaleController.formatPluralString("Stickers", arrayList4 != null ? arrayList4.size() : arrayList3.size(), new Object[0]));
            HashMap map = this.V;
            if (map != null && !map.isEmpty()) {
                w0(null, LocaleController.getString(R.string.ImportStickersProcessing), org.telegram.ui.ActionBar.g6.f23283q5);
                this.f28191s.setEnabled(false);
                return;
            }
            ow0 ow0Var = new ow0(this, 13);
            int i12 = R.string.ImportStickers;
            ArrayList arrayList5 = this.U;
            w0(ow0Var, LocaleController.formatString("ImportStickers", i12, LocaleController.formatPluralString("Stickers", arrayList5 != null ? arrayList5.size() : arrayList3.size(), new Object[0])), org.telegram.ui.ActionBar.g6.f23233n5);
            this.f28191s.setEnabled(true);
            return;
        }
        CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(this.O.set.title, this.h.getPaint().getFontMetricsInt(), false);
        try {
            if (this.f28171b == null) {
                this.f28171b = Pattern.compile("@[a-zA-Z\\d_]{1,32}");
            }
            Matcher matcher = this.f28171b.matcher(charSequenceReplaceEmoji);
            SpannableStringBuilder spannableStringBuilder = null;
            while (matcher.find()) {
                if (spannableStringBuilder == null) {
                    spannableStringBuilder = new SpannableStringBuilder(charSequenceReplaceEmoji);
                }
                int iStart = matcher.start();
                int iEnd = matcher.end();
                if (this.O.set.title.charAt(iStart) != '@') {
                    iStart++;
                }
                spannableStringBuilder.setSpan(new g4(charSequenceReplaceEmoji.subSequence(iStart + 1, iEnd).toString(), i10, this), iStart, iEnd, 0);
            }
            if (spannableStringBuilder != null) {
                charSequenceReplaceEmoji = spannableStringBuilder;
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        this.h.setText(charSequenceReplaceEmoji);
        int i13 = 5;
        if (s0()) {
            int measuredWidth = this.f28173c.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = AndroidUtilities.displaySize.x;
            }
            this.d.d = Math.max(1, measuredWidth / AndroidUtilities.dp(AndroidUtilities.isTablet() ? 60.0f : 45.0f));
        } else {
            this.d.d = 5;
        }
        this.I.y1(this.d.d);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.O;
        if (tL_messages_stickerSet2 == null || (stickerSet7 = tL_messages_stickerSet2.set) == null || !stickerSet7.emojis || UserConfig.getInstance(this.currentAccount).isPremium() || this.Z != null) {
            this.v.setVisibility(4);
        } else if (this.O.documents != null) {
            for (int i14 = 0; i14 < this.O.documents.size(); i14++) {
                if (!MessageObject.isFreeEmoji(this.O.documents.get(i14))) {
                    this.v.setVisibility(0);
                    this.f28191s.setBackground(null);
                    w0(null, null, -1);
                    this.v.a(LocaleController.getString(R.string.UnlockPremiumEmoji), new ow0(this, i11), false);
                    return;
                }
            }
        }
        MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = this.O;
        if (tL_messages_stickerSet3 == null || (stickerSet6 = tL_messages_stickerSet3.set) == null || !stickerSet6.emojis) {
            z10 = tL_messages_stickerSet3 == null || (stickerSet = tL_messages_stickerSet3.set) == null || !mediaDataController.isStickerPackInstalled(stickerSet.f22407id);
        } else {
            ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = mediaDataController.getStickerSets(5);
            int i15 = 0;
            while (true) {
                if (stickerSets == null || i15 >= stickerSets.size()) {
                    z11 = false;
                    break;
                }
                if (stickerSets.get(i15) != null && stickerSets.get(i15).set != null && stickerSets.get(i15).set.f22407id == this.O.set.f22407id) {
                    z11 = true;
                    break;
                }
                i15++;
            }
            z10 = !z11;
        }
        org.telegram.ui.x60 x60Var = this.Z;
        if (x60Var != null) {
            ow0 ow0Var2 = new ow0(this, i13);
            boolean z12 = x60Var.f44290a;
            String string = x60Var.f44292c.J ? LocaleController.getString(z12 ? R.string.RemoveGroupEmojiPackSet : R.string.SetAsGroupEmojiPackSet) : LocaleController.getString(z12 ? R.string.RemoveGroupStickerSet : R.string.SetAsGroupStickerSet);
            boolean z13 = this.Z.f44290a;
            x0(ow0Var2, string, z13 ? org.telegram.ui.ActionBar.g6.f23284q7 : org.telegram.ui.ActionBar.g6.Sh, !z13 ? org.telegram.ui.ActionBar.g6.Oh : -1, z13 ? -1 : org.telegram.ui.ActionBar.g6.Qh);
            return;
        }
        if (z10) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = this.O;
            if (tL_messages_stickerSet4 != null && (stickerSet5 = tL_messages_stickerSet4.set) != null && stickerSet5.emojis) {
                i10 = 5;
            } else if (tL_messages_stickerSet4 == null || (stickerSet4 = tL_messages_stickerSet4.set) == null || !stickerSet4.masks) {
                i10 = 0;
            }
            if (!mediaDataController.areStickersLoaded(i10)) {
                mediaDataController.checkStickers(i10);
                x0(null, "", -1, -1, -1);
                return;
            }
        }
        if (z10) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = this.O;
            if (tL_messages_stickerSet5 != null && (stickerSet3 = tL_messages_stickerSet5.set) != null && stickerSet3.masks) {
                ArrayList<TLRPC.Document> arrayList6 = tL_messages_stickerSet5.documents;
                pluralString2 = LocaleController.formatPluralString("AddManyMasksCount", arrayList6 == null ? 0 : arrayList6.size(), new Object[0]);
            } else if (tL_messages_stickerSet5 == null || (stickerSet2 = tL_messages_stickerSet5.set) == null || !stickerSet2.emojis) {
                pluralString2 = LocaleController.formatPluralString("AddManyStickersCount", (tL_messages_stickerSet5 == null || (arrayList2 = tL_messages_stickerSet5.documents) == null) ? 0 : arrayList2.size(), new Object[0]);
            } else {
                ArrayList<TLRPC.Document> arrayList7 = tL_messages_stickerSet5.documents;
                pluralString2 = LocaleController.formatPluralString("AddManyEmojiCount", arrayList7 == null ? 0 : arrayList7.size(), new Object[0]);
            }
            x0(new ow0(this, 9), pluralString2, org.telegram.ui.ActionBar.g6.Sh, org.telegram.ui.ActionBar.g6.Oh, org.telegram.ui.ActionBar.g6.Qh);
        } else {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet6 = this.O;
            TLRPC.StickerSet stickerSet8 = tL_messages_stickerSet6.set;
            boolean z14 = stickerSet8.creator;
            if (z14) {
                pluralString = LocaleController.getString(this.N ? R.string.Done : R.string.EditStickers);
            } else if (stickerSet8.masks) {
                pluralString = LocaleController.formatPluralString("RemoveManyMasksCount", tL_messages_stickerSet6.documents.size(), new Object[0]);
            } else {
                pluralString = stickerSet8.emojis ? LocaleController.formatPluralString("RemoveManyEmojiCount", tL_messages_stickerSet6.documents.size(), new Object[0]) : LocaleController.formatPluralString("RemoveManyStickersCount", tL_messages_stickerSet6.documents.size(), new Object[0]);
            }
            if (z14) {
                x0(new ow0(this, 10), pluralString, org.telegram.ui.ActionBar.g6.Sh, org.telegram.ui.ActionBar.g6.Oh, org.telegram.ui.ActionBar.g6.Qh);
            } else {
                String str = pluralString;
                if (this.O.set.official) {
                    w0(new ow0(this, 11), str, org.telegram.ui.ActionBar.g6.f23284q7);
                } else {
                    w0(new ow0(this, 12), str, org.telegram.ui.ActionBar.g6.f23284q7);
                }
            }
        }
        this.d.l();
    }

    public final void C0() {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        Point point = AndroidUtilities.displaySize;
        int iMin = (int) ((Math.min(point.x, point.y) / 2) / AndroidUtilities.density);
        if (this.T != null) {
            this.f28194y.setText(LocaleController.getString(R.string.ImportStickersRemove));
            this.f28194y.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23284q7));
            float f10 = iMin;
            this.B.setLayoutParams(h7.z5.d(iMin, f10, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.C.setLayoutParams(h7.z5.d(iMin, f10, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.f28194y.setVisibility(0);
            this.A.setVisibility(0);
            return;
        }
        if (this.X == null || ((tL_messages_stickerSet = this.O) != null && tL_messages_stickerSet.set.masks)) {
            this.f28194y.setText(LocaleController.getString(R.string.Close));
            this.B.setLayoutParams(h7.z5.e(iMin, iMin, 17));
            this.C.setLayoutParams(h7.z5.e(iMin, iMin, 17));
            this.f28194y.setVisibility(8);
            this.A.setVisibility(8);
            return;
        }
        this.f28194y.setText(LocaleController.getString(R.string.SendSticker));
        float f11 = iMin;
        this.B.setLayoutParams(h7.z5.d(iMin, f11, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        this.C.setLayoutParams(h7.z5.d(iMin, f11, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        this.f28194y.setVisibility(0);
        this.A.setVisibility(0);
    }

    public final void D0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.O = tL_messages_stickerSet;
        if (this.d != null) {
            C0();
            B0();
            this.d.l();
        }
        A0();
        MediaDataController.getInstance(this.currentAccount).preloadStickerSetThumb(this.O);
        l0();
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            hh.f1 f1Var = this.f28173c;
            if (f1Var != null) {
                int childCount = f1Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    this.f28173c.getChildAt(i12).invalidate();
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.fileUploaded) {
            HashMap map = this.V;
            if (map == null) {
                return;
            }
            String str = (String) objArr[0];
            SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) map.get(str);
            if (importingSticker != null) {
                importingSticker.uploadMedia(this.currentAccount, (TLRPC.InputFile) objArr[1], new gs0(this, str, importingSticker, 5));
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.fileUploadFailed) {
            HashMap map2 = this.V;
            if (map2 == null) {
                return;
            }
            SendMessagesHelper.ImportingSticker importingSticker2 = (SendMessagesHelper.ImportingSticker) map2.remove((String) objArr[0]);
            if (importingSticker2 != null) {
                u0(importingSticker2);
            }
            if (this.V.isEmpty()) {
                B0();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.stickersDidLoad) {
            TLRPC.TL_messages_stickerSet stickerSetByName = null;
            if (this.R != null) {
                MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
                String str2 = this.R.short_name;
                stickerSetByName = str2 != null ? mediaDataController.getStickerSetByName(str2) : null;
                if (stickerSetByName == null) {
                    stickerSetByName = mediaDataController.getStickerSetById(this.R.f22400id);
                }
            }
            if (stickerSetByName != null && stickerSetByName != this.O) {
                this.O = stickerSetByName;
                t0();
            }
            B0();
        }
    }

    @Override
    public void dismiss() {
        super.dismiss();
        this.f28181h0.B(false);
        Runnable runnable = this.f28188o0;
        if (runnable != null) {
            runnable.run();
        }
        if (this.f28172b0 != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f28172b0, true);
            this.f28172b0 = 0;
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        if (this.T != null) {
            ArrayList arrayList = this.U;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) this.U.get(i10);
                    if (!importingSticker.validated) {
                        FileLoader.getInstance(this.currentAccount).cancelFileUpload(importingSticker.path, false);
                    }
                    if (importingSticker.animated) {
                        new File(importingSticker.path).delete();
                    }
                }
            }
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileUploaded);
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileUploadFailed);
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        s6 s6Var = new s6(this, 9);
        ViewGroup viewGroup = this.containerView;
        Drawable[] drawableArr = {this.shadowDrawable};
        int i10 = org.telegram.ui.ActionBar.g6.f23124h5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(viewGroup, 0, null, null, drawableArr, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.containerView, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Ii));
        ex0 ex0Var = this.d.f26838r;
        if (ex0Var.S != null) {
            org.telegram.ui.Cells.p3.a(arrayList, ex0Var.f28173c, s6Var);
        }
        View[] viewArr = this.F;
        View view = viewArr[0];
        int i11 = org.telegram.ui.ActionBar.g6.V5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(viewArr[1], 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f28173c, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.A5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f23161j5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 2, null, null, null, null, org.telegram.ui.ActionBar.g6.f23180k5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f28186n, 65568, null, null, null, null, org.telegram.ui.ActionBar.g6.Ni));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f28191s, 32, null, null, null, null, i10));
        j6 j6Var = this.f28191s;
        int i12 = org.telegram.ui.ActionBar.g6.f23144i6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(j6Var, 65568, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f28191s, 4, null, null, null, null, this.f28180g0));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f28194y, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f23233n5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f28194y, 32, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f28194y, 65568, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.g6.f23197l5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, s6Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.g6.Ji));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.g6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.g6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.g6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.g6.G8));
        return arrayList;
    }

    public final void l0() {
        if (this.O != null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSetFilterPremiumStickers = MessagesController.getInstance(this.currentAccount).filterPremiumStickers(this.O);
            this.O = tL_messages_stickerSetFilterPremiumStickers;
            if (tL_messages_stickerSetFilterPremiumStickers == null) {
                dismiss();
            }
        }
    }

    public final void m0(TextView textView, String str, boolean z10) {
        if (z10) {
            textView.setText(LocaleController.getString(R.string.ImportStickersLinkAvailable));
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23391w6));
            this.m0 = true;
            this.f28184k0 = str;
            return;
        }
        gs0 gs0Var = this.f28183j0;
        if (gs0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(gs0Var);
            this.f28183j0 = null;
            this.f28184k0 = null;
            if (this.f28185l0 != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f28185l0, true);
            }
        }
        if (TextUtils.isEmpty(str)) {
            textView.setText(LocaleController.getString(R.string.ImportStickersEnterUrlInfo));
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23283q5));
            return;
        }
        this.m0 = false;
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalid));
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23269p7));
                return;
            }
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if ((cCharAt < '0' || cCharAt > '9') && ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && cCharAt != '_'))) {
                    textView.setText(LocaleController.getString(R.string.ImportStickersEnterUrlInfo));
                    textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23269p7));
                    return;
                }
            }
        }
        if (str == null || str.length() < 5) {
            textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalidShort));
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23269p7));
        } else {
            if (str.length() > 32) {
                textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalidLong));
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23269p7));
                return;
            }
            textView.setText(LocaleController.getString(R.string.ImportStickersLinkChecking));
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.F6));
            this.f28184k0 = str;
            gs0 gs0Var2 = new gs0(this, str, textView, 8);
            this.f28183j0 = gs0Var2;
            AndroidUtilities.runOnUIThread(gs0Var2, 300L);
        }
    }

    public final void n0() {
        if (this.N) {
            this.f28176e.d(null);
            this.N = false;
            this.f28181h0.B(true);
            AndroidUtilities.forEachViews((RecyclerView) this.f28173c, (d5.d) new j4.w0(9));
            this.f28186n.postDelayed(new qw0(this, 0), 200L);
            this.f28191s.c(LocaleController.getString(R.string.EditStickers), true, true);
        }
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
    public final void onStart() {
        super.onStart();
        ec.a((FrameLayout) this.containerView, new gh.w0(this, 10));
    }

    @Override
    public final void onStop() {
        super.onStop();
        ec.h((FrameLayout) this.containerView);
    }

    public final void p0() {
        if (this.N) {
            return;
        }
        this.f28176e.d(this.f28173c);
        int i10 = 1;
        this.N = true;
        com.google.firebase.messaging.m mVar = this.f28181h0;
        mVar.B(false);
        Float fValueOf = Float.valueOf(0.0f);
        ArrayList arrayList = (ArrayList) mVar.d;
        if (arrayList.isEmpty()) {
            for (int i11 = 0; i11 < 6; i11++) {
                arrayList.add(fValueOf);
                ((ArrayList) mVar.f4605e).add(fValueOf);
                ((ArrayList) mVar.f4606f).add(fValueOf);
            }
        }
        int i12 = 0;
        for (int i13 = 6; i12 < i13; i13 = 6) {
            long jNextFloat = (long) (Utilities.random.nextFloat() * 300);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, -2.0f, 0.0f, 2.0f, 0.0f);
            valueAnimatorOfFloat.addUpdateListener(new dx0(mVar, i12, 3));
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.setRepeatMode(1);
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.setCurrentPlayTime(jNextFloat);
            long j10 = 300;
            valueAnimatorOfFloat.setDuration(j10);
            valueAnimatorOfFloat.start();
            float fDp = AndroidUtilities.dp(0.5f);
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, fDp, 0.0f, -fDp, 0.0f);
            valueAnimatorOfFloat2.addUpdateListener(new dx0(mVar, i12, 4));
            valueAnimatorOfFloat2.setRepeatCount(-1);
            valueAnimatorOfFloat2.setRepeatMode(1);
            valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat2.setCurrentPlayTime(jNextFloat);
            valueAnimatorOfFloat2.setDuration((long) (((double) 300) * 1.2d));
            valueAnimatorOfFloat2.start();
            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, fDp, 0.0f - fDp, 0.0f);
            valueAnimatorOfFloat3.addUpdateListener(new dx0(mVar, i12, 5));
            valueAnimatorOfFloat3.setRepeatCount(-1);
            valueAnimatorOfFloat3.setRepeatMode(1);
            valueAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat3.setCurrentPlayTime(jNextFloat);
            valueAnimatorOfFloat3.setDuration(j10);
            valueAnimatorOfFloat3.start();
            ((ArrayList) mVar.f4602a).add(valueAnimatorOfFloat);
            ((ArrayList) mVar.f4603b).add(valueAnimatorOfFloat2);
            ((ArrayList) mVar.f4604c).add(valueAnimatorOfFloat3);
            i12++;
        }
        AndroidUtilities.forEachViews((RecyclerView) this.f28173c, (d5.d) new j4.w0(10));
        this.f28186n.postDelayed(new qw0(this, i10), 200L);
        this.f28191s.c(LocaleController.getString(R.string.Done), true, true);
    }

    public final void q0() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f28193x, (Property<FrameLayout, Float>) View.ALPHA, 0.0f));
        animatorSet.setDuration(200L);
        animatorSet.addListener(new sz(this, 25));
        animatorSet.start();
    }

    public final void r0(Context context) {
        ww0 ww0Var = new ww0(this, context);
        this.containerView = ww0Var;
        ww0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i10 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i10, 0, i10, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(48.0f);
        View view = new View(context);
        View[] viewArr = this.F;
        viewArr[0] = view;
        int i11 = org.telegram.ui.ActionBar.g6.V5;
        view.setBackgroundColor(getThemedColor(i11));
        viewArr[0].setAlpha(0.0f);
        viewArr[0].setVisibility(4);
        viewArr[0].setTag(1);
        this.containerView.addView(viewArr[0], layoutParams);
        hh.f1 f1Var = new hh.f1(this, context, 23);
        this.f28173c = f1Var;
        f1Var.setTag(14);
        hh.f1 f1Var2 = this.f28173c;
        getContext();
        kh.l lVar = new kh.l(this);
        this.I = lVar;
        f1Var2.setLayoutManager(lVar);
        this.I.O = new gh.u5(this, 7);
        this.f28176e = new f2.f0(new xw0(this));
        hh.f1 f1Var3 = this.f28173c;
        ax0 ax0Var = new ax0(this, context);
        this.d = ax0Var;
        f1Var3.setAdapter(ax0Var);
        this.f28173c.setVerticalScrollBarEnabled(false);
        this.f28173c.i(new jh.j(6));
        this.f28173c.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        this.f28173c.setClipToPadding(false);
        this.f28173c.setEnabled(true);
        this.f28173c.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.g6.A5));
        this.f28173c.setOnTouchListener(new jr(this, 4));
        this.f28173c.setOnScrollListener(new xm(this, 14));
        j jVar = new j(this, 16);
        this.D = jVar;
        this.f28173c.setOnItemClickListener(jVar);
        this.containerView.addView(this.f28173c, h7.z5.d(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 48.0f));
        ag.p1 p1Var = new ag.p1(this, context, 26);
        this.G = p1Var;
        this.containerView.addView(p1Var, h7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.f28173c.setEmptyView(this.G);
        this.G.setOnTouchListener(new kh.e(24));
        p80 p80Var = new p80(context, null);
        this.h = p80Var;
        p80Var.setLines(1);
        this.h.setSingleLine(true);
        this.h.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23161j5));
        this.h.setTextSize(1, 20.0f);
        this.h.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23180k5));
        this.h.setEllipsize(TextUtils.TruncateAt.END);
        this.h.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f));
        this.h.setGravity(16);
        this.h.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(this.h, h7.z5.d(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(context, null, 0, getThemedColor(org.telegram.ui.ActionBar.g6.Ji), false, this.resourcesProvider);
        this.f28186n = v0Var;
        v0Var.setLongClickEnabled(false);
        this.f28186n.setSubMenuOpenSide(2);
        this.f28186n.setIcon(R.drawable.ic_ab_other);
        this.f28186n.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(getThemedColor(org.telegram.ui.ActionBar.g6.Ni), 1, -1));
        this.containerView.addView(this.f28186n, h7.z5.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
        this.f28186n.e(1, R.drawable.msg_share, LocaleController.getString(R.string.StickersShare));
        this.f28186n.e(2, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink));
        this.f28186n.setOnClickListener(new ow0(this, 1));
        this.f28186n.setDelegate(new pw0(this));
        this.f28186n.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.f28186n.setVisibility(this.R != null ? 0 : 8);
        this.G.addView(new RadialProgressView(context, null), h7.z5.e(-2, -2, 17));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams2.bottomMargin = AndroidUtilities.dp(48.0f);
        View view2 = new View(context);
        viewArr[1] = view2;
        view2.setBackgroundColor(getThemedColor(i11));
        this.containerView.addView(viewArr[1], layoutParams2);
        j6 j6Var = new j6(context, false, false, false);
        this.f28191s = j6Var;
        int i12 = org.telegram.ui.ActionBar.g6.f23124h5;
        int themedColor = getThemedColor(i12);
        int i13 = org.telegram.ui.ActionBar.g6.f23144i6;
        j6Var.setBackground(org.telegram.ui.ActionBar.g6.g0(themedColor, getThemedColor(i13)));
        j6 j6Var2 = this.f28191s;
        int i14 = org.telegram.ui.ActionBar.g6.f23233n5;
        this.f28180g0 = i14;
        j6Var2.setTextColor(getThemedColor(i14));
        this.f28191s.setTextSize(AndroidUtilities.dp(14.0f));
        this.f28191s.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        this.f28191s.setTypeface(AndroidUtilities.bold());
        this.f28191s.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f28192w = frameLayout;
        frameLayout.addView(this.f28191s, h7.z5.c(48.0f, -1));
        this.containerView.addView(this.f28192w, h7.z5.e(-1, -2, 83));
        ag.s1 s1Var = new ag.s1(AndroidUtilities.dp(24.0f), context, this.resourcesProvider, false);
        this.v = s1Var;
        s1Var.setIcon(R.raw.unlock_icon);
        this.v.setVisibility(4);
        this.containerView.addView(this.v, h7.z5.d(-1, 48.0f, 87, 8.0f, 0.0f, 8.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f28193x = frameLayout2;
        frameLayout2.setVisibility(8);
        this.f28193x.setSoundEffectsEnabled(false);
        this.containerView.addView(this.f28193x, h7.z5.c(-1.0f, -1));
        this.f28193x.setOnClickListener(new ow0(this, 2));
        n9 n9Var = new n9(context);
        this.B = n9Var;
        n9Var.setAspectFit(true);
        this.B.setLayerNum(7);
        this.f28193x.addView(this.B);
        TextView textView = new TextView(context);
        this.C = textView;
        textView.setTextSize(1, 30.0f);
        this.C.setGravity(85);
        this.f28193x.addView(this.C);
        TextView textView2 = new TextView(context);
        this.f28194y = textView2;
        textView2.setTextSize(1, 14.0f);
        this.f28194y.setTextColor(getThemedColor(i14));
        this.f28194y.setBackground(org.telegram.ui.ActionBar.g6.g0(getThemedColor(i12), getThemedColor(i13)));
        this.f28194y.setGravity(17);
        this.f28194y.setPadding(AndroidUtilities.dp(29.0f), 0, AndroidUtilities.dp(29.0f), 0);
        this.f28194y.setTypeface(AndroidUtilities.bold());
        this.f28193x.addView(this.f28194y, h7.z5.e(-1, 48, 83));
        this.f28194y.setOnClickListener(new ow0(this, 3));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams3.bottomMargin = AndroidUtilities.dp(48.0f);
        View view3 = new View(context);
        this.A = view3;
        view3.setBackgroundColor(getThemedColor(i11));
        this.f28193x.addView(this.A, layoutParams3);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        if (this.T != null) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileUploaded);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileUploadFailed);
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
        B0();
        C0();
        A0();
        z0(false);
        this.d.l();
    }

    public final boolean s0() {
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.O;
        if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.emojis) {
            return tL_messages_stickerSet == null && this.M;
        }
        return true;
    }

    @Override
    public final void setOnDismissListener(Runnable runnable) {
        this.f28188o0 = runnable;
    }

    @Override
    public final void show() {
        super.show();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4);
    }

    public final void t0() {
        String str;
        if (this.R != null) {
            MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
            if (this.O == null && (str = this.R.short_name) != null) {
                this.O = mediaDataController.getStickerSetByName(str);
            }
            if (this.O == null) {
                this.O = mediaDataController.getStickerSetById(this.R.f22400id);
            }
            if (this.O == null) {
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                tL_messages_getStickerSet.stickerset = this.R;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getStickerSet, new org.telegram.ui.gg(18, this, mediaDataController));
            } else {
                if (this.d != null) {
                    C0();
                    B0();
                    this.d.l();
                }
                A0();
                mediaDataController.preloadStickerSetThumb(this.O);
                l0();
            }
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.O;
        if (tL_messages_stickerSet != null) {
            this.f28175d0 = !tL_messages_stickerSet.set.masks;
        }
        l0();
    }

    public final void u0(SendMessagesHelper.ImportingSticker importingSticker) {
        int iIndexOf = this.U.indexOf(importingSticker);
        if (iIndexOf >= 0) {
            this.U.remove(iIndexOf);
            this.d.u(iIndexOf);
            if (this.U.isEmpty()) {
                dismiss();
            } else {
                B0();
            }
        }
    }

    public final void v0(int i10, boolean z10) {
        if (this.S != null) {
            return;
        }
        View[] viewArr = this.F;
        if ((!z10 || viewArr[i10].getTag() == null) && (z10 || viewArr[i10].getTag() != null)) {
            return;
        }
        int i11 = 1;
        viewArr[i10].setTag(z10 ? null : 1);
        if (z10) {
            viewArr[i10].setVisibility(0);
        }
        AnimatorSet[] animatorSetArr = this.E;
        AnimatorSet animatorSet = animatorSetArr[i10];
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSetArr[i10] = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(viewArr[i10], (Property<View, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        animatorSetArr[i10].setDuration(150L);
        animatorSetArr[i10].addListener(new m90(this, i10, z10, i11));
        animatorSetArr[i10].start();
    }

    public final void w0(View.OnClickListener onClickListener, String str, int i10) {
        x0(onClickListener, str, i10, -1, -1);
    }

    public final void x0(View.OnClickListener onClickListener, String str, int i10, int i11, int i12) {
        if (i10 >= 0) {
            j6 j6Var = this.f28191s;
            this.f28180g0 = i10;
            j6Var.setTextColor(getThemedColor(i10));
        }
        this.f28191s.c(str, false, true);
        this.f28191s.setOnClickListener(onClickListener);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f28191s.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.F[1].getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.f28173c.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.G.getLayoutParams();
        if (onClickListener == null) {
            this.f28191s.setAlpha(0.0f);
        } else if (i11 < 0 || i12 < 0) {
            this.f28191s.setBackground(org.telegram.ui.ActionBar.g6.g0(getThemedColor(org.telegram.ui.ActionBar.g6.f23124h5), org.telegram.ui.ActionBar.g6.l1(0.1f, getThemedColor(org.telegram.ui.ActionBar.g6.f23284q7))));
            this.f28192w.setBackgroundColor(0);
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.rightMargin = 0;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.leftMargin = 0;
            int iDp = AndroidUtilities.dp(48.0f);
            marginLayoutParams2.bottomMargin = iDp;
            marginLayoutParams3.bottomMargin = iDp;
            marginLayoutParams4.bottomMargin = iDp;
            if (this.f28191s.getAlpha() < 1.0f) {
                org.telegram.messenger.rl.o(this.f28191s.animate().alpha(1.0f), er.h, 240L);
            }
        } else {
            j6 j6Var2 = this.f28191s;
            int iDp2 = AndroidUtilities.dp(24.0f);
            int themedColor = getThemedColor(i11);
            int themedColor2 = getThemedColor(i12);
            j6Var2.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp2, iDp2, iDp2, iDp2, themedColor, themedColor2, themedColor2));
            this.f28192w.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23124h5));
            int iDp3 = AndroidUtilities.dp(8.0f);
            marginLayoutParams.bottomMargin = iDp3;
            marginLayoutParams.rightMargin = iDp3;
            marginLayoutParams.topMargin = iDp3;
            marginLayoutParams.leftMargin = iDp3;
            int iDp4 = AndroidUtilities.dp(64.0f);
            marginLayoutParams2.bottomMargin = iDp4;
            marginLayoutParams3.bottomMargin = iDp4;
            marginLayoutParams4.bottomMargin = iDp4;
            if (this.f28191s.getAlpha() < 1.0f) {
                org.telegram.messenger.rl.o(this.f28191s.animate().alpha(1.0f), er.h, 240L);
            }
        }
        this.containerView.requestLayout();
    }

    public final void y0(int i10) {
        this.f28170a0 = i10;
        if (this.S == null) {
            float f10 = i10;
            this.h.setTranslationY(f10);
            if (this.T == null) {
                this.f28186n.setTranslationY(f10);
            }
            this.F[0].setTranslationY(f10);
        }
        this.containerView.invalidate();
    }

    public final void z0(boolean z10) {
        ex0 ex0Var = this.d.f26838r;
        if (ex0Var.S != null) {
            int childCount = ex0Var.f28173c.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = ex0Var.f28173c.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.p3) {
                    ((org.telegram.ui.Cells.p3) childAt).d();
                }
            }
        }
        this.h.setHighlightColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23197l5));
        this.f28193x.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23124h5) & (-536870913));
        this.f28186n.setIconColor(getThemedColor(org.telegram.ui.ActionBar.g6.Ji));
        this.f28186n.G(getThemedColor(org.telegram.ui.ActionBar.g6.E8), false);
        this.f28186n.G(getThemedColor(org.telegram.ui.ActionBar.g6.F8), true);
        this.f28186n.setPopupItemsSelectorColor(getThemedColor(org.telegram.ui.ActionBar.g6.I5));
        this.f28186n.B(getThemedColor(org.telegram.ui.ActionBar.g6.G8));
        if (this.f28190r != null) {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.f23284q7);
            this.f28190r.c(themedColor, themedColor);
            this.f28190r.setSelectorColor(org.telegram.ui.ActionBar.g6.l1(0.1f, themedColor));
            if (this.f28190r.getRightIcon() != null) {
                this.f28190r.getRightIcon().setColorFilter(themedColor);
            }
        }
        if (z10) {
            if (org.telegram.ui.ActionBar.g6.sl != null && this.f28189p0 == null) {
                ArrayList themeDescriptions = getThemeDescriptions();
                this.f28189p0 = themeDescriptions;
                int size = themeDescriptions.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((org.telegram.ui.ActionBar.i6) this.f28189p0.get(i11)).h = null;
                }
            }
            int size2 = this.f28189p0.size();
            for (int i12 = 0; i12 < size2; i12++) {
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.f28189p0.get(i12);
                i6Var.d(getThemedColor(i6Var.f23517f), false, false);
            }
        }
        if (org.telegram.ui.ActionBar.g6.sl == null && this.f28189p0 != null) {
            this.f28189p0 = null;
        }
    }

    public ex0(Context context, String str, ArrayList arrayList, ArrayList arrayList2) {
        super(context, null, false, false);
        this.E = new AnimatorSet[2];
        this.F = new View[2];
        this.f28179f0 = true;
        this.f28181h0 = new com.google.firebase.messaging.m(8);
        this.f28182i0 = new tw0(this);
        fixNavigationBar();
        this.J = (Activity) context;
        this.T = arrayList;
        this.W = str;
        Utilities.globalQueue.postRunnable(new gs0(this, arrayList, arrayList2, 9));
        r0(context);
    }

    public ex0(Context context, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.InputStickerSet inputStickerSet, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, bx0 bx0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, false, false);
        this.E = new AnimatorSet[2];
        this.F = new View[2];
        this.f28179f0 = true;
        this.f28181h0 = new com.google.firebase.messaging.m(8);
        this.f28182i0 = new tw0(this);
        fixNavigationBar();
        this.X = bx0Var;
        this.R = inputStickerSet;
        this.O = tL_messages_stickerSet;
        this.H = n2Var;
        t0();
        r0(context);
    }
}
