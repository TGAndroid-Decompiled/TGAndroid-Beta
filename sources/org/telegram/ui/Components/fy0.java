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
public class fy0 extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f24285u0 = 0;
    public View E;
    public w9 F;
    public TextView G;
    public j H;
    public final AnimatorSet[] I;
    public final View[] J;
    public ai.f0 K;
    public final org.telegram.ui.ActionBar.m2 L;
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
    public final String f24286a0;
    public Pattern f24287b;
    public final cy0 f24288b0;
    public ai.w0 f24289c;
    public dy0 f24290c0;
    public by0 d;
    public org.telegram.ui.j70 f24291d0;
    public s4.y e;
    public int f24292e0;
    public TLRPC.Document f24293f;
    public int f24294f0;
    public boolean f24295g0;
    public n90 h;
    public boolean f24296h0;
    public boolean f24297i0;
    public boolean f24298j0;
    public int f24299k0;
    public final com.google.firebase.messaging.n f24300l0;
    public final ux0 m0;
    public org.telegram.ui.ActionBar.u0 f24301n;
    public cn0 f24302n0;
    public String f24303o0;
    public int f24304p0;
    public boolean f24305q0;
    public org.telegram.ui.ActionBar.e1 f24306r;
    public String f24307r0;
    public p6 f24308s;
    public Runnable f24309s0;
    public ArrayList f24310t0;
    public rg.p0 v;
    public FrameLayout f24311w;
    public FrameLayout f24312x;
    public TextView f24313y;

    public fy0(Context context, Object obj, TLObject tLObject, org.telegram.ui.ActionBar.d6 d6Var) {
        super(1, context, d6Var, false);
        this.I = new AnimatorSet[2];
        this.J = new View[2];
        this.f24298j0 = true;
        this.f24300l0 = new com.google.firebase.messaging.n(6);
        this.m0 = new ux0(this);
        this.resourcesProvider = d6Var;
        fixNavigationBar();
        this.N = (Activity) context;
        TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = new TLRPC.TL_messages_getAttachedStickers();
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.Photo photo = (TLRPC.Photo) tLObject;
            TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = new TLRPC.TL_inputStickeredMediaPhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_inputStickeredMediaPhoto.f18406id = tL_inputPhoto;
            tL_inputPhoto.f18355id = photo.f18360id;
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
            tL_inputStickeredMediaDocument.f18405id = tL_inputDocument;
            tL_inputDocument.f18348id = document.f18342id;
            tL_inputDocument.access_hash = document.access_hash;
            byte[] bArr2 = document.file_reference;
            tL_inputDocument.file_reference = bArr2;
            if (bArr2 == null) {
                tL_inputDocument.file_reference = new byte[0];
            }
            tL_messages_getAttachedStickers.media = tL_inputStickeredMediaDocument;
        }
        org.telegram.ui.js0 js0Var = (org.telegram.ui.js0) this;
        this.f24294f0 = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getAttachedStickers, new ai.p3(js0Var, obj, tL_messages_getAttachedStickers, new org.telegram.ui.lo(15, js0Var, tL_messages_getAttachedStickers), 7));
        r0(context);
    }

    public static void A(fy0 fy0Var) {
        fy0Var.dismiss();
        dy0 dy0Var = fy0Var.f24290c0;
        if (dy0Var != null) {
            dy0Var.a();
        }
        if (fy0Var.V != null && !MediaDataController.getInstance(fy0Var.currentAccount).cancelRemovingStickerSet(fy0Var.V.f18356id)) {
            TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
            tL_messages_installStickerSet.stickerset = fy0Var.V;
            ConnectionsManager.getInstance(fy0Var.currentAccount).sendRequest(tL_messages_installStickerSet, new y1(fy0Var, 13));
        }
    }

    public static void B(fy0 fy0Var, int i10) {
        String str;
        org.telegram.ui.ActionBar.m2 m2Var = fy0Var.L;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = fy0Var.S;
        if (tL_messages_stickerSet != null) {
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet != null && stickerSet.emojis) {
                str = "https://" + MessagesController.getInstance(fy0Var.currentAccount).linkPrefix + "/addemoji/" + fy0Var.S.set.short_name;
            } else {
                str = "https://" + MessagesController.getInstance(fy0Var.currentAccount).linkPrefix + "/addstickers/" + fy0Var.S.set.short_name;
            }
            String str2 = str;
            if (i10 == 1) {
                Context context = fy0Var.N;
                if (context == null && m2Var != null) {
                    context = m2Var.getParentActivity();
                }
                if (context == null) {
                    context = fy0Var.getContext();
                }
                sx0 sx0Var = new sx0(fy0Var, context, str2, str2, fy0Var.resourcesProvider);
                if (m2Var != null) {
                    m2Var.showDialog(sx0Var);
                    if (m2Var instanceof org.telegram.ui.wn) {
                        sx0Var.setCalcMandatoryInsets(((org.telegram.ui.wn) m2Var).x9());
                        return;
                    }
                    return;
                }
                sx0Var.show();
            } else if (i10 == 2) {
                try {
                    AndroidUtilities.addToClipboard(str2);
                    new xc((FrameLayout) fy0Var.containerView, fy0Var.resourcesProvider).k(false).j();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else if (i10 == 3) {
                if (fy0Var.R) {
                    fy0Var.n0();
                } else {
                    fy0Var.p0();
                }
            } else if (i10 == 4) {
                ly0.c(fy0Var.S.set, fy0Var.resourcesProvider, fy0Var.getContext(), new d(fy0Var, 20));
            } else if (i10 == 5) {
                ly0.b(fy0Var.S.set, fy0Var.resourcesProvider, fy0Var.getContext(), new qx0(fy0Var, 2));
            }
        }
    }

    public static void E(fy0 fy0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        int i10;
        org.telegram.ui.ActionBar.m2 m2Var = fy0Var.L;
        TLRPC.StickerSet stickerSet = fy0Var.S.set;
        if (stickerSet.masks) {
            i10 = 1;
        } else if (stickerSet.emojis) {
            i10 = 5;
        } else {
            i10 = 0;
        }
        try {
            if (tL_error == null) {
                if (fy0Var.f24298j0) {
                    qc.g(m2Var, new kx0(fy0Var.f24311w.getContext(), fy0Var.S, 1, 2, null, fy0Var.resourcesProvider), 1500).j();
                }
                if (tLObject instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                    MediaDataController.getInstance(fy0Var.currentAccount).processStickerSetInstallResultArchive(m2Var, true, i10, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject);
                }
            } else {
                Toast.makeText(fy0Var.getContext(), LocaleController.getString(R.string.ErrorOccurred), 0).show();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        MediaDataController.getInstance(fy0Var.currentAccount).loadStickers(i10, false, true);
    }

    public static void F(fy0 fy0Var, TLRPC.TL_error tL_error, TLObject tLObject, MediaDataController mediaDataController) {
        TLRPC.StickerSet stickerSet;
        boolean z10 = false;
        fy0Var.f24294f0 = 0;
        if (tL_error == null) {
            qm0 qm0Var = new qm0(fy0Var, 1);
            qm0Var.addTarget(fy0Var.containerView);
            TransitionManager.beginDelayedTransition(fy0Var.container, qm0Var);
            fy0Var.f24301n.setVisibility(0);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            fy0Var.S = tL_messages_stickerSet;
            mediaDataController.putStickerSet(tL_messages_stickerSet, false);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = fy0Var.S;
            if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.documents.isEmpty()) {
                fy0Var.dismiss();
                return;
            }
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = fy0Var.S;
            if (tL_messages_stickerSet3 != null && (stickerSet = tL_messages_stickerSet3.set) != null && !stickerSet.masks) {
                z10 = true;
            }
            fy0Var.f24296h0 = z10;
            fy0Var.l0();
            mediaDataController.preloadStickerSetThumb(fy0Var.S);
            fy0Var.C0();
            fy0Var.B0();
            fy0Var.A0();
            fy0Var.d.l();
            return;
        }
        fy0Var.dismiss();
        org.telegram.ui.ActionBar.m2 m2Var = fy0Var.L;
        if (m2Var != null) {
            org.telegram.messenger.ok.p(R.string.AddStickersNotFound, xc.a0(m2Var), null);
        }
    }

    public static void G(fy0 fy0Var, String str, TextView textView) {
        TLRPC.TL_stickers_checkShortName tL_stickers_checkShortName = new TLRPC.TL_stickers_checkShortName();
        tL_stickers_checkShortName.short_name = str;
        fy0Var.f24304p0 = ConnectionsManager.getInstance(fy0Var.currentAccount).sendRequest(tL_stickers_checkShortName, new ai.s5(fy0Var, str, textView, 12), 2);
    }

    public static void H(fy0 fy0Var) {
        boolean z10;
        TLRPC.StickerSet stickerSet;
        MediaDataController mediaDataController = MediaDataController.getInstance(fy0Var.currentAccount);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = fy0Var.S;
        if (tL_messages_stickerSet != null && mediaDataController.isStickerPackInstalled(tL_messages_stickerSet.set.f18363id)) {
            z10 = false;
        } else {
            z10 = true;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = fy0Var.S;
        if (tL_messages_stickerSet2 != null && (stickerSet = tL_messages_stickerSet2.set) != null && stickerSet.creator && fy0Var.f24306r == null) {
            fy0Var.f24301n.e(3, R.drawable.tabs_reorder, LocaleController.getString(R.string.StickersReorder));
            fy0Var.f24301n.e(4, R.drawable.msg_edit, LocaleController.getString(R.string.EditName));
            if (z10) {
                fy0Var.f24306r = fy0Var.f24301n.e(5, R.drawable.msg_delete, LocaleController.getString(R.string.Delete));
            } else {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, fy0Var.getContext(), fy0Var.resourcesProvider);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
                org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, fy0Var.resourcesProvider).setOnClickListener(new ox0(fy0Var, 4));
                org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.StickersDeleteForEveryone), false, fy0Var.resourcesProvider);
                int themedColor = fy0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19299q7);
                c10.c(themedColor, themedColor);
                c10.setSelectorColor(org.telegram.ui.ActionBar.h6.l1(0.1f, themedColor));
                org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.StickersRemoveForMe), false, fy0Var.resourcesProvider).setOnClickListener(new ox0(fy0Var, 6));
                c10.setOnClickListener(new ox0(fy0Var, 7));
                fy0Var.f24306r = fy0Var.f24301n.i(R.drawable.msg_delete, null, LocaleController.getString(R.string.Delete), actionBarPopupWindow$ActionBarPopupWindowLayout);
            }
            fy0Var.f24301n.a(-1);
            fb0 fb0Var = new fb0(fy0Var.currentAccount, fy0Var.getContext(), fy0Var.resourcesProvider, new ArrayList(), 4);
            fb0Var.setOnClickListener(new ox0(fy0Var, 8));
            fb0Var.setTag(R.id.fit_width_tag, 1);
            org.telegram.ui.ActionBar.u0 u0Var = fy0Var.f24301n;
            u0Var.o();
            u0Var.f19789b.a(fb0Var, new LinearLayout.LayoutParams(-1, -2));
            int themedColor2 = fy0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19299q7);
            fy0Var.f24306r.c(themedColor2, themedColor2);
            fy0Var.f24306r.setSelectorColor(org.telegram.ui.ActionBar.h6.l1(0.1f, themedColor2));
            if (fy0Var.f24306r.getRightIcon() != null) {
                fy0Var.f24306r.getRightIcon().setColorFilter(themedColor2);
            }
        }
        if (fy0Var.f24301n.getPopupLayout() != null) {
            fy0Var.f24301n.getPopupLayout().requestLayout();
        }
        fy0Var.f24301n.M(null, null);
    }

    public static void O(fy0 fy0Var) {
        if (fy0Var.f24289c.getChildCount() <= 0) {
            fy0Var.y0(fy0Var.f24289c.getPaddingTop());
            return;
        }
        int i10 = 0;
        View view = null;
        int i11 = -1;
        for (int i12 = 0; i12 < fy0Var.f24289c.getChildCount(); i12++) {
            View childAt = fy0Var.f24289c.getChildAt(i12);
            fy0Var.f24289c.getClass();
            int R = RecyclerView.R(childAt);
            if (i11 == -1 || i11 > R) {
                view = childAt;
                i11 = R;
            }
        }
        if (view != null && view.getTop() >= 0) {
            int top = view.getTop();
            fy0Var.v0(0, false);
            i10 = top;
        } else {
            fy0Var.v0(0, true);
        }
        fy0Var.v0(1, true);
        if (fy0Var.f24292e0 != i10) {
            fy0Var.y0(i10);
        }
    }

    public static void m(fy0 fy0Var, View view, int i10) {
        TLRPC.StickerSet stickerSet;
        String str;
        if (view instanceof zx0) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = fy0Var.S;
            org.telegram.ui.ActionBar.m2 m2Var = fy0Var.L;
            org.telegram.ui.ActionBar.d6 d6Var = fy0Var.resourcesProvider;
            if (m2Var != null) {
                Context context = m2Var.getContext();
                if (!(m2Var instanceof org.telegram.ui.wn)) {
                    ly0.a(tL_messages_stickerSet, m2Var, d6Var);
                    return;
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert3, 0, context, d6Var);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                arrayList.add(LocaleController.getString(R.string.StickersCreateNewSticker));
                org.telegram.ui.Cells.c1.m(R.drawable.menu_sticker_add, 0, arrayList3, arrayList2);
                arrayList.add(LocaleController.getString(R.string.StickersAddAnExistingSticker));
                arrayList3.add(Integer.valueOf(R.drawable.menu_sticker_select));
                arrayList2.add(1);
                org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                ai.s0 s0Var = new ai.s0(m1Var, arrayList2, tL_messages_stickerSet, m2Var, d6Var, 11);
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, ((Integer) arrayList3.get(i11)).intValue(), (CharSequence) arrayList.get(i11), false, d6Var);
                    c10.setTag(Integer.valueOf(i11));
                    c10.setOnClickListener(s0Var);
                }
                m1Var.f19636c = 100;
                m1Var.f19638g = true;
                m1Var.setOutsideTouchable(true);
                m1Var.setClippingEnabled(true);
                m1Var.setAnimationStyle(R.style.PopupContextAnimation);
                m1Var.setFocusable(true);
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                m1Var.setInputMethodMode(2);
                m1Var.getContentView().setFocusableInTouchMode(true);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                m1Var.showAtLocation(view, 0, ((view.getMeasuredWidth() / 2) + iArr[0]) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() / 2), ((view.getMeasuredHeight() / 2) + iArr[1]) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() / 2));
                m1Var.b();
            }
        } else if (!fy0Var.R) {
            if (fy0Var.W != null) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) fy0Var.d.f23123f.get(i10);
                if (stickerSetCovered != null) {
                    fy0Var.dismiss();
                    TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                    TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
                    tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                    tL_inputStickerSetID.f18356id = stickerSet2.f18363id;
                    new fy0(fy0Var.N, fy0Var.L, tL_inputStickerSetID, null, null, fy0Var.resourcesProvider).show();
                    return;
                }
                return;
            }
            ArrayList arrayList4 = fy0Var.Y;
            if (arrayList4 != null) {
                if (i10 >= 0 && i10 < arrayList4.size()) {
                    SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) fy0Var.Y.get(i10);
                    fy0Var.U = importingSticker;
                    if (importingSticker.validated) {
                        TextView textView = fy0Var.G;
                        textView.setText(Emoji.replaceEmoji(importingSticker.emoji, textView.getPaint().getFontMetricsInt(), false));
                        w9 w9Var = fy0Var.F;
                        ImageLocation forPath = ImageLocation.getForPath(fy0Var.U.path);
                        if (fy0Var.U.animated) {
                            str = "tgs";
                        } else {
                            str = null;
                        }
                        w9Var.m(forPath, null, null, null, null, str, 0, null);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) fy0Var.f24312x.getLayoutParams();
                        layoutParams.topMargin = fy0Var.f24292e0;
                        fy0Var.f24312x.setLayoutParams(layoutParams);
                        fy0Var.f24312x.setVisibility(0);
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ObjectAnimator.ofFloat(fy0Var.f24312x, View.ALPHA, 0.0f, 1.0f));
                        animatorSet.setDuration(200L);
                        animatorSet.start();
                        return;
                    }
                    return;
                }
                return;
            }
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = fy0Var.S;
            if (tL_messages_stickerSet2 != null && i10 >= 0 && i10 < tL_messages_stickerSet2.documents.size()) {
                fy0Var.T = fy0Var.S.documents.get(i10);
                int i12 = 0;
                while (true) {
                    if (i12 >= fy0Var.T.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = fy0Var.T.attributes.get(i12);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                        String str2 = documentAttribute.alt;
                        if (str2 != null && str2.length() > 0) {
                            TextView textView2 = fy0Var.G;
                            textView2.setText(Emoji.replaceEmoji(documentAttribute.alt, textView2.getPaint().getFontMetricsInt(), false));
                        }
                    } else {
                        i12++;
                    }
                }
                fy0Var.G.setText(Emoji.replaceEmoji(MediaDataController.getInstance(fy0Var.currentAccount).getEmojiForSticker(fy0Var.T.f18342id), fy0Var.G.getPaint().getFontMetricsInt(), false));
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = fy0Var.S;
                if ((tL_messages_stickerSet3 == null || (stickerSet = tL_messages_stickerSet3.set) == null || !stickerSet.emojis) && !org.telegram.ui.nt.q().y(view)) {
                    fy0Var.F.getImageReceiver().setImage(ImageLocation.getForDocument(fy0Var.T), (String) null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(fy0Var.T.thumbs, 90), fy0Var.T), (String) null, "webp", fy0Var.S, 1);
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) fy0Var.f24312x.getLayoutParams();
                    layoutParams2.topMargin = fy0Var.f24292e0;
                    fy0Var.f24312x.setLayoutParams(layoutParams2);
                    fy0Var.f24312x.setVisibility(0);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(fy0Var.f24312x, View.ALPHA, 0.0f, 1.0f));
                    animatorSet2.setDuration(200L);
                    animatorSet2.start();
                }
            }
        }
    }

    public static void n(fy0 fy0Var) {
        fy0Var.f24301n.n();
        ly0.b(fy0Var.S.set, fy0Var.resourcesProvider, fy0Var.getContext(), new qx0(fy0Var, 4));
    }

    public static void o(org.telegram.ui.js0 js0Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers) {
        js0Var.f24294f0 = 0;
        if (tL_error == null && (tLObject instanceof Vector)) {
            Vector vector = (Vector) tLObject;
            if (vector.objects.isEmpty()) {
                js0Var.dismiss();
                return;
            } else if (vector.objects.size() == 1) {
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                js0Var.V = tL_inputStickerSetID;
                TLRPC.StickerSet stickerSet = ((TLRPC.StickerSetCovered) vector.objects.get(0)).set;
                tL_inputStickerSetID.f18356id = stickerSet.f18363id;
                tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                js0Var.t0();
                return;
            } else {
                ArrayList arrayList = new ArrayList();
                js0Var.W = arrayList;
                arrayList.addAll(vector.objects);
                js0Var.f24289c.setLayoutParams(w7.y5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
                js0Var.h.setVisibility(8);
                js0Var.J[0].setVisibility(8);
                js0Var.d.l();
                return;
            }
        }
        e5.f0(js0Var.currentAccount, tL_error, js0Var.L, tL_messages_getAttachedStickers, new Object[0]);
        js0Var.dismiss();
    }

    public static void o0(org.telegram.ui.ActionBar.m2 m2Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, TLRPC.Document document) {
        org.telegram.ui.wn wnVar;
        boolean z10;
        TLRPC.StickerSet stickerSet;
        if (m2Var != null) {
            if (m2Var instanceof org.telegram.ui.wn) {
                wnVar = (org.telegram.ui.wn) m2Var;
            } else {
                wnVar = null;
            }
            org.telegram.ui.wn wnVar2 = wnVar;
            if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.creator) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (MessageObject.isStaticStickerDocument(document)) {
                ArrayList arrayList = new ArrayList();
                File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true);
                if (pathToAttach != null && pathToAttach.exists()) {
                    AndroidUtilities.runOnUIThread(new hg.s0(pathToAttach, arrayList, m2Var, wnVar2, document, z10, tL_messages_stickerSet), 300L);
                    return;
                }
                return;
            }
            AndroidUtilities.runOnUIThread(new ci.u1((Object) m2Var, (Object) tL_messages_stickerSet, (Object) document, (Object) wnVar2, z10, 19), 300L);
        }
    }

    public static void p(org.telegram.ui.js0 js0Var, Object obj, TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers, org.telegram.ui.lo loVar, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && obj != null) {
            FileRefController.getInstance(js0Var.currentAccount).requestReference(obj, tL_messages_getAttachedStickers, loVar);
        } else {
            loVar.run(tLObject, tL_error);
        }
    }

    public static void q(fy0 fy0Var) {
        fy0Var.dismiss();
        MediaDataController.getInstance(fy0Var.currentAccount).toggleStickerSet(fy0Var.getContext(), fy0Var.S, 0, fy0Var.L, true, fy0Var.f24298j0);
    }

    public static void r(fy0 fy0Var) {
        fy0Var.f24301n.n();
        fy0Var.dismiss();
        MediaDataController.getInstance(fy0Var.currentAccount).toggleStickerSet(fy0Var.getContext(), fy0Var.S, 1, fy0Var.L, true, true);
    }

    public static void s(fy0 fy0Var) {
        fy0Var.dismiss();
        MediaDataController.getInstance(fy0Var.currentAccount).toggleStickerSet(fy0Var.getContext(), fy0Var.S, 1, fy0Var.L, false, false);
    }

    public static void t(fy0 fy0Var) {
        fy0Var.dismiss();
        MediaDataController.getInstance(fy0Var.currentAccount).toggleStickerSet(fy0Var.getContext(), fy0Var.S, 1, fy0Var.L, false, false);
    }

    public static boolean v(fy0 fy0Var, MotionEvent motionEvent) {
        if (fy0Var.R) {
            return false;
        }
        return org.telegram.ui.nt.q().s(motionEvent, fy0Var.f24289c, fy0Var.H, fy0Var.m0, fy0Var.resourcesProvider);
    }

    public static void w(fy0 fy0Var, ArrayList arrayList, Boolean bool) {
        fy0Var.Y = arrayList;
        if (arrayList.isEmpty()) {
            fy0Var.dismiss();
            return;
        }
        fy0Var.d.l();
        if (bool.booleanValue()) {
            fy0Var.Z = new HashMap();
            int size = fy0Var.Y.size();
            for (int i10 = 0; i10 < size; i10++) {
                SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) fy0Var.Y.get(i10);
                fy0Var.Z.put(importingSticker.path, importingSticker);
                FileLoader.getInstance(fy0Var.currentAccount).uploadFile(importingSticker.path, false, true, 67108864);
            }
        }
        fy0Var.B0();
    }

    public static void x(fy0 fy0Var, int[] iArr, EditTextBoldCursor editTextBoldCursor, TextView textView, TextView textView2, AlertDialog$Builder alertDialog$Builder) {
        int i10 = iArr[0];
        if (i10 != 1) {
            if (i10 == 0) {
                iArr[0] = 1;
                TLRPC.TL_stickers_suggestShortName tL_stickers_suggestShortName = new TLRPC.TL_stickers_suggestShortName();
                String obj = editTextBoldCursor.getText().toString();
                fy0Var.f24307r0 = obj;
                tL_stickers_suggestShortName.title = obj;
                ConnectionsManager.getInstance(fy0Var.currentAccount).sendRequest(tL_stickers_suggestShortName, new ci.hd(fy0Var, editTextBoldCursor, textView, textView2, iArr));
            } else if (i10 == 2) {
                iArr[0] = 3;
                if (!fy0Var.f24305q0) {
                    AndroidUtilities.shakeView(editTextBoldCursor);
                    try {
                        editTextBoldCursor.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                SendMessagesHelper.getInstance(fy0Var.currentAccount).prepareImportStickers(fy0Var.f24307r0, fy0Var.f24303o0, fy0Var.f24286a0, fy0Var.Y, new px0(fy0Var));
                alertDialog$Builder.f18662a.L0.run();
                fy0Var.dismiss();
            }
        }
    }

    public static void z(fy0 fy0Var) {
        fy0Var.dismiss();
        MediaDataController.getInstance(fy0Var.currentAccount).toggleStickerSet(fy0Var.getContext(), fy0Var.S, 1, fy0Var.L, true, fy0Var.f24298j0);
    }

    public final void A0() {
        if (this.containerView != null && !UserConfig.getInstance(this.currentAccount).isPremium()) {
            MessageObject.isPremiumEmojiPack(this.S);
        }
    }

    public final void B0() {
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
                if (this.f24287b == null) {
                    this.f24287b = Pattern.compile("@[a-zA-Z\\d_]{1,32}");
                }
                Matcher matcher = this.f24287b.matcher(replaceEmoji);
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
                    spannableStringBuilder.setSpan(new m4(replaceEmoji.subSequence(start + 1, end).toString(), 1, this), start, end, 0);
                }
                if (spannableStringBuilder != null) {
                    replaceEmoji = spannableStringBuilder;
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            this.h.setText(replaceEmoji);
            if (s0()) {
                int measuredWidth = this.f24289c.getMeasuredWidth();
                if (measuredWidth == 0) {
                    measuredWidth = AndroidUtilities.displaySize.x;
                }
                by0 by0Var = this.d;
                if (AndroidUtilities.isTablet()) {
                    f7 = 60.0f;
                } else {
                    f7 = 45.0f;
                }
                by0Var.d = Math.max(1, measuredWidth / AndroidUtilities.dp(f7));
            } else {
                this.d.d = 5;
            }
            this.M.y1(this.d.d);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.S;
            int i17 = -1;
            if (tL_messages_stickerSet2 != null && (stickerSet7 = tL_messages_stickerSet2.set) != null && stickerSet7.emojis && !UserConfig.getInstance(this.currentAccount).isPremium() && this.f24291d0 == null) {
                if (this.S.documents != null) {
                    for (int i18 = 0; i18 < this.S.documents.size(); i18++) {
                        if (!MessageObject.isFreeEmoji(this.S.documents.get(i18))) {
                            this.v.setVisibility(0);
                            this.f24308s.setBackground(null);
                            w0(null, null, -1);
                            this.v.a(LocaleController.getString(R.string.UnlockPremiumEmoji), new ox0(this, 0), false);
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
                    if (stickerSets.get(i19) != null && stickerSets.get(i19).set != null && stickerSets.get(i19).set.f18363id == this.S.set.f18363id) {
                        z11 = true;
                        break;
                    }
                }
                z11 = false;
                z10 = !z11;
            } else if (tL_messages_stickerSet3 != null && (stickerSet = tL_messages_stickerSet3.set) != null && mediaDataController.isStickerPackInstalled(stickerSet.f18363id)) {
                z10 = false;
            } else {
                z10 = true;
            }
            org.telegram.ui.j70 j70Var = this.f24291d0;
            if (j70Var != null) {
                ox0 ox0Var = new ox0(this, 5);
                boolean z12 = j70Var.f34674a;
                if (j70Var.f34676c.N) {
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
                boolean z13 = this.f24291d0.f34674a;
                if (z13) {
                    i13 = org.telegram.ui.ActionBar.h6.f19299q7;
                } else {
                    i13 = org.telegram.ui.ActionBar.h6.Sh;
                }
                if (!z13) {
                    i14 = org.telegram.ui.ActionBar.h6.Oh;
                } else {
                    i14 = -1;
                }
                if (!z13) {
                    i17 = org.telegram.ui.ActionBar.h6.Qh;
                }
                x0(ox0Var, str, i13, i14, i17);
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
                    x0(null, "", -1, -1, -1);
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
                x0(new ox0(this, 9), formatPluralString2, org.telegram.ui.ActionBar.h6.Sh, org.telegram.ui.ActionBar.h6.Oh, org.telegram.ui.ActionBar.h6.Qh);
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
                    x0(new ox0(this, 10), formatPluralString, org.telegram.ui.ActionBar.h6.Sh, org.telegram.ui.ActionBar.h6.Oh, org.telegram.ui.ActionBar.h6.Qh);
                } else {
                    String str2 = formatPluralString;
                    if (this.S.set.official) {
                        w0(new ox0(this, 11), str2, org.telegram.ui.ActionBar.h6.f19299q7);
                    } else {
                        w0(new ox0(this, 12), str2, org.telegram.ui.ActionBar.h6.f19299q7);
                    }
                }
            }
            this.d.l();
            return;
        }
        ArrayList arrayList5 = this.X;
        if (arrayList5 != null) {
            n90 n90Var = this.h;
            ArrayList arrayList6 = this.Y;
            if (arrayList6 != null) {
                size = arrayList6.size();
            } else {
                size = arrayList5.size();
            }
            n90Var.setText(LocaleController.formatPluralString("Stickers", size, new Object[0]));
            HashMap hashMap = this.Z;
            if (hashMap != null && !hashMap.isEmpty()) {
                w0(null, LocaleController.getString(R.string.ImportStickersProcessing), org.telegram.ui.ActionBar.h6.f19298q5);
                this.f24308s.setEnabled(false);
                return;
            }
            ox0 ox0Var2 = new ox0(this, 13);
            int i20 = R.string.ImportStickers;
            ArrayList arrayList7 = this.Y;
            if (arrayList7 != null) {
                size2 = arrayList7.size();
            } else {
                size2 = arrayList5.size();
            }
            w0(ox0Var2, LocaleController.formatString("ImportStickers", i20, LocaleController.formatPluralString("Stickers", size2, new Object[0])), org.telegram.ui.ActionBar.h6.f19243n5);
            this.f24308s.setEnabled(true);
            return;
        }
        w0(new ox0(this, 14), LocaleController.getString(R.string.Close), org.telegram.ui.ActionBar.h6.f19243n5);
    }

    public final void C0() {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        Point point = AndroidUtilities.displaySize;
        int min = (int) ((Math.min(point.x, point.y) / 2) / AndroidUtilities.density);
        if (this.X != null) {
            this.f24313y.setText(LocaleController.getString(R.string.ImportStickersRemove));
            this.f24313y.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f19299q7));
            float f7 = min;
            this.F.setLayoutParams(w7.y5.d(min, f7, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.G.setLayoutParams(w7.y5.d(min, f7, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.f24313y.setVisibility(0);
            this.E.setVisibility(0);
        } else if (this.f24288b0 != null && ((tL_messages_stickerSet = this.S) == null || !tL_messages_stickerSet.set.masks)) {
            this.f24313y.setText(LocaleController.getString(R.string.SendSticker));
            float f10 = min;
            this.F.setLayoutParams(w7.y5.d(min, f10, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.G.setLayoutParams(w7.y5.d(min, f10, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.f24313y.setVisibility(0);
            this.E.setVisibility(0);
        } else {
            this.f24313y.setText(LocaleController.getString(R.string.Close));
            this.F.setLayoutParams(w7.y5.e(min, min, 17));
            this.G.setLayoutParams(w7.y5.e(min, min, 17));
            this.f24313y.setVisibility(8);
            this.E.setVisibility(8);
        }
    }

    public final void D0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.S = tL_messages_stickerSet;
        if (this.d != null) {
            C0();
            B0();
            this.d.l();
        }
        A0();
        MediaDataController.getInstance(this.currentAccount).preloadStickerSetThumb(this.S);
        l0();
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            ai.w0 w0Var = this.f24289c;
            if (w0Var != null) {
                int childCount = w0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    this.f24289c.getChildAt(i12).invalidate();
                }
            }
        } else if (i10 == NotificationCenter.fileUploaded) {
            HashMap hashMap = this.Z;
            if (hashMap != null) {
                String str = (String) objArr[0];
                SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) hashMap.get(str);
                if (importingSticker != null) {
                    importingSticker.uploadMedia(this.currentAccount, (TLRPC.InputFile) objArr[1], new cn0(this, str, importingSticker, 9));
                }
            }
        } else if (i10 == NotificationCenter.fileUploadFailed) {
            HashMap hashMap2 = this.Z;
            if (hashMap2 != null) {
                SendMessagesHelper.ImportingSticker importingSticker2 = (SendMessagesHelper.ImportingSticker) hashMap2.remove((String) objArr[0]);
                if (importingSticker2 != null) {
                    u0(importingSticker2);
                }
                if (this.Z.isEmpty()) {
                    B0();
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
                    tL_messages_stickerSet = mediaDataController.getStickerSetById(this.V.f18356id);
                }
            }
            if (tL_messages_stickerSet != null && tL_messages_stickerSet != this.S) {
                this.S = tL_messages_stickerSet;
                t0();
            }
            B0();
        }
    }

    @Override
    public void dismiss() {
        super.dismiss();
        this.f24300l0.E(false);
        Runnable runnable = this.f24309s0;
        if (runnable != null) {
            runnable.run();
        }
        if (this.f24294f0 != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f24294f0, true);
            this.f24294f0 = 0;
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
        y6 y6Var = new y6(this, 9);
        ViewGroup viewGroup = this.containerView;
        Drawable[] drawableArr = {this.shadowDrawable};
        int i10 = org.telegram.ui.ActionBar.h6.f19130h5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(viewGroup, 0, null, null, drawableArr, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.containerView, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Ii));
        fy0 fy0Var = this.d.f23125r;
        if (fy0Var.W != null) {
            org.telegram.ui.Cells.s3.a(arrayList, fy0Var.f24289c, y6Var);
        }
        View[] viewArr = this.J;
        View view = viewArr[0];
        int i11 = org.telegram.ui.ActionBar.h6.V5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(view, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(viewArr[1], 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f24289c, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.A5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f19166j5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 2, null, null, null, null, org.telegram.ui.ActionBar.h6.f19186k5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f24301n, 65568, null, null, null, null, org.telegram.ui.ActionBar.h6.Ni));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f24308s, 32, null, null, null, null, i10));
        p6 p6Var = this.f24308s;
        int i12 = org.telegram.ui.ActionBar.h6.f19149i6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(p6Var, 65568, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f24308s, 4, null, null, null, null, this.f24299k0));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f24313y, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f19243n5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f24313y, 32, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f24313y, 65568, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.E, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.h6.f19204l5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, y6Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.h6.Ji));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.h6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.h6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.h6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.h6.G8));
        return arrayList;
    }

    public final void l0() {
        if (this.S != null) {
            TLRPC.TL_messages_stickerSet filterPremiumStickers = MessagesController.getInstance(this.currentAccount).filterPremiumStickers(this.S);
            this.S = filterPremiumStickers;
            if (filterPremiumStickers == null) {
                dismiss();
            }
        }
    }

    public final void m0(TextView textView, String str, boolean z10) {
        if (z10) {
            textView.setText(LocaleController.getString(R.string.ImportStickersLinkAvailable));
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f19409w6));
            this.f24305q0 = true;
            this.f24303o0 = str;
            return;
        }
        cn0 cn0Var = this.f24302n0;
        if (cn0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(cn0Var);
            this.f24302n0 = null;
            this.f24303o0 = null;
            if (this.f24304p0 != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f24304p0, true);
            }
        }
        if (TextUtils.isEmpty(str)) {
            textView.setText(LocaleController.getString(R.string.ImportStickersEnterUrlInfo));
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f19298q5));
            return;
        }
        this.f24305q0 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                int length = str.length();
                for (int i10 = 0; i10 < length; i10++) {
                    char charAt = str.charAt(i10);
                    if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        textView.setText(LocaleController.getString(R.string.ImportStickersEnterUrlInfo));
                        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f19280p7));
                        return;
                    }
                }
            } else {
                textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalid));
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f19280p7));
                return;
            }
        }
        if (str != null && str.length() >= 5) {
            if (str.length() > 32) {
                textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalidLong));
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f19280p7));
                return;
            }
            textView.setText(LocaleController.getString(R.string.ImportStickersLinkChecking));
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.F6));
            this.f24303o0 = str;
            cn0 cn0Var2 = new cn0(this, str, textView, 12);
            this.f24302n0 = cn0Var2;
            AndroidUtilities.runOnUIThread(cn0Var2, 300L);
            return;
        }
        textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalidShort));
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f19280p7));
    }

    public final void n0() {
        if (!this.R) {
            return;
        }
        this.e.e(null);
        this.R = false;
        this.f24300l0.E(true);
        AndroidUtilities.forEachViews((RecyclerView) this.f24289c, (Utilities.Callback<View>) new ai.i(14));
        this.f24301n.postDelayed(new qx0(this, 0), 200L);
        this.f24308s.c(LocaleController.getString(R.string.EditStickers), true, true);
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
    public final void onStart() {
        super.onStart();
        qc.a((FrameLayout) this.containerView, new ai.w4(this, 8));
    }

    @Override
    public final void onStop() {
        super.onStop();
        qc.h((FrameLayout) this.containerView);
    }

    public final void p0() {
        if (this.R) {
            return;
        }
        this.e.e(this.f24289c);
        this.R = true;
        com.google.firebase.messaging.n nVar = this.f24300l0;
        nVar.E(false);
        Float valueOf = Float.valueOf(0.0f);
        ArrayList arrayList = (ArrayList) nVar.d;
        if (arrayList.isEmpty()) {
            for (int i10 = 0; i10 < 6; i10++) {
                arrayList.add(valueOf);
                ((ArrayList) nVar.e).add(valueOf);
                ((ArrayList) nVar.f7315f).add(valueOf);
            }
        }
        int i11 = 0;
        for (int i12 = 6; i11 < i12; i12 = 6) {
            long nextFloat = Utilities.random.nextFloat() * 300;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, -2.0f, 0.0f, 2.0f, 0.0f);
            ofFloat.addUpdateListener(new ey0(nVar, i11, 3));
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(1);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setCurrentPlayTime(nextFloat);
            long j3 = 300;
            ofFloat.setDuration(j3);
            ofFloat.start();
            float dp = AndroidUtilities.dp(0.5f);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, dp, 0.0f, -dp, 0.0f);
            ofFloat2.addUpdateListener(new ey0(nVar, i11, 4));
            ofFloat2.setRepeatCount(-1);
            ofFloat2.setRepeatMode(1);
            ofFloat2.setInterpolator(new LinearInterpolator());
            ofFloat2.setCurrentPlayTime(nextFloat);
            ofFloat2.setDuration((long) (300 * 1.2d));
            ofFloat2.start();
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, dp, 0.0f - dp, 0.0f);
            ofFloat3.addUpdateListener(new ey0(nVar, i11, 5));
            ofFloat3.setRepeatCount(-1);
            ofFloat3.setRepeatMode(1);
            ofFloat3.setInterpolator(new LinearInterpolator());
            ofFloat3.setCurrentPlayTime(nextFloat);
            ofFloat3.setDuration(j3);
            ofFloat3.start();
            ((ArrayList) nVar.f7312a).add(ofFloat);
            ((ArrayList) nVar.f7313b).add(ofFloat2);
            ((ArrayList) nVar.f7314c).add(ofFloat3);
            i11++;
        }
        AndroidUtilities.forEachViews((RecyclerView) this.f24289c, (Utilities.Callback<View>) new ai.i(15));
        this.f24301n.postDelayed(new qx0(this, 1), 200L);
        this.f24308s.c(LocaleController.getString(R.string.Done), true, true);
    }

    public final void q0() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f24312x, View.ALPHA, 0.0f));
        animatorSet.setDuration(200L);
        animatorSet.addListener(new fd0(this, 18));
        animatorSet.start();
    }

    public final void r0(Context context) {
        int i10;
        xx0 xx0Var = new xx0(this, context);
        this.containerView = xx0Var;
        xx0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i11, 0, i11, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(48.0f);
        View view = new View(context);
        View[] viewArr = this.J;
        viewArr[0] = view;
        int i12 = org.telegram.ui.ActionBar.h6.V5;
        view.setBackgroundColor(getThemedColor(i12));
        viewArr[0].setAlpha(0.0f);
        viewArr[0].setVisibility(4);
        viewArr[0].setTag(1);
        this.containerView.addView(viewArr[0], layoutParams);
        ai.w0 w0Var = new ai.w0(this, context, 23);
        this.f24289c = w0Var;
        w0Var.setTag(14);
        ai.w0 w0Var2 = this.f24289c;
        getContext();
        bi.l lVar = new bi.l(this);
        this.M = lVar;
        w0Var2.setLayoutManager(lVar);
        this.M.O = new ci.x1(this, 5);
        this.e = new s4.y(new yx0(this));
        ai.w0 w0Var3 = this.f24289c;
        by0 by0Var = new by0(this, context);
        this.d = by0Var;
        w0Var3.setAdapter(by0Var);
        this.f24289c.setVerticalScrollBarEnabled(false);
        this.f24289c.i(new ai.t(8));
        this.f24289c.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        this.f24289c.setClipToPadding(false);
        this.f24289c.setEnabled(true);
        this.f24289c.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.h6.A5));
        this.f24289c.setOnTouchListener(new wr(this, 5));
        this.f24289c.setOnScrollListener(new ug0(this, 6));
        j jVar = new j(this, 16);
        this.H = jVar;
        this.f24289c.setOnItemClickListener(jVar);
        this.containerView.addView(this.f24289c, w7.y5.d(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 48.0f));
        ai.f0 f0Var = new ai.f0(this, context, 20);
        this.K = f0Var;
        this.containerView.addView(f0Var, w7.y5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.f24289c.setEmptyView(this.K);
        this.K.setOnTouchListener(new bi.d(24));
        n90 n90Var = new n90(context, null);
        this.h = n90Var;
        n90Var.setLines(1);
        this.h.setSingleLine(true);
        this.h.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f19166j5));
        this.h.setTextSize(1, 20.0f);
        this.h.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f19186k5));
        this.h.setEllipsize(TextUtils.TruncateAt.END);
        this.h.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f));
        this.h.setGravity(16);
        this.h.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(this.h, w7.y5.d(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(context, null, 0, getThemedColor(org.telegram.ui.ActionBar.h6.Ji), false, this.resourcesProvider);
        this.f24301n = u0Var;
        u0Var.setLongClickEnabled(false);
        this.f24301n.setSubMenuOpenSide(2);
        this.f24301n.setIcon(R.drawable.ic_ab_other);
        this.f24301n.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.f0(getThemedColor(org.telegram.ui.ActionBar.h6.Ni), 1, -1));
        this.containerView.addView(this.f24301n, w7.y5.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
        this.f24301n.e(1, R.drawable.msg_share, LocaleController.getString(R.string.StickersShare));
        this.f24301n.e(2, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink));
        this.f24301n.setOnClickListener(new ox0(this, 1));
        this.f24301n.setDelegate(new px0(this));
        this.f24301n.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f24301n;
        if (this.V != null) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        u0Var2.setVisibility(i10);
        this.K.addView(new RadialProgressView(context, null), w7.y5.e(-2, -2, 17));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams2.bottomMargin = AndroidUtilities.dp(48.0f);
        View view2 = new View(context);
        viewArr[1] = view2;
        view2.setBackgroundColor(getThemedColor(i12));
        this.containerView.addView(viewArr[1], layoutParams2);
        p6 p6Var = new p6(context, false, false, false);
        this.f24308s = p6Var;
        int i13 = org.telegram.ui.ActionBar.h6.f19130h5;
        int themedColor = getThemedColor(i13);
        int i14 = org.telegram.ui.ActionBar.h6.f19149i6;
        p6Var.setBackground(org.telegram.ui.ActionBar.h6.g0(themedColor, getThemedColor(i14)));
        p6 p6Var2 = this.f24308s;
        int i15 = org.telegram.ui.ActionBar.h6.f19243n5;
        this.f24299k0 = i15;
        p6Var2.setTextColor(getThemedColor(i15));
        this.f24308s.setTextSize(AndroidUtilities.dp(14.0f));
        this.f24308s.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        this.f24308s.setTypeface(AndroidUtilities.bold());
        this.f24308s.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f24311w = frameLayout;
        frameLayout.addView(this.f24308s, w7.y5.c(48.0f, -1));
        this.containerView.addView(this.f24311w, w7.y5.e(-1, -2, 83));
        rg.p0 p0Var = new rg.p0(AndroidUtilities.dp(24.0f), context, this.resourcesProvider, false);
        this.v = p0Var;
        p0Var.setIcon(R.raw.unlock_icon);
        this.v.setVisibility(4);
        this.containerView.addView(this.v, w7.y5.d(-1, 48.0f, 87, 8.0f, 0.0f, 8.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f24312x = frameLayout2;
        frameLayout2.setVisibility(8);
        this.f24312x.setSoundEffectsEnabled(false);
        this.containerView.addView(this.f24312x, w7.y5.c(-1.0f, -1));
        this.f24312x.setOnClickListener(new ox0(this, 2));
        w9 w9Var = new w9(context);
        this.F = w9Var;
        w9Var.setAspectFit(true);
        this.F.setLayerNum(7);
        this.f24312x.addView(this.F);
        TextView textView = new TextView(context);
        this.G = textView;
        textView.setTextSize(1, 30.0f);
        this.G.setGravity(85);
        this.f24312x.addView(this.G);
        TextView textView2 = new TextView(context);
        this.f24313y = textView2;
        textView2.setTextSize(1, 14.0f);
        this.f24313y.setTextColor(getThemedColor(i15));
        this.f24313y.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(i13), getThemedColor(i14)));
        this.f24313y.setGravity(17);
        this.f24313y.setPadding(AndroidUtilities.dp(29.0f), 0, AndroidUtilities.dp(29.0f), 0);
        this.f24313y.setTypeface(AndroidUtilities.bold());
        this.f24312x.addView(this.f24313y, w7.y5.e(-1, 48, 83));
        this.f24313y.setOnClickListener(new ox0(this, 3));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams3.bottomMargin = AndroidUtilities.dp(48.0f);
        View view3 = new View(context);
        this.E = view3;
        view3.setBackgroundColor(getThemedColor(i12));
        this.f24312x.addView(this.E, layoutParams3);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        if (this.X != null) {
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
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.S;
        if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.emojis) {
            if (tL_messages_stickerSet == null && this.Q) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final void setOnDismissListener(Runnable runnable) {
        this.f24309s0 = runnable;
    }

    @Override
    public final void show() {
        super.show();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4);
    }

    public final void t0() {
        String str;
        if (this.V != null) {
            MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
            if (this.S == null && (str = this.V.short_name) != null) {
                this.S = mediaDataController.getStickerSetByName(str);
            }
            if (this.S == null) {
                this.S = mediaDataController.getStickerSetById(this.V.f18356id);
            }
            if (this.S == null) {
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                tL_messages_getStickerSet.stickerset = this.V;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getStickerSet, new org.telegram.ui.lo(14, this, mediaDataController));
            } else {
                if (this.d != null) {
                    C0();
                    B0();
                    this.d.l();
                }
                A0();
                mediaDataController.preloadStickerSetThumb(this.S);
                l0();
            }
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.S;
        if (tL_messages_stickerSet != null) {
            this.f24296h0 = !tL_messages_stickerSet.set.masks;
        }
        l0();
    }

    public final void u0(SendMessagesHelper.ImportingSticker importingSticker) {
        int indexOf = this.Y.indexOf(importingSticker);
        if (indexOf >= 0) {
            this.Y.remove(indexOf);
            this.d.u(indexOf);
            if (this.Y.isEmpty()) {
                dismiss();
            } else {
                B0();
            }
        }
    }

    public final void v0(int i10, boolean z10) {
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
                animatorSetArr[i10].addListener(new la0(this, i10, z10, 1));
                animatorSetArr[i10].start();
            }
        }
    }

    public final void w0(View.OnClickListener onClickListener, String str, int i10) {
        x0(onClickListener, str, i10, -1, -1);
    }

    public final void x0(View.OnClickListener onClickListener, String str, int i10, int i11, int i12) {
        if (i10 >= 0) {
            p6 p6Var = this.f24308s;
            this.f24299k0 = i10;
            p6Var.setTextColor(getThemedColor(i10));
        }
        this.f24308s.c(str, false, true);
        this.f24308s.setOnClickListener(onClickListener);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f24308s.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.J[1].getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.f24289c.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.K.getLayoutParams();
        if (onClickListener == null) {
            this.f24308s.setAlpha(0.0f);
        } else if (i11 >= 0 && i12 >= 0) {
            p6 p6Var2 = this.f24308s;
            int dp = AndroidUtilities.dp(24.0f);
            int themedColor = getThemedColor(i11);
            int themedColor2 = getThemedColor(i12);
            p6Var2.setBackground(org.telegram.ui.ActionBar.h6.i0(dp, dp, dp, dp, themedColor, themedColor2, themedColor2));
            this.f24311w.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.f19130h5));
            int dp2 = AndroidUtilities.dp(8.0f);
            marginLayoutParams.bottomMargin = dp2;
            marginLayoutParams.rightMargin = dp2;
            marginLayoutParams.topMargin = dp2;
            marginLayoutParams.leftMargin = dp2;
            int dp3 = AndroidUtilities.dp(64.0f);
            marginLayoutParams2.bottomMargin = dp3;
            marginLayoutParams3.bottomMargin = dp3;
            marginLayoutParams4.bottomMargin = dp3;
            if (this.f24308s.getAlpha() < 1.0f) {
                org.telegram.messenger.ok.s(this.f24308s.animate().alpha(1.0f), rr.h, 240L);
            }
        } else {
            this.f24308s.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(org.telegram.ui.ActionBar.h6.f19130h5), org.telegram.ui.ActionBar.h6.l1(0.1f, getThemedColor(org.telegram.ui.ActionBar.h6.f19299q7))));
            this.f24311w.setBackgroundColor(0);
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.rightMargin = 0;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.leftMargin = 0;
            int dp4 = AndroidUtilities.dp(48.0f);
            marginLayoutParams2.bottomMargin = dp4;
            marginLayoutParams3.bottomMargin = dp4;
            marginLayoutParams4.bottomMargin = dp4;
            if (this.f24308s.getAlpha() < 1.0f) {
                org.telegram.messenger.ok.s(this.f24308s.animate().alpha(1.0f), rr.h, 240L);
            }
        }
        this.containerView.requestLayout();
    }

    public final void y0(int i10) {
        this.f24292e0 = i10;
        if (this.W == null) {
            float f7 = i10;
            this.h.setTranslationY(f7);
            if (this.X == null) {
                this.f24301n.setTranslationY(f7);
            }
            this.J[0].setTranslationY(f7);
        }
        this.containerView.invalidate();
    }

    public final void z0(boolean z10) {
        fy0 fy0Var = this.d.f23125r;
        if (fy0Var.W != null) {
            int childCount = fy0Var.f24289c.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = fy0Var.f24289c.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.s3) {
                    ((org.telegram.ui.Cells.s3) childAt).d();
                }
            }
        }
        this.h.setHighlightColor(getThemedColor(org.telegram.ui.ActionBar.h6.f19204l5));
        this.f24312x.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.f19130h5) & (-536870913));
        this.f24301n.setIconColor(getThemedColor(org.telegram.ui.ActionBar.h6.Ji));
        this.f24301n.G(getThemedColor(org.telegram.ui.ActionBar.h6.E8), false);
        this.f24301n.G(getThemedColor(org.telegram.ui.ActionBar.h6.F8), true);
        this.f24301n.setPopupItemsSelectorColor(getThemedColor(org.telegram.ui.ActionBar.h6.I5));
        this.f24301n.B(getThemedColor(org.telegram.ui.ActionBar.h6.G8));
        if (this.f24306r != null) {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.f19299q7);
            this.f24306r.c(themedColor, themedColor);
            this.f24306r.setSelectorColor(org.telegram.ui.ActionBar.h6.l1(0.1f, themedColor));
            if (this.f24306r.getRightIcon() != null) {
                this.f24306r.getRightIcon().setColorFilter(themedColor);
            }
        }
        if (z10) {
            if (org.telegram.ui.ActionBar.h6.sl != null && this.f24310t0 == null) {
                ArrayList themeDescriptions = getThemeDescriptions();
                this.f24310t0 = themeDescriptions;
                int size = themeDescriptions.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((org.telegram.ui.ActionBar.j6) this.f24310t0.get(i11)).h = null;
                }
            }
            int size2 = this.f24310t0.size();
            for (int i12 = 0; i12 < size2; i12++) {
                org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) this.f24310t0.get(i12);
                j6Var.e(getThemedColor(j6Var.f19518f), false, false);
            }
        }
        if (org.telegram.ui.ActionBar.h6.sl == null && this.f24310t0 != null) {
            this.f24310t0 = null;
        }
    }

    public fy0(Context context, String str, ArrayList arrayList, ArrayList arrayList2) {
        super(1, context, (org.telegram.ui.ActionBar.d6) null, false);
        this.I = new AnimatorSet[2];
        this.J = new View[2];
        this.f24298j0 = true;
        this.f24300l0 = new com.google.firebase.messaging.n(6);
        this.m0 = new ux0(this);
        fixNavigationBar();
        this.N = (Activity) context;
        this.X = arrayList;
        this.f24286a0 = str;
        Utilities.globalQueue.postRunnable(new cn0((Object) this, (Object) arrayList, (Object) arrayList2, 13));
        r0(context);
    }

    public fy0(Context context, org.telegram.ui.ActionBar.m2 m2Var, TLRPC.InputStickerSet inputStickerSet, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, cy0 cy0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(1, context, d6Var, false);
        this.I = new AnimatorSet[2];
        this.J = new View[2];
        this.f24298j0 = true;
        this.f24300l0 = new com.google.firebase.messaging.n(6);
        this.m0 = new ux0(this);
        fixNavigationBar();
        this.f24288b0 = cy0Var;
        this.V = inputStickerSet;
        this.S = tL_messages_stickerSet;
        this.L = m2Var;
        t0();
        r0(context);
    }
}
