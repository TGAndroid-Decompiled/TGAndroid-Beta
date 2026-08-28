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
public class cx0 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f27569q0 = 0;
    public View A;
    public o9 B;
    public TextView C;
    public j D;
    public final AnimatorSet[] E;
    public final View[] F;
    public fh.d2 G;
    public final org.telegram.ui.ActionBar.o2 H;
    public jh.k I;
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
    public final zw0 X;
    public ax0 Y;
    public org.telegram.ui.u60 Z;
    public int f27570a0;
    public Pattern f27571b;
    public int f27572b0;
    public gh.f1 f27573c;
    public boolean f27574c0;
    public yw0 d;
    public boolean f27575d0;
    public f2.h0 f27576e;
    public boolean f27577e0;
    public TLRPC.Document f27578f;
    public boolean f27579f0;
    public int f27580g0;
    public l80 h;
    public final com.google.firebase.messaging.m f27581h0;
    public final rw0 f27582i0;
    public ue0 f27583j0;
    public String f27584k0;
    public int f27585l0;
    public boolean m0;
    public org.telegram.ui.ActionBar.w0 f27586n;
    public String f27587n0;
    public Runnable f27588o0;
    public ArrayList f27589p0;
    public org.telegram.ui.ActionBar.g1 f27590r;
    public j6 f27591s;
    public zf.p0 v;
    public FrameLayout f27592w;
    public FrameLayout f27593x;
    public TextView f27594y;

    public cx0(Context context, Object obj, TLObject tLObject, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var, false, false);
        this.E = new AnimatorSet[2];
        this.F = new View[2];
        this.f27579f0 = true;
        this.f27581h0 = new com.google.firebase.messaging.m(8);
        this.f27582i0 = new rw0(this);
        this.resourcesProvider = b6Var;
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
        org.telegram.ui.or0 or0Var = (org.telegram.ui.or0) this;
        this.f27572b0 = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getAttachedStickers, new fh.h1(or0Var, obj, tL_messages_getAttachedStickers, new org.telegram.ui.rc(22, or0Var, tL_messages_getAttachedStickers), 13));
        q0(context);
    }

    public static void A(cx0 cx0Var) {
        cx0Var.dismiss();
        ax0 ax0Var = cx0Var.Y;
        if (ax0Var != null) {
            ax0Var.a();
        }
        if (cx0Var.R != null && !MediaDataController.getInstance(cx0Var.currentAccount).cancelRemovingStickerSet(cx0Var.R.f22400id)) {
            TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
            tL_messages_installStickerSet.stickerset = cx0Var.R;
            ConnectionsManager.getInstance(cx0Var.currentAccount).sendRequest(tL_messages_installStickerSet, new w1(cx0Var, 13));
        }
    }

    public static void C(cx0 cx0Var, int i9) {
        String str;
        org.telegram.ui.ActionBar.o2 o2Var = cx0Var.H;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = cx0Var.O;
        if (tL_messages_stickerSet != null) {
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet != null && stickerSet.emojis) {
                str = "https://" + MessagesController.getInstance(cx0Var.currentAccount).linkPrefix + "/addemoji/" + cx0Var.O.set.short_name;
            } else {
                str = "https://" + MessagesController.getInstance(cx0Var.currentAccount).linkPrefix + "/addstickers/" + cx0Var.O.set.short_name;
            }
            String str2 = str;
            if (i9 == 1) {
                Context context = cx0Var.J;
                if (context == null && o2Var != null) {
                    context = o2Var.getParentActivity();
                }
                if (context == null) {
                    context = cx0Var.getContext();
                }
                pw0 pw0Var = new pw0(cx0Var, context, str2, str2, cx0Var.resourcesProvider);
                if (o2Var != null) {
                    o2Var.showDialog(pw0Var);
                    if (o2Var instanceof org.telegram.ui.qn) {
                        pw0Var.setCalcMandatoryInsets(((org.telegram.ui.qn) o2Var).x9());
                        return;
                    }
                    return;
                }
                pw0Var.show();
            } else if (i9 == 2) {
                try {
                    AndroidUtilities.addToClipboard(str2);
                    new oc((FrameLayout) cx0Var.containerView, cx0Var.resourcesProvider).k(false).j();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            } else if (i9 == 3) {
                if (cx0Var.N) {
                    cx0Var.m0();
                } else {
                    cx0Var.o0();
                }
            } else if (i9 == 4) {
                ix0.c(cx0Var.O.set, cx0Var.resourcesProvider, cx0Var.getContext(), new d(cx0Var, 20));
            } else if (i9 == 5) {
                ix0.b(cx0Var.O.set, cx0Var.resourcesProvider, cx0Var.getContext(), new ow0(cx0Var, 2));
            }
        }
    }

    public static void D(cx0 cx0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        int i9;
        org.telegram.ui.ActionBar.o2 o2Var = cx0Var.H;
        TLRPC.StickerSet stickerSet = cx0Var.O.set;
        if (stickerSet.masks) {
            i9 = 1;
        } else if (stickerSet.emojis) {
            i9 = 5;
        } else {
            i9 = 0;
        }
        try {
            if (tL_error == null) {
                if (cx0Var.f27579f0) {
                    gc.g(o2Var, new iw0(cx0Var.f27592w.getContext(), cx0Var.O, 1, 2, null, cx0Var.resourcesProvider), 1500).j();
                }
                if (tLObject instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                    MediaDataController.getInstance(cx0Var.currentAccount).processStickerSetInstallResultArchive(o2Var, true, i9, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject);
                }
            } else {
                Toast.makeText(cx0Var.getContext(), LocaleController.getString(R.string.ErrorOccurred), 0).show();
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        MediaDataController.getInstance(cx0Var.currentAccount).loadStickers(i9, false, true);
    }

    public static void E(cx0 cx0Var, TLRPC.TL_error tL_error, TLObject tLObject, MediaDataController mediaDataController) {
        TLRPC.StickerSet stickerSet;
        boolean z10 = false;
        cx0Var.f27572b0 = 0;
        if (tL_error == null) {
            pl0 pl0Var = new pl0(cx0Var, 1);
            pl0Var.addTarget(cx0Var.containerView);
            TransitionManager.beginDelayedTransition(cx0Var.container, pl0Var);
            cx0Var.f27586n.setVisibility(0);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            cx0Var.O = tL_messages_stickerSet;
            mediaDataController.putStickerSet(tL_messages_stickerSet, false);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = cx0Var.O;
            if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.documents.isEmpty()) {
                cx0Var.dismiss();
                return;
            }
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = cx0Var.O;
            if (tL_messages_stickerSet3 != null && (stickerSet = tL_messages_stickerSet3.set) != null && !stickerSet.masks) {
                z10 = true;
            }
            cx0Var.f27575d0 = z10;
            cx0Var.k0();
            mediaDataController.preloadStickerSetThumb(cx0Var.O);
            cx0Var.B0();
            cx0Var.A0();
            cx0Var.z0();
            cx0Var.d.l();
            return;
        }
        cx0Var.dismiss();
        org.telegram.ui.ActionBar.o2 o2Var = cx0Var.H;
        if (o2Var != null) {
            org.telegram.messenger.ll.p(R.string.AddStickersNotFound, oc.a0(o2Var), null);
        }
    }

    public static void F(cx0 cx0Var, String str, TextView textView) {
        TLRPC.TL_stickers_checkShortName tL_stickers_checkShortName = new TLRPC.TL_stickers_checkShortName();
        tL_stickers_checkShortName.short_name = str;
        cx0Var.f27585l0 = ConnectionsManager.getInstance(cx0Var.currentAccount).sendRequest(tL_stickers_checkShortName, new bg.b0(cx0Var, str, textView, 20), 2);
    }

    public static void G(cx0 cx0Var) {
        boolean z10;
        TLRPC.StickerSet stickerSet;
        MediaDataController mediaDataController = MediaDataController.getInstance(cx0Var.currentAccount);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = cx0Var.O;
        if (tL_messages_stickerSet != null && mediaDataController.isStickerPackInstalled(tL_messages_stickerSet.set.f22407id)) {
            z10 = false;
        } else {
            z10 = true;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = cx0Var.O;
        if (tL_messages_stickerSet2 != null && (stickerSet = tL_messages_stickerSet2.set) != null && stickerSet.creator && cx0Var.f27590r == null) {
            cx0Var.f27586n.e(3, R.drawable.tabs_reorder, LocaleController.getString(R.string.StickersReorder));
            cx0Var.f27586n.e(4, R.drawable.msg_edit, LocaleController.getString(R.string.EditName));
            if (z10) {
                cx0Var.f27590r = cx0Var.f27586n.e(5, R.drawable.msg_delete, LocaleController.getString(R.string.Delete));
            } else {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, cx0Var.getContext(), cx0Var.resourcesProvider);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, cx0Var.resourcesProvider).setOnClickListener(new mw0(cx0Var, 4));
                org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.StickersDeleteForEveryone), false, cx0Var.resourcesProvider);
                int themedColor = cx0Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23230q7);
                c10.c(themedColor, themedColor);
                c10.setSelectorColor(org.telegram.ui.ActionBar.f6.l1(0.1f, themedColor));
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.StickersRemoveForMe), false, cx0Var.resourcesProvider).setOnClickListener(new mw0(cx0Var, 6));
                c10.setOnClickListener(new mw0(cx0Var, 7));
                cx0Var.f27590r = cx0Var.f27586n.i(R.drawable.msg_delete, null, LocaleController.getString(R.string.Delete), actionBarPopupWindow$ActionBarPopupWindowLayout);
            }
            cx0Var.f27586n.a(-1);
            ca0 ca0Var = new ca0(cx0Var.currentAccount, cx0Var.getContext(), cx0Var.resourcesProvider, new ArrayList(), 4);
            ca0Var.setOnClickListener(new mw0(cx0Var, 8));
            ca0Var.setTag(R.id.fit_width_tag, 1);
            org.telegram.ui.ActionBar.w0 w0Var = cx0Var.f27586n;
            w0Var.o();
            w0Var.f23901b.a(ca0Var, new LinearLayout.LayoutParams(-1, -2));
            int themedColor2 = cx0Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23230q7);
            cx0Var.f27590r.c(themedColor2, themedColor2);
            cx0Var.f27590r.setSelectorColor(org.telegram.ui.ActionBar.f6.l1(0.1f, themedColor2));
            if (cx0Var.f27590r.getRightIcon() != null) {
                cx0Var.f27590r.getRightIcon().setColorFilter(themedColor2);
            }
        }
        if (cx0Var.f27586n.getPopupLayout() != null) {
            cx0Var.f27586n.getPopupLayout().requestLayout();
        }
        cx0Var.f27586n.M(null, null);
    }

    public static void N(cx0 cx0Var) {
        if (cx0Var.f27573c.getChildCount() <= 0) {
            cx0Var.x0(cx0Var.f27573c.getPaddingTop());
            return;
        }
        int i9 = 0;
        View view = null;
        int i10 = -1;
        for (int i11 = 0; i11 < cx0Var.f27573c.getChildCount(); i11++) {
            View childAt = cx0Var.f27573c.getChildAt(i11);
            cx0Var.f27573c.getClass();
            int R = RecyclerView.R(childAt);
            if (i10 == -1 || i10 > R) {
                view = childAt;
                i10 = R;
            }
        }
        if (view != null && view.getTop() >= 0) {
            int top = view.getTop();
            cx0Var.u0(0, false);
            i9 = top;
        } else {
            cx0Var.u0(0, true);
        }
        cx0Var.u0(1, true);
        if (cx0Var.f27570a0 != i9) {
            cx0Var.x0(i9);
        }
    }

    public static void m(cx0 cx0Var, View view, int i9) {
        TLRPC.StickerSet stickerSet;
        String str;
        if (view instanceof ww0) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = cx0Var.O;
            org.telegram.ui.ActionBar.o2 o2Var = cx0Var.H;
            org.telegram.ui.ActionBar.b6 b6Var = cx0Var.resourcesProvider;
            if (o2Var != null) {
                Context context = o2Var.getContext();
                if (!(o2Var instanceof org.telegram.ui.qn)) {
                    ix0.a(tL_messages_stickerSet, o2Var, b6Var);
                    return;
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert3, 0, context, b6Var);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                arrayList.add(LocaleController.getString(R.string.StickersCreateNewSticker));
                org.telegram.ui.Cells.j2.j(R.drawable.menu_sticker_add, 0, arrayList3, arrayList2);
                arrayList.add(LocaleController.getString(R.string.StickersAddAnExistingSticker));
                arrayList3.add(Integer.valueOf(R.drawable.menu_sticker_select));
                arrayList2.add(1);
                org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                ih.d0 d0Var = new ih.d0(o1Var, arrayList2, tL_messages_stickerSet, o2Var, b6Var, 10);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, ((Integer) arrayList3.get(i10)).intValue(), (CharSequence) arrayList.get(i10), false, b6Var);
                    c10.setTag(Integer.valueOf(i10));
                    c10.setOnClickListener(d0Var);
                }
                o1Var.f23689c = 100;
                o1Var.f23692g = true;
                o1Var.setOutsideTouchable(true);
                o1Var.setClippingEnabled(true);
                o1Var.setAnimationStyle(R.style.PopupContextAnimation);
                o1Var.setFocusable(true);
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                o1Var.setInputMethodMode(2);
                o1Var.getContentView().setFocusableInTouchMode(true);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                o1Var.showAtLocation(view, 0, ((view.getMeasuredWidth() / 2) + iArr[0]) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() / 2), ((view.getMeasuredHeight() / 2) + iArr[1]) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() / 2));
                o1Var.b();
            }
        } else if (!cx0Var.N) {
            if (cx0Var.S != null) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) cx0Var.d.f35089f.get(i9);
                if (stickerSetCovered != null) {
                    cx0Var.dismiss();
                    TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                    TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
                    tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                    tL_inputStickerSetID.f22400id = stickerSet2.f22407id;
                    new cx0(cx0Var.J, cx0Var.H, tL_inputStickerSetID, null, null, cx0Var.resourcesProvider).show();
                    return;
                }
                return;
            }
            ArrayList arrayList4 = cx0Var.U;
            if (arrayList4 != null) {
                if (i9 >= 0 && i9 < arrayList4.size()) {
                    SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) cx0Var.U.get(i9);
                    cx0Var.Q = importingSticker;
                    if (importingSticker.validated) {
                        TextView textView = cx0Var.C;
                        textView.setText(Emoji.replaceEmoji(importingSticker.emoji, textView.getPaint().getFontMetricsInt(), false));
                        o9 o9Var = cx0Var.B;
                        ImageLocation forPath = ImageLocation.getForPath(cx0Var.Q.path);
                        if (cx0Var.Q.animated) {
                            str = "tgs";
                        } else {
                            str = null;
                        }
                        o9Var.m(forPath, null, null, null, null, str, 0, null);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) cx0Var.f27593x.getLayoutParams();
                        layoutParams.topMargin = cx0Var.f27570a0;
                        cx0Var.f27593x.setLayoutParams(layoutParams);
                        cx0Var.f27593x.setVisibility(0);
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ObjectAnimator.ofFloat(cx0Var.f27593x, View.ALPHA, 0.0f, 1.0f));
                        animatorSet.setDuration(200L);
                        animatorSet.start();
                        return;
                    }
                    return;
                }
                return;
            }
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = cx0Var.O;
            if (tL_messages_stickerSet2 != null && i9 >= 0 && i9 < tL_messages_stickerSet2.documents.size()) {
                cx0Var.P = cx0Var.O.documents.get(i9);
                int i11 = 0;
                while (true) {
                    if (i11 >= cx0Var.P.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = cx0Var.P.attributes.get(i11);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                        String str2 = documentAttribute.alt;
                        if (str2 != null && str2.length() > 0) {
                            TextView textView2 = cx0Var.C;
                            textView2.setText(Emoji.replaceEmoji(documentAttribute.alt, textView2.getPaint().getFontMetricsInt(), false));
                        }
                    } else {
                        i11++;
                    }
                }
                cx0Var.C.setText(Emoji.replaceEmoji(MediaDataController.getInstance(cx0Var.currentAccount).getEmojiForSticker(cx0Var.P.f22386id), cx0Var.C.getPaint().getFontMetricsInt(), false));
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = cx0Var.O;
                if ((tL_messages_stickerSet3 == null || (stickerSet = tL_messages_stickerSet3.set) == null || !stickerSet.emojis) && !org.telegram.ui.ht.q().y(view)) {
                    cx0Var.B.getImageReceiver().setImage(ImageLocation.getForDocument(cx0Var.P), (String) null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(cx0Var.P.thumbs, 90), cx0Var.P), (String) null, "webp", cx0Var.O, 1);
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) cx0Var.f27593x.getLayoutParams();
                    layoutParams2.topMargin = cx0Var.f27570a0;
                    cx0Var.f27593x.setLayoutParams(layoutParams2);
                    cx0Var.f27593x.setVisibility(0);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(cx0Var.f27593x, View.ALPHA, 0.0f, 1.0f));
                    animatorSet2.setDuration(200L);
                    animatorSet2.start();
                }
            }
        }
    }

    public static void n(cx0 cx0Var) {
        cx0Var.f27586n.n();
        ix0.b(cx0Var.O.set, cx0Var.resourcesProvider, cx0Var.getContext(), new ow0(cx0Var, 4));
    }

    public static void n0(org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, TLRPC.Document document) {
        org.telegram.ui.qn qnVar;
        boolean z10;
        TLRPC.StickerSet stickerSet;
        if (o2Var != null) {
            if (o2Var instanceof org.telegram.ui.qn) {
                qnVar = (org.telegram.ui.qn) o2Var;
            } else {
                qnVar = null;
            }
            org.telegram.ui.qn qnVar2 = qnVar;
            if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.creator) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (MessageObject.isStaticStickerDocument(document)) {
                ArrayList arrayList = new ArrayList();
                File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true);
                if (pathToAttach != null && pathToAttach.exists()) {
                    AndroidUtilities.runOnUIThread(new eh.h(pathToAttach, arrayList, o2Var, qnVar2, document, z10, tL_messages_stickerSet), 300L);
                    return;
                }
                return;
            }
            AndroidUtilities.runOnUIThread(new bg.m(o2Var, (Object) tL_messages_stickerSet, (Object) document, (Object) qnVar2, z10, 17), 300L);
        }
    }

    public static void o(org.telegram.ui.or0 or0Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers) {
        or0Var.f27572b0 = 0;
        if (tL_error == null && (tLObject instanceof Vector)) {
            Vector vector = (Vector) tLObject;
            if (vector.objects.isEmpty()) {
                or0Var.dismiss();
                return;
            } else if (vector.objects.size() == 1) {
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                or0Var.R = tL_inputStickerSetID;
                TLRPC.StickerSet stickerSet = ((TLRPC.StickerSetCovered) vector.objects.get(0)).set;
                tL_inputStickerSetID.f22400id = stickerSet.f22407id;
                tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                or0Var.s0();
                return;
            } else {
                ArrayList arrayList = new ArrayList();
                or0Var.S = arrayList;
                arrayList.addAll(vector.objects);
                or0Var.f27573c.setLayoutParams(g7.e6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
                or0Var.h.setVisibility(8);
                or0Var.F[0].setVisibility(8);
                or0Var.d.l();
                return;
            }
        }
        y4.f0(or0Var.currentAccount, tL_error, or0Var.H, tL_messages_getAttachedStickers, new Object[0]);
        or0Var.dismiss();
    }

    public static void p(org.telegram.ui.or0 or0Var, Object obj, TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers, org.telegram.ui.rc rcVar, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && obj != null) {
            FileRefController.getInstance(or0Var.currentAccount).requestReference(obj, tL_messages_getAttachedStickers, rcVar);
        } else {
            rcVar.run(tLObject, tL_error);
        }
    }

    public static void q(cx0 cx0Var) {
        cx0Var.dismiss();
        MediaDataController.getInstance(cx0Var.currentAccount).toggleStickerSet(cx0Var.getContext(), cx0Var.O, 0, cx0Var.H, true, cx0Var.f27579f0);
    }

    public static void r(cx0 cx0Var) {
        cx0Var.f27586n.n();
        cx0Var.dismiss();
        MediaDataController.getInstance(cx0Var.currentAccount).toggleStickerSet(cx0Var.getContext(), cx0Var.O, 1, cx0Var.H, true, true);
    }

    public static void s(cx0 cx0Var) {
        cx0Var.dismiss();
        MediaDataController.getInstance(cx0Var.currentAccount).toggleStickerSet(cx0Var.getContext(), cx0Var.O, 1, cx0Var.H, false, false);
    }

    public static void t(cx0 cx0Var) {
        cx0Var.dismiss();
        MediaDataController.getInstance(cx0Var.currentAccount).toggleStickerSet(cx0Var.getContext(), cx0Var.O, 1, cx0Var.H, false, false);
    }

    public static boolean v(cx0 cx0Var, MotionEvent motionEvent) {
        if (cx0Var.N) {
            return false;
        }
        return org.telegram.ui.ht.q().s(motionEvent, cx0Var.f27573c, cx0Var.D, cx0Var.f27582i0, cx0Var.resourcesProvider);
    }

    public static void w(cx0 cx0Var, ArrayList arrayList, Boolean bool) {
        cx0Var.U = arrayList;
        if (arrayList.isEmpty()) {
            cx0Var.dismiss();
            return;
        }
        cx0Var.d.l();
        if (bool.booleanValue()) {
            cx0Var.V = new HashMap();
            int size = cx0Var.U.size();
            for (int i9 = 0; i9 < size; i9++) {
                SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) cx0Var.U.get(i9);
                cx0Var.V.put(importingSticker.path, importingSticker);
                FileLoader.getInstance(cx0Var.currentAccount).uploadFile(importingSticker.path, false, true, 67108864);
            }
        }
        cx0Var.A0();
    }

    public static void x(cx0 cx0Var, int[] iArr, EditTextBoldCursor editTextBoldCursor, TextView textView, TextView textView2, AlertDialog$Builder alertDialog$Builder) {
        int i9 = iArr[0];
        if (i9 != 1) {
            if (i9 == 0) {
                iArr[0] = 1;
                TLRPC.TL_stickers_suggestShortName tL_stickers_suggestShortName = new TLRPC.TL_stickers_suggestShortName();
                String obj = editTextBoldCursor.getText().toString();
                cx0Var.f27587n0 = obj;
                tL_stickers_suggestShortName.title = obj;
                ConnectionsManager.getInstance(cx0Var.currentAccount).sendRequest(tL_stickers_suggestShortName, new bg.h0(cx0Var, editTextBoldCursor, textView, textView2, iArr, 9));
            } else if (i9 == 2) {
                iArr[0] = 3;
                if (!cx0Var.m0) {
                    AndroidUtilities.shakeView(editTextBoldCursor);
                    try {
                        editTextBoldCursor.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                SendMessagesHelper.getInstance(cx0Var.currentAccount).prepareImportStickers(cx0Var.f27587n0, cx0Var.f27584k0, cx0Var.W, cx0Var.U, new nw0(cx0Var));
                alertDialog$Builder.f22702a.H0.run();
                cx0Var.dismiss();
            }
        }
    }

    public static void z(cx0 cx0Var) {
        cx0Var.dismiss();
        MediaDataController.getInstance(cx0Var.currentAccount).toggleStickerSet(cx0Var.getContext(), cx0Var.O, 1, cx0Var.H, true, cx0Var.f27579f0);
    }

    public final void A0() {
        int size;
        int size2;
        ArrayList<TLRPC.Document> arrayList;
        boolean z10;
        TLRPC.StickerSet stickerSet;
        String formatPluralString;
        int i9;
        int i10;
        String formatPluralString2;
        ArrayList<TLRPC.Document> arrayList2;
        TLRPC.StickerSet stickerSet2;
        int size3;
        TLRPC.StickerSet stickerSet3;
        int size4;
        TLRPC.StickerSet stickerSet4;
        TLRPC.StickerSet stickerSet5;
        int i11;
        String string;
        int i12;
        int i13;
        int i14;
        TLRPC.StickerSet stickerSet6;
        boolean z11;
        TLRPC.StickerSet stickerSet7;
        float f10;
        if (this.h == null) {
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.O;
        int i15 = 1;
        if (tL_messages_stickerSet != null && (arrayList = tL_messages_stickerSet.documents) != null && !arrayList.isEmpty()) {
            CharSequence replaceEmoji = Emoji.replaceEmoji(this.O.set.title, this.h.getPaint().getFontMetricsInt(), false);
            try {
                if (this.f27571b == null) {
                    this.f27571b = Pattern.compile("@[a-zA-Z\\d_]{1,32}");
                }
                Matcher matcher = this.f27571b.matcher(replaceEmoji);
                SpannableStringBuilder spannableStringBuilder = null;
                while (matcher.find()) {
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder(replaceEmoji);
                    }
                    int start = matcher.start();
                    int end = matcher.end();
                    if (this.O.set.title.charAt(start) != '@') {
                        start++;
                    }
                    spannableStringBuilder.setSpan(new g4(replaceEmoji.subSequence(start + 1, end).toString(), 1, this), start, end, 0);
                }
                if (spannableStringBuilder != null) {
                    replaceEmoji = spannableStringBuilder;
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            this.h.setText(replaceEmoji);
            if (r0()) {
                int measuredWidth = this.f27573c.getMeasuredWidth();
                if (measuredWidth == 0) {
                    measuredWidth = AndroidUtilities.displaySize.x;
                }
                yw0 yw0Var = this.d;
                if (AndroidUtilities.isTablet()) {
                    f10 = 60.0f;
                } else {
                    f10 = 45.0f;
                }
                yw0Var.d = Math.max(1, measuredWidth / AndroidUtilities.dp(f10));
            } else {
                this.d.d = 5;
            }
            this.I.y1(this.d.d);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.O;
            int i16 = -1;
            if (tL_messages_stickerSet2 != null && (stickerSet7 = tL_messages_stickerSet2.set) != null && stickerSet7.emojis && !UserConfig.getInstance(this.currentAccount).isPremium() && this.Z == null) {
                if (this.O.documents != null) {
                    for (int i17 = 0; i17 < this.O.documents.size(); i17++) {
                        if (!MessageObject.isFreeEmoji(this.O.documents.get(i17))) {
                            this.v.setVisibility(0);
                            this.f27591s.setBackground(null);
                            v0(null, null, -1);
                            this.v.a(LocaleController.getString(R.string.UnlockPremiumEmoji), new mw0(this, 0), false);
                            return;
                        }
                    }
                }
            } else {
                this.v.setVisibility(4);
            }
            MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = this.O;
            if (tL_messages_stickerSet3 != null && (stickerSet6 = tL_messages_stickerSet3.set) != null && stickerSet6.emojis) {
                ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = mediaDataController.getStickerSets(5);
                for (int i18 = 0; stickerSets != null && i18 < stickerSets.size(); i18++) {
                    if (stickerSets.get(i18) != null && stickerSets.get(i18).set != null && stickerSets.get(i18).set.f22407id == this.O.set.f22407id) {
                        z11 = true;
                        break;
                    }
                }
                z11 = false;
                z10 = !z11;
            } else if (tL_messages_stickerSet3 != null && (stickerSet = tL_messages_stickerSet3.set) != null && mediaDataController.isStickerPackInstalled(stickerSet.f22407id)) {
                z10 = false;
            } else {
                z10 = true;
            }
            org.telegram.ui.u60 u60Var = this.Z;
            if (u60Var != null) {
                mw0 mw0Var = new mw0(this, 5);
                boolean z12 = u60Var.f43145a;
                if (u60Var.f43147c.J) {
                    if (z12) {
                        i14 = R.string.RemoveGroupEmojiPackSet;
                    } else {
                        i14 = R.string.SetAsGroupEmojiPackSet;
                    }
                    string = LocaleController.getString(i14);
                } else {
                    if (z12) {
                        i11 = R.string.RemoveGroupStickerSet;
                    } else {
                        i11 = R.string.SetAsGroupStickerSet;
                    }
                    string = LocaleController.getString(i11);
                }
                String str = string;
                boolean z13 = this.Z.f43145a;
                if (z13) {
                    i12 = org.telegram.ui.ActionBar.f6.f23230q7;
                } else {
                    i12 = org.telegram.ui.ActionBar.f6.Sh;
                }
                if (!z13) {
                    i13 = org.telegram.ui.ActionBar.f6.Oh;
                } else {
                    i13 = -1;
                }
                if (!z13) {
                    i16 = org.telegram.ui.ActionBar.f6.Qh;
                }
                w0(mw0Var, str, i12, i13, i16);
                return;
            }
            if (z10) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = this.O;
                if (tL_messages_stickerSet4 != null && (stickerSet5 = tL_messages_stickerSet4.set) != null && stickerSet5.emojis) {
                    i15 = 5;
                } else if (tL_messages_stickerSet4 == null || (stickerSet4 = tL_messages_stickerSet4.set) == null || !stickerSet4.masks) {
                    i15 = 0;
                }
                if (!mediaDataController.areStickersLoaded(i15)) {
                    mediaDataController.checkStickers(i15);
                    w0(null, "", -1, -1, -1);
                    return;
                }
            }
            if (z10) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = this.O;
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
                        i10 = arrayList2.size();
                    } else {
                        i10 = 0;
                    }
                    formatPluralString2 = LocaleController.formatPluralString("AddManyStickersCount", i10, new Object[0]);
                }
                w0(new mw0(this, 9), formatPluralString2, org.telegram.ui.ActionBar.f6.Sh, org.telegram.ui.ActionBar.f6.Oh, org.telegram.ui.ActionBar.f6.Qh);
            } else {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet6 = this.O;
                TLRPC.StickerSet stickerSet8 = tL_messages_stickerSet6.set;
                boolean z14 = stickerSet8.creator;
                if (z14) {
                    if (this.N) {
                        i9 = R.string.Done;
                    } else {
                        i9 = R.string.EditStickers;
                    }
                    formatPluralString = LocaleController.getString(i9);
                } else if (stickerSet8.masks) {
                    formatPluralString = LocaleController.formatPluralString("RemoveManyMasksCount", tL_messages_stickerSet6.documents.size(), new Object[0]);
                } else if (stickerSet8.emojis) {
                    formatPluralString = LocaleController.formatPluralString("RemoveManyEmojiCount", tL_messages_stickerSet6.documents.size(), new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("RemoveManyStickersCount", tL_messages_stickerSet6.documents.size(), new Object[0]);
                }
                if (z14) {
                    w0(new mw0(this, 10), formatPluralString, org.telegram.ui.ActionBar.f6.Sh, org.telegram.ui.ActionBar.f6.Oh, org.telegram.ui.ActionBar.f6.Qh);
                } else {
                    String str2 = formatPluralString;
                    if (this.O.set.official) {
                        v0(new mw0(this, 11), str2, org.telegram.ui.ActionBar.f6.f23230q7);
                    } else {
                        v0(new mw0(this, 12), str2, org.telegram.ui.ActionBar.f6.f23230q7);
                    }
                }
            }
            this.d.l();
            return;
        }
        ArrayList arrayList5 = this.T;
        if (arrayList5 != null) {
            l80 l80Var = this.h;
            ArrayList arrayList6 = this.U;
            if (arrayList6 != null) {
                size = arrayList6.size();
            } else {
                size = arrayList5.size();
            }
            l80Var.setText(LocaleController.formatPluralString("Stickers", size, new Object[0]));
            HashMap hashMap = this.V;
            if (hashMap != null && !hashMap.isEmpty()) {
                v0(null, LocaleController.getString(R.string.ImportStickersProcessing), org.telegram.ui.ActionBar.f6.f23228q5);
                this.f27591s.setEnabled(false);
                return;
            }
            mw0 mw0Var2 = new mw0(this, 13);
            int i19 = R.string.ImportStickers;
            ArrayList arrayList7 = this.U;
            if (arrayList7 != null) {
                size2 = arrayList7.size();
            } else {
                size2 = arrayList5.size();
            }
            v0(mw0Var2, LocaleController.formatString("ImportStickers", i19, LocaleController.formatPluralString("Stickers", size2, new Object[0])), org.telegram.ui.ActionBar.f6.f23178n5);
            this.f27591s.setEnabled(true);
            return;
        }
        v0(new mw0(this, 14), LocaleController.getString(R.string.Close), org.telegram.ui.ActionBar.f6.f23178n5);
    }

    public final void B0() {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        Point point = AndroidUtilities.displaySize;
        int min = (int) ((Math.min(point.x, point.y) / 2) / AndroidUtilities.density);
        if (this.T != null) {
            this.f27594y.setText(LocaleController.getString(R.string.ImportStickersRemove));
            this.f27594y.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23230q7));
            float f10 = min;
            this.B.setLayoutParams(g7.e6.d(min, f10, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.C.setLayoutParams(g7.e6.d(min, f10, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.f27594y.setVisibility(0);
            this.A.setVisibility(0);
        } else if (this.X != null && ((tL_messages_stickerSet = this.O) == null || !tL_messages_stickerSet.set.masks)) {
            this.f27594y.setText(LocaleController.getString(R.string.SendSticker));
            float f11 = min;
            this.B.setLayoutParams(g7.e6.d(min, f11, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.C.setLayoutParams(g7.e6.d(min, f11, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.f27594y.setVisibility(0);
            this.A.setVisibility(0);
        } else {
            this.f27594y.setText(LocaleController.getString(R.string.Close));
            this.B.setLayoutParams(g7.e6.e(min, min, 17));
            this.C.setLayoutParams(g7.e6.e(min, min, 17));
            this.f27594y.setVisibility(8);
            this.A.setVisibility(8);
        }
    }

    public final void C0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.O = tL_messages_stickerSet;
        if (this.d != null) {
            B0();
            A0();
            this.d.l();
        }
        z0();
        MediaDataController.getInstance(this.currentAccount).preloadStickerSetThumb(this.O);
        k0();
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.emojiLoaded) {
            gh.f1 f1Var = this.f27573c;
            if (f1Var != null) {
                int childCount = f1Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    this.f27573c.getChildAt(i11).invalidate();
                }
            }
        } else if (i9 == NotificationCenter.fileUploaded) {
            HashMap hashMap = this.V;
            if (hashMap != null) {
                String str = (String) objArr[0];
                SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) hashMap.get(str);
                if (importingSticker != null) {
                    importingSticker.uploadMedia(this.currentAccount, (TLRPC.InputFile) objArr[1], new ue0(this, str, importingSticker, 11));
                }
            }
        } else if (i9 == NotificationCenter.fileUploadFailed) {
            HashMap hashMap2 = this.V;
            if (hashMap2 != null) {
                SendMessagesHelper.ImportingSticker importingSticker2 = (SendMessagesHelper.ImportingSticker) hashMap2.remove((String) objArr[0]);
                if (importingSticker2 != null) {
                    t0(importingSticker2);
                }
                if (this.V.isEmpty()) {
                    A0();
                }
            }
        } else if (i9 == NotificationCenter.stickersDidLoad) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
            if (this.R != null) {
                MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
                String str2 = this.R.short_name;
                if (str2 != null) {
                    tL_messages_stickerSet = mediaDataController.getStickerSetByName(str2);
                }
                if (tL_messages_stickerSet == null) {
                    tL_messages_stickerSet = mediaDataController.getStickerSetById(this.R.f22400id);
                }
            }
            if (tL_messages_stickerSet != null && tL_messages_stickerSet != this.O) {
                this.O = tL_messages_stickerSet;
                s0();
            }
            A0();
        }
    }

    @Override
    public void dismiss() {
        super.dismiss();
        this.f27581h0.B(false);
        Runnable runnable = this.f27588o0;
        if (runnable != null) {
            runnable.run();
        }
        if (this.f27572b0 != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f27572b0, true);
            this.f27572b0 = 0;
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        if (this.T != null) {
            ArrayList arrayList = this.U;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i9 = 0; i9 < size; i9++) {
                    SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) this.U.get(i9);
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
        int i9 = org.telegram.ui.ActionBar.f6.f23072h5;
        arrayList.add(new org.telegram.ui.ActionBar.h6(viewGroup, 0, null, null, drawableArr, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.containerView, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Ii));
        cx0 cx0Var = this.d.f35091r;
        if (cx0Var.S != null) {
            org.telegram.ui.Cells.s3.a(arrayList, cx0Var.f27573c, s6Var);
        }
        View[] viewArr = this.F;
        View view = viewArr[0];
        int i10 = org.telegram.ui.ActionBar.f6.V5;
        arrayList.add(new org.telegram.ui.ActionBar.h6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(viewArr[1], 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f27573c, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.A5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.f23108j5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h, 2, null, null, null, null, org.telegram.ui.ActionBar.f6.f23126k5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f27586n, 65568, null, null, null, null, org.telegram.ui.ActionBar.f6.Ni));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f27591s, 32, null, null, null, null, i9));
        j6 j6Var = this.f27591s;
        int i11 = org.telegram.ui.ActionBar.f6.f23092i6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(j6Var, 65568, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f27591s, 4, null, null, null, null, this.f27580g0));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f27594y, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.f23178n5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f27594y, 32, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f27594y, 65568, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.f6.f23143l5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, s6Var, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.f6.Ji));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.f6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.f6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.f6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.f6.G8));
        return arrayList;
    }

    public final void k0() {
        if (this.O != null) {
            TLRPC.TL_messages_stickerSet filterPremiumStickers = MessagesController.getInstance(this.currentAccount).filterPremiumStickers(this.O);
            this.O = filterPremiumStickers;
            if (filterPremiumStickers == null) {
                dismiss();
            }
        }
    }

    public final void l0(TextView textView, String str, boolean z10) {
        if (z10) {
            textView.setText(LocaleController.getString(R.string.ImportStickersLinkAvailable));
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23334w6));
            this.m0 = true;
            this.f27584k0 = str;
            return;
        }
        ue0 ue0Var = this.f27583j0;
        if (ue0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(ue0Var);
            this.f27583j0 = null;
            this.f27584k0 = null;
            if (this.f27585l0 != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f27585l0, true);
            }
        }
        if (TextUtils.isEmpty(str)) {
            textView.setText(LocaleController.getString(R.string.ImportStickersEnterUrlInfo));
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23228q5));
            return;
        }
        this.m0 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                int length = str.length();
                for (int i9 = 0; i9 < length; i9++) {
                    char charAt = str.charAt(i9);
                    if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        textView.setText(LocaleController.getString(R.string.ImportStickersEnterUrlInfo));
                        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23212p7));
                        return;
                    }
                }
            } else {
                textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalid));
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23212p7));
                return;
            }
        }
        if (str != null && str.length() >= 5) {
            if (str.length() > 32) {
                textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalidLong));
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23212p7));
                return;
            }
            textView.setText(LocaleController.getString(R.string.ImportStickersLinkChecking));
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.F6));
            this.f27584k0 = str;
            ue0 ue0Var2 = new ue0(this, str, textView, 14);
            this.f27583j0 = ue0Var2;
            AndroidUtilities.runOnUIThread(ue0Var2, 300L);
            return;
        }
        textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalidShort));
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23212p7));
    }

    public final void m0() {
        if (!this.N) {
            return;
        }
        this.f27576e.d(null);
        this.N = false;
        this.f27581h0.B(true);
        AndroidUtilities.forEachViews((RecyclerView) this.f27573c, (d5.d) new ih.e(9));
        this.f27586n.postDelayed(new ow0(this, 0), 200L);
        this.f27591s.c(LocaleController.getString(R.string.EditStickers), true, true);
    }

    public final void o0() {
        if (this.N) {
            return;
        }
        this.f27576e.d(this.f27573c);
        this.N = true;
        com.google.firebase.messaging.m mVar = this.f27581h0;
        mVar.B(false);
        Float valueOf = Float.valueOf(0.0f);
        ArrayList arrayList = (ArrayList) mVar.d;
        if (arrayList.isEmpty()) {
            for (int i9 = 0; i9 < 6; i9++) {
                arrayList.add(valueOf);
                ((ArrayList) mVar.f4163e).add(valueOf);
                ((ArrayList) mVar.f4164f).add(valueOf);
            }
        }
        int i10 = 0;
        for (int i11 = 6; i10 < i11; i11 = 6) {
            long nextFloat = Utilities.random.nextFloat() * 300;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, -2.0f, 0.0f, 2.0f, 0.0f);
            ofFloat.addUpdateListener(new bx0(mVar, i10, 3));
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(1);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setCurrentPlayTime(nextFloat);
            long j10 = 300;
            ofFloat.setDuration(j10);
            ofFloat.start();
            float dp = AndroidUtilities.dp(0.5f);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, dp, 0.0f, -dp, 0.0f);
            ofFloat2.addUpdateListener(new bx0(mVar, i10, 4));
            ofFloat2.setRepeatCount(-1);
            ofFloat2.setRepeatMode(1);
            ofFloat2.setInterpolator(new LinearInterpolator());
            ofFloat2.setCurrentPlayTime(nextFloat);
            ofFloat2.setDuration((long) (300 * 1.2d));
            ofFloat2.start();
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, dp, 0.0f - dp, 0.0f);
            ofFloat3.addUpdateListener(new bx0(mVar, i10, 5));
            ofFloat3.setRepeatCount(-1);
            ofFloat3.setRepeatMode(1);
            ofFloat3.setInterpolator(new LinearInterpolator());
            ofFloat3.setCurrentPlayTime(nextFloat);
            ofFloat3.setDuration(j10);
            ofFloat3.start();
            ((ArrayList) mVar.f4160a).add(ofFloat);
            ((ArrayList) mVar.f4161b).add(ofFloat2);
            ((ArrayList) mVar.f4162c).add(ofFloat3);
            i10++;
        }
        AndroidUtilities.forEachViews((RecyclerView) this.f27573c, (d5.d) new ih.e(10));
        this.f27586n.postDelayed(new ow0(this, 1), 200L);
        this.f27591s.c(LocaleController.getString(R.string.Done), true, true);
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
    public final void onStart() {
        super.onStart();
        gc.a((FrameLayout) this.containerView, new fh.y0(this, 10));
    }

    @Override
    public final void onStop() {
        super.onStop();
        gc.h((FrameLayout) this.containerView);
    }

    public final void p0() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f27593x, View.ALPHA, 0.0f));
        animatorSet.setDuration(200L);
        animatorSet.addListener(new r60(this, 23));
        animatorSet.start();
    }

    public final void q0(Context context) {
        int i9;
        uw0 uw0Var = new uw0(this, context);
        this.containerView = uw0Var;
        uw0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i10 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i10, 0, i10, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(48.0f);
        View view = new View(context);
        View[] viewArr = this.F;
        viewArr[0] = view;
        int i11 = org.telegram.ui.ActionBar.f6.V5;
        view.setBackgroundColor(getThemedColor(i11));
        viewArr[0].setAlpha(0.0f);
        viewArr[0].setVisibility(4);
        viewArr[0].setTag(1);
        this.containerView.addView(viewArr[0], layoutParams);
        gh.f1 f1Var = new gh.f1(this, context, 23);
        this.f27573c = f1Var;
        f1Var.setTag(14);
        gh.f1 f1Var2 = this.f27573c;
        getContext();
        jh.k kVar = new jh.k(this);
        this.I = kVar;
        f1Var2.setLayoutManager(kVar);
        this.I.O = new fh.c6(this, 7);
        this.f27576e = new f2.h0(new vw0(this));
        gh.f1 f1Var3 = this.f27573c;
        yw0 yw0Var = new yw0(this, context);
        this.d = yw0Var;
        f1Var3.setAdapter(yw0Var);
        this.f27573c.setVerticalScrollBarEnabled(false);
        this.f27573c.i(new ih.l(7));
        this.f27573c.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        this.f27573c.setClipToPadding(false);
        this.f27573c.setEnabled(true);
        this.f27573c.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.f6.A5));
        this.f27573c.setOnTouchListener(new lr(this, 4));
        this.f27573c.setOnScrollListener(new kn(this, 13));
        j jVar = new j(this, 16);
        this.D = jVar;
        this.f27573c.setOnItemClickListener(jVar);
        this.containerView.addView(this.f27573c, g7.e6.d(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 48.0f));
        fh.d2 d2Var = new fh.d2(this, context, 23);
        this.G = d2Var;
        this.containerView.addView(d2Var, g7.e6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.f27573c.setEmptyView(this.G);
        this.G.setOnTouchListener(new jh.d(24));
        l80 l80Var = new l80(context, null);
        this.h = l80Var;
        l80Var.setLines(1);
        this.h.setSingleLine(true);
        this.h.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23108j5));
        this.h.setTextSize(1, 20.0f);
        this.h.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23126k5));
        this.h.setEllipsize(TextUtils.TruncateAt.END);
        this.h.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f));
        this.h.setGravity(16);
        this.h.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(this.h, g7.e6.d(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(org.telegram.ui.ActionBar.f6.Ji), false, this.resourcesProvider);
        this.f27586n = w0Var;
        w0Var.setLongClickEnabled(false);
        this.f27586n.setSubMenuOpenSide(2);
        this.f27586n.setIcon(R.drawable.ic_ab_other);
        this.f27586n.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(getThemedColor(org.telegram.ui.ActionBar.f6.Ni), 1, -1));
        this.containerView.addView(this.f27586n, g7.e6.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
        this.f27586n.e(1, R.drawable.msg_share, LocaleController.getString(R.string.StickersShare));
        this.f27586n.e(2, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink));
        this.f27586n.setOnClickListener(new mw0(this, 1));
        this.f27586n.setDelegate(new nw0(this));
        this.f27586n.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f27586n;
        if (this.R != null) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        w0Var2.setVisibility(i9);
        this.G.addView(new RadialProgressView(context, null), g7.e6.e(-2, -2, 17));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams2.bottomMargin = AndroidUtilities.dp(48.0f);
        View view2 = new View(context);
        viewArr[1] = view2;
        view2.setBackgroundColor(getThemedColor(i11));
        this.containerView.addView(viewArr[1], layoutParams2);
        j6 j6Var = new j6(context, false, false, false);
        this.f27591s = j6Var;
        int i12 = org.telegram.ui.ActionBar.f6.f23072h5;
        int themedColor = getThemedColor(i12);
        int i13 = org.telegram.ui.ActionBar.f6.f23092i6;
        j6Var.setBackground(org.telegram.ui.ActionBar.f6.g0(themedColor, getThemedColor(i13)));
        j6 j6Var2 = this.f27591s;
        int i14 = org.telegram.ui.ActionBar.f6.f23178n5;
        this.f27580g0 = i14;
        j6Var2.setTextColor(getThemedColor(i14));
        this.f27591s.setTextSize(AndroidUtilities.dp(14.0f));
        this.f27591s.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        this.f27591s.setTypeface(AndroidUtilities.bold());
        this.f27591s.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f27592w = frameLayout;
        frameLayout.addView(this.f27591s, g7.e6.c(48.0f, -1));
        this.containerView.addView(this.f27592w, g7.e6.e(-1, -2, 83));
        zf.p0 p0Var = new zf.p0(AndroidUtilities.dp(24.0f), context, this.resourcesProvider, false);
        this.v = p0Var;
        p0Var.setIcon(R.raw.unlock_icon);
        this.v.setVisibility(4);
        this.containerView.addView(this.v, g7.e6.d(-1, 48.0f, 87, 8.0f, 0.0f, 8.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f27593x = frameLayout2;
        frameLayout2.setVisibility(8);
        this.f27593x.setSoundEffectsEnabled(false);
        this.containerView.addView(this.f27593x, g7.e6.c(-1.0f, -1));
        this.f27593x.setOnClickListener(new mw0(this, 2));
        o9 o9Var = new o9(context);
        this.B = o9Var;
        o9Var.setAspectFit(true);
        this.B.setLayerNum(7);
        this.f27593x.addView(this.B);
        TextView textView = new TextView(context);
        this.C = textView;
        textView.setTextSize(1, 30.0f);
        this.C.setGravity(85);
        this.f27593x.addView(this.C);
        TextView textView2 = new TextView(context);
        this.f27594y = textView2;
        textView2.setTextSize(1, 14.0f);
        this.f27594y.setTextColor(getThemedColor(i14));
        this.f27594y.setBackground(org.telegram.ui.ActionBar.f6.g0(getThemedColor(i12), getThemedColor(i13)));
        this.f27594y.setGravity(17);
        this.f27594y.setPadding(AndroidUtilities.dp(29.0f), 0, AndroidUtilities.dp(29.0f), 0);
        this.f27594y.setTypeface(AndroidUtilities.bold());
        this.f27593x.addView(this.f27594y, g7.e6.e(-1, 48, 83));
        this.f27594y.setOnClickListener(new mw0(this, 3));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams3.bottomMargin = AndroidUtilities.dp(48.0f);
        View view3 = new View(context);
        this.A = view3;
        view3.setBackgroundColor(getThemedColor(i11));
        this.f27593x.addView(this.A, layoutParams3);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        if (this.T != null) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileUploaded);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileUploadFailed);
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
        A0();
        B0();
        z0();
        y0(false);
        this.d.l();
    }

    public final boolean r0() {
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.O;
        if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.emojis) {
            if (tL_messages_stickerSet == null && this.M) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void s0() {
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
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getStickerSet, new org.telegram.ui.rc(21, this, mediaDataController));
            } else {
                if (this.d != null) {
                    B0();
                    A0();
                    this.d.l();
                }
                z0();
                mediaDataController.preloadStickerSetThumb(this.O);
                k0();
            }
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.O;
        if (tL_messages_stickerSet != null) {
            this.f27575d0 = !tL_messages_stickerSet.set.masks;
        }
        k0();
    }

    @Override
    public final void setOnDismissListener(Runnable runnable) {
        this.f27588o0 = runnable;
    }

    @Override
    public final void show() {
        super.show();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4);
    }

    public final void t0(SendMessagesHelper.ImportingSticker importingSticker) {
        int indexOf = this.U.indexOf(importingSticker);
        if (indexOf >= 0) {
            this.U.remove(indexOf);
            this.d.u(indexOf);
            if (this.U.isEmpty()) {
                dismiss();
            } else {
                A0();
            }
        }
    }

    public final void u0(int i9, boolean z10) {
        Integer num;
        float f10;
        if (this.S == null) {
            View[] viewArr = this.F;
            if ((z10 && viewArr[i9].getTag() != null) || (!z10 && viewArr[i9].getTag() == null)) {
                View view = viewArr[i9];
                if (z10) {
                    num = null;
                } else {
                    num = 1;
                }
                view.setTag(num);
                if (z10) {
                    viewArr[i9].setVisibility(0);
                }
                AnimatorSet[] animatorSetArr = this.E;
                AnimatorSet animatorSet = animatorSetArr[i9];
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSetArr[i9] = animatorSet2;
                View view2 = viewArr[i9];
                Property property = View.ALPHA;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                animatorSet2.playTogether(ObjectAnimator.ofFloat(view2, property, f10));
                animatorSetArr[i9].setDuration(150L);
                animatorSetArr[i9].addListener(new i90(this, i9, z10, 1));
                animatorSetArr[i9].start();
            }
        }
    }

    public final void v0(View.OnClickListener onClickListener, String str, int i9) {
        w0(onClickListener, str, i9, -1, -1);
    }

    public final void w0(View.OnClickListener onClickListener, String str, int i9, int i10, int i11) {
        if (i9 >= 0) {
            j6 j6Var = this.f27591s;
            this.f27580g0 = i9;
            j6Var.setTextColor(getThemedColor(i9));
        }
        this.f27591s.c(str, false, true);
        this.f27591s.setOnClickListener(onClickListener);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f27591s.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.F[1].getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.f27573c.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.G.getLayoutParams();
        if (onClickListener == null) {
            this.f27591s.setAlpha(0.0f);
        } else if (i10 >= 0 && i11 >= 0) {
            j6 j6Var2 = this.f27591s;
            int dp = AndroidUtilities.dp(24.0f);
            int themedColor = getThemedColor(i10);
            int themedColor2 = getThemedColor(i11);
            j6Var2.setBackground(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, themedColor, themedColor2, themedColor2));
            this.f27592w.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23072h5));
            int dp2 = AndroidUtilities.dp(8.0f);
            marginLayoutParams.bottomMargin = dp2;
            marginLayoutParams.rightMargin = dp2;
            marginLayoutParams.topMargin = dp2;
            marginLayoutParams.leftMargin = dp2;
            int dp3 = AndroidUtilities.dp(64.0f);
            marginLayoutParams2.bottomMargin = dp3;
            marginLayoutParams3.bottomMargin = dp3;
            marginLayoutParams4.bottomMargin = dp3;
            if (this.f27591s.getAlpha() < 1.0f) {
                org.telegram.messenger.ll.r(this.f27591s.animate().alpha(1.0f), gr.h, 240L);
            }
        } else {
            this.f27591s.setBackground(org.telegram.ui.ActionBar.f6.g0(getThemedColor(org.telegram.ui.ActionBar.f6.f23072h5), org.telegram.ui.ActionBar.f6.l1(0.1f, getThemedColor(org.telegram.ui.ActionBar.f6.f23230q7))));
            this.f27592w.setBackgroundColor(0);
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.rightMargin = 0;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.leftMargin = 0;
            int dp4 = AndroidUtilities.dp(48.0f);
            marginLayoutParams2.bottomMargin = dp4;
            marginLayoutParams3.bottomMargin = dp4;
            marginLayoutParams4.bottomMargin = dp4;
            if (this.f27591s.getAlpha() < 1.0f) {
                org.telegram.messenger.ll.r(this.f27591s.animate().alpha(1.0f), gr.h, 240L);
            }
        }
        this.containerView.requestLayout();
    }

    public final void x0(int i9) {
        this.f27570a0 = i9;
        if (this.S == null) {
            float f10 = i9;
            this.h.setTranslationY(f10);
            if (this.T == null) {
                this.f27586n.setTranslationY(f10);
            }
            this.F[0].setTranslationY(f10);
        }
        this.containerView.invalidate();
    }

    public final void y0(boolean z10) {
        cx0 cx0Var = this.d.f35091r;
        if (cx0Var.S != null) {
            int childCount = cx0Var.f27573c.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = cx0Var.f27573c.getChildAt(i9);
                if (childAt instanceof org.telegram.ui.Cells.s3) {
                    ((org.telegram.ui.Cells.s3) childAt).d();
                }
            }
        }
        this.h.setHighlightColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23143l5));
        this.f27593x.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23072h5) & (-536870913));
        this.f27586n.setIconColor(getThemedColor(org.telegram.ui.ActionBar.f6.Ji));
        this.f27586n.G(getThemedColor(org.telegram.ui.ActionBar.f6.E8), false);
        this.f27586n.G(getThemedColor(org.telegram.ui.ActionBar.f6.F8), true);
        this.f27586n.setPopupItemsSelectorColor(getThemedColor(org.telegram.ui.ActionBar.f6.I5));
        this.f27586n.B(getThemedColor(org.telegram.ui.ActionBar.f6.G8));
        if (this.f27590r != null) {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.f6.f23230q7);
            this.f27590r.c(themedColor, themedColor);
            this.f27590r.setSelectorColor(org.telegram.ui.ActionBar.f6.l1(0.1f, themedColor));
            if (this.f27590r.getRightIcon() != null) {
                this.f27590r.getRightIcon().setColorFilter(themedColor);
            }
        }
        if (z10) {
            if (org.telegram.ui.ActionBar.f6.sl != null && this.f27589p0 == null) {
                ArrayList themeDescriptions = getThemeDescriptions();
                this.f27589p0 = themeDescriptions;
                int size = themeDescriptions.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((org.telegram.ui.ActionBar.h6) this.f27589p0.get(i10)).h = null;
                }
            }
            int size2 = this.f27589p0.size();
            for (int i11 = 0; i11 < size2; i11++) {
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.f27589p0.get(i11);
                h6Var.d(getThemedColor(h6Var.f23498f), false, false);
            }
        }
        if (org.telegram.ui.ActionBar.f6.sl == null && this.f27589p0 != null) {
            this.f27589p0 = null;
        }
    }

    public final void z0() {
        if (this.containerView != null && !UserConfig.getInstance(this.currentAccount).isPremium()) {
            MessageObject.isPremiumEmojiPack(this.O);
        }
    }

    public cx0(Context context, String str, ArrayList arrayList, ArrayList arrayList2) {
        super(context, null, false, false);
        this.E = new AnimatorSet[2];
        this.F = new View[2];
        this.f27579f0 = true;
        this.f27581h0 = new com.google.firebase.messaging.m(8);
        this.f27582i0 = new rw0(this);
        fixNavigationBar();
        this.J = (Activity) context;
        this.T = arrayList;
        this.W = str;
        Utilities.globalQueue.postRunnable(new ue0(this, arrayList, arrayList2, 15));
        q0(context);
    }

    public cx0(Context context, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.InputStickerSet inputStickerSet, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, zw0 zw0Var, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var, false, false);
        this.E = new AnimatorSet[2];
        this.F = new View[2];
        this.f27579f0 = true;
        this.f27581h0 = new com.google.firebase.messaging.m(8);
        this.f27582i0 = new rw0(this);
        fixNavigationBar();
        this.X = zw0Var;
        this.R = inputStickerSet;
        this.O = tL_messages_stickerSet;
        this.H = o2Var;
        s0();
        q0(context);
    }
}
