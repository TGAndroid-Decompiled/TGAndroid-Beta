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
public class ty0 extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f29500u0 = 0;
    public View E;
    public z9 F;
    public TextView G;
    public j H;
    public final AnimatorSet[] I;
    public final View[] J;
    public ah.x K;
    public final org.telegram.ui.ActionBar.m2 L;
    public ci.k M;
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
    public final String f29501a0;
    public Pattern f29502b;
    public final qy0 f29503b0;
    public bi.o0 f29504c;
    public ry0 f29505c0;
    public py0 d;
    public org.telegram.ui.t70 f29506d0;
    public s4.y e;
    public int f29507e0;
    public TLRPC.Document f29508f;
    public int f29509f0;
    public boolean f29510g0;
    public da0 h;
    public boolean f29511h0;
    public boolean f29512i0;
    public boolean f29513j0;
    public int f29514k0;
    public final com.google.firebase.messaging.m f29515l0;
    public final iy0 m0;
    public org.telegram.ui.ActionBar.u0 f29516n;
    public v70 f29517n0;
    public String f29518o0;
    public int f29519p0;
    public boolean f29520q0;
    public org.telegram.ui.ActionBar.e1 f29521r;
    public String f29522r0;
    public s6 f29523s;
    public Runnable f29524s0;
    public ArrayList f29525t0;
    public sg.q0 v;
    public FrameLayout f29526w;
    public FrameLayout f29527x;
    public TextView f29528y;

    public ty0(Context context, Object obj, TLObject tLObject, org.telegram.ui.ActionBar.c6 c6Var) {
        super(1, context, c6Var, false);
        this.I = new AnimatorSet[2];
        this.J = new View[2];
        this.f29513j0 = true;
        this.f29515l0 = new com.google.firebase.messaging.m(5);
        this.m0 = new iy0(this);
        this.resourcesProvider = c6Var;
        fixNavigationBar();
        this.N = (Activity) context;
        TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = new TLRPC.TL_messages_getAttachedStickers();
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.Photo photo = (TLRPC.Photo) tLObject;
            TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = new TLRPC.TL_inputStickeredMediaPhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_inputStickeredMediaPhoto.f19286id = tL_inputPhoto;
            tL_inputPhoto.f19235id = photo.f19240id;
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
            tL_inputStickeredMediaDocument.f19285id = tL_inputDocument;
            tL_inputDocument.f19228id = document.f19222id;
            tL_inputDocument.access_hash = document.access_hash;
            byte[] bArr2 = document.file_reference;
            tL_inputDocument.file_reference = bArr2;
            if (bArr2 == null) {
                tL_inputDocument.file_reference = new byte[0];
            }
            tL_messages_getAttachedStickers.media = tL_inputStickeredMediaDocument;
        }
        org.telegram.ui.ys0 ys0Var = (org.telegram.ui.ys0) this;
        this.f29509f0 = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getAttachedStickers, new bi.f3(ys0Var, obj, tL_messages_getAttachedStickers, new org.telegram.ui.to(15, ys0Var, tL_messages_getAttachedStickers), 7));
        s0(context);
    }

    public static void B(ty0 ty0Var) {
        ty0Var.dismiss();
        MediaDataController.getInstance(ty0Var.currentAccount).toggleStickerSet(ty0Var.getContext(), ty0Var.S, 1, ty0Var.L, true, ty0Var.f29513j0);
    }

    public static void D(ty0 ty0Var) {
        ty0Var.dismiss();
        ry0 ry0Var = ty0Var.f29505c0;
        if (ry0Var != null) {
            ry0Var.a();
        }
        if (ty0Var.V != null && !MediaDataController.getInstance(ty0Var.currentAccount).cancelRemovingStickerSet(ty0Var.V.f19236id)) {
            TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
            tL_messages_installStickerSet.stickerset = ty0Var.V;
            ConnectionsManager.getInstance(ty0Var.currentAccount).sendRequest(tL_messages_installStickerSet, new y1(ty0Var, 13));
        }
    }

    public static void E(ty0 ty0Var, int i10) {
        String str;
        org.telegram.ui.ActionBar.m2 m2Var = ty0Var.L;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = ty0Var.S;
        if (tL_messages_stickerSet != null) {
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet != null && stickerSet.emojis) {
                str = "https://" + MessagesController.getInstance(ty0Var.currentAccount).linkPrefix + "/addemoji/" + ty0Var.S.set.short_name;
            } else {
                str = "https://" + MessagesController.getInstance(ty0Var.currentAccount).linkPrefix + "/addstickers/" + ty0Var.S.set.short_name;
            }
            String str2 = str;
            if (i10 == 1) {
                Context context = ty0Var.N;
                if (context == null && m2Var != null) {
                    context = m2Var.getParentActivity();
                }
                if (context == null) {
                    context = ty0Var.getContext();
                }
                gy0 gy0Var = new gy0(ty0Var, context, str2, str2, ty0Var.resourcesProvider);
                if (m2Var != null) {
                    m2Var.showDialog(gy0Var);
                    if (m2Var instanceof org.telegram.ui.fo) {
                        gy0Var.setCalcMandatoryInsets(((org.telegram.ui.fo) m2Var).C9());
                        return;
                    }
                    return;
                }
                gy0Var.show();
            } else if (i10 == 2) {
                try {
                    AndroidUtilities.addToClipboard(str2);
                    new zc((FrameLayout) ty0Var.containerView, ty0Var.resourcesProvider).k(false).j();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else if (i10 == 3) {
                if (ty0Var.R) {
                    ty0Var.o0();
                } else {
                    ty0Var.q0();
                }
            } else if (i10 == 4) {
                yy0.c(ty0Var.S.set, ty0Var.resourcesProvider, ty0Var.getContext(), new d(ty0Var, 20));
            } else if (i10 == 5) {
                yy0.b(ty0Var.S.set, ty0Var.resourcesProvider, ty0Var.getContext(), new ey0(ty0Var, 2));
            }
        }
    }

    public static void F(ty0 ty0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        int i10;
        org.telegram.ui.ActionBar.m2 m2Var = ty0Var.L;
        TLRPC.StickerSet stickerSet = ty0Var.S.set;
        if (stickerSet.masks) {
            i10 = 1;
        } else if (stickerSet.emojis) {
            i10 = 5;
        } else {
            i10 = 0;
        }
        try {
            if (tL_error == null) {
                if (ty0Var.f29513j0) {
                    sc.g(m2Var, new yx0(ty0Var.f29526w.getContext(), ty0Var.S, 1, 2, null, ty0Var.resourcesProvider), 1500).j();
                }
                if (tLObject instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                    MediaDataController.getInstance(ty0Var.currentAccount).processStickerSetInstallResultArchive(m2Var, true, i10, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject);
                }
            } else {
                Toast.makeText(ty0Var.getContext(), LocaleController.getString(R.string.ErrorOccurred), 0).show();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        MediaDataController.getInstance(ty0Var.currentAccount).loadStickers(i10, false, true);
    }

    public static void G(ty0 ty0Var, TLRPC.TL_error tL_error, TLObject tLObject, MediaDataController mediaDataController) {
        TLRPC.StickerSet stickerSet;
        boolean z10 = false;
        ty0Var.f29509f0 = 0;
        if (tL_error == null) {
            gn0 gn0Var = new gn0(ty0Var, 1);
            gn0Var.addTarget(ty0Var.containerView);
            TransitionManager.beginDelayedTransition(ty0Var.container, gn0Var);
            ty0Var.f29516n.setVisibility(0);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            ty0Var.S = tL_messages_stickerSet;
            mediaDataController.putStickerSet(tL_messages_stickerSet, false);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = ty0Var.S;
            if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.documents.isEmpty()) {
                ty0Var.dismiss();
                return;
            }
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = ty0Var.S;
            if (tL_messages_stickerSet3 != null && (stickerSet = tL_messages_stickerSet3.set) != null && !stickerSet.masks) {
                z10 = true;
            }
            ty0Var.f29511h0 = z10;
            ty0Var.m0();
            mediaDataController.preloadStickerSetThumb(ty0Var.S);
            ty0Var.D0();
            ty0Var.C0();
            ty0Var.B0();
            ty0Var.d.l();
            return;
        }
        ty0Var.dismiss();
        org.telegram.ui.ActionBar.m2 m2Var = ty0Var.L;
        if (m2Var != null) {
            org.telegram.messenger.yh.p(R.string.AddStickersNotFound, zc.a0(m2Var), null);
        }
    }

    public static void H(ty0 ty0Var, String str, TextView textView) {
        TLRPC.TL_stickers_checkShortName tL_stickers_checkShortName = new TLRPC.TL_stickers_checkShortName();
        tL_stickers_checkShortName.short_name = str;
        ty0Var.f29519p0 = ConnectionsManager.getInstance(ty0Var.currentAccount).sendRequest(tL_stickers_checkShortName, new bi.e5(ty0Var, str, textView, 12), 2);
    }

    public static void I(ty0 ty0Var) {
        boolean z10;
        TLRPC.StickerSet stickerSet;
        MediaDataController mediaDataController = MediaDataController.getInstance(ty0Var.currentAccount);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = ty0Var.S;
        if (tL_messages_stickerSet != null && mediaDataController.isStickerPackInstalled(tL_messages_stickerSet.set.f19243id)) {
            z10 = false;
        } else {
            z10 = true;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = ty0Var.S;
        if (tL_messages_stickerSet2 != null && (stickerSet = tL_messages_stickerSet2.set) != null && stickerSet.creator && ty0Var.f29521r == null) {
            ty0Var.f29516n.e(3, R.drawable.tabs_reorder, LocaleController.getString(R.string.StickersReorder));
            ty0Var.f29516n.e(4, R.drawable.msg_edit, LocaleController.getString(R.string.EditName));
            if (z10) {
                ty0Var.f29521r = ty0Var.f29516n.e(5, R.drawable.msg_delete, LocaleController.getString(R.string.Delete));
            } else {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, ty0Var.getContext(), ty0Var.resourcesProvider);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
                org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, ty0Var.resourcesProvider).setOnClickListener(new cy0(ty0Var, 4));
                org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.StickersDeleteForEveryone), false, ty0Var.resourcesProvider);
                int themedColor = ty0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f20139q7);
                c10.c(themedColor, themedColor);
                c10.setSelectorColor(org.telegram.ui.ActionBar.g6.m1(0.1f, themedColor));
                org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.StickersRemoveForMe), false, ty0Var.resourcesProvider).setOnClickListener(new cy0(ty0Var, 6));
                c10.setOnClickListener(new cy0(ty0Var, 7));
                ty0Var.f29521r = ty0Var.f29516n.i(R.drawable.msg_delete, null, LocaleController.getString(R.string.Delete), actionBarPopupWindow$ActionBarPopupWindowLayout);
            }
            ty0Var.f29516n.a(-1);
            ub0 ub0Var = new ub0(ty0Var.currentAccount, 4, ty0Var.getContext(), new ArrayList(), ty0Var.resourcesProvider);
            ub0Var.setOnClickListener(new cy0(ty0Var, 8));
            ub0Var.setTag(R.id.fit_width_tag, 1);
            org.telegram.ui.ActionBar.u0 u0Var = ty0Var.f29516n;
            u0Var.o();
            u0Var.f20675b.a(ub0Var, new LinearLayout.LayoutParams(-1, -2));
            int themedColor2 = ty0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f20139q7);
            ty0Var.f29521r.c(themedColor2, themedColor2);
            ty0Var.f29521r.setSelectorColor(org.telegram.ui.ActionBar.g6.m1(0.1f, themedColor2));
            if (ty0Var.f29521r.getRightIcon() != null) {
                ty0Var.f29521r.getRightIcon().setColorFilter(themedColor2);
            }
        }
        if (ty0Var.f29516n.getPopupLayout() != null) {
            ty0Var.f29516n.getPopupLayout().requestLayout();
        }
        ty0Var.f29516n.M(null, null);
    }

    public static void P(ty0 ty0Var) {
        if (ty0Var.f29504c.getChildCount() <= 0) {
            ty0Var.z0(ty0Var.f29504c.getPaddingTop());
            return;
        }
        int i10 = 0;
        View view = null;
        int i11 = -1;
        for (int i12 = 0; i12 < ty0Var.f29504c.getChildCount(); i12++) {
            View childAt = ty0Var.f29504c.getChildAt(i12);
            ty0Var.f29504c.getClass();
            int R = RecyclerView.R(childAt);
            if (i11 == -1 || i11 > R) {
                view = childAt;
                i11 = R;
            }
        }
        if (view != null && view.getTop() >= 0) {
            int top = view.getTop();
            ty0Var.w0(0, false);
            i10 = top;
        } else {
            ty0Var.w0(0, true);
        }
        ty0Var.w0(1, true);
        if (ty0Var.f29507e0 != i10) {
            ty0Var.z0(i10);
        }
    }

    public static void n(ty0 ty0Var, View view, int i10) {
        TLRPC.StickerSet stickerSet;
        String str;
        if (view instanceof ny0) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = ty0Var.S;
            org.telegram.ui.ActionBar.m2 m2Var = ty0Var.L;
            org.telegram.ui.ActionBar.c6 c6Var = ty0Var.resourcesProvider;
            if (m2Var != null) {
                Context context = m2Var.getContext();
                if (!(m2Var instanceof org.telegram.ui.fo)) {
                    yy0.a(tL_messages_stickerSet, m2Var, c6Var);
                    return;
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert3, 0, context, c6Var);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                arrayList.add(LocaleController.getString(R.string.StickersCreateNewSticker));
                org.telegram.ui.Cells.d0.m(R.drawable.menu_sticker_add, 0, arrayList3, arrayList2);
                arrayList.add(LocaleController.getString(R.string.StickersAddAnExistingSticker));
                arrayList3.add(Integer.valueOf(R.drawable.menu_sticker_select));
                arrayList2.add(1);
                org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                bi.l0 l0Var = new bi.l0(m1Var, arrayList2, tL_messages_stickerSet, m2Var, c6Var, 11);
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, ((Integer) arrayList3.get(i11)).intValue(), (CharSequence) arrayList.get(i11), false, c6Var);
                    c10.setTag(Integer.valueOf(i11));
                    c10.setOnClickListener(l0Var);
                }
                m1Var.f20521c = 100;
                m1Var.f20523g = true;
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
        } else if (!ty0Var.R) {
            if (ty0Var.W != null) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) ty0Var.d.f28448f.get(i10);
                if (stickerSetCovered != null) {
                    ty0Var.dismiss();
                    TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                    TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
                    tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                    tL_inputStickerSetID.f19236id = stickerSet2.f19243id;
                    new ty0(ty0Var.N, ty0Var.L, tL_inputStickerSetID, null, null, ty0Var.resourcesProvider).show();
                    return;
                }
                return;
            }
            ArrayList arrayList4 = ty0Var.Y;
            if (arrayList4 != null) {
                if (i10 >= 0 && i10 < arrayList4.size()) {
                    SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) ty0Var.Y.get(i10);
                    ty0Var.U = importingSticker;
                    if (importingSticker.validated) {
                        TextView textView = ty0Var.G;
                        textView.setText(Emoji.replaceEmoji(importingSticker.emoji, textView.getPaint().getFontMetricsInt(), false));
                        z9 z9Var = ty0Var.F;
                        ImageLocation forPath = ImageLocation.getForPath(ty0Var.U.path);
                        if (ty0Var.U.animated) {
                            str = "tgs";
                        } else {
                            str = null;
                        }
                        z9Var.m(forPath, null, null, null, null, str, 0, null);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ty0Var.f29527x.getLayoutParams();
                        layoutParams.topMargin = ty0Var.f29507e0;
                        ty0Var.f29527x.setLayoutParams(layoutParams);
                        ty0Var.f29527x.setVisibility(0);
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ObjectAnimator.ofFloat(ty0Var.f29527x, View.ALPHA, 0.0f, 1.0f));
                        animatorSet.setDuration(200L);
                        animatorSet.start();
                        return;
                    }
                    return;
                }
                return;
            }
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = ty0Var.S;
            if (tL_messages_stickerSet2 != null && i10 >= 0 && i10 < tL_messages_stickerSet2.documents.size()) {
                ty0Var.T = ty0Var.S.documents.get(i10);
                int i12 = 0;
                while (true) {
                    if (i12 >= ty0Var.T.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = ty0Var.T.attributes.get(i12);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                        String str2 = documentAttribute.alt;
                        if (str2 != null && str2.length() > 0) {
                            TextView textView2 = ty0Var.G;
                            textView2.setText(Emoji.replaceEmoji(documentAttribute.alt, textView2.getPaint().getFontMetricsInt(), false));
                        }
                    } else {
                        i12++;
                    }
                }
                ty0Var.G.setText(Emoji.replaceEmoji(MediaDataController.getInstance(ty0Var.currentAccount).getEmojiForSticker(ty0Var.T.f19222id), ty0Var.G.getPaint().getFontMetricsInt(), false));
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = ty0Var.S;
                if ((tL_messages_stickerSet3 == null || (stickerSet = tL_messages_stickerSet3.set) == null || !stickerSet.emojis) && !org.telegram.ui.xt.q().y(view)) {
                    ty0Var.F.getImageReceiver().setImage(ImageLocation.getForDocument(ty0Var.T), (String) null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(ty0Var.T.thumbs, 90), ty0Var.T), (String) null, "webp", ty0Var.S, 1);
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ty0Var.f29527x.getLayoutParams();
                    layoutParams2.topMargin = ty0Var.f29507e0;
                    ty0Var.f29527x.setLayoutParams(layoutParams2);
                    ty0Var.f29527x.setVisibility(0);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(ty0Var.f29527x, View.ALPHA, 0.0f, 1.0f));
                    animatorSet2.setDuration(200L);
                    animatorSet2.start();
                }
            }
        }
    }

    public static void o(ty0 ty0Var) {
        ty0Var.f29516n.n();
        yy0.b(ty0Var.S.set, ty0Var.resourcesProvider, ty0Var.getContext(), new ey0(ty0Var, 4));
    }

    public static void p0(org.telegram.ui.ActionBar.m2 m2Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, TLRPC.Document document) {
        org.telegram.ui.fo foVar;
        boolean z10;
        TLRPC.StickerSet stickerSet;
        if (m2Var != null) {
            if (m2Var instanceof org.telegram.ui.fo) {
                foVar = (org.telegram.ui.fo) m2Var;
            } else {
                foVar = null;
            }
            org.telegram.ui.fo foVar2 = foVar;
            if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.creator) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (MessageObject.isStaticStickerDocument(document)) {
                ArrayList arrayList = new ArrayList();
                File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true);
                if (pathToAttach != null && pathToAttach.exists()) {
                    AndroidUtilities.runOnUIThread(new ig.q0(pathToAttach, arrayList, m2Var, foVar2, document, z10, tL_messages_stickerSet), 300L);
                    return;
                }
                return;
            }
            AndroidUtilities.runOnUIThread(new di.t1((Object) m2Var, (Object) tL_messages_stickerSet, (Object) document, (Object) foVar2, z10, 19), 300L);
        }
    }

    public static void q(org.telegram.ui.ys0 ys0Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers) {
        ys0Var.f29509f0 = 0;
        if (tL_error == null && (tLObject instanceof Vector)) {
            Vector vector = (Vector) tLObject;
            if (vector.objects.isEmpty()) {
                ys0Var.dismiss();
                return;
            } else if (vector.objects.size() == 1) {
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                ys0Var.V = tL_inputStickerSetID;
                TLRPC.StickerSet stickerSet = ((TLRPC.StickerSetCovered) vector.objects.get(0)).set;
                tL_inputStickerSetID.f19236id = stickerSet.f19243id;
                tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                ys0Var.u0();
                return;
            } else {
                ArrayList arrayList = new ArrayList();
                ys0Var.W = arrayList;
                arrayList.addAll(vector.objects);
                ys0Var.f29504c.setLayoutParams(w7.a6.a(-1.0f, 0.0f, 0.0f, 0.0f, 48.0f, -1, 51));
                ys0Var.h.setVisibility(8);
                ys0Var.J[0].setVisibility(8);
                ys0Var.d.l();
                return;
            }
        }
        g5.e0(ys0Var.currentAccount, tL_error, ys0Var.L, tL_messages_getAttachedStickers, new Object[0]);
        ys0Var.dismiss();
    }

    public static void r(org.telegram.ui.ys0 ys0Var, Object obj, TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers, org.telegram.ui.to toVar, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && obj != null) {
            FileRefController.getInstance(ys0Var.currentAccount).requestReference(obj, tL_messages_getAttachedStickers, toVar);
        } else {
            toVar.run(tLObject, tL_error);
        }
    }

    public static void s(ty0 ty0Var) {
        ty0Var.dismiss();
        MediaDataController.getInstance(ty0Var.currentAccount).toggleStickerSet(ty0Var.getContext(), ty0Var.S, 0, ty0Var.L, true, ty0Var.f29513j0);
    }

    public static void t(ty0 ty0Var) {
        ty0Var.f29516n.n();
        ty0Var.dismiss();
        MediaDataController.getInstance(ty0Var.currentAccount).toggleStickerSet(ty0Var.getContext(), ty0Var.S, 1, ty0Var.L, true, true);
    }

    public static void u(ty0 ty0Var) {
        ty0Var.dismiss();
        MediaDataController.getInstance(ty0Var.currentAccount).toggleStickerSet(ty0Var.getContext(), ty0Var.S, 1, ty0Var.L, false, false);
    }

    public static void v(ty0 ty0Var) {
        ty0Var.dismiss();
        MediaDataController.getInstance(ty0Var.currentAccount).toggleStickerSet(ty0Var.getContext(), ty0Var.S, 1, ty0Var.L, false, false);
    }

    public static boolean x(ty0 ty0Var, MotionEvent motionEvent) {
        if (ty0Var.R) {
            return false;
        }
        return org.telegram.ui.xt.q().s(motionEvent, ty0Var.f29504c, ty0Var.H, ty0Var.m0, ty0Var.resourcesProvider);
    }

    public static void y(ty0 ty0Var, ArrayList arrayList, Boolean bool) {
        ty0Var.Y = arrayList;
        if (arrayList.isEmpty()) {
            ty0Var.dismiss();
            return;
        }
        ty0Var.d.l();
        if (bool.booleanValue()) {
            ty0Var.Z = new HashMap();
            int size = ty0Var.Y.size();
            for (int i10 = 0; i10 < size; i10++) {
                SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) ty0Var.Y.get(i10);
                ty0Var.Z.put(importingSticker.path, importingSticker);
                FileLoader.getInstance(ty0Var.currentAccount).uploadFile(importingSticker.path, false, true, 67108864);
            }
        }
        ty0Var.C0();
    }

    public static void z(ty0 ty0Var, int[] iArr, EditTextBoldCursor editTextBoldCursor, TextView textView, TextView textView2, AlertDialog$Builder alertDialog$Builder) {
        int i10 = iArr[0];
        if (i10 != 1) {
            if (i10 == 0) {
                iArr[0] = 1;
                TLRPC.TL_stickers_suggestShortName tL_stickers_suggestShortName = new TLRPC.TL_stickers_suggestShortName();
                String obj = editTextBoldCursor.getText().toString();
                ty0Var.f29522r0 = obj;
                tL_stickers_suggestShortName.title = obj;
                ConnectionsManager.getInstance(ty0Var.currentAccount).sendRequest(tL_stickers_suggestShortName, new di.fd(ty0Var, editTextBoldCursor, textView, textView2, iArr));
            } else if (i10 == 2) {
                iArr[0] = 3;
                if (!ty0Var.f29520q0) {
                    AndroidUtilities.shakeView(editTextBoldCursor);
                    try {
                        editTextBoldCursor.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                SendMessagesHelper.getInstance(ty0Var.currentAccount).prepareImportStickers(ty0Var.f29522r0, ty0Var.f29518o0, ty0Var.f29501a0, ty0Var.Y, new dy0(ty0Var));
                alertDialog$Builder.f19548a.L0.run();
                ty0Var.dismiss();
            }
        }
    }

    public final void A0(boolean z10) {
        ty0 ty0Var = this.d.f28450r;
        if (ty0Var.W != null) {
            int childCount = ty0Var.f29504c.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = ty0Var.f29504c.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.s3) {
                    ((org.telegram.ui.Cells.s3) childAt).d();
                }
            }
        }
        this.h.setHighlightColor(getThemedColor(org.telegram.ui.ActionBar.g6.f20044l5));
        this.f29527x.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f19972h5) & (-536870913));
        this.f29516n.setIconColor(getThemedColor(org.telegram.ui.ActionBar.g6.Ji));
        this.f29516n.G(getThemedColor(org.telegram.ui.ActionBar.g6.E8), false);
        this.f29516n.G(getThemedColor(org.telegram.ui.ActionBar.g6.F8), true);
        this.f29516n.setPopupItemsSelectorColor(getThemedColor(org.telegram.ui.ActionBar.g6.I5));
        this.f29516n.B(getThemedColor(org.telegram.ui.ActionBar.g6.G8));
        if (this.f29521r != null) {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.f20139q7);
            this.f29521r.c(themedColor, themedColor);
            this.f29521r.setSelectorColor(org.telegram.ui.ActionBar.g6.m1(0.1f, themedColor));
            if (this.f29521r.getRightIcon() != null) {
                this.f29521r.getRightIcon().setColorFilter(themedColor);
            }
        }
        if (z10) {
            if (org.telegram.ui.ActionBar.g6.vl != null && this.f29525t0 == null) {
                ArrayList themeDescriptions = getThemeDescriptions();
                this.f29525t0 = themeDescriptions;
                int size = themeDescriptions.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((org.telegram.ui.ActionBar.i6) this.f29525t0.get(i11)).h = null;
                }
            }
            int size2 = this.f29525t0.size();
            for (int i12 = 0; i12 < size2; i12++) {
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.f29525t0.get(i12);
                i6Var.e(getThemedColor(i6Var.f20375f), false, false);
            }
        }
        if (org.telegram.ui.ActionBar.g6.vl == null && this.f29525t0 != null) {
            this.f29525t0 = null;
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
                if (this.f29502b == null) {
                    this.f29502b = Pattern.compile("@[a-zA-Z\\d_]{1,32}");
                }
                Matcher matcher = this.f29502b.matcher(replaceEmoji);
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
            } catch (Exception e) {
                FileLog.e(e);
            }
            this.h.setText(replaceEmoji);
            if (t0()) {
                int measuredWidth = this.f29504c.getMeasuredWidth();
                if (measuredWidth == 0) {
                    measuredWidth = AndroidUtilities.displaySize.x;
                }
                py0 py0Var = this.d;
                if (AndroidUtilities.isTablet()) {
                    f7 = 60.0f;
                } else {
                    f7 = 45.0f;
                }
                py0Var.d = Math.max(1, measuredWidth / AndroidUtilities.dp(f7));
            } else {
                this.d.d = 5;
            }
            this.M.y1(this.d.d);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.S;
            int i17 = -1;
            if (tL_messages_stickerSet2 != null && (stickerSet7 = tL_messages_stickerSet2.set) != null && stickerSet7.emojis && !UserConfig.getInstance(this.currentAccount).isPremium() && this.f29506d0 == null) {
                if (this.S.documents != null) {
                    for (int i18 = 0; i18 < this.S.documents.size(); i18++) {
                        if (!MessageObject.isFreeEmoji(this.S.documents.get(i18))) {
                            this.v.setVisibility(0);
                            this.f29523s.setBackground(null);
                            x0(null, null, -1);
                            this.v.a(LocaleController.getString(R.string.UnlockPremiumEmoji), new cy0(this, 0), false);
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
                    if (stickerSets.get(i19) != null && stickerSets.get(i19).set != null && stickerSets.get(i19).set.f19243id == this.S.set.f19243id) {
                        z11 = true;
                        break;
                    }
                }
                z11 = false;
                z10 = !z11;
            } else if (tL_messages_stickerSet3 != null && (stickerSet = tL_messages_stickerSet3.set) != null && mediaDataController.isStickerPackInstalled(stickerSet.f19243id)) {
                z10 = false;
            } else {
                z10 = true;
            }
            org.telegram.ui.t70 t70Var = this.f29506d0;
            if (t70Var != null) {
                cy0 cy0Var = new cy0(this, 5);
                boolean z12 = t70Var.f40301a;
                if (t70Var.f40303c.N) {
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
                boolean z13 = this.f29506d0.f40301a;
                if (z13) {
                    i13 = org.telegram.ui.ActionBar.g6.f20139q7;
                } else {
                    i13 = org.telegram.ui.ActionBar.g6.Sh;
                }
                if (!z13) {
                    i14 = org.telegram.ui.ActionBar.g6.Oh;
                } else {
                    i14 = -1;
                }
                if (!z13) {
                    i17 = org.telegram.ui.ActionBar.g6.Qh;
                }
                y0(cy0Var, str, i13, i14, i17);
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
                y0(new cy0(this, 9), formatPluralString2, org.telegram.ui.ActionBar.g6.Sh, org.telegram.ui.ActionBar.g6.Oh, org.telegram.ui.ActionBar.g6.Qh);
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
                    y0(new cy0(this, 10), formatPluralString, org.telegram.ui.ActionBar.g6.Sh, org.telegram.ui.ActionBar.g6.Oh, org.telegram.ui.ActionBar.g6.Qh);
                } else {
                    String str2 = formatPluralString;
                    if (this.S.set.official) {
                        x0(new cy0(this, 11), str2, org.telegram.ui.ActionBar.g6.f20139q7);
                    } else {
                        x0(new cy0(this, 12), str2, org.telegram.ui.ActionBar.g6.f20139q7);
                    }
                }
            }
            this.d.l();
            return;
        }
        ArrayList arrayList5 = this.X;
        if (arrayList5 != null) {
            da0 da0Var = this.h;
            ArrayList arrayList6 = this.Y;
            if (arrayList6 != null) {
                size = arrayList6.size();
            } else {
                size = arrayList5.size();
            }
            da0Var.setText(LocaleController.formatPluralString("Stickers", size, new Object[0]));
            HashMap hashMap = this.Z;
            if (hashMap != null && !hashMap.isEmpty()) {
                x0(null, LocaleController.getString(R.string.ImportStickersProcessing), org.telegram.ui.ActionBar.g6.f20138q5);
                this.f29523s.setEnabled(false);
                return;
            }
            cy0 cy0Var2 = new cy0(this, 13);
            int i20 = R.string.ImportStickers;
            ArrayList arrayList7 = this.Y;
            if (arrayList7 != null) {
                size2 = arrayList7.size();
            } else {
                size2 = arrayList5.size();
            }
            x0(cy0Var2, LocaleController.formatString("ImportStickers", i20, LocaleController.formatPluralString("Stickers", size2, new Object[0])), org.telegram.ui.ActionBar.g6.f20083n5);
            this.f29523s.setEnabled(true);
            return;
        }
        x0(new cy0(this, 14), LocaleController.getString(R.string.Close), org.telegram.ui.ActionBar.g6.f20083n5);
    }

    public final void D0() {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        Point point = AndroidUtilities.displaySize;
        int min = (int) ((Math.min(point.x, point.y) / 2) / AndroidUtilities.density);
        if (this.X != null) {
            this.f29528y.setText(LocaleController.getString(R.string.ImportStickersRemove));
            this.f29528y.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f20139q7));
            float f7 = min;
            this.F.setLayoutParams(w7.a6.a(f7, 0.0f, 0.0f, 0.0f, 30.0f, min, 17));
            this.G.setLayoutParams(w7.a6.a(f7, 0.0f, 0.0f, 0.0f, 30.0f, min, 17));
            this.f29528y.setVisibility(0);
            this.E.setVisibility(0);
        } else if (this.f29503b0 != null && ((tL_messages_stickerSet = this.S) == null || !tL_messages_stickerSet.set.masks)) {
            this.f29528y.setText(LocaleController.getString(R.string.SendSticker));
            float f10 = min;
            this.F.setLayoutParams(w7.a6.a(f10, 0.0f, 0.0f, 0.0f, 30.0f, min, 17));
            this.G.setLayoutParams(w7.a6.a(f10, 0.0f, 0.0f, 0.0f, 30.0f, min, 17));
            this.f29528y.setVisibility(0);
            this.E.setVisibility(0);
        } else {
            this.f29528y.setText(LocaleController.getString(R.string.Close));
            this.F.setLayoutParams(w7.a6.e(min, min, 17));
            this.G.setLayoutParams(w7.a6.e(min, min, 17));
            this.f29528y.setVisibility(8);
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
            bi.o0 o0Var = this.f29504c;
            if (o0Var != null) {
                int childCount = o0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    this.f29504c.getChildAt(i12).invalidate();
                }
            }
        } else if (i10 == NotificationCenter.fileUploaded) {
            HashMap hashMap = this.Z;
            if (hashMap != null) {
                String str = (String) objArr[0];
                SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) hashMap.get(str);
                if (importingSticker != null) {
                    importingSticker.uploadMedia(this.currentAccount, (TLRPC.InputFile) objArr[1], new v70(this, str, importingSticker, 15));
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
                    tL_messages_stickerSet = mediaDataController.getStickerSetById(this.V.f19236id);
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
        this.f29515l0.E(false);
        Runnable runnable = this.f29524s0;
        if (runnable != null) {
            runnable.run();
        }
        if (this.f29509f0 != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f29509f0, true);
            this.f29509f0 = 0;
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
        b7 b7Var = new b7(this, 9);
        ViewGroup viewGroup = this.containerView;
        Drawable[] drawableArr = {this.shadowDrawable};
        int i10 = org.telegram.ui.ActionBar.g6.f19972h5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(viewGroup, 0, null, null, drawableArr, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.containerView, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Ii));
        ty0 ty0Var = this.d.f28450r;
        if (ty0Var.W != null) {
            org.telegram.ui.Cells.s3.a(arrayList, ty0Var.f29504c, b7Var);
        }
        View[] viewArr = this.J;
        View view = viewArr[0];
        int i11 = org.telegram.ui.ActionBar.g6.V5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(viewArr[1], 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f29504c, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.A5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f20007j5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 2, null, null, null, null, org.telegram.ui.ActionBar.g6.f20027k5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f29516n, 65568, null, null, null, null, org.telegram.ui.ActionBar.g6.Ni));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f29523s, 32, null, null, null, null, i10));
        s6 s6Var = this.f29523s;
        int i12 = org.telegram.ui.ActionBar.g6.f19990i6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(s6Var, 65568, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f29523s, 4, null, null, null, null, this.f29514k0));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f29528y, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f20083n5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f29528y, 32, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f29528y, 65568, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.E, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, b7Var, org.telegram.ui.ActionBar.g6.f20044l5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, b7Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, b7Var, org.telegram.ui.ActionBar.g6.Ji));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, b7Var, org.telegram.ui.ActionBar.g6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, b7Var, org.telegram.ui.ActionBar.g6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, b7Var, org.telegram.ui.ActionBar.g6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, b7Var, org.telegram.ui.ActionBar.g6.G8));
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
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f20252w6));
            this.f29520q0 = true;
            this.f29518o0 = str;
            return;
        }
        v70 v70Var = this.f29517n0;
        if (v70Var != null) {
            AndroidUtilities.cancelRunOnUIThread(v70Var);
            this.f29517n0 = null;
            this.f29518o0 = null;
            if (this.f29519p0 != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f29519p0, true);
            }
        }
        if (TextUtils.isEmpty(str)) {
            textView.setText(LocaleController.getString(R.string.ImportStickersEnterUrlInfo));
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f20138q5));
            return;
        }
        this.f29520q0 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                int length = str.length();
                for (int i10 = 0; i10 < length; i10++) {
                    char charAt = str.charAt(i10);
                    if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        textView.setText(LocaleController.getString(R.string.ImportStickersEnterUrlInfo));
                        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f20122p7));
                        return;
                    }
                }
            } else {
                textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalid));
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f20122p7));
                return;
            }
        }
        if (str != null && str.length() >= 5) {
            if (str.length() > 32) {
                textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalidLong));
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f20122p7));
                return;
            }
            textView.setText(LocaleController.getString(R.string.ImportStickersLinkChecking));
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.F6));
            this.f29518o0 = str;
            v70 v70Var2 = new v70(this, str, textView, 18);
            this.f29517n0 = v70Var2;
            AndroidUtilities.runOnUIThread(v70Var2, 300L);
            return;
        }
        textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalidShort));
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f20122p7));
    }

    public final void o0() {
        if (!this.R) {
            return;
        }
        this.e.d(null);
        this.R = false;
        this.f29515l0.E(true);
        AndroidUtilities.forEachViews((RecyclerView) this.f29504c, (Utilities.Callback<View>) new bi.f(14));
        this.f29516n.postDelayed(new ey0(this, 0), 200L);
        this.f29523s.c(LocaleController.getString(R.string.EditStickers), true, true);
    }

    @Override
    public final void onBackPressed() {
        if (org.telegram.ui.xt.q().E) {
            org.telegram.ui.xt.q().o();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onStart() {
        super.onStart();
        sc.a((FrameLayout) this.containerView, new ah.m0(this, 9));
    }

    @Override
    public final void onStop() {
        super.onStop();
        sc.h((FrameLayout) this.containerView);
    }

    public final void q0() {
        if (this.R) {
            return;
        }
        this.e.d(this.f29504c);
        this.R = true;
        com.google.firebase.messaging.m mVar = this.f29515l0;
        char c10 = 0;
        mVar.E(false);
        float f7 = 0.0f;
        Float valueOf = Float.valueOf(0.0f);
        ArrayList arrayList = (ArrayList) mVar.d;
        if (arrayList.isEmpty()) {
            for (int i10 = 0; i10 < 6; i10++) {
                arrayList.add(valueOf);
                ((ArrayList) mVar.e).add(valueOf);
                ((ArrayList) mVar.f6194f).add(valueOf);
            }
        }
        int i11 = 0;
        for (int i12 = 6; i11 < i12; i12 = 6) {
            long nextFloat = Utilities.random.nextFloat() * 300;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, -2.0f, 0.0f, 2.0f, 0.0f);
            ofFloat.addUpdateListener(new sy0(mVar, i11, 3));
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(1);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setCurrentPlayTime(nextFloat);
            long j10 = 300;
            ofFloat.setDuration(j10);
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
            ofFloat2.addUpdateListener(new sy0(mVar, i11, 4));
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
            ofFloat3.addUpdateListener(new sy0(mVar, i11, 5));
            ofFloat3.setRepeatCount(-1);
            ofFloat3.setRepeatMode(1);
            ofFloat3.setInterpolator(new LinearInterpolator());
            ofFloat3.setCurrentPlayTime(nextFloat);
            ofFloat3.setDuration(j10);
            ofFloat3.start();
            ((ArrayList) mVar.f6191a).add(ofFloat);
            ((ArrayList) mVar.f6192b).add(ofFloat2);
            ((ArrayList) mVar.f6193c).add(ofFloat3);
            i11++;
            f7 = f10;
            c10 = c11;
        }
        AndroidUtilities.forEachViews((RecyclerView) this.f29504c, (Utilities.Callback<View>) new bi.f(15));
        this.f29516n.postDelayed(new ey0(this, 1), 200L);
        this.f29523s.c(LocaleController.getString(R.string.Done), true, true);
    }

    public final void r0() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f29527x, View.ALPHA, 0.0f));
        animatorSet.setDuration(200L);
        animatorSet.addListener(new k90(this, 21));
        animatorSet.start();
    }

    public final void s0(Context context) {
        int i10;
        ly0 ly0Var = new ly0(this, context);
        this.containerView = ly0Var;
        ly0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i11, 0, i11, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(48.0f);
        View view = new View(context);
        View[] viewArr = this.J;
        viewArr[0] = view;
        int i12 = org.telegram.ui.ActionBar.g6.V5;
        view.setBackgroundColor(getThemedColor(i12));
        viewArr[0].setAlpha(0.0f);
        viewArr[0].setVisibility(4);
        viewArr[0].setTag(1);
        this.containerView.addView(viewArr[0], layoutParams);
        bi.o0 o0Var = new bi.o0(this, context, 23);
        this.f29504c = o0Var;
        o0Var.setTag(14);
        bi.o0 o0Var2 = this.f29504c;
        getContext();
        ci.k kVar = new ci.k(this);
        this.M = kVar;
        o0Var2.setLayoutManager(kVar);
        this.M.O = new di.w1(this, 5);
        this.e = new s4.y(new my0(this));
        bi.o0 o0Var3 = this.f29504c;
        py0 py0Var = new py0(this, context);
        this.d = py0Var;
        o0Var3.setAdapter(py0Var);
        this.f29504c.setVerticalScrollBarEnabled(false);
        this.f29504c.i(new bi.o(8));
        this.f29504c.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        this.f29504c.setClipToPadding(false);
        this.f29504c.setEnabled(true);
        this.f29504c.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.g6.A5));
        this.f29504c.setOnTouchListener(new uk(this, 6));
        this.f29504c.setOnScrollListener(new kc0(this, 7));
        j jVar = new j(this, 16);
        this.H = jVar;
        this.f29504c.setOnItemClickListener(jVar);
        this.containerView.addView(this.f29504c, w7.a6.a(-1.0f, 0.0f, 48.0f, 0.0f, 48.0f, -1, 51));
        ah.x xVar = new ah.x(this, context, 21);
        this.K = xVar;
        this.containerView.addView(xVar, w7.a6.a(-1.0f, 0.0f, 0.0f, 0.0f, 48.0f, -1, 51));
        this.f29504c.setEmptyView(this.K);
        this.K.setOnTouchListener(new ci.d(24));
        da0 da0Var = new da0(context, null);
        this.h = da0Var;
        da0Var.setLines(1);
        this.h.setSingleLine(true);
        this.h.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f20007j5));
        this.h.setTextSize(1, 20.0f);
        this.h.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f20027k5));
        this.h.setEllipsize(TextUtils.TruncateAt.END);
        this.h.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f));
        this.h.setGravity(16);
        this.h.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(this.h, w7.a6.a(50.0f, 0.0f, 0.0f, 40.0f, 0.0f, -1, 51));
        org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(context, null, 0, getThemedColor(org.telegram.ui.ActionBar.g6.Ji), false, this.resourcesProvider);
        this.f29516n = u0Var;
        u0Var.setLongClickEnabled(false);
        this.f29516n.setSubMenuOpenSide(2);
        this.f29516n.setIcon(R.drawable.ic_ab_other);
        this.f29516n.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.g0(getThemedColor(org.telegram.ui.ActionBar.g6.Ni), 1, -1));
        this.containerView.addView(this.f29516n, w7.a6.a(40.0f, 0.0f, 5.0f, 5.0f, 0.0f, 40, 53));
        this.f29516n.e(1, R.drawable.msg_share, LocaleController.getString(R.string.StickersShare));
        this.f29516n.e(2, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink));
        this.f29516n.setOnClickListener(new cy0(this, 1));
        this.f29516n.setDelegate(new dy0(this));
        this.f29516n.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f29516n;
        if (this.V != null) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        u0Var2.setVisibility(i10);
        this.K.addView(new RadialProgressView(context, null), w7.a6.e(-2, -2, 17));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams2.bottomMargin = AndroidUtilities.dp(48.0f);
        View view2 = new View(context);
        viewArr[1] = view2;
        view2.setBackgroundColor(getThemedColor(i12));
        this.containerView.addView(viewArr[1], layoutParams2);
        s6 s6Var = new s6(context, false, false, false);
        this.f29523s = s6Var;
        int i13 = org.telegram.ui.ActionBar.g6.f19972h5;
        int themedColor = getThemedColor(i13);
        int i14 = org.telegram.ui.ActionBar.g6.f19990i6;
        s6Var.setBackground(org.telegram.ui.ActionBar.g6.h0(themedColor, getThemedColor(i14)));
        s6 s6Var2 = this.f29523s;
        int i15 = org.telegram.ui.ActionBar.g6.f20083n5;
        this.f29514k0 = i15;
        s6Var2.setTextColor(getThemedColor(i15));
        this.f29523s.setTextSize(AndroidUtilities.dp(14.0f));
        this.f29523s.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        this.f29523s.setTypeface(AndroidUtilities.bold());
        this.f29523s.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f29526w = frameLayout;
        frameLayout.addView(this.f29523s, w7.a6.d(48.0f, -1));
        this.containerView.addView(this.f29526w, w7.a6.e(-1, -2, 83));
        sg.q0 q0Var = new sg.q0(AndroidUtilities.dp(24.0f), context, this.resourcesProvider, false);
        this.v = q0Var;
        q0Var.setIcon(R.raw.unlock_icon);
        this.v.setVisibility(4);
        this.containerView.addView(this.v, w7.a6.a(48.0f, 8.0f, 0.0f, 8.0f, 8.0f, -1, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f29527x = frameLayout2;
        frameLayout2.setVisibility(8);
        this.f29527x.setSoundEffectsEnabled(false);
        this.containerView.addView(this.f29527x, w7.a6.d(-1.0f, -1));
        this.f29527x.setOnClickListener(new cy0(this, 2));
        z9 z9Var = new z9(context);
        this.F = z9Var;
        z9Var.setAspectFit(true);
        this.F.setLayerNum(7);
        this.f29527x.addView(this.F);
        TextView textView = new TextView(context);
        this.G = textView;
        textView.setTextSize(1, 30.0f);
        this.G.setGravity(85);
        this.f29527x.addView(this.G);
        TextView textView2 = new TextView(context);
        this.f29528y = textView2;
        textView2.setTextSize(1, 14.0f);
        this.f29528y.setTextColor(getThemedColor(i15));
        this.f29528y.setBackground(org.telegram.ui.ActionBar.g6.h0(getThemedColor(i13), getThemedColor(i14)));
        this.f29528y.setGravity(17);
        this.f29528y.setPadding(AndroidUtilities.dp(29.0f), 0, AndroidUtilities.dp(29.0f), 0);
        this.f29528y.setTypeface(AndroidUtilities.bold());
        this.f29527x.addView(this.f29528y, w7.a6.e(-1, 48, 83));
        this.f29528y.setOnClickListener(new cy0(this, 3));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams3.bottomMargin = AndroidUtilities.dp(48.0f);
        View view3 = new View(context);
        this.E = view3;
        view3.setBackgroundColor(getThemedColor(i12));
        this.f29527x.addView(this.E, layoutParams3);
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
        this.f29524s0 = runnable;
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
                this.S = mediaDataController.getStickerSetById(this.V.f19236id);
            }
            if (this.S == null) {
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                tL_messages_getStickerSet.stickerset = this.V;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getStickerSet, new org.telegram.ui.to(14, this, mediaDataController));
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
            this.f29511h0 = !tL_messages_stickerSet.set.masks;
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
                animatorSetArr[i10].addListener(new ab0(this, i10, z10, 1));
                animatorSetArr[i10].start();
            }
        }
    }

    public final void x0(View.OnClickListener onClickListener, String str, int i10) {
        y0(onClickListener, str, i10, -1, -1);
    }

    public final void y0(View.OnClickListener onClickListener, String str, int i10, int i11, int i12) {
        if (i10 >= 0) {
            s6 s6Var = this.f29523s;
            this.f29514k0 = i10;
            s6Var.setTextColor(getThemedColor(i10));
        }
        this.f29523s.c(str, false, true);
        this.f29523s.setOnClickListener(onClickListener);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f29523s.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.J[1].getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.f29504c.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.K.getLayoutParams();
        if (onClickListener == null) {
            this.f29523s.setAlpha(0.0f);
        } else if (i11 >= 0 && i12 >= 0) {
            s6 s6Var2 = this.f29523s;
            int dp = AndroidUtilities.dp(24.0f);
            int themedColor = getThemedColor(i11);
            int themedColor2 = getThemedColor(i12);
            s6Var2.setBackground(org.telegram.ui.ActionBar.g6.j0(dp, dp, dp, dp, themedColor, themedColor2, themedColor2));
            this.f29526w.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f19972h5));
            int dp2 = AndroidUtilities.dp(8.0f);
            marginLayoutParams.bottomMargin = dp2;
            marginLayoutParams.rightMargin = dp2;
            marginLayoutParams.topMargin = dp2;
            marginLayoutParams.leftMargin = dp2;
            int dp3 = AndroidUtilities.dp(64.0f);
            marginLayoutParams2.bottomMargin = dp3;
            marginLayoutParams3.bottomMargin = dp3;
            marginLayoutParams4.bottomMargin = dp3;
            if (this.f29523s.getAlpha() < 1.0f) {
                org.telegram.messenger.yh.s(this.f29523s.animate().alpha(1.0f), es.h, 240L);
            }
        } else {
            this.f29523s.setBackground(org.telegram.ui.ActionBar.g6.h0(getThemedColor(org.telegram.ui.ActionBar.g6.f19972h5), org.telegram.ui.ActionBar.g6.m1(0.1f, getThemedColor(org.telegram.ui.ActionBar.g6.f20139q7))));
            this.f29526w.setBackgroundColor(0);
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.rightMargin = 0;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.leftMargin = 0;
            int dp4 = AndroidUtilities.dp(48.0f);
            marginLayoutParams2.bottomMargin = dp4;
            marginLayoutParams3.bottomMargin = dp4;
            marginLayoutParams4.bottomMargin = dp4;
            if (this.f29523s.getAlpha() < 1.0f) {
                org.telegram.messenger.yh.s(this.f29523s.animate().alpha(1.0f), es.h, 240L);
            }
        }
        this.containerView.requestLayout();
    }

    public final void z0(int i10) {
        this.f29507e0 = i10;
        if (this.W == null) {
            float f7 = i10;
            this.h.setTranslationY(f7);
            if (this.X == null) {
                this.f29516n.setTranslationY(f7);
            }
            this.J[0].setTranslationY(f7);
        }
        this.containerView.invalidate();
    }

    public ty0(Context context, String str, ArrayList arrayList, ArrayList arrayList2) {
        super(1, context, (org.telegram.ui.ActionBar.c6) null, false);
        this.I = new AnimatorSet[2];
        this.J = new View[2];
        this.f29513j0 = true;
        this.f29515l0 = new com.google.firebase.messaging.m(5);
        this.m0 = new iy0(this);
        fixNavigationBar();
        this.N = (Activity) context;
        this.X = arrayList;
        this.f29501a0 = str;
        Utilities.globalQueue.postRunnable(new v70(this, arrayList, arrayList2, 19));
        s0(context);
    }

    public ty0(Context context, org.telegram.ui.ActionBar.m2 m2Var, TLRPC.InputStickerSet inputStickerSet, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, qy0 qy0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(1, context, c6Var, false);
        this.I = new AnimatorSet[2];
        this.J = new View[2];
        this.f29513j0 = true;
        this.f29515l0 = new com.google.firebase.messaging.m(5);
        this.m0 = new iy0(this);
        fixNavigationBar();
        this.f29503b0 = qy0Var;
        this.V = inputStickerSet;
        this.S = tL_messages_stickerSet;
        this.L = m2Var;
        u0();
        s0(context);
    }
}
