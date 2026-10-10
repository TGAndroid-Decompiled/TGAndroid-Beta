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
public class yy0 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f33419u0 = 0;
    public View E;
    public y9 F;
    public TextView G;
    public j H;
    public final AnimatorSet[] I;
    public final View[] J;
    public ai.f0 K;
    public final org.telegram.ui.ActionBar.n2 L;
    public bi.l M;
    public final Activity N;
    public int O;
    public int P;
    public boolean Q;
    public boolean R;
    public TLRPC.TL_messages_stickerSet S;
    public TLRPC.Document T;
    public SendMessagesHelper.ImportingSticker U;
    public TLRPC.InputStickerSet V;
    public ArrayList W;
    public final ArrayList X;
    public ArrayList Y;
    public HashMap Z;
    public final String f33420a0;
    public Pattern f33421b;
    public final vy0 f33422b0;
    public ai.w0 f33423c;
    public wy0 f33424c0;
    public uy0 d;
    public org.telegram.ui.n70 f33425d0;
    public s4.z f33426e;
    public int f33427e0;
    public TLRPC.Document f33428f;
    public int f33429f0;
    public boolean f33430g0;
    public fa0 h;
    public boolean f33431h0;
    public boolean f33432i0;
    public boolean f33433j0;
    public int f33434k0;
    public final com.google.firebase.messaging.n f33435l0;
    public final ny0 m0;
    public org.telegram.ui.ActionBar.v0 f33436n;
    public cf0 f33437n0;
    public String f33438o0;
    public int f33439p0;
    public boolean f33440q0;
    public org.telegram.ui.ActionBar.f1 f33441r;
    public String f33442r0;
    public r6 f33443s;
    public Runnable f33444s0;
    public ArrayList f33445t0;
    public rg.p0 v;
    public FrameLayout f33446w;
    public FrameLayout f33447x;
    public TextView f33448y;

    public yy0(Context context, Object obj, TLObject tLObject, org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, false);
        this.I = new AnimatorSet[2];
        this.J = new View[2];
        this.f33433j0 = true;
        this.f33435l0 = new com.google.firebase.messaging.n(6);
        this.m0 = new ny0(this);
        this.resourcesProvider = e6Var;
        fixNavigationBar();
        this.N = (Activity) context;
        TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = new TLRPC.TL_messages_getAttachedStickers();
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.Photo photo = (TLRPC.Photo) tLObject;
            TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = new TLRPC.TL_inputStickeredMediaPhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_inputStickeredMediaPhoto.f20112id = tL_inputPhoto;
            tL_inputPhoto.f20061id = photo.f20066id;
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
            tL_inputStickeredMediaDocument.f20111id = tL_inputDocument;
            tL_inputDocument.f20054id = document.f20048id;
            tL_inputDocument.access_hash = document.access_hash;
            byte[] bArr2 = document.file_reference;
            tL_inputDocument.file_reference = bArr2;
            if (bArr2 == null) {
                tL_inputDocument.file_reference = new byte[0];
            }
            tL_messages_getAttachedStickers.media = tL_inputStickeredMediaDocument;
        }
        org.telegram.ui.rs0 rs0Var = (org.telegram.ui.rs0) this;
        this.f33429f0 = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getAttachedStickers, new ai.q3(rs0Var, obj, tL_messages_getAttachedStickers, new org.telegram.ui.oo(15, rs0Var, tL_messages_getAttachedStickers), 7));
        s0(context);
    }

    public static void C(yy0 yy0Var) {
        yy0Var.dismiss();
        MediaDataController.getInstance(yy0Var.currentAccount).toggleStickerSet(yy0Var.getContext(), yy0Var.S, 1, yy0Var.L, true, yy0Var.f33433j0);
    }

    public static void D(yy0 yy0Var) {
        yy0Var.dismiss();
        wy0 wy0Var = yy0Var.f33424c0;
        if (wy0Var != null) {
            wy0Var.a();
        }
        if (yy0Var.V != null && !MediaDataController.getInstance(yy0Var.currentAccount).cancelRemovingStickerSet(yy0Var.V.f20062id)) {
            TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
            tL_messages_installStickerSet.stickerset = yy0Var.V;
            ConnectionsManager.getInstance(yy0Var.currentAccount).sendRequest(tL_messages_installStickerSet, new y1(yy0Var, 13));
        }
    }

    public static void E(yy0 yy0Var, int i10) {
        String str;
        org.telegram.ui.ActionBar.n2 n2Var = yy0Var.L;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = yy0Var.S;
        if (tL_messages_stickerSet != null) {
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet != null && stickerSet.emojis) {
                str = "https://" + MessagesController.getInstance(yy0Var.currentAccount).linkPrefix + "/addemoji/" + yy0Var.S.set.short_name;
            } else {
                str = "https://" + MessagesController.getInstance(yy0Var.currentAccount).linkPrefix + "/addstickers/" + yy0Var.S.set.short_name;
            }
            String str2 = str;
            if (i10 == 1) {
                Context context = yy0Var.N;
                if (context == null && n2Var != null) {
                    context = n2Var.getParentActivity();
                }
                if (context == null) {
                    context = yy0Var.getContext();
                }
                ly0 ly0Var = new ly0(yy0Var, context, str2, str2, yy0Var.resourcesProvider);
                if (n2Var != null) {
                    n2Var.showDialog(ly0Var);
                    if (n2Var instanceof org.telegram.ui.zn) {
                        ly0Var.setCalcMandatoryInsets(((org.telegram.ui.zn) n2Var).C9());
                        return;
                    }
                    return;
                }
                ly0Var.show();
            } else if (i10 == 2) {
                try {
                    AndroidUtilities.addToClipboard(str2);
                    new ad((FrameLayout) yy0Var.containerView, yy0Var.resourcesProvider).k(false).j();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            } else if (i10 == 3) {
                if (yy0Var.R) {
                    yy0Var.o0();
                } else {
                    yy0Var.q0();
                }
            } else if (i10 == 4) {
                dz0.c(yy0Var.S.set, yy0Var.resourcesProvider, yy0Var.getContext(), new d(yy0Var, 20));
            } else if (i10 == 5) {
                dz0.b(yy0Var.S.set, yy0Var.resourcesProvider, yy0Var.getContext(), new jy0(yy0Var, 2));
            }
        }
    }

    public static void F(yy0 yy0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        int i10;
        org.telegram.ui.ActionBar.n2 n2Var = yy0Var.L;
        TLRPC.StickerSet stickerSet = yy0Var.S.set;
        if (stickerSet.masks) {
            i10 = 1;
        } else if (stickerSet.emojis) {
            i10 = 5;
        } else {
            i10 = 0;
        }
        try {
            if (tL_error == null) {
                if (yy0Var.f33433j0) {
                    tc.g(n2Var, new dy0(yy0Var.f33446w.getContext(), yy0Var.S, 1, 2, null, yy0Var.resourcesProvider), 1500).j();
                }
                if (tLObject instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                    MediaDataController.getInstance(yy0Var.currentAccount).processStickerSetInstallResultArchive(n2Var, true, i10, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject);
                }
            } else {
                Toast.makeText(yy0Var.getContext(), LocaleController.getString(R.string.ErrorOccurred), 0).show();
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        MediaDataController.getInstance(yy0Var.currentAccount).loadStickers(i10, false, true);
    }

    public static void G(yy0 yy0Var, TLRPC.TL_error tL_error, TLObject tLObject, MediaDataController mediaDataController) {
        TLRPC.StickerSet stickerSet;
        boolean z10 = false;
        yy0Var.f33429f0 = 0;
        if (tL_error == null) {
            ln0 ln0Var = new ln0(yy0Var, 1);
            ln0Var.addTarget(yy0Var.containerView);
            TransitionManager.beginDelayedTransition(yy0Var.container, ln0Var);
            yy0Var.f33436n.setVisibility(0);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            yy0Var.S = tL_messages_stickerSet;
            mediaDataController.putStickerSet(tL_messages_stickerSet, false);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = yy0Var.S;
            if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.documents.isEmpty()) {
                yy0Var.dismiss();
                return;
            }
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = yy0Var.S;
            if (tL_messages_stickerSet3 != null && (stickerSet = tL_messages_stickerSet3.set) != null && !stickerSet.masks) {
                z10 = true;
            }
            yy0Var.f33431h0 = z10;
            yy0Var.m0();
            mediaDataController.preloadStickerSetThumb(yy0Var.S);
            yy0Var.D0();
            yy0Var.C0();
            yy0Var.B0();
            yy0Var.d.l();
            return;
        }
        yy0Var.dismiss();
        org.telegram.ui.ActionBar.n2 n2Var = yy0Var.L;
        if (n2Var != null) {
            org.telegram.messenger.bi.q(R.string.AddStickersNotFound, ad.a0(n2Var), null);
        }
    }

    public static void H(yy0 yy0Var, String str, TextView textView) {
        TLRPC.TL_stickers_checkShortName tL_stickers_checkShortName = new TLRPC.TL_stickers_checkShortName();
        tL_stickers_checkShortName.short_name = str;
        yy0Var.f33439p0 = ConnectionsManager.getInstance(yy0Var.currentAccount).sendRequest(tL_stickers_checkShortName, new ai.t5(yy0Var, str, textView, 12), 2);
    }

    public static void I(yy0 yy0Var) {
        boolean z10;
        TLRPC.StickerSet stickerSet;
        MediaDataController mediaDataController = MediaDataController.getInstance(yy0Var.currentAccount);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = yy0Var.S;
        if (tL_messages_stickerSet != null && mediaDataController.isStickerPackInstalled(tL_messages_stickerSet.set.f20069id)) {
            z10 = false;
        } else {
            z10 = true;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = yy0Var.S;
        if (tL_messages_stickerSet2 != null && (stickerSet = tL_messages_stickerSet2.set) != null && stickerSet.creator && yy0Var.f33441r == null) {
            yy0Var.f33436n.e(3, R.drawable.tabs_reorder, LocaleController.getString(R.string.StickersReorder));
            yy0Var.f33436n.e(4, R.drawable.msg_edit, LocaleController.getString(R.string.EditName));
            if (z10) {
                yy0Var.f33441r = yy0Var.f33436n.e(5, R.drawable.msg_delete, LocaleController.getString(R.string.Delete));
            } else {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, yy0Var.getContext(), yy0Var.resourcesProvider);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
                org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, yy0Var.resourcesProvider).setOnClickListener(new hy0(yy0Var, 4));
                org.telegram.ui.ActionBar.f1 c10 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.StickersDeleteForEveryone), false, yy0Var.resourcesProvider);
                int themedColor = yy0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f21041q7);
                c10.c(themedColor, themedColor);
                c10.setSelectorColor(org.telegram.ui.ActionBar.i6.m1(0.1f, themedColor));
                org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.StickersRemoveForMe), false, yy0Var.resourcesProvider).setOnClickListener(new hy0(yy0Var, 6));
                c10.setOnClickListener(new hy0(yy0Var, 7));
                yy0Var.f33441r = yy0Var.f33436n.i(R.drawable.msg_delete, null, LocaleController.getString(R.string.Delete), actionBarPopupWindow$ActionBarPopupWindowLayout);
            }
            yy0Var.f33436n.a(-1);
            wb0 wb0Var = new wb0(yy0Var.currentAccount, 4, yy0Var.getContext(), new ArrayList(), yy0Var.resourcesProvider);
            wb0Var.setOnClickListener(new hy0(yy0Var, 8));
            wb0Var.setTag(R.id.fit_width_tag, 1);
            org.telegram.ui.ActionBar.v0 v0Var = yy0Var.f33436n;
            v0Var.o();
            v0Var.f21583b.a(wb0Var, new LinearLayout.LayoutParams(-1, -2));
            int themedColor2 = yy0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f21041q7);
            yy0Var.f33441r.c(themedColor2, themedColor2);
            yy0Var.f33441r.setSelectorColor(org.telegram.ui.ActionBar.i6.m1(0.1f, themedColor2));
            if (yy0Var.f33441r.getRightIcon() != null) {
                yy0Var.f33441r.getRightIcon().setColorFilter(themedColor2);
            }
        }
        if (yy0Var.f33436n.getPopupLayout() != null) {
            yy0Var.f33436n.getPopupLayout().requestLayout();
        }
        yy0Var.f33436n.M(null, null);
    }

    public static void P(yy0 yy0Var) {
        if (yy0Var.f33423c.getChildCount() <= 0) {
            yy0Var.z0(yy0Var.f33423c.getPaddingTop());
            return;
        }
        int i10 = 0;
        View view = null;
        int i11 = -1;
        for (int i12 = 0; i12 < yy0Var.f33423c.getChildCount(); i12++) {
            View childAt = yy0Var.f33423c.getChildAt(i12);
            yy0Var.f33423c.getClass();
            int R = RecyclerView.R(childAt);
            if (i11 == -1 || i11 > R) {
                view = childAt;
                i11 = R;
            }
        }
        if (view != null && view.getTop() >= 0) {
            int top = view.getTop();
            yy0Var.w0(0, false);
            i10 = top;
        } else {
            yy0Var.w0(0, true);
        }
        yy0Var.w0(1, true);
        if (yy0Var.f33427e0 != i10) {
            yy0Var.z0(i10);
        }
    }

    public static void o(yy0 yy0Var, View view, int i10) {
        TLRPC.StickerSet stickerSet;
        String str;
        if (view instanceof sy0) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = yy0Var.S;
            org.telegram.ui.ActionBar.n2 n2Var = yy0Var.L;
            org.telegram.ui.ActionBar.e6 e6Var = yy0Var.resourcesProvider;
            if (n2Var != null) {
                Context context = n2Var.getContext();
                if (!(n2Var instanceof org.telegram.ui.zn)) {
                    dz0.a(tL_messages_stickerSet, n2Var, e6Var);
                    return;
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert3, 0, context, e6Var);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                arrayList.add(LocaleController.getString(R.string.StickersCreateNewSticker));
                org.telegram.ui.Cells.c1.k(R.drawable.menu_sticker_add, 0, arrayList3, arrayList2);
                arrayList.add(LocaleController.getString(R.string.StickersAddAnExistingSticker));
                arrayList3.add(Integer.valueOf(R.drawable.menu_sticker_select));
                arrayList2.add(1);
                org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                ai.s0 s0Var = new ai.s0(n1Var, arrayList2, tL_messages_stickerSet, n2Var, e6Var, 11);
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    org.telegram.ui.ActionBar.f1 c10 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, ((Integer) arrayList3.get(i11)).intValue(), (CharSequence) arrayList.get(i11), false, e6Var);
                    c10.setTag(Integer.valueOf(i11));
                    c10.setOnClickListener(s0Var);
                }
                n1Var.f21418c = 100;
                n1Var.f21421g = true;
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
            }
        } else if (!yy0Var.R) {
            if (yy0Var.W != null) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) yy0Var.d.f31666f.get(i10);
                if (stickerSetCovered != null) {
                    yy0Var.dismiss();
                    TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                    TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
                    tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                    tL_inputStickerSetID.f20062id = stickerSet2.f20069id;
                    new yy0(yy0Var.N, yy0Var.L, tL_inputStickerSetID, null, null, yy0Var.resourcesProvider).show();
                    return;
                }
                return;
            }
            ArrayList arrayList4 = yy0Var.Y;
            if (arrayList4 != null) {
                if (i10 >= 0 && i10 < arrayList4.size()) {
                    SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) yy0Var.Y.get(i10);
                    yy0Var.U = importingSticker;
                    if (importingSticker.validated) {
                        TextView textView = yy0Var.G;
                        textView.setText(Emoji.replaceEmoji(importingSticker.emoji, textView.getPaint().getFontMetricsInt(), false));
                        y9 y9Var = yy0Var.F;
                        ImageLocation forPath = ImageLocation.getForPath(yy0Var.U.path);
                        if (yy0Var.U.animated) {
                            str = "tgs";
                        } else {
                            str = null;
                        }
                        y9Var.m(forPath, null, null, null, null, str, 0, null);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) yy0Var.f33447x.getLayoutParams();
                        layoutParams.topMargin = yy0Var.f33427e0;
                        yy0Var.f33447x.setLayoutParams(layoutParams);
                        yy0Var.f33447x.setVisibility(0);
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ObjectAnimator.ofFloat(yy0Var.f33447x, View.ALPHA, 0.0f, 1.0f));
                        animatorSet.setDuration(200L);
                        animatorSet.start();
                        return;
                    }
                    return;
                }
                return;
            }
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = yy0Var.S;
            if (tL_messages_stickerSet2 != null && i10 >= 0 && i10 < tL_messages_stickerSet2.documents.size()) {
                yy0Var.T = yy0Var.S.documents.get(i10);
                int i12 = 0;
                while (true) {
                    if (i12 >= yy0Var.T.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = yy0Var.T.attributes.get(i12);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                        String str2 = documentAttribute.alt;
                        if (str2 != null && str2.length() > 0) {
                            TextView textView2 = yy0Var.G;
                            textView2.setText(Emoji.replaceEmoji(documentAttribute.alt, textView2.getPaint().getFontMetricsInt(), false));
                        }
                    } else {
                        i12++;
                    }
                }
                yy0Var.G.setText(Emoji.replaceEmoji(MediaDataController.getInstance(yy0Var.currentAccount).getEmojiForSticker(yy0Var.T.f20048id), yy0Var.G.getPaint().getFontMetricsInt(), false));
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = yy0Var.S;
                if ((tL_messages_stickerSet3 == null || (stickerSet = tL_messages_stickerSet3.set) == null || !stickerSet.emojis) && !org.telegram.ui.rt.q().y(view)) {
                    yy0Var.F.getImageReceiver().setImage(ImageLocation.getForDocument(yy0Var.T), (String) null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(yy0Var.T.thumbs, 90), yy0Var.T), (String) null, "webp", yy0Var.S, 1);
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) yy0Var.f33447x.getLayoutParams();
                    layoutParams2.topMargin = yy0Var.f33427e0;
                    yy0Var.f33447x.setLayoutParams(layoutParams2);
                    yy0Var.f33447x.setVisibility(0);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(yy0Var.f33447x, View.ALPHA, 0.0f, 1.0f));
                    animatorSet2.setDuration(200L);
                    animatorSet2.start();
                }
            }
        }
    }

    public static void p(yy0 yy0Var) {
        yy0Var.f33436n.n();
        dz0.b(yy0Var.S.set, yy0Var.resourcesProvider, yy0Var.getContext(), new jy0(yy0Var, 4));
    }

    public static void p0(org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, TLRPC.Document document) {
        org.telegram.ui.zn znVar;
        boolean z10;
        TLRPC.StickerSet stickerSet;
        if (n2Var != null) {
            if (n2Var instanceof org.telegram.ui.zn) {
                znVar = (org.telegram.ui.zn) n2Var;
            } else {
                znVar = null;
            }
            org.telegram.ui.zn znVar2 = znVar;
            if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.creator) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (MessageObject.isStaticStickerDocument(document)) {
                ArrayList arrayList = new ArrayList();
                File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true);
                if (pathToAttach != null && pathToAttach.exists()) {
                    AndroidUtilities.runOnUIThread(new hg.r0(pathToAttach, arrayList, n2Var, znVar2, document, z10, tL_messages_stickerSet), 300L);
                    return;
                }
                return;
            }
            AndroidUtilities.runOnUIThread(new ci.t1((Object) n2Var, (Object) tL_messages_stickerSet, (Object) document, (Object) znVar2, z10, 19), 300L);
        }
    }

    public static void q(org.telegram.ui.rs0 rs0Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers) {
        rs0Var.f33429f0 = 0;
        if (tL_error == null && (tLObject instanceof Vector)) {
            Vector vector = (Vector) tLObject;
            if (vector.objects.isEmpty()) {
                rs0Var.dismiss();
                return;
            } else if (vector.objects.size() == 1) {
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                rs0Var.V = tL_inputStickerSetID;
                TLRPC.StickerSet stickerSet = ((TLRPC.StickerSetCovered) vector.objects.get(0)).set;
                tL_inputStickerSetID.f20062id = stickerSet.f20069id;
                tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                rs0Var.u0();
                return;
            } else {
                ArrayList arrayList = new ArrayList();
                rs0Var.W = arrayList;
                arrayList.addAll(vector.objects);
                rs0Var.f33423c.setLayoutParams(w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 48.0f, -1, 51));
                rs0Var.h.setVisibility(8);
                rs0Var.J[0].setVisibility(8);
                rs0Var.d.l();
                return;
            }
        }
        g5.e0(rs0Var.currentAccount, tL_error, rs0Var.L, tL_messages_getAttachedStickers, new Object[0]);
        rs0Var.dismiss();
    }

    public static void r(org.telegram.ui.rs0 rs0Var, Object obj, TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers, org.telegram.ui.oo ooVar, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && obj != null) {
            FileRefController.getInstance(rs0Var.currentAccount).requestReference(obj, tL_messages_getAttachedStickers, ooVar);
        } else {
            ooVar.run(tLObject, tL_error);
        }
    }

    public static void s(yy0 yy0Var) {
        yy0Var.dismiss();
        MediaDataController.getInstance(yy0Var.currentAccount).toggleStickerSet(yy0Var.getContext(), yy0Var.S, 0, yy0Var.L, true, yy0Var.f33433j0);
    }

    public static void t(yy0 yy0Var) {
        yy0Var.f33436n.n();
        yy0Var.dismiss();
        MediaDataController.getInstance(yy0Var.currentAccount).toggleStickerSet(yy0Var.getContext(), yy0Var.S, 1, yy0Var.L, true, true);
    }

    public static void u(yy0 yy0Var) {
        yy0Var.dismiss();
        MediaDataController.getInstance(yy0Var.currentAccount).toggleStickerSet(yy0Var.getContext(), yy0Var.S, 1, yy0Var.L, false, false);
    }

    public static void v(yy0 yy0Var) {
        yy0Var.dismiss();
        MediaDataController.getInstance(yy0Var.currentAccount).toggleStickerSet(yy0Var.getContext(), yy0Var.S, 1, yy0Var.L, false, false);
    }

    public static boolean x(yy0 yy0Var, MotionEvent motionEvent) {
        if (yy0Var.R) {
            return false;
        }
        return org.telegram.ui.rt.q().s(motionEvent, yy0Var.f33423c, yy0Var.H, yy0Var.m0, yy0Var.resourcesProvider);
    }

    public static void y(yy0 yy0Var, ArrayList arrayList, Boolean bool) {
        yy0Var.Y = arrayList;
        if (arrayList.isEmpty()) {
            yy0Var.dismiss();
            return;
        }
        yy0Var.d.l();
        if (bool.booleanValue()) {
            yy0Var.Z = new HashMap();
            int size = yy0Var.Y.size();
            for (int i10 = 0; i10 < size; i10++) {
                SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) yy0Var.Y.get(i10);
                yy0Var.Z.put(importingSticker.path, importingSticker);
                FileLoader.getInstance(yy0Var.currentAccount).uploadFile(importingSticker.path, false, true, 67108864);
            }
        }
        yy0Var.C0();
    }

    public static void z(yy0 yy0Var, int[] iArr, EditTextBoldCursor editTextBoldCursor, TextView textView, TextView textView2, AlertDialog$Builder alertDialog$Builder) {
        int i10 = iArr[0];
        if (i10 != 1) {
            if (i10 == 0) {
                iArr[0] = 1;
                TLRPC.TL_stickers_suggestShortName tL_stickers_suggestShortName = new TLRPC.TL_stickers_suggestShortName();
                String obj = editTextBoldCursor.getText().toString();
                yy0Var.f33442r0 = obj;
                tL_stickers_suggestShortName.title = obj;
                ConnectionsManager.getInstance(yy0Var.currentAccount).sendRequest(tL_stickers_suggestShortName, new ci.hd(yy0Var, editTextBoldCursor, textView, textView2, iArr));
            } else if (i10 == 2) {
                iArr[0] = 3;
                if (!yy0Var.f33440q0) {
                    AndroidUtilities.shakeView(editTextBoldCursor);
                    try {
                        editTextBoldCursor.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                SendMessagesHelper.getInstance(yy0Var.currentAccount).prepareImportStickers(yy0Var.f33442r0, yy0Var.f33438o0, yy0Var.f33420a0, yy0Var.Y, new iy0(yy0Var));
                alertDialog$Builder.f20378a.L0.run();
                yy0Var.dismiss();
            }
        }
    }

    public final void A0(boolean z10) {
        yy0 yy0Var = this.d.f31668r;
        if (yy0Var.W != null) {
            int childCount = yy0Var.f33423c.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = yy0Var.f33423c.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.s3) {
                    ((org.telegram.ui.Cells.s3) childAt).d();
                }
            }
        }
        this.h.setHighlightColor(getThemedColor(org.telegram.ui.ActionBar.i6.f20946l5));
        this.f33447x.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.i6.f20872h5) & (-536870913));
        this.f33436n.setIconColor(getThemedColor(org.telegram.ui.ActionBar.i6.Ji));
        this.f33436n.G(getThemedColor(org.telegram.ui.ActionBar.i6.E8), false);
        this.f33436n.G(getThemedColor(org.telegram.ui.ActionBar.i6.F8), true);
        this.f33436n.setPopupItemsSelectorColor(getThemedColor(org.telegram.ui.ActionBar.i6.I5));
        this.f33436n.B(getThemedColor(org.telegram.ui.ActionBar.i6.G8));
        if (this.f33441r != null) {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.i6.f21041q7);
            this.f33441r.c(themedColor, themedColor);
            this.f33441r.setSelectorColor(org.telegram.ui.ActionBar.i6.m1(0.1f, themedColor));
            if (this.f33441r.getRightIcon() != null) {
                this.f33441r.getRightIcon().setColorFilter(themedColor);
            }
        }
        if (z10) {
            if (org.telegram.ui.ActionBar.i6.vl != null && this.f33445t0 == null) {
                ArrayList themeDescriptions = getThemeDescriptions();
                this.f33445t0 = themeDescriptions;
                int size = themeDescriptions.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((org.telegram.ui.ActionBar.k6) this.f33445t0.get(i11)).h = null;
                }
            }
            int size2 = this.f33445t0.size();
            for (int i12 = 0; i12 < size2; i12++) {
                org.telegram.ui.ActionBar.k6 k6Var = (org.telegram.ui.ActionBar.k6) this.f33445t0.get(i12);
                k6Var.e(getThemedColor(k6Var.f21349f), false, false);
            }
        }
        if (org.telegram.ui.ActionBar.i6.vl == null && this.f33445t0 != null) {
            this.f33445t0 = null;
        }
    }

    public final void B0() {
        if (this.containerView != null && !UserConfig.getInstance(this.currentAccount).isPremium()) {
            MessageObject.isPremiumEmojiPack(this.S);
        }
    }

    public final void C0() {
        int size;
        int size2;
        ArrayList<TLRPC.Document> arrayList;
        boolean z10;
        TLRPC.StickerSet stickerSet;
        String formatPluralString;
        int i10;
        int i11;
        String formatPluralString2;
        ArrayList<TLRPC.Document> arrayList2;
        TLRPC.StickerSet stickerSet2;
        int size3;
        TLRPC.StickerSet stickerSet3;
        int size4;
        TLRPC.StickerSet stickerSet4;
        TLRPC.StickerSet stickerSet5;
        int i12;
        String string;
        int i13;
        int i14;
        int i15;
        TLRPC.StickerSet stickerSet6;
        boolean z11;
        TLRPC.StickerSet stickerSet7;
        float f7;
        if (this.h == null) {
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.S;
        int i16 = 1;
        if (tL_messages_stickerSet != null && (arrayList = tL_messages_stickerSet.documents) != null && !arrayList.isEmpty()) {
            CharSequence replaceEmoji = Emoji.replaceEmoji(this.S.set.title, this.h.getPaint().getFontMetricsInt(), false);
            try {
                if (this.f33421b == null) {
                    this.f33421b = Pattern.compile("@[a-zA-Z\\d_]{1,32}");
                }
                Matcher matcher = this.f33421b.matcher(replaceEmoji);
                SpannableStringBuilder spannableStringBuilder = null;
                while (matcher.find()) {
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder(replaceEmoji);
                    }
                    int start = matcher.start();
                    int end = matcher.end();
                    if (this.S.set.title.charAt(start) != '@') {
                        start++;
                    }
                    spannableStringBuilder.setSpan(new o4(replaceEmoji.subSequence(start + 1, end).toString(), 1, this), start, end, 0);
                }
                if (spannableStringBuilder != null) {
                    replaceEmoji = spannableStringBuilder;
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            this.h.setText(replaceEmoji);
            if (t0()) {
                int measuredWidth = this.f33423c.getMeasuredWidth();
                if (measuredWidth == 0) {
                    measuredWidth = AndroidUtilities.displaySize.x;
                }
                uy0 uy0Var = this.d;
                if (AndroidUtilities.isTablet()) {
                    f7 = 60.0f;
                } else {
                    f7 = 45.0f;
                }
                uy0Var.d = Math.max(1, measuredWidth / AndroidUtilities.dp(f7));
            } else {
                this.d.d = 5;
            }
            this.M.y1(this.d.d);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.S;
            int i17 = -1;
            if (tL_messages_stickerSet2 != null && (stickerSet7 = tL_messages_stickerSet2.set) != null && stickerSet7.emojis && !UserConfig.getInstance(this.currentAccount).isPremium() && this.f33425d0 == null) {
                if (this.S.documents != null) {
                    for (int i18 = 0; i18 < this.S.documents.size(); i18++) {
                        if (!MessageObject.isFreeEmoji(this.S.documents.get(i18))) {
                            this.v.setVisibility(0);
                            this.f33443s.setBackground(null);
                            x0(null, null, -1);
                            this.v.a(LocaleController.getString(R.string.UnlockPremiumEmoji), new hy0(this, 0), false);
                            return;
                        }
                    }
                }
            } else {
                this.v.setVisibility(4);
            }
            MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = this.S;
            if (tL_messages_stickerSet3 != null && (stickerSet6 = tL_messages_stickerSet3.set) != null && stickerSet6.emojis) {
                ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = mediaDataController.getStickerSets(5);
                for (int i19 = 0; stickerSets != null && i19 < stickerSets.size(); i19++) {
                    if (stickerSets.get(i19) != null && stickerSets.get(i19).set != null && stickerSets.get(i19).set.f20069id == this.S.set.f20069id) {
                        z11 = true;
                        break;
                    }
                }
                z11 = false;
                z10 = !z11;
            } else if (tL_messages_stickerSet3 != null && (stickerSet = tL_messages_stickerSet3.set) != null && mediaDataController.isStickerPackInstalled(stickerSet.f20069id)) {
                z10 = false;
            } else {
                z10 = true;
            }
            org.telegram.ui.n70 n70Var = this.f33425d0;
            if (n70Var != null) {
                hy0 hy0Var = new hy0(this, 5);
                boolean z12 = n70Var.f40137a;
                if (n70Var.f40139c.N) {
                    if (z12) {
                        i15 = R.string.RemoveGroupEmojiPackSet;
                    } else {
                        i15 = R.string.SetAsGroupEmojiPackSet;
                    }
                    string = LocaleController.getString(i15);
                } else {
                    if (z12) {
                        i12 = R.string.RemoveGroupStickerSet;
                    } else {
                        i12 = R.string.SetAsGroupStickerSet;
                    }
                    string = LocaleController.getString(i12);
                }
                String str = string;
                boolean z13 = this.f33425d0.f40137a;
                if (z13) {
                    i13 = org.telegram.ui.ActionBar.i6.f21041q7;
                } else {
                    i13 = org.telegram.ui.ActionBar.i6.Sh;
                }
                if (!z13) {
                    i14 = org.telegram.ui.ActionBar.i6.Oh;
                } else {
                    i14 = -1;
                }
                if (!z13) {
                    i17 = org.telegram.ui.ActionBar.i6.Qh;
                }
                y0(hy0Var, str, i13, i14, i17);
                return;
            }
            if (z10) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = this.S;
                if (tL_messages_stickerSet4 != null && (stickerSet5 = tL_messages_stickerSet4.set) != null && stickerSet5.emojis) {
                    i16 = 5;
                } else if (tL_messages_stickerSet4 == null || (stickerSet4 = tL_messages_stickerSet4.set) == null || !stickerSet4.masks) {
                    i16 = 0;
                }
                if (!mediaDataController.areStickersLoaded(i16)) {
                    mediaDataController.checkStickers(i16);
                    y0(null, "", -1, -1, -1);
                    return;
                }
            }
            if (z10) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = this.S;
                if (tL_messages_stickerSet5 != null && (stickerSet3 = tL_messages_stickerSet5.set) != null && stickerSet3.masks) {
                    ArrayList<TLRPC.Document> arrayList3 = tL_messages_stickerSet5.documents;
                    if (arrayList3 == null) {
                        size4 = 0;
                    } else {
                        size4 = arrayList3.size();
                    }
                    formatPluralString2 = LocaleController.formatPluralString("AddManyMasksCount", size4, new Object[0]);
                } else if (tL_messages_stickerSet5 != null && (stickerSet2 = tL_messages_stickerSet5.set) != null && stickerSet2.emojis) {
                    ArrayList<TLRPC.Document> arrayList4 = tL_messages_stickerSet5.documents;
                    if (arrayList4 == null) {
                        size3 = 0;
                    } else {
                        size3 = arrayList4.size();
                    }
                    formatPluralString2 = LocaleController.formatPluralString("AddManyEmojiCount", size3, new Object[0]);
                } else {
                    if (tL_messages_stickerSet5 != null && (arrayList2 = tL_messages_stickerSet5.documents) != null) {
                        i11 = arrayList2.size();
                    } else {
                        i11 = 0;
                    }
                    formatPluralString2 = LocaleController.formatPluralString("AddManyStickersCount", i11, new Object[0]);
                }
                y0(new hy0(this, 9), formatPluralString2, org.telegram.ui.ActionBar.i6.Sh, org.telegram.ui.ActionBar.i6.Oh, org.telegram.ui.ActionBar.i6.Qh);
            } else {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet6 = this.S;
                TLRPC.StickerSet stickerSet8 = tL_messages_stickerSet6.set;
                boolean z14 = stickerSet8.creator;
                if (z14) {
                    if (this.R) {
                        i10 = R.string.Done;
                    } else {
                        i10 = R.string.EditStickers;
                    }
                    formatPluralString = LocaleController.getString(i10);
                } else if (stickerSet8.masks) {
                    formatPluralString = LocaleController.formatPluralString("RemoveManyMasksCount", tL_messages_stickerSet6.documents.size(), new Object[0]);
                } else if (stickerSet8.emojis) {
                    formatPluralString = LocaleController.formatPluralString("RemoveManyEmojiCount", tL_messages_stickerSet6.documents.size(), new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("RemoveManyStickersCount", tL_messages_stickerSet6.documents.size(), new Object[0]);
                }
                if (z14) {
                    y0(new hy0(this, 10), formatPluralString, org.telegram.ui.ActionBar.i6.Sh, org.telegram.ui.ActionBar.i6.Oh, org.telegram.ui.ActionBar.i6.Qh);
                } else {
                    String str2 = formatPluralString;
                    if (this.S.set.official) {
                        x0(new hy0(this, 11), str2, org.telegram.ui.ActionBar.i6.f21041q7);
                    } else {
                        x0(new hy0(this, 12), str2, org.telegram.ui.ActionBar.i6.f21041q7);
                    }
                }
            }
            this.d.l();
            return;
        }
        ArrayList arrayList5 = this.X;
        if (arrayList5 != null) {
            fa0 fa0Var = this.h;
            ArrayList arrayList6 = this.Y;
            if (arrayList6 != null) {
                size = arrayList6.size();
            } else {
                size = arrayList5.size();
            }
            fa0Var.setText(LocaleController.formatPluralString("Stickers", size, new Object[0]));
            HashMap hashMap = this.Z;
            if (hashMap != null && !hashMap.isEmpty()) {
                x0(null, LocaleController.getString(R.string.ImportStickersProcessing), org.telegram.ui.ActionBar.i6.f21040q5);
                this.f33443s.setEnabled(false);
                return;
            }
            hy0 hy0Var2 = new hy0(this, 13);
            int i20 = R.string.ImportStickers;
            ArrayList arrayList7 = this.Y;
            if (arrayList7 != null) {
                size2 = arrayList7.size();
            } else {
                size2 = arrayList5.size();
            }
            x0(hy0Var2, LocaleController.formatString("ImportStickers", i20, LocaleController.formatPluralString("Stickers", size2, new Object[0])), org.telegram.ui.ActionBar.i6.f20985n5);
            this.f33443s.setEnabled(true);
            return;
        }
        x0(new hy0(this, 14), LocaleController.getString(R.string.Close), org.telegram.ui.ActionBar.i6.f20985n5);
    }

    public final void D0() {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        Point point = AndroidUtilities.displaySize;
        int min = (int) ((Math.min(point.x, point.y) / 2) / AndroidUtilities.density);
        if (this.X != null) {
            this.f33448y.setText(LocaleController.getString(R.string.ImportStickersRemove));
            this.f33448y.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.f21041q7));
            float f7 = min;
            this.F.setLayoutParams(w7.x5.a(f7, 0.0f, 0.0f, 0.0f, 30.0f, min, 17));
            this.G.setLayoutParams(w7.x5.a(f7, 0.0f, 0.0f, 0.0f, 30.0f, min, 17));
            this.f33448y.setVisibility(0);
            this.E.setVisibility(0);
        } else if (this.f33422b0 != null && ((tL_messages_stickerSet = this.S) == null || !tL_messages_stickerSet.set.masks)) {
            this.f33448y.setText(LocaleController.getString(R.string.SendSticker));
            float f10 = min;
            this.F.setLayoutParams(w7.x5.a(f10, 0.0f, 0.0f, 0.0f, 30.0f, min, 17));
            this.G.setLayoutParams(w7.x5.a(f10, 0.0f, 0.0f, 0.0f, 30.0f, min, 17));
            this.f33448y.setVisibility(0);
            this.E.setVisibility(0);
        } else {
            this.f33448y.setText(LocaleController.getString(R.string.Close));
            this.F.setLayoutParams(w7.x5.e(min, min, 17));
            this.G.setLayoutParams(w7.x5.e(min, min, 17));
            this.f33448y.setVisibility(8);
            this.E.setVisibility(8);
        }
    }

    public final void E0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.S = tL_messages_stickerSet;
        if (this.d != null) {
            D0();
            C0();
            this.d.l();
        }
        B0();
        MediaDataController.getInstance(this.currentAccount).preloadStickerSetThumb(this.S);
        m0();
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            ai.w0 w0Var = this.f33423c;
            if (w0Var != null) {
                int childCount = w0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    this.f33423c.getChildAt(i12).invalidate();
                }
            }
        } else if (i10 == NotificationCenter.fileUploaded) {
            HashMap hashMap = this.Z;
            if (hashMap != null) {
                String str = (String) objArr[0];
                SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) hashMap.get(str);
                if (importingSticker != null) {
                    importingSticker.uploadMedia(this.currentAccount, (TLRPC.InputFile) objArr[1], new cf0(this, str, importingSticker, 12));
                }
            }
        } else if (i10 == NotificationCenter.fileUploadFailed) {
            HashMap hashMap2 = this.Z;
            if (hashMap2 != null) {
                SendMessagesHelper.ImportingSticker importingSticker2 = (SendMessagesHelper.ImportingSticker) hashMap2.remove((String) objArr[0]);
                if (importingSticker2 != null) {
                    v0(importingSticker2);
                }
                if (this.Z.isEmpty()) {
                    C0();
                }
            }
        } else if (i10 == NotificationCenter.stickersDidLoad) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
            if (this.V != null) {
                MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
                String str2 = this.V.short_name;
                if (str2 != null) {
                    tL_messages_stickerSet = mediaDataController.getStickerSetByName(str2);
                }
                if (tL_messages_stickerSet == null) {
                    tL_messages_stickerSet = mediaDataController.getStickerSetById(this.V.f20062id);
                }
            }
            if (tL_messages_stickerSet != null && tL_messages_stickerSet != this.S) {
                this.S = tL_messages_stickerSet;
                u0();
            }
            C0();
        }
    }

    @Override
    public void dismiss() {
        super.dismiss();
        this.f33435l0.E(false);
        Runnable runnable = this.f33444s0;
        if (runnable != null) {
            runnable.run();
        }
        if (this.f33429f0 != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f33429f0, true);
            this.f33429f0 = 0;
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        if (this.X != null) {
            ArrayList arrayList = this.Y;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) this.Y.get(i10);
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
        a7 a7Var = new a7(this, 9);
        ViewGroup viewGroup = this.containerView;
        Drawable[] drawableArr = {this.shadowDrawable};
        int i10 = org.telegram.ui.ActionBar.i6.f20872h5;
        arrayList.add(new org.telegram.ui.ActionBar.k6(viewGroup, 0, null, null, drawableArr, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.containerView, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Ii));
        yy0 yy0Var = this.d.f31668r;
        if (yy0Var.W != null) {
            org.telegram.ui.Cells.s3.a(arrayList, yy0Var.f33423c, a7Var);
        }
        View[] viewArr = this.J;
        View view = viewArr[0];
        int i11 = org.telegram.ui.ActionBar.i6.V5;
        arrayList.add(new org.telegram.ui.ActionBar.k6(view, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(viewArr[1], 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33423c, 32768, null, null, null, null, org.telegram.ui.ActionBar.i6.A5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.f20909j5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 2, null, null, null, null, org.telegram.ui.ActionBar.i6.f20928k5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33436n, 65568, null, null, null, null, org.telegram.ui.ActionBar.i6.Ni));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33443s, 32, null, null, null, null, i10));
        r6 r6Var = this.f33443s;
        int i12 = org.telegram.ui.ActionBar.i6.f20892i6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(r6Var, 65568, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33443s, 4, null, null, null, null, this.f33434k0));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33448y, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.f20985n5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33448y, 32, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33448y, 65568, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.E, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.i6.f20946l5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, a7Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.i6.Ji));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.i6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.i6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.i6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.i6.G8));
        return arrayList;
    }

    public final void m0() {
        if (this.S != null) {
            TLRPC.TL_messages_stickerSet filterPremiumStickers = MessagesController.getInstance(this.currentAccount).filterPremiumStickers(this.S);
            this.S = filterPremiumStickers;
            if (filterPremiumStickers == null) {
                dismiss();
            }
        }
    }

    public final void n0(TextView textView, String str, boolean z10) {
        if (z10) {
            textView.setText(LocaleController.getString(R.string.ImportStickersLinkAvailable));
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.f21150w6));
            this.f33440q0 = true;
            this.f33438o0 = str;
            return;
        }
        cf0 cf0Var = this.f33437n0;
        if (cf0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(cf0Var);
            this.f33437n0 = null;
            this.f33438o0 = null;
            if (this.f33439p0 != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f33439p0, true);
            }
        }
        if (TextUtils.isEmpty(str)) {
            textView.setText(LocaleController.getString(R.string.ImportStickersEnterUrlInfo));
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.f21040q5));
            return;
        }
        this.f33440q0 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                int length = str.length();
                for (int i10 = 0; i10 < length; i10++) {
                    char charAt = str.charAt(i10);
                    if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        textView.setText(LocaleController.getString(R.string.ImportStickersEnterUrlInfo));
                        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.f21022p7));
                        return;
                    }
                }
            } else {
                textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalid));
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.f21022p7));
                return;
            }
        }
        if (str != null && str.length() >= 5) {
            if (str.length() > 32) {
                textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalidLong));
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.f21022p7));
                return;
            }
            textView.setText(LocaleController.getString(R.string.ImportStickersLinkChecking));
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.F6));
            this.f33438o0 = str;
            cf0 cf0Var2 = new cf0(this, str, textView, 15);
            this.f33437n0 = cf0Var2;
            AndroidUtilities.runOnUIThread(cf0Var2, 300L);
            return;
        }
        textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalidShort));
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.f21022p7));
    }

    public final void o0() {
        if (!this.R) {
            return;
        }
        this.f33426e.e(null);
        this.R = false;
        this.f33435l0.E(true);
        AndroidUtilities.forEachViews((RecyclerView) this.f33423c, (Utilities.Callback<View>) new ai.i(14));
        this.f33436n.postDelayed(new jy0(this, 0), 200L);
        this.f33443s.c(LocaleController.getString(R.string.EditStickers), true, true);
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
    public final void onStart() {
        super.onStart();
        tc.a((FrameLayout) this.containerView, new ai.x4(this, 8));
    }

    @Override
    public final void onStop() {
        super.onStop();
        tc.h((FrameLayout) this.containerView);
    }

    public final void q0() {
        if (this.R) {
            return;
        }
        this.f33426e.e(this.f33423c);
        this.R = true;
        com.google.firebase.messaging.n nVar = this.f33435l0;
        char c10 = 0;
        nVar.E(false);
        float f7 = 0.0f;
        Float valueOf = Float.valueOf(0.0f);
        ArrayList arrayList = (ArrayList) nVar.d;
        if (arrayList.isEmpty()) {
            for (int i10 = 0; i10 < 6; i10++) {
                arrayList.add(valueOf);
                ((ArrayList) nVar.f7957e).add(valueOf);
                ((ArrayList) nVar.f7958f).add(valueOf);
            }
        }
        int i11 = 0;
        for (int i12 = 6; i11 < i12; i12 = 6) {
            long nextFloat = Utilities.random.nextFloat() * 300;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, -2.0f, 0.0f, 2.0f, 0.0f);
            ofFloat.addUpdateListener(new xy0(nVar, i11, 3));
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(1);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setCurrentPlayTime(nextFloat);
            long j3 = 300;
            ofFloat.setDuration(j3);
            ofFloat.start();
            char c11 = c10;
            float dp = AndroidUtilities.dp(0.5f);
            float f10 = f7;
            float[] fArr = new float[5];
            fArr[c11] = f10;
            fArr[1] = dp;
            fArr[2] = f10;
            fArr[3] = -dp;
            fArr[4] = f10;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr);
            ofFloat2.addUpdateListener(new xy0(nVar, i11, 4));
            ofFloat2.setRepeatCount(-1);
            ofFloat2.setRepeatMode(1);
            ofFloat2.setInterpolator(new LinearInterpolator());
            ofFloat2.setCurrentPlayTime(nextFloat);
            ofFloat2.setDuration((long) (300 * 1.2d));
            ofFloat2.start();
            float[] fArr2 = new float[4];
            fArr2[c11] = f10;
            fArr2[1] = dp;
            fArr2[2] = f10 - dp;
            fArr2[3] = f10;
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(fArr2);
            ofFloat3.addUpdateListener(new xy0(nVar, i11, 5));
            ofFloat3.setRepeatCount(-1);
            ofFloat3.setRepeatMode(1);
            ofFloat3.setInterpolator(new LinearInterpolator());
            ofFloat3.setCurrentPlayTime(nextFloat);
            ofFloat3.setDuration(j3);
            ofFloat3.start();
            ((ArrayList) nVar.f7954a).add(ofFloat);
            ((ArrayList) nVar.f7955b).add(ofFloat2);
            ((ArrayList) nVar.f7956c).add(ofFloat3);
            i11++;
            f7 = f10;
            c10 = c11;
        }
        AndroidUtilities.forEachViews((RecyclerView) this.f33423c, (Utilities.Callback<View>) new ai.i(15));
        this.f33436n.postDelayed(new jy0(this, 1), 200L);
        this.f33443s.c(LocaleController.getString(R.string.Done), true, true);
    }

    public final void r0() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f33447x, View.ALPHA, 0.0f));
        animatorSet.setDuration(200L);
        animatorSet.addListener(new wd0(this, 18));
        animatorSet.start();
    }

    public final void s0(Context context) {
        int i10;
        qy0 qy0Var = new qy0(this, context);
        this.containerView = qy0Var;
        qy0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i11, 0, i11, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(48.0f);
        View view = new View(context);
        View[] viewArr = this.J;
        viewArr[0] = view;
        int i12 = org.telegram.ui.ActionBar.i6.V5;
        view.setBackgroundColor(getThemedColor(i12));
        viewArr[0].setAlpha(0.0f);
        viewArr[0].setVisibility(4);
        viewArr[0].setTag(1);
        this.containerView.addView(viewArr[0], layoutParams);
        ai.w0 w0Var = new ai.w0(this, context, 23);
        this.f33423c = w0Var;
        w0Var.setTag(14);
        ai.w0 w0Var2 = this.f33423c;
        getContext();
        bi.l lVar = new bi.l(this);
        this.M = lVar;
        w0Var2.setLayoutManager(lVar);
        this.M.O = new ci.w1(this, 5);
        this.f33426e = new s4.z(new ry0(this));
        ai.w0 w0Var3 = this.f33423c;
        uy0 uy0Var = new uy0(this, context);
        this.d = uy0Var;
        w0Var3.setAdapter(uy0Var);
        this.f33423c.setVerticalScrollBarEnabled(false);
        this.f33423c.i(new ai.t(8));
        this.f33423c.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        this.f33423c.setClipToPadding(false);
        this.f33423c.setEnabled(true);
        this.f33423c.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.i6.A5));
        this.f33423c.setOnTouchListener(new wk(this, 6));
        this.f33423c.setOnScrollListener(new nh0(this, 6));
        j jVar = new j(this, 16);
        this.H = jVar;
        this.f33423c.setOnItemClickListener(jVar);
        this.containerView.addView(this.f33423c, w7.x5.a(-1.0f, 0.0f, 48.0f, 0.0f, 48.0f, -1, 51));
        ai.f0 f0Var = new ai.f0(this, context, 20);
        this.K = f0Var;
        this.containerView.addView(f0Var, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 48.0f, -1, 51));
        this.f33423c.setEmptyView(this.K);
        this.K.setOnTouchListener(new bi.d(24));
        fa0 fa0Var = new fa0(context, null);
        this.h = fa0Var;
        fa0Var.setLines(1);
        this.h.setSingleLine(true);
        this.h.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.f20909j5));
        this.h.setTextSize(1, 20.0f);
        this.h.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.f20928k5));
        this.h.setEllipsize(TextUtils.TruncateAt.END);
        this.h.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f));
        this.h.setGravity(16);
        this.h.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(this.h, w7.x5.a(50.0f, 0.0f, 0.0f, 40.0f, 0.0f, -1, 51));
        org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(context, null, 0, getThemedColor(org.telegram.ui.ActionBar.i6.Ji), false, this.resourcesProvider);
        this.f33436n = v0Var;
        v0Var.setLongClickEnabled(false);
        this.f33436n.setSubMenuOpenSide(2);
        this.f33436n.setIcon(R.drawable.ic_ab_other);
        this.f33436n.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.g0(getThemedColor(org.telegram.ui.ActionBar.i6.Ni), 1, -1));
        this.containerView.addView(this.f33436n, w7.x5.a(40.0f, 0.0f, 5.0f, 5.0f, 0.0f, 40, 53));
        this.f33436n.e(1, R.drawable.msg_share, LocaleController.getString(R.string.StickersShare));
        this.f33436n.e(2, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink));
        this.f33436n.setOnClickListener(new hy0(this, 1));
        this.f33436n.setDelegate(new iy0(this));
        this.f33436n.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        org.telegram.ui.ActionBar.v0 v0Var2 = this.f33436n;
        if (this.V != null) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        v0Var2.setVisibility(i10);
        this.K.addView(new RadialProgressView(context, null), w7.x5.e(-2, -2, 17));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams2.bottomMargin = AndroidUtilities.dp(48.0f);
        View view2 = new View(context);
        viewArr[1] = view2;
        view2.setBackgroundColor(getThemedColor(i12));
        this.containerView.addView(viewArr[1], layoutParams2);
        r6 r6Var = new r6(context, false, false, false);
        this.f33443s = r6Var;
        int i13 = org.telegram.ui.ActionBar.i6.f20872h5;
        int themedColor = getThemedColor(i13);
        int i14 = org.telegram.ui.ActionBar.i6.f20892i6;
        r6Var.setBackground(org.telegram.ui.ActionBar.i6.h0(themedColor, getThemedColor(i14)));
        r6 r6Var2 = this.f33443s;
        int i15 = org.telegram.ui.ActionBar.i6.f20985n5;
        this.f33434k0 = i15;
        r6Var2.setTextColor(getThemedColor(i15));
        this.f33443s.setTextSize(AndroidUtilities.dp(14.0f));
        this.f33443s.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        this.f33443s.setTypeface(AndroidUtilities.bold());
        this.f33443s.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f33446w = frameLayout;
        frameLayout.addView(this.f33443s, w7.x5.d(48.0f, -1));
        this.containerView.addView(this.f33446w, w7.x5.e(-1, -2, 83));
        rg.p0 p0Var = new rg.p0(AndroidUtilities.dp(24.0f), context, this.resourcesProvider, false);
        this.v = p0Var;
        p0Var.setIcon(R.raw.unlock_icon);
        this.v.setVisibility(4);
        this.containerView.addView(this.v, w7.x5.a(48.0f, 8.0f, 0.0f, 8.0f, 8.0f, -1, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f33447x = frameLayout2;
        frameLayout2.setVisibility(8);
        this.f33447x.setSoundEffectsEnabled(false);
        this.containerView.addView(this.f33447x, w7.x5.d(-1.0f, -1));
        this.f33447x.setOnClickListener(new hy0(this, 2));
        y9 y9Var = new y9(context);
        this.F = y9Var;
        y9Var.setAspectFit(true);
        this.F.setLayerNum(7);
        this.f33447x.addView(this.F);
        TextView textView = new TextView(context);
        this.G = textView;
        textView.setTextSize(1, 30.0f);
        this.G.setGravity(85);
        this.f33447x.addView(this.G);
        TextView textView2 = new TextView(context);
        this.f33448y = textView2;
        textView2.setTextSize(1, 14.0f);
        this.f33448y.setTextColor(getThemedColor(i15));
        this.f33448y.setBackground(org.telegram.ui.ActionBar.i6.h0(getThemedColor(i13), getThemedColor(i14)));
        this.f33448y.setGravity(17);
        this.f33448y.setPadding(AndroidUtilities.dp(29.0f), 0, AndroidUtilities.dp(29.0f), 0);
        this.f33448y.setTypeface(AndroidUtilities.bold());
        this.f33447x.addView(this.f33448y, w7.x5.e(-1, 48, 83));
        this.f33448y.setOnClickListener(new hy0(this, 3));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams3.bottomMargin = AndroidUtilities.dp(48.0f);
        View view3 = new View(context);
        this.E = view3;
        view3.setBackgroundColor(getThemedColor(i12));
        this.f33447x.addView(this.E, layoutParams3);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        if (this.X != null) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileUploaded);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileUploadFailed);
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
        C0();
        D0();
        B0();
        A0(false);
        this.d.l();
    }

    @Override
    public final void setOnDismissListener(Runnable runnable) {
        this.f33444s0 = runnable;
    }

    @Override
    public final void show() {
        super.show();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4);
    }

    public final boolean t0() {
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.S;
        if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.emojis) {
            if (tL_messages_stickerSet == null && this.Q) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void u0() {
        String str;
        if (this.V != null) {
            MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
            if (this.S == null && (str = this.V.short_name) != null) {
                this.S = mediaDataController.getStickerSetByName(str);
            }
            if (this.S == null) {
                this.S = mediaDataController.getStickerSetById(this.V.f20062id);
            }
            if (this.S == null) {
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                tL_messages_getStickerSet.stickerset = this.V;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getStickerSet, new org.telegram.ui.oo(14, this, mediaDataController));
            } else {
                if (this.d != null) {
                    D0();
                    C0();
                    this.d.l();
                }
                B0();
                mediaDataController.preloadStickerSetThumb(this.S);
                m0();
            }
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.S;
        if (tL_messages_stickerSet != null) {
            this.f33431h0 = !tL_messages_stickerSet.set.masks;
        }
        m0();
    }

    public final void v0(SendMessagesHelper.ImportingSticker importingSticker) {
        int indexOf = this.Y.indexOf(importingSticker);
        if (indexOf >= 0) {
            this.Y.remove(indexOf);
            this.d.u(indexOf);
            if (this.Y.isEmpty()) {
                dismiss();
            } else {
                C0();
            }
        }
    }

    public final void w0(int i10, boolean z10) {
        Integer num;
        float f7;
        if (this.W == null) {
            View[] viewArr = this.J;
            if ((z10 && viewArr[i10].getTag() != null) || (!z10 && viewArr[i10].getTag() == null)) {
                View view = viewArr[i10];
                if (z10) {
                    num = null;
                } else {
                    num = 1;
                }
                view.setTag(num);
                if (z10) {
                    viewArr[i10].setVisibility(0);
                }
                AnimatorSet[] animatorSetArr = this.I;
                AnimatorSet animatorSet = animatorSetArr[i10];
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSetArr[i10] = animatorSet2;
                View view2 = viewArr[i10];
                Property property = View.ALPHA;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                animatorSet2.playTogether(ObjectAnimator.ofFloat(view2, property, f7));
                animatorSetArr[i10].setDuration(150L);
                animatorSetArr[i10].addListener(new cb0(this, i10, z10, 1));
                animatorSetArr[i10].start();
            }
        }
    }

    public final void x0(View.OnClickListener onClickListener, String str, int i10) {
        y0(onClickListener, str, i10, -1, -1);
    }

    public final void y0(View.OnClickListener onClickListener, String str, int i10, int i11, int i12) {
        if (i10 >= 0) {
            r6 r6Var = this.f33443s;
            this.f33434k0 = i10;
            r6Var.setTextColor(getThemedColor(i10));
        }
        this.f33443s.c(str, false, true);
        this.f33443s.setOnClickListener(onClickListener);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f33443s.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.J[1].getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.f33423c.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.K.getLayoutParams();
        if (onClickListener == null) {
            this.f33443s.setAlpha(0.0f);
        } else if (i11 >= 0 && i12 >= 0) {
            r6 r6Var2 = this.f33443s;
            int dp = AndroidUtilities.dp(24.0f);
            int themedColor = getThemedColor(i11);
            int themedColor2 = getThemedColor(i12);
            r6Var2.setBackground(org.telegram.ui.ActionBar.i6.j0(dp, dp, dp, dp, themedColor, themedColor2, themedColor2));
            this.f33446w.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.i6.f20872h5));
            int dp2 = AndroidUtilities.dp(8.0f);
            marginLayoutParams.bottomMargin = dp2;
            marginLayoutParams.rightMargin = dp2;
            marginLayoutParams.topMargin = dp2;
            marginLayoutParams.leftMargin = dp2;
            int dp3 = AndroidUtilities.dp(64.0f);
            marginLayoutParams2.bottomMargin = dp3;
            marginLayoutParams3.bottomMargin = dp3;
            marginLayoutParams4.bottomMargin = dp3;
            if (this.f33443s.getAlpha() < 1.0f) {
                org.telegram.messenger.bi.t(this.f33443s.animate().alpha(1.0f), is.h, 240L);
            }
        } else {
            this.f33443s.setBackground(org.telegram.ui.ActionBar.i6.h0(getThemedColor(org.telegram.ui.ActionBar.i6.f20872h5), org.telegram.ui.ActionBar.i6.m1(0.1f, getThemedColor(org.telegram.ui.ActionBar.i6.f21041q7))));
            this.f33446w.setBackgroundColor(0);
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.rightMargin = 0;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.leftMargin = 0;
            int dp4 = AndroidUtilities.dp(48.0f);
            marginLayoutParams2.bottomMargin = dp4;
            marginLayoutParams3.bottomMargin = dp4;
            marginLayoutParams4.bottomMargin = dp4;
            if (this.f33443s.getAlpha() < 1.0f) {
                org.telegram.messenger.bi.t(this.f33443s.animate().alpha(1.0f), is.h, 240L);
            }
        }
        this.containerView.requestLayout();
    }

    public final void z0(int i10) {
        this.f33427e0 = i10;
        if (this.W == null) {
            float f7 = i10;
            this.h.setTranslationY(f7);
            if (this.X == null) {
                this.f33436n.setTranslationY(f7);
            }
            this.J[0].setTranslationY(f7);
        }
        this.containerView.invalidate();
    }

    public yy0(Context context, String str, ArrayList arrayList, ArrayList arrayList2) {
        super(1, context, (org.telegram.ui.ActionBar.e6) null, false);
        this.I = new AnimatorSet[2];
        this.J = new View[2];
        this.f33433j0 = true;
        this.f33435l0 = new com.google.firebase.messaging.n(6);
        this.m0 = new ny0(this);
        fixNavigationBar();
        this.N = (Activity) context;
        this.X = arrayList;
        this.f33420a0 = str;
        Utilities.globalQueue.postRunnable(new cf0(this, arrayList, arrayList2, 16));
        s0(context);
    }

    public yy0(Context context, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.InputStickerSet inputStickerSet, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, vy0 vy0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, false);
        this.I = new AnimatorSet[2];
        this.J = new View[2];
        this.f33433j0 = true;
        this.f33435l0 = new com.google.firebase.messaging.n(6);
        this.m0 = new ny0(this);
        fixNavigationBar();
        this.f33422b0 = vy0Var;
        this.V = inputStickerSet;
        this.S = tL_messages_stickerSet;
        this.L = n2Var;
        u0();
        s0(context);
    }
}
