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
public class iy0 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f25195u0 = 0;
    public View E;
    public v9 F;
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
    public final String f25196a0;
    public Pattern f25197b;
    public final fy0 f25198b0;
    public ai.w0 f25199c;
    public gy0 f25200c0;
    public ey0 d;
    public org.telegram.ui.o70 f25201d0;
    public s4.y e;
    public int f25202e0;
    public TLRPC.Document f25203f;
    public int f25204f0;
    public boolean f25205g0;
    public n90 h;
    public boolean f25206h0;
    public boolean f25207i0;
    public boolean f25208j0;
    public int f25209k0;
    public final com.google.firebase.messaging.n f25210l0;
    public final xx0 m0;
    public org.telegram.ui.ActionBar.v0 f25211n;
    public en0 f25212n0;
    public String f25213o0;
    public int f25214p0;
    public boolean f25215q0;
    public org.telegram.ui.ActionBar.f1 f25216r;
    public String f25217r0;
    public o6 f25218s;
    public Runnable f25219s0;
    public ArrayList f25220t0;
    public rg.p0 v;
    public FrameLayout f25221w;
    public FrameLayout f25222x;
    public TextView f25223y;

    public iy0(Context context, Object obj, TLObject tLObject, org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, false);
        this.I = new AnimatorSet[2];
        this.J = new View[2];
        this.f25208j0 = true;
        this.f25210l0 = new com.google.firebase.messaging.n(6);
        this.m0 = new xx0(this);
        this.resourcesProvider = f6Var;
        fixNavigationBar();
        this.N = (Activity) context;
        TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = new TLRPC.TL_messages_getAttachedStickers();
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.Photo photo = (TLRPC.Photo) tLObject;
            TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = new TLRPC.TL_inputStickeredMediaPhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_inputStickeredMediaPhoto.f18413id = tL_inputPhoto;
            tL_inputPhoto.f18362id = photo.f18367id;
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
            tL_inputStickeredMediaDocument.f18412id = tL_inputDocument;
            tL_inputDocument.f18355id = document.f18349id;
            tL_inputDocument.access_hash = document.access_hash;
            byte[] bArr2 = document.file_reference;
            tL_inputDocument.file_reference = bArr2;
            if (bArr2 == null) {
                tL_inputDocument.file_reference = new byte[0];
            }
            tL_messages_getAttachedStickers.media = tL_inputStickeredMediaDocument;
        }
        org.telegram.ui.rs0 rs0Var = (org.telegram.ui.rs0) this;
        this.f25204f0 = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getAttachedStickers, new ai.p3(rs0Var, obj, tL_messages_getAttachedStickers, new org.telegram.ui.oo(15, rs0Var, tL_messages_getAttachedStickers), 7));
        r0(context);
    }

    public static void A(iy0 iy0Var) {
        iy0Var.dismiss();
        gy0 gy0Var = iy0Var.f25200c0;
        if (gy0Var != null) {
            gy0Var.a();
        }
        if (iy0Var.V != null && !MediaDataController.getInstance(iy0Var.currentAccount).cancelRemovingStickerSet(iy0Var.V.f18363id)) {
            TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
            tL_messages_installStickerSet.stickerset = iy0Var.V;
            ConnectionsManager.getInstance(iy0Var.currentAccount).sendRequest(tL_messages_installStickerSet, new x1(iy0Var, 13));
        }
    }

    public static void B(iy0 iy0Var, int i10) {
        String str;
        org.telegram.ui.ActionBar.n2 n2Var = iy0Var.L;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = iy0Var.S;
        if (tL_messages_stickerSet != null) {
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet != null && stickerSet.emojis) {
                str = "https://" + MessagesController.getInstance(iy0Var.currentAccount).linkPrefix + "/addemoji/" + iy0Var.S.set.short_name;
            } else {
                str = "https://" + MessagesController.getInstance(iy0Var.currentAccount).linkPrefix + "/addstickers/" + iy0Var.S.set.short_name;
            }
            String str2 = str;
            if (i10 == 1) {
                Context context = iy0Var.N;
                if (context == null && n2Var != null) {
                    context = n2Var.getParentActivity();
                }
                if (context == null) {
                    context = iy0Var.getContext();
                }
                vx0 vx0Var = new vx0(iy0Var, context, str2, str2, iy0Var.resourcesProvider);
                if (n2Var != null) {
                    n2Var.showDialog(vx0Var);
                    if (n2Var instanceof org.telegram.ui.zn) {
                        vx0Var.setCalcMandatoryInsets(((org.telegram.ui.zn) n2Var).x9());
                        return;
                    }
                    return;
                }
                vx0Var.show();
            } else if (i10 == 2) {
                try {
                    AndroidUtilities.addToClipboard(str2);
                    new xc((FrameLayout) iy0Var.containerView, iy0Var.resourcesProvider).k(false).j();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else if (i10 == 3) {
                if (iy0Var.R) {
                    iy0Var.n0();
                } else {
                    iy0Var.p0();
                }
            } else if (i10 == 4) {
                oy0.c(iy0Var.S.set, iy0Var.resourcesProvider, iy0Var.getContext(), new d(iy0Var, 20));
            } else if (i10 == 5) {
                oy0.b(iy0Var.S.set, iy0Var.resourcesProvider, iy0Var.getContext(), new tx0(iy0Var, 2));
            }
        }
    }

    public static void D(iy0 iy0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        int i10;
        org.telegram.ui.ActionBar.n2 n2Var = iy0Var.L;
        TLRPC.StickerSet stickerSet = iy0Var.S.set;
        if (stickerSet.masks) {
            i10 = 1;
        } else if (stickerSet.emojis) {
            i10 = 5;
        } else {
            i10 = 0;
        }
        try {
            if (tL_error == null) {
                if (iy0Var.f25208j0) {
                    pc.g(n2Var, new nx0(iy0Var.f25221w.getContext(), iy0Var.S, 1, 2, null, iy0Var.resourcesProvider), 1500).j();
                }
                if (tLObject instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                    MediaDataController.getInstance(iy0Var.currentAccount).processStickerSetInstallResultArchive(n2Var, true, i10, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject);
                }
            } else {
                Toast.makeText(iy0Var.getContext(), LocaleController.getString(R.string.ErrorOccurred), 0).show();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        MediaDataController.getInstance(iy0Var.currentAccount).loadStickers(i10, false, true);
    }

    public static void E(iy0 iy0Var, TLRPC.TL_error tL_error, TLObject tLObject, MediaDataController mediaDataController) {
        TLRPC.StickerSet stickerSet;
        boolean z10 = false;
        iy0Var.f25204f0 = 0;
        if (tL_error == null) {
            sm0 sm0Var = new sm0(iy0Var, 1);
            sm0Var.addTarget(iy0Var.containerView);
            TransitionManager.beginDelayedTransition(iy0Var.container, sm0Var);
            iy0Var.f25211n.setVisibility(0);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            iy0Var.S = tL_messages_stickerSet;
            mediaDataController.putStickerSet(tL_messages_stickerSet, false);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = iy0Var.S;
            if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.documents.isEmpty()) {
                iy0Var.dismiss();
                return;
            }
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = iy0Var.S;
            if (tL_messages_stickerSet3 != null && (stickerSet = tL_messages_stickerSet3.set) != null && !stickerSet.masks) {
                z10 = true;
            }
            iy0Var.f25206h0 = z10;
            iy0Var.l0();
            mediaDataController.preloadStickerSetThumb(iy0Var.S);
            iy0Var.C0();
            iy0Var.B0();
            iy0Var.A0();
            iy0Var.d.l();
            return;
        }
        iy0Var.dismiss();
        org.telegram.ui.ActionBar.n2 n2Var = iy0Var.L;
        if (n2Var != null) {
            org.telegram.messenger.rk.p(R.string.AddStickersNotFound, xc.a0(n2Var), null);
        }
    }

    public static void F(iy0 iy0Var, String str, TextView textView) {
        TLRPC.TL_stickers_checkShortName tL_stickers_checkShortName = new TLRPC.TL_stickers_checkShortName();
        tL_stickers_checkShortName.short_name = str;
        iy0Var.f25214p0 = ConnectionsManager.getInstance(iy0Var.currentAccount).sendRequest(tL_stickers_checkShortName, new ai.t5(iy0Var, str, textView, 12), 2);
    }

    public static void G(iy0 iy0Var) {
        boolean z10;
        TLRPC.StickerSet stickerSet;
        MediaDataController mediaDataController = MediaDataController.getInstance(iy0Var.currentAccount);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = iy0Var.S;
        if (tL_messages_stickerSet != null && mediaDataController.isStickerPackInstalled(tL_messages_stickerSet.set.f18370id)) {
            z10 = false;
        } else {
            z10 = true;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = iy0Var.S;
        if (tL_messages_stickerSet2 != null && (stickerSet = tL_messages_stickerSet2.set) != null && stickerSet.creator && iy0Var.f25216r == null) {
            iy0Var.f25211n.e(3, R.drawable.tabs_reorder, LocaleController.getString(R.string.StickersReorder));
            iy0Var.f25211n.e(4, R.drawable.msg_edit, LocaleController.getString(R.string.EditName));
            if (z10) {
                iy0Var.f25216r = iy0Var.f25211n.e(5, R.drawable.msg_delete, LocaleController.getString(R.string.Delete));
            } else {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, iy0Var.getContext(), iy0Var.resourcesProvider);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
                org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, iy0Var.resourcesProvider).setOnClickListener(new rx0(iy0Var, 4));
                org.telegram.ui.ActionBar.f1 c10 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.StickersDeleteForEveryone), false, iy0Var.resourcesProvider);
                int themedColor = iy0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19348q7);
                c10.c(themedColor, themedColor);
                c10.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.1f, themedColor));
                org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.StickersRemoveForMe), false, iy0Var.resourcesProvider).setOnClickListener(new rx0(iy0Var, 6));
                c10.setOnClickListener(new rx0(iy0Var, 7));
                iy0Var.f25216r = iy0Var.f25211n.i(R.drawable.msg_delete, null, LocaleController.getString(R.string.Delete), actionBarPopupWindow$ActionBarPopupWindowLayout);
            }
            iy0Var.f25211n.a(-1);
            eb0 eb0Var = new eb0(iy0Var.currentAccount, iy0Var.getContext(), iy0Var.resourcesProvider, new ArrayList(), 4);
            eb0Var.setOnClickListener(new rx0(iy0Var, 8));
            eb0Var.setTag(R.id.fit_width_tag, 1);
            org.telegram.ui.ActionBar.v0 v0Var = iy0Var.f25211n;
            v0Var.o();
            v0Var.f19812b.a(eb0Var, new LinearLayout.LayoutParams(-1, -2));
            int themedColor2 = iy0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19348q7);
            iy0Var.f25216r.c(themedColor2, themedColor2);
            iy0Var.f25216r.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.1f, themedColor2));
            if (iy0Var.f25216r.getRightIcon() != null) {
                iy0Var.f25216r.getRightIcon().setColorFilter(themedColor2);
            }
        }
        if (iy0Var.f25211n.getPopupLayout() != null) {
            iy0Var.f25211n.getPopupLayout().requestLayout();
        }
        iy0Var.f25211n.M(null, null);
    }

    public static void O(iy0 iy0Var) {
        if (iy0Var.f25199c.getChildCount() <= 0) {
            iy0Var.y0(iy0Var.f25199c.getPaddingTop());
            return;
        }
        int i10 = 0;
        View view = null;
        int i11 = -1;
        for (int i12 = 0; i12 < iy0Var.f25199c.getChildCount(); i12++) {
            View childAt = iy0Var.f25199c.getChildAt(i12);
            iy0Var.f25199c.getClass();
            int S = RecyclerView.S(childAt);
            if (i11 == -1 || i11 > S) {
                view = childAt;
                i11 = S;
            }
        }
        if (view != null && view.getTop() >= 0) {
            int top = view.getTop();
            iy0Var.v0(0, false);
            i10 = top;
        } else {
            iy0Var.v0(0, true);
        }
        iy0Var.v0(1, true);
        if (iy0Var.f25202e0 != i10) {
            iy0Var.y0(i10);
        }
    }

    public static void m(iy0 iy0Var, View view, int i10) {
        TLRPC.StickerSet stickerSet;
        String str;
        if (view instanceof cy0) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = iy0Var.S;
            org.telegram.ui.ActionBar.n2 n2Var = iy0Var.L;
            org.telegram.ui.ActionBar.f6 f6Var = iy0Var.resourcesProvider;
            if (n2Var != null) {
                Context context = n2Var.getContext();
                if (!(n2Var instanceof org.telegram.ui.zn)) {
                    oy0.a(tL_messages_stickerSet, n2Var, f6Var);
                    return;
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert3, 0, context, f6Var);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                arrayList.add(LocaleController.getString(R.string.StickersCreateNewSticker));
                org.telegram.ui.Cells.c1.n(R.drawable.menu_sticker_add, 0, arrayList3, arrayList2);
                arrayList.add(LocaleController.getString(R.string.StickersAddAnExistingSticker));
                arrayList3.add(Integer.valueOf(R.drawable.menu_sticker_select));
                arrayList2.add(1);
                org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                ai.s0 s0Var = new ai.s0(n1Var, arrayList2, tL_messages_stickerSet, n2Var, f6Var, 11);
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    org.telegram.ui.ActionBar.f1 c10 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, ((Integer) arrayList3.get(i11)).intValue(), (CharSequence) arrayList.get(i11), false, f6Var);
                    c10.setTag(Integer.valueOf(i11));
                    c10.setOnClickListener(s0Var);
                }
                n1Var.f19656c = 100;
                n1Var.f19658g = true;
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
        } else if (!iy0Var.R) {
            if (iy0Var.W != null) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) iy0Var.d.f24058f.get(i10);
                if (stickerSetCovered != null) {
                    iy0Var.dismiss();
                    TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                    TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
                    tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                    tL_inputStickerSetID.f18363id = stickerSet2.f18370id;
                    new iy0(iy0Var.N, iy0Var.L, tL_inputStickerSetID, null, null, iy0Var.resourcesProvider).show();
                    return;
                }
                return;
            }
            ArrayList arrayList4 = iy0Var.Y;
            if (arrayList4 != null) {
                if (i10 >= 0 && i10 < arrayList4.size()) {
                    SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) iy0Var.Y.get(i10);
                    iy0Var.U = importingSticker;
                    if (importingSticker.validated) {
                        TextView textView = iy0Var.G;
                        textView.setText(Emoji.replaceEmoji(importingSticker.emoji, textView.getPaint().getFontMetricsInt(), false));
                        v9 v9Var = iy0Var.F;
                        ImageLocation forPath = ImageLocation.getForPath(iy0Var.U.path);
                        if (iy0Var.U.animated) {
                            str = "tgs";
                        } else {
                            str = null;
                        }
                        v9Var.m(forPath, null, null, null, null, str, 0, null);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) iy0Var.f25222x.getLayoutParams();
                        layoutParams.topMargin = iy0Var.f25202e0;
                        iy0Var.f25222x.setLayoutParams(layoutParams);
                        iy0Var.f25222x.setVisibility(0);
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ObjectAnimator.ofFloat(iy0Var.f25222x, View.ALPHA, 0.0f, 1.0f));
                        animatorSet.setDuration(200L);
                        animatorSet.start();
                        return;
                    }
                    return;
                }
                return;
            }
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = iy0Var.S;
            if (tL_messages_stickerSet2 != null && i10 >= 0 && i10 < tL_messages_stickerSet2.documents.size()) {
                iy0Var.T = iy0Var.S.documents.get(i10);
                int i12 = 0;
                while (true) {
                    if (i12 >= iy0Var.T.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = iy0Var.T.attributes.get(i12);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                        String str2 = documentAttribute.alt;
                        if (str2 != null && str2.length() > 0) {
                            TextView textView2 = iy0Var.G;
                            textView2.setText(Emoji.replaceEmoji(documentAttribute.alt, textView2.getPaint().getFontMetricsInt(), false));
                        }
                    } else {
                        i12++;
                    }
                }
                iy0Var.G.setText(Emoji.replaceEmoji(MediaDataController.getInstance(iy0Var.currentAccount).getEmojiForSticker(iy0Var.T.f18349id), iy0Var.G.getPaint().getFontMetricsInt(), false));
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = iy0Var.S;
                if ((tL_messages_stickerSet3 == null || (stickerSet = tL_messages_stickerSet3.set) == null || !stickerSet.emojis) && !org.telegram.ui.st.q().y(view)) {
                    iy0Var.F.getImageReceiver().setImage(ImageLocation.getForDocument(iy0Var.T), (String) null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(iy0Var.T.thumbs, 90), iy0Var.T), (String) null, "webp", iy0Var.S, 1);
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) iy0Var.f25222x.getLayoutParams();
                    layoutParams2.topMargin = iy0Var.f25202e0;
                    iy0Var.f25222x.setLayoutParams(layoutParams2);
                    iy0Var.f25222x.setVisibility(0);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(iy0Var.f25222x, View.ALPHA, 0.0f, 1.0f));
                    animatorSet2.setDuration(200L);
                    animatorSet2.start();
                }
            }
        }
    }

    public static void n(iy0 iy0Var) {
        iy0Var.f25211n.n();
        oy0.b(iy0Var.S.set, iy0Var.resourcesProvider, iy0Var.getContext(), new tx0(iy0Var, 4));
    }

    public static void o(org.telegram.ui.rs0 rs0Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers) {
        rs0Var.f25204f0 = 0;
        if (tL_error == null && (tLObject instanceof Vector)) {
            Vector vector = (Vector) tLObject;
            if (vector.objects.isEmpty()) {
                rs0Var.dismiss();
                return;
            } else if (vector.objects.size() == 1) {
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                rs0Var.V = tL_inputStickerSetID;
                TLRPC.StickerSet stickerSet = ((TLRPC.StickerSetCovered) vector.objects.get(0)).set;
                tL_inputStickerSetID.f18363id = stickerSet.f18370id;
                tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                rs0Var.t0();
                return;
            } else {
                ArrayList arrayList = new ArrayList();
                rs0Var.W = arrayList;
                arrayList.addAll(vector.objects);
                rs0Var.f25199c.setLayoutParams(w7.y5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
                rs0Var.h.setVisibility(8);
                rs0Var.J[0].setVisibility(8);
                rs0Var.d.l();
                return;
            }
        }
        d5.f0(rs0Var.currentAccount, tL_error, rs0Var.L, tL_messages_getAttachedStickers, new Object[0]);
        rs0Var.dismiss();
    }

    public static void o0(org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, TLRPC.Document document) {
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
            AndroidUtilities.runOnUIThread(new ci.u1((Object) n2Var, (Object) tL_messages_stickerSet, (Object) document, (Object) znVar2, z10, 19), 300L);
        }
    }

    public static void p(org.telegram.ui.rs0 rs0Var, Object obj, TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers, org.telegram.ui.oo ooVar, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && obj != null) {
            FileRefController.getInstance(rs0Var.currentAccount).requestReference(obj, tL_messages_getAttachedStickers, ooVar);
        } else {
            ooVar.run(tLObject, tL_error);
        }
    }

    public static void q(iy0 iy0Var) {
        iy0Var.dismiss();
        MediaDataController.getInstance(iy0Var.currentAccount).toggleStickerSet(iy0Var.getContext(), iy0Var.S, 0, iy0Var.L, true, iy0Var.f25208j0);
    }

    public static void r(iy0 iy0Var) {
        iy0Var.f25211n.n();
        iy0Var.dismiss();
        MediaDataController.getInstance(iy0Var.currentAccount).toggleStickerSet(iy0Var.getContext(), iy0Var.S, 1, iy0Var.L, true, true);
    }

    public static void s(iy0 iy0Var) {
        iy0Var.dismiss();
        MediaDataController.getInstance(iy0Var.currentAccount).toggleStickerSet(iy0Var.getContext(), iy0Var.S, 1, iy0Var.L, false, false);
    }

    public static void t(iy0 iy0Var) {
        iy0Var.dismiss();
        MediaDataController.getInstance(iy0Var.currentAccount).toggleStickerSet(iy0Var.getContext(), iy0Var.S, 1, iy0Var.L, false, false);
    }

    public static boolean v(iy0 iy0Var, MotionEvent motionEvent) {
        if (iy0Var.R) {
            return false;
        }
        return org.telegram.ui.st.q().s(motionEvent, iy0Var.f25199c, iy0Var.H, iy0Var.m0, iy0Var.resourcesProvider);
    }

    public static void w(iy0 iy0Var, ArrayList arrayList, Boolean bool) {
        iy0Var.Y = arrayList;
        if (arrayList.isEmpty()) {
            iy0Var.dismiss();
            return;
        }
        iy0Var.d.l();
        if (bool.booleanValue()) {
            iy0Var.Z = new HashMap();
            int size = iy0Var.Y.size();
            for (int i10 = 0; i10 < size; i10++) {
                SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) iy0Var.Y.get(i10);
                iy0Var.Z.put(importingSticker.path, importingSticker);
                FileLoader.getInstance(iy0Var.currentAccount).uploadFile(importingSticker.path, false, true, 67108864);
            }
        }
        iy0Var.B0();
    }

    public static void x(iy0 iy0Var, int[] iArr, EditTextBoldCursor editTextBoldCursor, TextView textView, TextView textView2, AlertDialog$Builder alertDialog$Builder) {
        int i10 = iArr[0];
        if (i10 != 1) {
            if (i10 == 0) {
                iArr[0] = 1;
                TLRPC.TL_stickers_suggestShortName tL_stickers_suggestShortName = new TLRPC.TL_stickers_suggestShortName();
                String obj = editTextBoldCursor.getText().toString();
                iy0Var.f25217r0 = obj;
                tL_stickers_suggestShortName.title = obj;
                ConnectionsManager.getInstance(iy0Var.currentAccount).sendRequest(tL_stickers_suggestShortName, new ci.kd(iy0Var, editTextBoldCursor, textView, textView2, iArr));
            } else if (i10 == 2) {
                iArr[0] = 3;
                if (!iy0Var.f25215q0) {
                    AndroidUtilities.shakeView(editTextBoldCursor);
                    try {
                        editTextBoldCursor.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                SendMessagesHelper.getInstance(iy0Var.currentAccount).prepareImportStickers(iy0Var.f25217r0, iy0Var.f25213o0, iy0Var.f25196a0, iy0Var.Y, new sx0(iy0Var));
                alertDialog$Builder.f18669a.L0.run();
                iy0Var.dismiss();
            }
        }
    }

    public static void z(iy0 iy0Var) {
        iy0Var.dismiss();
        MediaDataController.getInstance(iy0Var.currentAccount).toggleStickerSet(iy0Var.getContext(), iy0Var.S, 1, iy0Var.L, true, iy0Var.f25208j0);
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
                if (this.f25197b == null) {
                    this.f25197b = Pattern.compile("@[a-zA-Z\\d_]{1,32}");
                }
                Matcher matcher = this.f25197b.matcher(replaceEmoji);
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
                    spannableStringBuilder.setSpan(new l4(replaceEmoji.subSequence(start + 1, end).toString(), 1, this), start, end, 0);
                }
                if (spannableStringBuilder != null) {
                    replaceEmoji = spannableStringBuilder;
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            this.h.setText(replaceEmoji);
            if (s0()) {
                int measuredWidth = this.f25199c.getMeasuredWidth();
                if (measuredWidth == 0) {
                    measuredWidth = AndroidUtilities.displaySize.x;
                }
                ey0 ey0Var = this.d;
                if (AndroidUtilities.isTablet()) {
                    f7 = 60.0f;
                } else {
                    f7 = 45.0f;
                }
                ey0Var.d = Math.max(1, measuredWidth / AndroidUtilities.dp(f7));
            } else {
                this.d.d = 5;
            }
            this.M.y1(this.d.d);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.S;
            int i17 = -1;
            if (tL_messages_stickerSet2 != null && (stickerSet7 = tL_messages_stickerSet2.set) != null && stickerSet7.emojis && !UserConfig.getInstance(this.currentAccount).isPremium() && this.f25201d0 == null) {
                if (this.S.documents != null) {
                    for (int i18 = 0; i18 < this.S.documents.size(); i18++) {
                        if (!MessageObject.isFreeEmoji(this.S.documents.get(i18))) {
                            this.v.setVisibility(0);
                            this.f25218s.setBackground(null);
                            w0(null, null, -1);
                            this.v.a(LocaleController.getString(R.string.UnlockPremiumEmoji), new rx0(this, 0), false);
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
                    if (stickerSets.get(i19) != null && stickerSets.get(i19).set != null && stickerSets.get(i19).set.f18370id == this.S.set.f18370id) {
                        z11 = true;
                        break;
                    }
                }
                z11 = false;
                z10 = !z11;
            } else if (tL_messages_stickerSet3 != null && (stickerSet = tL_messages_stickerSet3.set) != null && mediaDataController.isStickerPackInstalled(stickerSet.f18370id)) {
                z10 = false;
            } else {
                z10 = true;
            }
            org.telegram.ui.o70 o70Var = this.f25201d0;
            if (o70Var != null) {
                rx0 rx0Var = new rx0(this, 5);
                boolean z12 = o70Var.f36218a;
                if (o70Var.f36220c.N) {
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
                boolean z13 = this.f25201d0.f36218a;
                if (z13) {
                    i13 = org.telegram.ui.ActionBar.j6.f19348q7;
                } else {
                    i13 = org.telegram.ui.ActionBar.j6.Sh;
                }
                if (!z13) {
                    i14 = org.telegram.ui.ActionBar.j6.Oh;
                } else {
                    i14 = -1;
                }
                if (!z13) {
                    i17 = org.telegram.ui.ActionBar.j6.Qh;
                }
                x0(rx0Var, str, i13, i14, i17);
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
                x0(new rx0(this, 9), formatPluralString2, org.telegram.ui.ActionBar.j6.Sh, org.telegram.ui.ActionBar.j6.Oh, org.telegram.ui.ActionBar.j6.Qh);
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
                    x0(new rx0(this, 10), formatPluralString, org.telegram.ui.ActionBar.j6.Sh, org.telegram.ui.ActionBar.j6.Oh, org.telegram.ui.ActionBar.j6.Qh);
                } else {
                    String str2 = formatPluralString;
                    if (this.S.set.official) {
                        w0(new rx0(this, 11), str2, org.telegram.ui.ActionBar.j6.f19348q7);
                    } else {
                        w0(new rx0(this, 12), str2, org.telegram.ui.ActionBar.j6.f19348q7);
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
                w0(null, LocaleController.getString(R.string.ImportStickersProcessing), org.telegram.ui.ActionBar.j6.f19347q5);
                this.f25218s.setEnabled(false);
                return;
            }
            rx0 rx0Var2 = new rx0(this, 13);
            int i20 = R.string.ImportStickers;
            ArrayList arrayList7 = this.Y;
            if (arrayList7 != null) {
                size2 = arrayList7.size();
            } else {
                size2 = arrayList5.size();
            }
            w0(rx0Var2, LocaleController.formatString("ImportStickers", i20, LocaleController.formatPluralString("Stickers", size2, new Object[0])), org.telegram.ui.ActionBar.j6.f19293n5);
            this.f25218s.setEnabled(true);
            return;
        }
        w0(new rx0(this, 14), LocaleController.getString(R.string.Close), org.telegram.ui.ActionBar.j6.f19293n5);
    }

    public final void C0() {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        Point point = AndroidUtilities.displaySize;
        int min = (int) ((Math.min(point.x, point.y) / 2) / AndroidUtilities.density);
        if (this.X != null) {
            this.f25223y.setText(LocaleController.getString(R.string.ImportStickersRemove));
            this.f25223y.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19348q7));
            float f7 = min;
            this.F.setLayoutParams(w7.y5.d(min, f7, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.G.setLayoutParams(w7.y5.d(min, f7, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.f25223y.setVisibility(0);
            this.E.setVisibility(0);
        } else if (this.f25198b0 != null && ((tL_messages_stickerSet = this.S) == null || !tL_messages_stickerSet.set.masks)) {
            this.f25223y.setText(LocaleController.getString(R.string.SendSticker));
            float f10 = min;
            this.F.setLayoutParams(w7.y5.d(min, f10, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.G.setLayoutParams(w7.y5.d(min, f10, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.f25223y.setVisibility(0);
            this.E.setVisibility(0);
        } else {
            this.f25223y.setText(LocaleController.getString(R.string.Close));
            this.F.setLayoutParams(w7.y5.e(min, min, 17));
            this.G.setLayoutParams(w7.y5.e(min, min, 17));
            this.f25223y.setVisibility(8);
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
            ai.w0 w0Var = this.f25199c;
            if (w0Var != null) {
                int childCount = w0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    this.f25199c.getChildAt(i12).invalidate();
                }
            }
        } else if (i10 == NotificationCenter.fileUploaded) {
            HashMap hashMap = this.Z;
            if (hashMap != null) {
                String str = (String) objArr[0];
                SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) hashMap.get(str);
                if (importingSticker != null) {
                    importingSticker.uploadMedia(this.currentAccount, (TLRPC.InputFile) objArr[1], new en0(this, str, importingSticker, 9));
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
                    tL_messages_stickerSet = mediaDataController.getStickerSetById(this.V.f18363id);
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
        this.f25210l0.E(false);
        Runnable runnable = this.f25219s0;
        if (runnable != null) {
            runnable.run();
        }
        if (this.f25204f0 != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f25204f0, true);
            this.f25204f0 = 0;
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
        x6 x6Var = new x6(this, 9);
        ViewGroup viewGroup = this.containerView;
        Drawable[] drawableArr = {this.shadowDrawable};
        int i10 = org.telegram.ui.ActionBar.j6.f19180h5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(viewGroup, 0, null, null, drawableArr, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.containerView, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Ii));
        iy0 iy0Var = this.d.f24060r;
        if (iy0Var.W != null) {
            org.telegram.ui.Cells.t3.a(arrayList, iy0Var.f25199c, x6Var);
        }
        View[] viewArr = this.J;
        View view = viewArr[0];
        int i11 = org.telegram.ui.ActionBar.j6.V5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(viewArr[1], 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f25199c, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.A5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f19216j5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 2, null, null, null, null, org.telegram.ui.ActionBar.j6.f19236k5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f25211n, 65568, null, null, null, null, org.telegram.ui.ActionBar.j6.Ni));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f25218s, 32, null, null, null, null, i10));
        o6 o6Var = this.f25218s;
        int i12 = org.telegram.ui.ActionBar.j6.f19199i6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(o6Var, 65568, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f25218s, 4, null, null, null, null, this.f25209k0));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f25223y, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f19293n5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f25223y, 32, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f25223y, 65568, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.f19254l5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.Ji));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.G8));
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
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19458w6));
            this.f25215q0 = true;
            this.f25213o0 = str;
            return;
        }
        en0 en0Var = this.f25212n0;
        if (en0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(en0Var);
            this.f25212n0 = null;
            this.f25213o0 = null;
            if (this.f25214p0 != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f25214p0, true);
            }
        }
        if (TextUtils.isEmpty(str)) {
            textView.setText(LocaleController.getString(R.string.ImportStickersEnterUrlInfo));
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19347q5));
            return;
        }
        this.f25215q0 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                int length = str.length();
                for (int i10 = 0; i10 < length; i10++) {
                    char charAt = str.charAt(i10);
                    if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        textView.setText(LocaleController.getString(R.string.ImportStickersEnterUrlInfo));
                        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19330p7));
                        return;
                    }
                }
            } else {
                textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalid));
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19330p7));
                return;
            }
        }
        if (str != null && str.length() >= 5) {
            if (str.length() > 32) {
                textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalidLong));
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19330p7));
                return;
            }
            textView.setText(LocaleController.getString(R.string.ImportStickersLinkChecking));
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.F6));
            this.f25213o0 = str;
            en0 en0Var2 = new en0(this, str, textView, 12);
            this.f25212n0 = en0Var2;
            AndroidUtilities.runOnUIThread(en0Var2, 300L);
            return;
        }
        textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalidShort));
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19330p7));
    }

    public final void n0() {
        if (!this.R) {
            return;
        }
        this.e.e(null);
        this.R = false;
        this.f25210l0.E(true);
        AndroidUtilities.forEachViews((RecyclerView) this.f25199c, (e2.h) new ai.i(25));
        this.f25211n.postDelayed(new tx0(this, 0), 200L);
        this.f25218s.c(LocaleController.getString(R.string.EditStickers), true, true);
    }

    @Override
    public final void onBackPressed() {
        if (org.telegram.ui.st.q().E) {
            org.telegram.ui.st.q().o();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onStart() {
        super.onStart();
        pc.a((FrameLayout) this.containerView, new ai.w4(this, 8));
    }

    @Override
    public final void onStop() {
        super.onStop();
        pc.h((FrameLayout) this.containerView);
    }

    public final void p0() {
        if (this.R) {
            return;
        }
        this.e.e(this.f25199c);
        this.R = true;
        com.google.firebase.messaging.n nVar = this.f25210l0;
        nVar.E(false);
        Float valueOf = Float.valueOf(0.0f);
        ArrayList arrayList = (ArrayList) nVar.d;
        if (arrayList.isEmpty()) {
            for (int i10 = 0; i10 < 6; i10++) {
                arrayList.add(valueOf);
                ((ArrayList) nVar.e).add(valueOf);
                ((ArrayList) nVar.f7331f).add(valueOf);
            }
        }
        int i11 = 0;
        for (int i12 = 6; i11 < i12; i12 = 6) {
            long nextFloat = Utilities.random.nextFloat() * 300;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, -2.0f, 0.0f, 2.0f, 0.0f);
            ofFloat.addUpdateListener(new hy0(nVar, i11, 3));
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(1);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setCurrentPlayTime(nextFloat);
            long j3 = 300;
            ofFloat.setDuration(j3);
            ofFloat.start();
            float dp = AndroidUtilities.dp(0.5f);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, dp, 0.0f, -dp, 0.0f);
            ofFloat2.addUpdateListener(new hy0(nVar, i11, 4));
            ofFloat2.setRepeatCount(-1);
            ofFloat2.setRepeatMode(1);
            ofFloat2.setInterpolator(new LinearInterpolator());
            ofFloat2.setCurrentPlayTime(nextFloat);
            ofFloat2.setDuration((long) (300 * 1.2d));
            ofFloat2.start();
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, dp, 0.0f - dp, 0.0f);
            ofFloat3.addUpdateListener(new hy0(nVar, i11, 5));
            ofFloat3.setRepeatCount(-1);
            ofFloat3.setRepeatMode(1);
            ofFloat3.setInterpolator(new LinearInterpolator());
            ofFloat3.setCurrentPlayTime(nextFloat);
            ofFloat3.setDuration(j3);
            ofFloat3.start();
            ((ArrayList) nVar.f7328a).add(ofFloat);
            ((ArrayList) nVar.f7329b).add(ofFloat2);
            ((ArrayList) nVar.f7330c).add(ofFloat3);
            i11++;
        }
        AndroidUtilities.forEachViews((RecyclerView) this.f25199c, (e2.h) new ai.i(26));
        this.f25211n.postDelayed(new tx0(this, 1), 200L);
        this.f25218s.c(LocaleController.getString(R.string.Done), true, true);
    }

    public final void q0() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f25222x, View.ALPHA, 0.0f));
        animatorSet.setDuration(200L);
        animatorSet.addListener(new gd0(this, 18));
        animatorSet.start();
    }

    public final void r0(Context context) {
        int i10;
        ay0 ay0Var = new ay0(this, context);
        this.containerView = ay0Var;
        ay0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i11, 0, i11, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(48.0f);
        View view = new View(context);
        View[] viewArr = this.J;
        viewArr[0] = view;
        int i12 = org.telegram.ui.ActionBar.j6.V5;
        view.setBackgroundColor(getThemedColor(i12));
        viewArr[0].setAlpha(0.0f);
        viewArr[0].setVisibility(4);
        viewArr[0].setTag(1);
        this.containerView.addView(viewArr[0], layoutParams);
        ai.w0 w0Var = new ai.w0(this, context, 23);
        this.f25199c = w0Var;
        w0Var.setTag(14);
        ai.w0 w0Var2 = this.f25199c;
        getContext();
        bi.l lVar = new bi.l(this);
        this.M = lVar;
        w0Var2.setLayoutManager(lVar);
        this.M.O = new ci.x1(this, 5);
        this.e = new s4.y(new by0(this));
        ai.w0 w0Var3 = this.f25199c;
        ey0 ey0Var = new ey0(this, context);
        this.d = ey0Var;
        w0Var3.setAdapter(ey0Var);
        this.f25199c.setVerticalScrollBarEnabled(false);
        this.f25199c.i(new ai.t(8));
        this.f25199c.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        this.f25199c.setClipToPadding(false);
        this.f25199c.setEnabled(true);
        this.f25199c.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.j6.A5));
        this.f25199c.setOnTouchListener(new vr(this, 5));
        this.f25199c.setOnScrollListener(new vb0(this, 8));
        j jVar = new j(this, 16);
        this.H = jVar;
        this.f25199c.setOnItemClickListener(jVar);
        this.containerView.addView(this.f25199c, w7.y5.d(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 48.0f));
        ai.f0 f0Var = new ai.f0(this, context, 20);
        this.K = f0Var;
        this.containerView.addView(f0Var, w7.y5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.f25199c.setEmptyView(this.K);
        this.K.setOnTouchListener(new bi.d(24));
        n90 n90Var = new n90(context, null);
        this.h = n90Var;
        n90Var.setLines(1);
        this.h.setSingleLine(true);
        this.h.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19216j5));
        this.h.setTextSize(1, 20.0f);
        this.h.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19236k5));
        this.h.setEllipsize(TextUtils.TruncateAt.END);
        this.h.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f));
        this.h.setGravity(16);
        this.h.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(this.h, w7.y5.d(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(context, null, 0, getThemedColor(org.telegram.ui.ActionBar.j6.Ji), false, this.resourcesProvider);
        this.f25211n = v0Var;
        v0Var.setLongClickEnabled(false);
        this.f25211n.setSubMenuOpenSide(2);
        this.f25211n.setIcon(R.drawable.ic_ab_other);
        this.f25211n.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(getThemedColor(org.telegram.ui.ActionBar.j6.Ni), 1, -1));
        this.containerView.addView(this.f25211n, w7.y5.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
        this.f25211n.e(1, R.drawable.msg_share, LocaleController.getString(R.string.StickersShare));
        this.f25211n.e(2, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink));
        this.f25211n.setOnClickListener(new rx0(this, 1));
        this.f25211n.setDelegate(new sx0(this));
        this.f25211n.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        org.telegram.ui.ActionBar.v0 v0Var2 = this.f25211n;
        if (this.V != null) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        v0Var2.setVisibility(i10);
        this.K.addView(new RadialProgressView(context, null), w7.y5.e(-2, -2, 17));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams2.bottomMargin = AndroidUtilities.dp(48.0f);
        View view2 = new View(context);
        viewArr[1] = view2;
        view2.setBackgroundColor(getThemedColor(i12));
        this.containerView.addView(viewArr[1], layoutParams2);
        o6 o6Var = new o6(context, false, false, false);
        this.f25218s = o6Var;
        int i13 = org.telegram.ui.ActionBar.j6.f19180h5;
        int themedColor = getThemedColor(i13);
        int i14 = org.telegram.ui.ActionBar.j6.f19199i6;
        o6Var.setBackground(org.telegram.ui.ActionBar.j6.g0(themedColor, getThemedColor(i14)));
        o6 o6Var2 = this.f25218s;
        int i15 = org.telegram.ui.ActionBar.j6.f19293n5;
        this.f25209k0 = i15;
        o6Var2.setTextColor(getThemedColor(i15));
        this.f25218s.setTextSize(AndroidUtilities.dp(14.0f));
        this.f25218s.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        this.f25218s.setTypeface(AndroidUtilities.bold());
        this.f25218s.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f25221w = frameLayout;
        frameLayout.addView(this.f25218s, w7.y5.c(48.0f, -1));
        this.containerView.addView(this.f25221w, w7.y5.e(-1, -2, 83));
        rg.p0 p0Var = new rg.p0(AndroidUtilities.dp(24.0f), context, this.resourcesProvider, false);
        this.v = p0Var;
        p0Var.setIcon(R.raw.unlock_icon);
        this.v.setVisibility(4);
        this.containerView.addView(this.v, w7.y5.d(-1, 48.0f, 87, 8.0f, 0.0f, 8.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f25222x = frameLayout2;
        frameLayout2.setVisibility(8);
        this.f25222x.setSoundEffectsEnabled(false);
        this.containerView.addView(this.f25222x, w7.y5.c(-1.0f, -1));
        this.f25222x.setOnClickListener(new rx0(this, 2));
        v9 v9Var = new v9(context);
        this.F = v9Var;
        v9Var.setAspectFit(true);
        this.F.setLayerNum(7);
        this.f25222x.addView(this.F);
        TextView textView = new TextView(context);
        this.G = textView;
        textView.setTextSize(1, 30.0f);
        this.G.setGravity(85);
        this.f25222x.addView(this.G);
        TextView textView2 = new TextView(context);
        this.f25223y = textView2;
        textView2.setTextSize(1, 14.0f);
        this.f25223y.setTextColor(getThemedColor(i15));
        this.f25223y.setBackground(org.telegram.ui.ActionBar.j6.g0(getThemedColor(i13), getThemedColor(i14)));
        this.f25223y.setGravity(17);
        this.f25223y.setPadding(AndroidUtilities.dp(29.0f), 0, AndroidUtilities.dp(29.0f), 0);
        this.f25223y.setTypeface(AndroidUtilities.bold());
        this.f25222x.addView(this.f25223y, w7.y5.e(-1, 48, 83));
        this.f25223y.setOnClickListener(new rx0(this, 3));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams3.bottomMargin = AndroidUtilities.dp(48.0f);
        View view3 = new View(context);
        this.E = view3;
        view3.setBackgroundColor(getThemedColor(i12));
        this.f25222x.addView(this.E, layoutParams3);
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
        this.f25219s0 = runnable;
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
                this.S = mediaDataController.getStickerSetById(this.V.f18363id);
            }
            if (this.S == null) {
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                tL_messages_getStickerSet.stickerset = this.V;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getStickerSet, new org.telegram.ui.oo(14, this, mediaDataController));
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
            this.f25206h0 = !tL_messages_stickerSet.set.masks;
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
                animatorSetArr[i10].addListener(new ka0(this, i10, z10, 1));
                animatorSetArr[i10].start();
            }
        }
    }

    public final void w0(View.OnClickListener onClickListener, String str, int i10) {
        x0(onClickListener, str, i10, -1, -1);
    }

    public final void x0(View.OnClickListener onClickListener, String str, int i10, int i11, int i12) {
        if (i10 >= 0) {
            o6 o6Var = this.f25218s;
            this.f25209k0 = i10;
            o6Var.setTextColor(getThemedColor(i10));
        }
        this.f25218s.c(str, false, true);
        this.f25218s.setOnClickListener(onClickListener);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f25218s.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.J[1].getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.f25199c.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.K.getLayoutParams();
        if (onClickListener == null) {
            this.f25218s.setAlpha(0.0f);
        } else if (i11 >= 0 && i12 >= 0) {
            o6 o6Var2 = this.f25218s;
            int dp = AndroidUtilities.dp(24.0f);
            int themedColor = getThemedColor(i11);
            int themedColor2 = getThemedColor(i12);
            o6Var2.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, themedColor, themedColor2, themedColor2));
            this.f25221w.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19180h5));
            int dp2 = AndroidUtilities.dp(8.0f);
            marginLayoutParams.bottomMargin = dp2;
            marginLayoutParams.rightMargin = dp2;
            marginLayoutParams.topMargin = dp2;
            marginLayoutParams.leftMargin = dp2;
            int dp3 = AndroidUtilities.dp(64.0f);
            marginLayoutParams2.bottomMargin = dp3;
            marginLayoutParams3.bottomMargin = dp3;
            marginLayoutParams4.bottomMargin = dp3;
            if (this.f25218s.getAlpha() < 1.0f) {
                org.telegram.messenger.rk.s(this.f25218s.animate().alpha(1.0f), qr.h, 240L);
            }
        } else {
            this.f25218s.setBackground(org.telegram.ui.ActionBar.j6.g0(getThemedColor(org.telegram.ui.ActionBar.j6.f19180h5), org.telegram.ui.ActionBar.j6.l1(0.1f, getThemedColor(org.telegram.ui.ActionBar.j6.f19348q7))));
            this.f25221w.setBackgroundColor(0);
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.rightMargin = 0;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.leftMargin = 0;
            int dp4 = AndroidUtilities.dp(48.0f);
            marginLayoutParams2.bottomMargin = dp4;
            marginLayoutParams3.bottomMargin = dp4;
            marginLayoutParams4.bottomMargin = dp4;
            if (this.f25218s.getAlpha() < 1.0f) {
                org.telegram.messenger.rk.s(this.f25218s.animate().alpha(1.0f), qr.h, 240L);
            }
        }
        this.containerView.requestLayout();
    }

    public final void y0(int i10) {
        this.f25202e0 = i10;
        if (this.W == null) {
            float f7 = i10;
            this.h.setTranslationY(f7);
            if (this.X == null) {
                this.f25211n.setTranslationY(f7);
            }
            this.J[0].setTranslationY(f7);
        }
        this.containerView.invalidate();
    }

    public final void z0(boolean z10) {
        iy0 iy0Var = this.d.f24060r;
        if (iy0Var.W != null) {
            int childCount = iy0Var.f25199c.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = iy0Var.f25199c.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.t3) {
                    ((org.telegram.ui.Cells.t3) childAt).d();
                }
            }
        }
        this.h.setHighlightColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19254l5));
        this.f25222x.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19180h5) & (-536870913));
        this.f25211n.setIconColor(getThemedColor(org.telegram.ui.ActionBar.j6.Ji));
        this.f25211n.G(getThemedColor(org.telegram.ui.ActionBar.j6.E8), false);
        this.f25211n.G(getThemedColor(org.telegram.ui.ActionBar.j6.F8), true);
        this.f25211n.setPopupItemsSelectorColor(getThemedColor(org.telegram.ui.ActionBar.j6.I5));
        this.f25211n.B(getThemedColor(org.telegram.ui.ActionBar.j6.G8));
        if (this.f25216r != null) {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.f19348q7);
            this.f25216r.c(themedColor, themedColor);
            this.f25216r.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.1f, themedColor));
            if (this.f25216r.getRightIcon() != null) {
                this.f25216r.getRightIcon().setColorFilter(themedColor);
            }
        }
        if (z10) {
            if (org.telegram.ui.ActionBar.j6.sl != null && this.f25220t0 == null) {
                ArrayList themeDescriptions = getThemeDescriptions();
                this.f25220t0 = themeDescriptions;
                int size = themeDescriptions.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((org.telegram.ui.ActionBar.l6) this.f25220t0.get(i11)).h = null;
                }
            }
            int size2 = this.f25220t0.size();
            for (int i12 = 0; i12 < size2; i12++) {
                org.telegram.ui.ActionBar.l6 l6Var = (org.telegram.ui.ActionBar.l6) this.f25220t0.get(i12);
                l6Var.d(getThemedColor(l6Var.f19624f), false, false);
            }
        }
        if (org.telegram.ui.ActionBar.j6.sl == null && this.f25220t0 != null) {
            this.f25220t0 = null;
        }
    }

    public iy0(Context context, String str, ArrayList arrayList, ArrayList arrayList2) {
        super(1, context, (org.telegram.ui.ActionBar.f6) null, false);
        this.I = new AnimatorSet[2];
        this.J = new View[2];
        this.f25208j0 = true;
        this.f25210l0 = new com.google.firebase.messaging.n(6);
        this.m0 = new xx0(this);
        fixNavigationBar();
        this.N = (Activity) context;
        this.X = arrayList;
        this.f25196a0 = str;
        Utilities.globalQueue.postRunnable(new en0((Object) this, (Object) arrayList, (Object) arrayList2, 13));
        r0(context);
    }

    public iy0(Context context, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.InputStickerSet inputStickerSet, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, fy0 fy0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, false);
        this.I = new AnimatorSet[2];
        this.J = new View[2];
        this.f25208j0 = true;
        this.f25210l0 = new com.google.firebase.messaging.n(6);
        this.m0 = new xx0(this);
        fixNavigationBar();
        this.f25198b0 = fy0Var;
        this.V = inputStickerSet;
        this.S = tL_messages_stickerSet;
        this.L = n2Var;
        t0();
        r0(context);
    }
}
