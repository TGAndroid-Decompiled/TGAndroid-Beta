package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
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
import java.util.HashSet;
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
public class cz0 extends org.telegram.ui.ActionBar.k3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f27285w0 = 0;
    public View E;
    public y9 F;
    public TextView G;
    public j H;
    public final AnimatorSet[] I;
    public final View[] J;
    public bh.r K;
    public final org.telegram.ui.ActionBar.r2 L;
    public ei.k M;
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
    public final String f27286a0;
    public Pattern f27287b;
    public final zy0 f27288b0;
    public bi.r1 f27289c;
    public az0 f27290c0;
    public yy0 d;
    public org.telegram.ui.a70 f27291d0;
    public s4.z e;
    public int f27292e0;
    public TLRPC.Document f27293f;
    public int f27294f0;
    public boolean f27295g0;
    public z90 h;
    public boolean f27296h0;
    public boolean f27297i0;
    public boolean f27298j0;
    public int f27299k0;
    public final aa.m0 f27300l0;
    public final ry0 m0;
    public org.telegram.ui.ActionBar.w0 f27301n;
    public ny0 f27302n0;
    public String f27303o0;
    public int f27304p0;
    public boolean f27305q0;
    public org.telegram.ui.ActionBar.g1 f27306r;
    public String f27307r0;
    public s6 f27308s;
    public Runnable f27309s0;
    public ArrayList f27310t0;
    public int f27311u0;
    public tg.p0 v;
    public int f27312v0;
    public FrameLayout f27313w;
    public FrameLayout f27314x;
    public TextView f27315y;

    public cz0(Context context, Object obj, TLObject tLObject, org.telegram.ui.ActionBar.u6 u6Var) {
        super(1, context, u6Var, false);
        this.I = new AnimatorSet[2];
        this.J = new View[2];
        this.f27298j0 = true;
        this.f27300l0 = new aa.m0(7);
        this.m0 = new ry0(this);
        this.resourcesProvider = u6Var;
        fixNavigationBar();
        this.N = (Activity) context;
        TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = new TLRPC.TL_messages_getAttachedStickers();
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.Photo photo = (TLRPC.Photo) tLObject;
            TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = new TLRPC.TL_inputStickeredMediaPhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_inputStickeredMediaPhoto.f22097id = tL_inputPhoto;
            tL_inputPhoto.f22046id = photo.f22051id;
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
            tL_inputStickeredMediaDocument.f22096id = tL_inputDocument;
            tL_inputDocument.f22039id = document.f22033id;
            tL_inputDocument.access_hash = document.access_hash;
            byte[] bArr2 = document.file_reference;
            tL_inputDocument.file_reference = bArr2;
            if (bArr2 == null) {
                tL_inputDocument.file_reference = new byte[0];
            }
            tL_messages_getAttachedStickers.media = tL_inputStickeredMediaDocument;
        }
        org.telegram.ui.es0 es0Var = (org.telegram.ui.es0) this;
        this.f27294f0 = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getAttachedStickers, new bi.i2(es0Var, obj, tL_messages_getAttachedStickers, new org.telegram.ui.z7(23, es0Var, tL_messages_getAttachedStickers), 12));
        t0(context);
    }

    public static void A(cz0 cz0Var, int[] iArr, EditTextBoldCursor editTextBoldCursor, TextView textView, TextView textView2, AlertDialog$Builder alertDialog$Builder) {
        int i10 = iArr[0];
        if (i10 != 1) {
            if (i10 == 0) {
                iArr[0] = 1;
                TLRPC.TL_stickers_suggestShortName tL_stickers_suggestShortName = new TLRPC.TL_stickers_suggestShortName();
                String obj = editTextBoldCursor.getText().toString();
                cz0Var.f27307r0 = obj;
                tL_stickers_suggestShortName.title = obj;
                ConnectionsManager.getInstance(cz0Var.currentAccount).sendRequest(tL_stickers_suggestShortName, new bi.n9(cz0Var, editTextBoldCursor, textView, textView2, iArr, 7));
            } else if (i10 == 2) {
                iArr[0] = 3;
                if (!cz0Var.f27305q0) {
                    AndroidUtilities.shakeView(editTextBoldCursor);
                    try {
                        editTextBoldCursor.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                SendMessagesHelper.getInstance(cz0Var.currentAccount).prepareImportStickers(cz0Var.f27307r0, cz0Var.f27303o0, cz0Var.f27286a0, cz0Var.Y, new ly0(cz0Var));
                alertDialog$Builder.f22366a.N0.run();
                cz0Var.dismiss();
            }
        }
    }

    public static void C(cz0 cz0Var) {
        cz0Var.dismiss();
        MediaDataController.getInstance(cz0Var.currentAccount).toggleStickerSet(cz0Var.getContext(), cz0Var.S, 1, cz0Var.L, true, cz0Var.f27298j0);
    }

    public static void D(cz0 cz0Var) {
        cz0Var.dismiss();
        az0 az0Var = cz0Var.f27290c0;
        if (az0Var != null) {
            az0Var.a();
        }
        if (cz0Var.V != null && !MediaDataController.getInstance(cz0Var.currentAccount).cancelRemovingStickerSet(cz0Var.V.f22047id)) {
            TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
            tL_messages_installStickerSet.stickerset = cz0Var.V;
            ConnectionsManager.getInstance(cz0Var.currentAccount).sendRequest(tL_messages_installStickerSet, new b2(cz0Var, 13));
        }
    }

    public static void F(cz0 cz0Var, int i10) {
        String str;
        org.telegram.ui.ActionBar.r2 r2Var = cz0Var.L;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = cz0Var.S;
        if (tL_messages_stickerSet != null) {
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet != null && stickerSet.emojis) {
                str = "https://" + MessagesController.getInstance(cz0Var.currentAccount).linkPrefix + "/addemoji/" + cz0Var.S.set.short_name;
            } else {
                str = "https://" + MessagesController.getInstance(cz0Var.currentAccount).linkPrefix + "/addstickers/" + cz0Var.S.set.short_name;
            }
            String str2 = str;
            if (i10 == 1) {
                Context context = cz0Var.N;
                if (context == null && r2Var != null) {
                    context = r2Var.getParentActivity();
                }
                if (context == null) {
                    context = cz0Var.getContext();
                }
                oy0 oy0Var = new oy0(cz0Var, context, str2, str2, cz0Var.resourcesProvider);
                if (r2Var != null) {
                    r2Var.showDialog(oy0Var);
                    if (r2Var instanceof org.telegram.ui.un) {
                        oy0Var.setCalcMandatoryInsets(((org.telegram.ui.un) r2Var).F9());
                        return;
                    }
                    return;
                }
                oy0Var.show();
            } else if (i10 == 2) {
                try {
                    AndroidUtilities.addToClipboard(str2);
                    new wc((FrameLayout) cz0Var.containerView, cz0Var.resourcesProvider).k(false).j();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else if (i10 == 3) {
                if (cz0Var.R) {
                    cz0Var.p0();
                } else {
                    cz0Var.r0();
                }
            } else if (i10 == 4) {
                hz0.c(cz0Var.S.set, cz0Var.resourcesProvider, cz0Var.getContext(), new d(cz0Var, 20));
            } else if (i10 == 5) {
                hz0.b(cz0Var.S.set, cz0Var.resourcesProvider, cz0Var.getContext(), new my0(cz0Var, 2));
            }
        }
    }

    public static void G(cz0 cz0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        int i10;
        org.telegram.ui.ActionBar.r2 r2Var = cz0Var.L;
        TLRPC.StickerSet stickerSet = cz0Var.S.set;
        if (stickerSet.masks) {
            i10 = 1;
        } else if (stickerSet.emojis) {
            i10 = 5;
        } else {
            i10 = 0;
        }
        try {
            if (tL_error == null) {
                if (cz0Var.f27298j0) {
                    qc.g(r2Var, new gy0(cz0Var.f27313w.getContext(), cz0Var.S, 1, 2, null, cz0Var.resourcesProvider), 1500).j();
                }
                if (tLObject instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                    MediaDataController.getInstance(cz0Var.currentAccount).processStickerSetInstallResultArchive(r2Var, true, i10, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject);
                }
            } else {
                Toast.makeText(cz0Var.getContext(), LocaleController.getString(R.string.ErrorOccurred), 0).show();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        MediaDataController.getInstance(cz0Var.currentAccount).loadStickers(i10, false, true);
    }

    public static void H(cz0 cz0Var, TLRPC.TL_error tL_error, TLObject tLObject, MediaDataController mediaDataController) {
        TLRPC.StickerSet stickerSet;
        boolean z10 = false;
        cz0Var.f27294f0 = 0;
        if (tL_error == null) {
            ln0 ln0Var = new ln0(cz0Var, 1);
            ln0Var.addTarget(cz0Var.containerView);
            TransitionManager.beginDelayedTransition(cz0Var.container, ln0Var);
            cz0Var.f27301n.setVisibility(0);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            cz0Var.S = tL_messages_stickerSet;
            mediaDataController.putStickerSet(tL_messages_stickerSet, false);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = cz0Var.S;
            if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.documents.isEmpty()) {
                cz0Var.dismiss();
                return;
            }
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = cz0Var.S;
            if (tL_messages_stickerSet3 != null && (stickerSet = tL_messages_stickerSet3.set) != null && !stickerSet.masks) {
                z10 = true;
            }
            cz0Var.f27296h0 = z10;
            cz0Var.n0();
            mediaDataController.preloadStickerSetThumb(cz0Var.S);
            cz0Var.E0();
            cz0Var.D0();
            cz0Var.C0();
            cz0Var.d.l();
            return;
        }
        cz0Var.dismiss();
        org.telegram.ui.ActionBar.r2 r2Var = cz0Var.L;
        if (r2Var != null) {
            org.telegram.messenger.vh.n(R.string.AddStickersNotFound, wc.b0(r2Var), null);
        }
    }

    public static void I(cz0 cz0Var, String str, TextView textView) {
        TLRPC.TL_stickers_checkShortName tL_stickers_checkShortName = new TLRPC.TL_stickers_checkShortName();
        tL_stickers_checkShortName.short_name = str;
        cz0Var.f27304p0 = ConnectionsManager.getInstance(cz0Var.currentAccount).sendRequest(tL_stickers_checkShortName, new bi.h2(cz0Var, str, textView, 17), 2);
    }

    public static void J(cz0 cz0Var) {
        boolean z10;
        TLRPC.StickerSet stickerSet;
        MediaDataController mediaDataController = MediaDataController.getInstance(cz0Var.currentAccount);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = cz0Var.S;
        if (tL_messages_stickerSet != null && mediaDataController.isStickerPackInstalled(tL_messages_stickerSet.set.f22054id)) {
            z10 = false;
        } else {
            z10 = true;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = cz0Var.S;
        if (tL_messages_stickerSet2 != null && (stickerSet = tL_messages_stickerSet2.set) != null && stickerSet.creator && cz0Var.f27306r == null) {
            cz0Var.f27301n.e(3, R.drawable.tabs_reorder, LocaleController.getString(R.string.StickersReorder));
            cz0Var.f27301n.e(4, R.drawable.msg_edit, LocaleController.getString(R.string.EditName));
            if (z10) {
                cz0Var.f27306r = cz0Var.f27301n.e(5, R.drawable.msg_delete, LocaleController.getString(R.string.Delete));
            } else {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, cz0Var.getContext(), cz0Var.resourcesProvider);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, cz0Var.resourcesProvider).setOnClickListener(new ky0(cz0Var, 4));
                org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.StickersDeleteForEveryone), false, cz0Var.resourcesProvider);
                int i10 = org.telegram.ui.ActionBar.y6.f23596q7;
                cz0Var.getThemedColor(i10);
                c10.c(i10, i10);
                c10.h(0.1f, i10);
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.StickersRemoveForMe), false, cz0Var.resourcesProvider).setOnClickListener(new ky0(cz0Var, 6));
                c10.setOnClickListener(new ky0(cz0Var, 7));
                cz0Var.f27306r = cz0Var.f27301n.i(R.drawable.msg_delete, null, LocaleController.getString(R.string.Delete), actionBarPopupWindow$ActionBarPopupWindowLayout);
            }
            cz0Var.f27301n.a(-1);
            mb0 mb0Var = new mb0(cz0Var.currentAccount, 4, cz0Var.getContext(), new ArrayList(), cz0Var.resourcesProvider);
            mb0Var.setOnClickListener(new ky0(cz0Var, 8));
            mb0Var.setTag(R.id.fit_width_tag, 1);
            org.telegram.ui.ActionBar.w0 w0Var = cz0Var.f27301n;
            w0Var.p();
            w0Var.f23174b.a(mb0Var, new LinearLayout.LayoutParams(-1, -2));
            int themedColor = cz0Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23596q7);
            cz0Var.f27306r.d(themedColor, themedColor);
            cz0Var.f27306r.setSelectorColor(org.telegram.ui.ActionBar.y6.o1(0.1f, themedColor));
            if (cz0Var.f27306r.getRightIcon() != null) {
                cz0Var.f27306r.getRightIcon().setColorFilter(themedColor);
            }
        }
        if (cz0Var.f27301n.getPopupLayout() != null) {
            cz0Var.f27301n.getPopupLayout().requestLayout();
        }
        cz0Var.f27301n.U(null, null);
    }

    public static void Q(cz0 cz0Var) {
        if (cz0Var.f27289c.getChildCount() <= 0) {
            cz0Var.A0(cz0Var.f27289c.getPaddingTop());
            return;
        }
        int i10 = 0;
        View view = null;
        int i11 = -1;
        for (int i12 = 0; i12 < cz0Var.f27289c.getChildCount(); i12++) {
            View childAt = cz0Var.f27289c.getChildAt(i12);
            cz0Var.f27289c.getClass();
            int R = RecyclerView.R(childAt);
            if (i11 == -1 || i11 > R) {
                view = childAt;
                i11 = R;
            }
        }
        if (view != null && view.getTop() >= 0) {
            int top = view.getTop();
            cz0Var.x0(0, false);
            i10 = top;
        } else {
            cz0Var.x0(0, true);
        }
        cz0Var.x0(1, true);
        if (cz0Var.f27292e0 != i10) {
            cz0Var.A0(i10);
        }
    }

    public static void m(cz0 cz0Var, View view, int i10) {
        TLRPC.StickerSet stickerSet;
        String str;
        if (view instanceof wy0) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = cz0Var.S;
            org.telegram.ui.ActionBar.r2 r2Var = cz0Var.L;
            org.telegram.ui.ActionBar.u6 u6Var = cz0Var.resourcesProvider;
            if (r2Var != null) {
                Context context = r2Var.getContext();
                if (!(r2Var instanceof org.telegram.ui.un)) {
                    hz0.a(tL_messages_stickerSet, r2Var, u6Var);
                    return;
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert3, 0, context, u6Var);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                arrayList.add(LocaleController.getString(R.string.StickersCreateNewSticker));
                org.telegram.ui.d3.n(R.drawable.menu_sticker_add, 0, arrayList3, arrayList2);
                arrayList.add(LocaleController.getString(R.string.StickersAddAnExistingSticker));
                arrayList3.add(Integer.valueOf(R.drawable.menu_sticker_select));
                arrayList2.add(1);
                org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                di.e0 e0Var = new di.e0(o1Var, arrayList2, tL_messages_stickerSet, r2Var, u6Var, 11);
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, ((Integer) arrayList3.get(i11)).intValue(), (CharSequence) arrayList.get(i11), false, u6Var);
                    c10.setTag(Integer.valueOf(i11));
                    c10.setOnClickListener(e0Var);
                }
                o1Var.f22907c = 100;
                o1Var.f22909g = true;
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
        } else if (!cz0Var.R) {
            if (cz0Var.W != null) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) cz0Var.d.f35149f.get(i10);
                if (stickerSetCovered != null) {
                    cz0Var.dismiss();
                    TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                    TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
                    tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                    tL_inputStickerSetID.f22047id = stickerSet2.f22054id;
                    new cz0(cz0Var.N, cz0Var.L, tL_inputStickerSetID, null, null, cz0Var.resourcesProvider).show();
                    return;
                }
                return;
            }
            ArrayList arrayList4 = cz0Var.Y;
            if (arrayList4 != null) {
                if (i10 >= 0 && i10 < arrayList4.size()) {
                    SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) cz0Var.Y.get(i10);
                    cz0Var.U = importingSticker;
                    if (importingSticker.validated) {
                        TextView textView = cz0Var.G;
                        textView.setText(Emoji.replaceEmoji(importingSticker.emoji, textView.getPaint().getFontMetricsInt(), false));
                        y9 y9Var = cz0Var.F;
                        ImageLocation forPath = ImageLocation.getForPath(cz0Var.U.path);
                        if (cz0Var.U.animated) {
                            str = "tgs";
                        } else {
                            str = null;
                        }
                        y9Var.m(forPath, null, null, null, null, str, 0, null);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) cz0Var.f27314x.getLayoutParams();
                        layoutParams.topMargin = cz0Var.f27292e0;
                        cz0Var.f27314x.setLayoutParams(layoutParams);
                        cz0Var.f27314x.setVisibility(0);
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ObjectAnimator.ofFloat(cz0Var.f27314x, View.ALPHA, 0.0f, 1.0f));
                        animatorSet.setDuration(200L);
                        animatorSet.start();
                        return;
                    }
                    return;
                }
                return;
            }
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = cz0Var.S;
            if (tL_messages_stickerSet2 != null && i10 >= 0 && i10 < tL_messages_stickerSet2.documents.size()) {
                cz0Var.T = cz0Var.S.documents.get(i10);
                int i12 = 0;
                while (true) {
                    if (i12 >= cz0Var.T.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = cz0Var.T.attributes.get(i12);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                        String str2 = documentAttribute.alt;
                        if (str2 != null && str2.length() > 0) {
                            TextView textView2 = cz0Var.G;
                            textView2.setText(Emoji.replaceEmoji(documentAttribute.alt, textView2.getPaint().getFontMetricsInt(), false));
                        }
                    } else {
                        i12++;
                    }
                }
                cz0Var.G.setText(Emoji.replaceEmoji(MediaDataController.getInstance(cz0Var.currentAccount).getEmojiForSticker(cz0Var.T.f22033id), cz0Var.G.getPaint().getFontMetricsInt(), false));
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = cz0Var.S;
                if ((tL_messages_stickerSet3 == null || (stickerSet = tL_messages_stickerSet3.set) == null || !stickerSet.emojis) && !org.telegram.ui.ft.o().w(view)) {
                    cz0Var.F.getImageReceiver().setImage(ImageLocation.getForDocument(cz0Var.T), (String) null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(cz0Var.T.thumbs, 90), cz0Var.T), (String) null, "webp", cz0Var.S, 1);
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) cz0Var.f27314x.getLayoutParams();
                    layoutParams2.topMargin = cz0Var.f27292e0;
                    cz0Var.f27314x.setLayoutParams(layoutParams2);
                    cz0Var.f27314x.setVisibility(0);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(cz0Var.f27314x, View.ALPHA, 0.0f, 1.0f));
                    animatorSet2.setDuration(200L);
                    animatorSet2.start();
                }
            }
        }
    }

    public static void n(cz0 cz0Var) {
        cz0Var.f27301n.o();
        hz0.b(cz0Var.S.set, cz0Var.resourcesProvider, cz0Var.getContext(), new my0(cz0Var, 4));
    }

    public static void o(cz0 cz0Var) {
        Context context = cz0Var.getContext();
        int[] iArr = {0};
        FrameLayout frameLayout = new FrameLayout(context);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.f22366a.R = LocaleController.getString(R.string.ImportStickersEnterName);
        alertDialog$Builder.k(LocaleController.getString(R.string.Next), new qd0(22));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        alertDialog$Builder.o(linearLayout);
        linearLayout.addView(frameLayout, gb1.x(-1, 36, 51, 24, 6, 24, 0));
        TextView textView = new TextView(context);
        TextView g7 = org.telegram.messenger.t.g(context, 1, 16.0f);
        org.telegram.ui.ActionBar.f7.V(g7, org.telegram.ui.ActionBar.y6.f23651t5, cz0Var.resourcesProvider);
        g7.setMaxLines(1);
        g7.setLines(1);
        g7.setText("t.me/addstickers/");
        g7.setInputType(16385);
        g7.setGravity(51);
        g7.setSingleLine(true);
        g7.setVisibility(4);
        g7.setImeOptions(6);
        g7.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        frameLayout.addView(g7, gb1.i(-2, 36, 51));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setBackground(null);
        org.telegram.ui.ActionBar.f7.G(editTextBoldCursor, org.telegram.ui.ActionBar.y6.f23670u5, org.telegram.ui.ActionBar.y6.f23689v5, org.telegram.ui.ActionBar.y6.f23596q7, null);
        editTextBoldCursor.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.f7.V(editTextBoldCursor, org.telegram.ui.ActionBar.y6.f23462j5, cz0Var.resourcesProvider);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setImeOptions(5);
        org.telegram.ui.ActionBar.f7.m(editTextBoldCursor, 30, org.telegram.ui.ActionBar.y6.G6, cz0Var.resourcesProvider);
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        editTextBoldCursor.addTextChangedListener(new py0(cz0Var, iArr, textView, editTextBoldCursor));
        frameLayout.addView(editTextBoldCursor, gb1.i(-1, 36, 51));
        editTextBoldCursor.setOnEditorActionListener(new d1(alertDialog$Builder, 8));
        editTextBoldCursor.setSelection(editTextBoldCursor.length());
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new tv(editTextBoldCursor, 24));
        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ImportStickersEnterNameInfo)));
        textView.setTextSize(1, 14.0f);
        textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q5, cz0Var.resourcesProvider);
        linearLayout.addView(textView, gb1.r(-1, -2));
        l2 l2Var = new l2(editTextBoldCursor, 2);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
        e2Var.setOnShowListener(l2Var);
        e2Var.show();
        editTextBoldCursor.requestFocus();
        e2Var.d(-1).setOnClickListener(new m0(cz0Var, iArr, editTextBoldCursor, textView, g7, alertDialog$Builder, 3));
    }

    public static void p(org.telegram.ui.es0 es0Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers) {
        es0Var.f27294f0 = 0;
        if (tL_error == null && (tLObject instanceof Vector)) {
            Vector vector = (Vector) tLObject;
            if (vector.objects.isEmpty()) {
                es0Var.dismiss();
                return;
            } else if (vector.objects.size() == 1) {
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                es0Var.V = tL_inputStickerSetID;
                TLRPC.StickerSet stickerSet = ((TLRPC.StickerSetCovered) vector.objects.get(0)).set;
                tL_inputStickerSetID.f22047id = stickerSet.f22054id;
                tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                es0Var.v0();
                return;
            } else {
                ArrayList arrayList = new ArrayList();
                es0Var.W = arrayList;
                arrayList.addAll(vector.objects);
                es0Var.f27289c.setLayoutParams(gb1.h(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
                es0Var.h.setVisibility(8);
                es0Var.J[0].setVisibility(8);
                es0Var.d.l();
                return;
            }
        }
        g5.e0(es0Var.currentAccount, tL_error, es0Var.L, tL_messages_getAttachedStickers, new Object[0]);
        es0Var.dismiss();
    }

    public static void q(org.telegram.ui.es0 es0Var, Object obj, TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers, org.telegram.ui.z7 z7Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && obj != null) {
            FileRefController.getInstance(es0Var.currentAccount).requestReference(obj, tL_messages_getAttachedStickers, z7Var);
        } else {
            z7Var.run(tLObject, tL_error);
        }
    }

    public static void q0(org.telegram.ui.ActionBar.r2 r2Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, TLRPC.Document document) {
        org.telegram.ui.un unVar;
        boolean z10;
        TLRPC.StickerSet stickerSet;
        if (r2Var != null) {
            if (r2Var instanceof org.telegram.ui.un) {
                unVar = (org.telegram.ui.un) r2Var;
            } else {
                unVar = null;
            }
            org.telegram.ui.un unVar2 = unVar;
            if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.creator) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (MessageObject.isStaticStickerDocument(document)) {
                ArrayList arrayList = new ArrayList();
                File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true);
                if (pathToAttach != null && pathToAttach.exists()) {
                    AndroidUtilities.runOnUIThread(new jg.q0(pathToAttach, arrayList, r2Var, unVar2, document, z10, tL_messages_stickerSet), 300L);
                    return;
                }
                return;
            }
            AndroidUtilities.runOnUIThread(new fi.r1((Object) r2Var, (Object) tL_messages_stickerSet, (Object) document, (Object) unVar2, z10, 18), 300L);
        }
    }

    public static void r(cz0 cz0Var) {
        cz0Var.dismiss();
        MediaDataController.getInstance(cz0Var.currentAccount).toggleStickerSet(cz0Var.getContext(), cz0Var.S, 0, cz0Var.L, true, cz0Var.f27298j0);
    }

    public static void s(cz0 cz0Var) {
        cz0Var.f27301n.o();
        cz0Var.dismiss();
        MediaDataController.getInstance(cz0Var.currentAccount).toggleStickerSet(cz0Var.getContext(), cz0Var.S, 1, cz0Var.L, true, true);
    }

    public static void t(cz0 cz0Var) {
        cz0Var.dismiss();
        MediaDataController.getInstance(cz0Var.currentAccount).toggleStickerSet(cz0Var.getContext(), cz0Var.S, 1, cz0Var.L, false, false);
    }

    public static void u(cz0 cz0Var) {
        cz0Var.dismiss();
        MediaDataController.getInstance(cz0Var.currentAccount).toggleStickerSet(cz0Var.getContext(), cz0Var.S, 1, cz0Var.L, false, false);
    }

    public static void v(cz0 cz0Var, String str, TLRPC.TL_error tL_error, TLObject tLObject, TextView textView) {
        cz0Var.f27304p0 = 0;
        String str2 = cz0Var.f27303o0;
        if (str2 != null && str2.equals(str)) {
            if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                textView.setText(LocaleController.getString(R.string.ImportStickersLinkAvailable));
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23709w6, cz0Var.resourcesProvider);
                cz0Var.f27305q0 = true;
                return;
            }
            textView.setText(LocaleController.getString(R.string.ImportStickersLinkTaken));
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23579p7, cz0Var.resourcesProvider);
            cz0Var.f27305q0 = false;
        }
    }

    public static boolean x(cz0 cz0Var, MotionEvent motionEvent) {
        if (cz0Var.R) {
            return false;
        }
        return org.telegram.ui.ft.o().q(motionEvent, cz0Var.f27289c, cz0Var.H, cz0Var.m0, cz0Var.resourcesProvider);
    }

    public static void y(cz0 cz0Var, ArrayList arrayList, Boolean bool) {
        cz0Var.Y = arrayList;
        if (arrayList.isEmpty()) {
            cz0Var.dismiss();
            return;
        }
        cz0Var.d.l();
        if (bool.booleanValue()) {
            cz0Var.Z = new HashMap();
            int size = cz0Var.Y.size();
            for (int i10 = 0; i10 < size; i10++) {
                SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) cz0Var.Y.get(i10);
                cz0Var.Z.put(importingSticker.path, importingSticker);
                FileLoader.getInstance(cz0Var.currentAccount).uploadFile(importingSticker.path, false, true, 67108864);
            }
        }
        cz0Var.D0();
    }

    public final void A0(int i10) {
        this.f27292e0 = i10;
        if (this.W == null) {
            float f7 = i10;
            this.h.setTranslationY(f7);
            if (this.X == null) {
                this.f27301n.setTranslationY(f7);
            }
            this.J[0].setTranslationY(f7);
        }
        this.containerView.invalidate();
    }

    public final void B0(boolean z10) {
        this.d.getClass();
        this.h.setHighlightColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23499l5));
        this.f27314x.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23425h5) & (-536870913));
        this.f27301n.setIconColor(getThemedColor(org.telegram.ui.ActionBar.y6.Ji));
        this.f27301n.O(getThemedColor(org.telegram.ui.ActionBar.y6.E8), false);
        this.f27301n.O(getThemedColor(org.telegram.ui.ActionBar.y6.F8), true);
        this.f27301n.setPopupItemsSelectorColor(getThemedColor(org.telegram.ui.ActionBar.y6.I5));
        this.f27301n.H(getThemedColor(org.telegram.ui.ActionBar.y6.G8));
        if (this.f27306r != null) {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.f23596q7);
            this.f27306r.d(themedColor, themedColor);
            this.f27306r.setSelectorColor(org.telegram.ui.ActionBar.y6.o1(0.1f, themedColor));
            if (this.f27306r.getRightIcon() != null && themedColor != this.f27311u0) {
                this.f27311u0 = themedColor;
                this.f27306r.getRightIcon().setColorFilter(themedColor);
            }
        }
        if (z10) {
            if (org.telegram.ui.ActionBar.y6.g1() && this.f27310t0 == null) {
                ArrayList themeDescriptions = getThemeDescriptions();
                this.f27310t0 = themeDescriptions;
                int size = themeDescriptions.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((org.telegram.ui.ActionBar.h7) this.f27310t0.get(i10)).f22692g = null;
                }
            }
            int size2 = this.f27310t0.size();
            for (int i11 = 0; i11 < size2; i11++) {
                org.telegram.ui.ActionBar.h7 h7Var = (org.telegram.ui.ActionBar.h7) this.f27310t0.get(i11);
                h7Var.e(getThemedColor(h7Var.e), false, false);
            }
        }
        if (!org.telegram.ui.ActionBar.y6.g1() && this.f27310t0 != null) {
            this.f27310t0 = null;
        }
    }

    public final void C0() {
        if (this.containerView != null && !UserConfig.getInstance(this.currentAccount).isPremium()) {
            MessageObject.isPremiumEmojiPack(this.S);
        }
    }

    public final void D0() {
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
                if (this.f27287b == null) {
                    this.f27287b = Pattern.compile("@[a-zA-Z\\d_]{1,32}");
                }
                Matcher matcher = this.f27287b.matcher(replaceEmoji);
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
            if (u0()) {
                int measuredWidth = this.f27289c.getMeasuredWidth();
                if (measuredWidth == 0) {
                    measuredWidth = AndroidUtilities.displaySize.x;
                }
                yy0 yy0Var = this.d;
                if (AndroidUtilities.isTablet()) {
                    f7 = 60.0f;
                } else {
                    f7 = 45.0f;
                }
                yy0Var.d = Math.max(1, measuredWidth / AndroidUtilities.dp(f7));
            } else {
                this.d.d = 5;
            }
            this.M.z1(this.d.d);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.S;
            int i17 = -1;
            if (tL_messages_stickerSet2 != null && (stickerSet7 = tL_messages_stickerSet2.set) != null && stickerSet7.emojis && !UserConfig.getInstance(this.currentAccount).isPremium() && this.f27291d0 == null) {
                if (this.S.documents != null) {
                    for (int i18 = 0; i18 < this.S.documents.size(); i18++) {
                        if (!MessageObject.isFreeEmoji(this.S.documents.get(i18))) {
                            this.v.setVisibility(0);
                            this.f27308s.setBackground(null);
                            y0(null, null, -1);
                            this.v.a(LocaleController.getString(R.string.UnlockPremiumEmoji), new ky0(this, 0), false);
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
                    if (stickerSets.get(i19) != null && stickerSets.get(i19).set != null && stickerSets.get(i19).set.f22054id == this.S.set.f22054id) {
                        z11 = true;
                        break;
                    }
                }
                z11 = false;
                z10 = !z11;
            } else if (tL_messages_stickerSet3 != null && (stickerSet = tL_messages_stickerSet3.set) != null && mediaDataController.isStickerPackInstalled(stickerSet.f22054id)) {
                z10 = false;
            } else {
                z10 = true;
            }
            org.telegram.ui.a70 a70Var = this.f27291d0;
            if (a70Var != null) {
                ky0 ky0Var = new ky0(this, 5);
                boolean z12 = a70Var.f37652a;
                if (a70Var.f37654c.N) {
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
                boolean z13 = this.f27291d0.f37652a;
                if (z13) {
                    i13 = org.telegram.ui.ActionBar.y6.f23596q7;
                } else {
                    i13 = org.telegram.ui.ActionBar.y6.Sh;
                }
                if (!z13) {
                    i14 = org.telegram.ui.ActionBar.y6.Oh;
                } else {
                    i14 = -1;
                }
                if (!z13) {
                    i17 = org.telegram.ui.ActionBar.y6.Qh;
                }
                z0(ky0Var, str, i13, i14, i17);
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
                    z0(null, "", -1, -1, -1);
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
                z0(new ky0(this, 9), formatPluralString2, org.telegram.ui.ActionBar.y6.Sh, org.telegram.ui.ActionBar.y6.Oh, org.telegram.ui.ActionBar.y6.Qh);
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
                    z0(new ky0(this, 10), formatPluralString, org.telegram.ui.ActionBar.y6.Sh, org.telegram.ui.ActionBar.y6.Oh, org.telegram.ui.ActionBar.y6.Qh);
                } else {
                    String str2 = formatPluralString;
                    if (this.S.set.official) {
                        y0(new ky0(this, 11), str2, org.telegram.ui.ActionBar.y6.f23596q7);
                    } else {
                        y0(new ky0(this, 12), str2, org.telegram.ui.ActionBar.y6.f23596q7);
                    }
                }
            }
            this.d.l();
            return;
        }
        ArrayList arrayList5 = this.X;
        if (arrayList5 != null) {
            z90 z90Var = this.h;
            ArrayList arrayList6 = this.Y;
            if (arrayList6 != null) {
                size = arrayList6.size();
            } else {
                size = arrayList5.size();
            }
            z90Var.setText(LocaleController.formatPluralString("Stickers", size, new Object[0]));
            HashMap hashMap = this.Z;
            if (hashMap != null && !hashMap.isEmpty()) {
                y0(null, LocaleController.getString(R.string.ImportStickersProcessing), org.telegram.ui.ActionBar.y6.q5);
                this.f27308s.setEnabled(false);
                return;
            }
            ky0 ky0Var2 = new ky0(this, 13);
            int i20 = R.string.ImportStickers;
            ArrayList arrayList7 = this.Y;
            if (arrayList7 != null) {
                size2 = arrayList7.size();
            } else {
                size2 = arrayList5.size();
            }
            y0(ky0Var2, LocaleController.formatString("ImportStickers", i20, LocaleController.formatPluralString("Stickers", size2, new Object[0])), org.telegram.ui.ActionBar.y6.f23537n5);
            this.f27308s.setEnabled(true);
            return;
        }
        y0(new ky0(this, 14), LocaleController.getString(R.string.Close), org.telegram.ui.ActionBar.y6.f23537n5);
    }

    public final void E0() {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        Point point = AndroidUtilities.displaySize;
        int min = (int) ((Math.min(point.x, point.y) / 2) / AndroidUtilities.density);
        if (this.X != null) {
            this.f27315y.setText(LocaleController.getString(R.string.ImportStickersRemove));
            org.telegram.ui.ActionBar.f7.V(this.f27315y, org.telegram.ui.ActionBar.y6.f23596q7, this.resourcesProvider);
            float f7 = min;
            this.F.setLayoutParams(gb1.h(min, f7, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.G.setLayoutParams(gb1.h(min, f7, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.f27315y.setVisibility(0);
            this.E.setVisibility(0);
        } else if (this.f27288b0 != null && ((tL_messages_stickerSet = this.S) == null || !tL_messages_stickerSet.set.masks)) {
            this.f27315y.setText(LocaleController.getString(R.string.SendSticker));
            float f10 = min;
            this.F.setLayoutParams(gb1.h(min, f10, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.G.setLayoutParams(gb1.h(min, f10, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.f27315y.setVisibility(0);
            this.E.setVisibility(0);
        } else {
            this.f27315y.setText(LocaleController.getString(R.string.Close));
            this.F.setLayoutParams(gb1.i(min, min, 17));
            this.G.setLayoutParams(gb1.i(min, min, 17));
            this.f27315y.setVisibility(8);
            this.E.setVisibility(8);
        }
    }

    public final void F0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.S = tL_messages_stickerSet;
        if (this.d != null) {
            E0();
            D0();
            this.d.l();
        }
        C0();
        MediaDataController.getInstance(this.currentAccount).preloadStickerSetThumb(this.S);
        n0();
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.I5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.F8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.E8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ji));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23499l5));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            bi.r1 r1Var = this.f27289c;
            if (r1Var != null) {
                int childCount = r1Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    this.f27289c.getChildAt(i12).invalidate();
                }
            }
        } else if (i10 == NotificationCenter.fileUploaded) {
            HashMap hashMap = this.Z;
            if (hashMap != null) {
                String str = (String) objArr[0];
                SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) hashMap.get(str);
                if (importingSticker != null) {
                    importingSticker.uploadMedia(this.currentAccount, (TLRPC.InputFile) objArr[1], new kg(this, str, importingSticker, 27));
                }
            }
        } else if (i10 == NotificationCenter.fileUploadFailed) {
            HashMap hashMap2 = this.Z;
            if (hashMap2 != null) {
                SendMessagesHelper.ImportingSticker importingSticker2 = (SendMessagesHelper.ImportingSticker) hashMap2.remove((String) objArr[0]);
                if (importingSticker2 != null) {
                    w0(importingSticker2);
                }
                if (this.Z.isEmpty()) {
                    D0();
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
                    tL_messages_stickerSet = mediaDataController.getStickerSetById(this.V.f22047id);
                }
            }
            if (tL_messages_stickerSet != null && tL_messages_stickerSet != this.S) {
                this.S = tL_messages_stickerSet;
                v0();
            }
            D0();
        }
    }

    @Override
    public void dismiss() {
        super.dismiss();
        this.f27300l0.B(false);
        Runnable runnable = this.f27309s0;
        if (runnable != null) {
            runnable.run();
        }
        if (this.f27294f0 != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f27294f0, true);
            this.f27294f0 = 0;
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
        b7 b7Var = new b7(this, 6);
        ViewGroup viewGroup = this.containerView;
        Drawable[] drawableArr = {this.shadowDrawable};
        int i10 = org.telegram.ui.ActionBar.y6.f23425h5;
        arrayList.add(new org.telegram.ui.ActionBar.h7(viewGroup, 0, (Class[]) null, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.containerView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Ii));
        if (this.d.f35151r.W != null) {
            org.telegram.ui.Cells.q3.a(arrayList, b7Var);
        }
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f27301n, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Ni));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f27308s, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        s6 s6Var = this.f27308s;
        int i11 = org.telegram.ui.ActionBar.y6.f23446i6;
        arrayList.add(new org.telegram.ui.ActionBar.h7(s6Var, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f27308s, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, this.f27299k0));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f27315y, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f27315y, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        return arrayList;
    }

    public final void n0() {
        if (this.S != null) {
            TLRPC.TL_messages_stickerSet filterPremiumStickers = MessagesController.getInstance(this.currentAccount).filterPremiumStickers(this.S);
            this.S = filterPremiumStickers;
            if (filterPremiumStickers == null) {
                dismiss();
            }
        }
    }

    public final void o0(TextView textView, String str, boolean z10) {
        if (z10) {
            textView.setText(LocaleController.getString(R.string.ImportStickersLinkAvailable));
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23709w6, this.resourcesProvider);
            this.f27305q0 = true;
            this.f27303o0 = str;
            return;
        }
        ny0 ny0Var = this.f27302n0;
        if (ny0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(ny0Var);
            this.f27302n0 = null;
            this.f27303o0 = null;
            if (this.f27304p0 != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f27304p0, true);
            }
        }
        if (TextUtils.isEmpty(str)) {
            textView.setText(LocaleController.getString(R.string.ImportStickersEnterUrlInfo));
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q5, this.resourcesProvider);
            return;
        }
        this.f27305q0 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                int length = str.length();
                for (int i10 = 0; i10 < length; i10++) {
                    char charAt = str.charAt(i10);
                    if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        textView.setText(LocaleController.getString(R.string.ImportStickersEnterUrlInfo));
                        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23579p7, this.resourcesProvider);
                        return;
                    }
                }
            } else {
                textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalid));
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23579p7, this.resourcesProvider);
                return;
            }
        }
        if (str != null && str.length() >= 5) {
            if (str.length() > 32) {
                textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalidLong));
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23579p7, this.resourcesProvider);
                return;
            }
            textView.setText(LocaleController.getString(R.string.ImportStickersLinkChecking));
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.F6, this.resourcesProvider);
            this.f27303o0 = str;
            ny0 ny0Var2 = new ny0(this, str, textView, 0);
            this.f27302n0 = ny0Var2;
            AndroidUtilities.runOnUIThread(ny0Var2, 300L);
            return;
        }
        textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalidShort));
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23579p7, this.resourcesProvider);
    }

    @Override
    public final void onBackPressed() {
        if (org.telegram.ui.ft.o().E) {
            org.telegram.ui.ft.o().m();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onStart() {
        super.onStart();
        qc.a((FrameLayout) this.containerView, new bh.c0(this, 10));
    }

    @Override
    public final void onStop() {
        super.onStop();
        qc.h((FrameLayout) this.containerView);
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        B0(false);
        try {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.f23425h5);
            if (this.shadowDrawable != null && themedColor != this.f27312v0) {
                this.f27312v0 = themedColor;
                setBackgroundColor(themedColor);
            }
            ViewGroup viewGroup = this.containerView;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void p0() {
        if (!this.R) {
            return;
        }
        this.e.h(null);
        this.R = false;
        this.f27300l0.B(true);
        AndroidUtilities.forEachViews((RecyclerView) this.f27289c, (Utilities.Callback<View>) new di.e(14));
        this.f27301n.postDelayed(new my0(this, 0), 200L);
        this.f27308s.c(LocaleController.getString(R.string.EditStickers), true, true);
    }

    public final void r0() {
        if (this.R) {
            return;
        }
        this.e.h(this.f27289c);
        this.R = true;
        aa.m0 m0Var = this.f27300l0;
        char c10 = 0;
        m0Var.B(false);
        float f7 = 0.0f;
        Float valueOf = Float.valueOf(0.0f);
        ArrayList arrayList = (ArrayList) m0Var.d;
        if (arrayList.isEmpty()) {
            for (int i10 = 0; i10 < 6; i10++) {
                arrayList.add(valueOf);
                ((ArrayList) m0Var.e).add(valueOf);
                ((ArrayList) m0Var.f1153f).add(valueOf);
            }
        }
        int i11 = 0;
        for (int i12 = 6; i11 < i12; i12 = 6) {
            long nextFloat = Utilities.random.nextFloat() * 300;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, -2.0f, 0.0f, 2.0f, 0.0f);
            ofFloat.addUpdateListener(new bz0(m0Var, i11, 3));
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
            ofFloat2.addUpdateListener(new bz0(m0Var, i11, 4));
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
            ofFloat3.addUpdateListener(new bz0(m0Var, i11, 5));
            ofFloat3.setRepeatCount(-1);
            ofFloat3.setRepeatMode(1);
            ofFloat3.setInterpolator(new LinearInterpolator());
            ofFloat3.setCurrentPlayTime(nextFloat);
            ofFloat3.setDuration(j10);
            ofFloat3.start();
            ((ArrayList) m0Var.f1150a).add(ofFloat);
            ((ArrayList) m0Var.f1151b).add(ofFloat2);
            ((ArrayList) m0Var.f1152c).add(ofFloat3);
            i11++;
            f7 = f10;
            c10 = c11;
        }
        AndroidUtilities.forEachViews((RecyclerView) this.f27289c, (Utilities.Callback<View>) new di.e(15));
        this.f27301n.postDelayed(new my0(this, 1), 200L);
        this.f27308s.c(LocaleController.getString(R.string.Done), true, true);
    }

    public final void s0() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f27314x, View.ALPHA, 0.0f));
        animatorSet.setDuration(200L);
        animatorSet.addListener(new i10(this, 25));
        animatorSet.start();
    }

    @Override
    public final void setOnDismissListener(Runnable runnable) {
        this.f27309s0 = runnable;
    }

    @Override
    public final void show() {
        super.show();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4);
    }

    public final void t0(Context context) {
        int i10;
        uy0 uy0Var = new uy0(this, context);
        this.containerView = uy0Var;
        uy0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i11, 0, i11, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(48.0f);
        View view = new View(context);
        View[] viewArr = this.J;
        viewArr[0] = view;
        int i12 = org.telegram.ui.ActionBar.y6.V5;
        org.telegram.ui.ActionBar.f7.i(i12, view, this.resourcesProvider);
        viewArr[0].setAlpha(0.0f);
        viewArr[0].setVisibility(4);
        viewArr[0].setTag(1);
        this.containerView.addView(viewArr[0], layoutParams);
        bi.r1 r1Var = new bi.r1(this, context, 24);
        this.f27289c = r1Var;
        r1Var.setTag(14);
        bi.r1 r1Var2 = this.f27289c;
        getContext();
        ei.k kVar = new ei.k(this);
        this.M = kVar;
        r1Var2.setLayoutManager(kVar);
        this.M.O = new ai.l(this, 7);
        this.e = new s4.z(new vy0(this));
        bi.r1 r1Var3 = this.f27289c;
        yy0 yy0Var = new yy0(this, context);
        this.d = yy0Var;
        r1Var3.setAdapter(yy0Var);
        this.f27289c.setVerticalScrollBarEnabled(false);
        this.f27289c.i(new di.l(8));
        this.f27289c.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        this.f27289c.setClipToPadding(false);
        this.f27289c.setEnabled(true);
        org.telegram.ui.ActionBar.f7.I(this.f27289c, org.telegram.ui.ActionBar.y6.A5, this.resourcesProvider);
        this.f27289c.setOnTouchListener(new rk(this, 6));
        this.f27289c.setOnScrollListener(new ml(this, 16));
        j jVar = new j(this, 16);
        this.H = jVar;
        this.f27289c.setOnItemClickListener(jVar);
        this.containerView.addView(this.f27289c, gb1.h(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 48.0f));
        bh.r rVar = new bh.r(this, context, 25);
        this.K = rVar;
        this.containerView.addView(rVar, gb1.h(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.f27289c.setEmptyView(this.K);
        this.K.setOnTouchListener(new ei.d(24));
        z90 z90Var = new z90(context, null);
        this.h = z90Var;
        z90Var.setLines(1);
        this.h.setSingleLine(true);
        org.telegram.ui.ActionBar.f7.V(this.h, org.telegram.ui.ActionBar.y6.f23462j5, this.resourcesProvider);
        this.h.setTextSize(1, 20.0f);
        org.telegram.ui.ActionBar.f7.H(this.h, org.telegram.ui.ActionBar.y6.f23481k5, this.resourcesProvider);
        this.h.setEllipsize(TextUtils.TruncateAt.END);
        this.h.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f));
        this.h.setGravity(16);
        this.h.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(this.h, gb1.h(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(org.telegram.ui.ActionBar.y6.Ji), false, this.resourcesProvider);
        this.f27301n = w0Var;
        w0Var.setLongClickEnabled(false);
        this.f27301n.setSubMenuOpenSide(2);
        this.f27301n.setIcon(R.drawable.ic_ab_other);
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f27301n;
        int i13 = org.telegram.ui.ActionBar.y6.Ni;
        org.telegram.ui.ActionBar.f7.R(w0Var2, org.telegram.ui.ActionBar.y6.g0(getThemedColor(i13), 1, -1), null, org.telegram.ui.ActionBar.f7.N(i13), this.resourcesProvider);
        this.containerView.addView(this.f27301n, gb1.h(40, 40.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
        this.f27301n.e(1, R.drawable.msg_share, LocaleController.getString(R.string.StickersShare));
        this.f27301n.e(2, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink));
        this.f27301n.setOnClickListener(new ky0(this, 1));
        this.f27301n.setDelegate(new ly0(this));
        this.f27301n.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        org.telegram.ui.ActionBar.w0 w0Var3 = this.f27301n;
        if (this.V != null) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        w0Var3.setVisibility(i10);
        this.K.addView(new RadialProgressView(context, null), gb1.i(-2, -2, 17));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams2.bottomMargin = AndroidUtilities.dp(48.0f);
        View view2 = new View(context);
        viewArr[1] = view2;
        org.telegram.ui.ActionBar.f7.i(i12, view2, this.resourcesProvider);
        this.containerView.addView(viewArr[1], layoutParams2);
        s6 s6Var = new s6(context, false, false, false);
        this.f27308s = s6Var;
        int i14 = org.telegram.ui.ActionBar.y6.f23425h5;
        int themedColor = getThemedColor(i14);
        int i15 = org.telegram.ui.ActionBar.y6.f23446i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.y6.h0(themedColor, getThemedColor(i15));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i14);
        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i15);
        org.telegram.ui.ActionBar.u6 u6Var = this.resourcesProvider;
        s6Var.setBackground(h02);
        org.telegram.ui.ActionBar.f7.k(s6Var, h02, N, N2, u6Var);
        s6 s6Var2 = this.f27308s;
        int i16 = org.telegram.ui.ActionBar.y6.f23537n5;
        this.f27299k0 = i16;
        org.telegram.ui.ActionBar.f7.Z(s6Var2, i16, this.resourcesProvider);
        this.f27308s.setTextSize(AndroidUtilities.dp(14.0f));
        this.f27308s.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        this.f27308s.setTypeface(AndroidUtilities.bold());
        this.f27308s.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f27313w = frameLayout;
        frameLayout.addView(this.f27308s, gb1.g(48.0f, -1));
        this.containerView.addView(this.f27313w, gb1.i(-1, -2, 83));
        tg.p0 p0Var = new tg.p0(AndroidUtilities.dp(24.0f), context, this.resourcesProvider, false);
        this.v = p0Var;
        p0Var.setIcon(R.raw.unlock_icon);
        this.v.setVisibility(4);
        this.containerView.addView(this.v, gb1.h(-1, 48.0f, 87, 8.0f, 0.0f, 8.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f27314x = frameLayout2;
        frameLayout2.setVisibility(8);
        this.f27314x.setSoundEffectsEnabled(false);
        this.containerView.addView(this.f27314x, gb1.g(-1.0f, -1));
        this.f27314x.setOnClickListener(new ky0(this, 2));
        y9 y9Var = new y9(context);
        this.F = y9Var;
        y9Var.setAspectFit(true);
        this.F.setLayerNum(7);
        this.f27314x.addView(this.F);
        TextView textView = new TextView(context);
        this.G = textView;
        textView.setTextSize(1, 30.0f);
        this.G.setGravity(85);
        this.f27314x.addView(this.G);
        TextView textView2 = new TextView(context);
        this.f27315y = textView2;
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.f7.V(this.f27315y, i16, this.resourcesProvider);
        org.telegram.ui.ActionBar.f7.R(this.f27315y, org.telegram.ui.ActionBar.y6.h0(getThemedColor(i14), getThemedColor(i15)), org.telegram.ui.ActionBar.f7.N(i14), org.telegram.ui.ActionBar.f7.N(i15), this.resourcesProvider);
        this.f27315y.setGravity(17);
        this.f27315y.setPadding(AndroidUtilities.dp(29.0f), 0, AndroidUtilities.dp(29.0f), 0);
        this.f27315y.setTypeface(AndroidUtilities.bold());
        this.f27314x.addView(this.f27315y, gb1.i(-1, 48, 83));
        this.f27315y.setOnClickListener(new ky0(this, 3));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams3.bottomMargin = AndroidUtilities.dp(48.0f);
        View view3 = new View(context);
        this.E = view3;
        org.telegram.ui.ActionBar.f7.i(i12, view3, this.resourcesProvider);
        this.f27314x.addView(this.E, layoutParams3);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        if (this.X != null) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileUploaded);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileUploadFailed);
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
        D0();
        E0();
        C0();
        B0(false);
        this.d.l();
    }

    public final boolean u0() {
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

    public final void v0() {
        String str;
        if (this.V != null) {
            MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
            if (this.S == null && (str = this.V.short_name) != null) {
                this.S = mediaDataController.getStickerSetByName(str);
            }
            if (this.S == null) {
                this.S = mediaDataController.getStickerSetById(this.V.f22047id);
            }
            if (this.S == null) {
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                tL_messages_getStickerSet.stickerset = this.V;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getStickerSet, new org.telegram.ui.z7(22, this, mediaDataController));
            } else {
                if (this.d != null) {
                    E0();
                    D0();
                    this.d.l();
                }
                C0();
                mediaDataController.preloadStickerSetThumb(this.S);
                n0();
            }
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.S;
        if (tL_messages_stickerSet != null) {
            this.f27296h0 = !tL_messages_stickerSet.set.masks;
        }
        n0();
    }

    public final void w0(SendMessagesHelper.ImportingSticker importingSticker) {
        int indexOf = this.Y.indexOf(importingSticker);
        if (indexOf >= 0) {
            this.Y.remove(indexOf);
            this.d.u(indexOf);
            if (this.Y.isEmpty()) {
                dismiss();
            } else {
                D0();
            }
        }
    }

    public final void x0(int i10, boolean z10) {
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
                animatorSetArr[i10].addListener(new qy0(this, i10, z10));
                animatorSetArr[i10].start();
            }
        }
    }

    public final void y0(View.OnClickListener onClickListener, String str, int i10) {
        z0(onClickListener, str, i10, -1, -1);
    }

    public final void z0(View.OnClickListener onClickListener, String str, int i10, int i11, int i12) {
        if (i10 >= 0) {
            s6 s6Var = this.f27308s;
            this.f27299k0 = i10;
            org.telegram.ui.ActionBar.f7.Z(s6Var, i10, this.resourcesProvider);
        }
        this.f27308s.c(str, false, true);
        this.f27308s.setOnClickListener(onClickListener);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f27308s.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.J[1].getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.f27289c.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.K.getLayoutParams();
        if (onClickListener == null) {
            this.f27308s.setAlpha(0.0f);
        } else if (i11 >= 0 && i12 >= 0) {
            s6 s6Var2 = this.f27308s;
            int dp = AndroidUtilities.dp(24.0f);
            int themedColor = getThemedColor(i11);
            int themedColor2 = getThemedColor(i12);
            org.telegram.ui.ActionBar.f7.R(s6Var2, org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, themedColor, themedColor2, themedColor2), org.telegram.ui.ActionBar.f7.N(i11), org.telegram.ui.ActionBar.f7.N(i12), this.resourcesProvider);
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23425h5, this.f27313w, this.resourcesProvider);
            int dp2 = AndroidUtilities.dp(8.0f);
            marginLayoutParams.bottomMargin = dp2;
            marginLayoutParams.rightMargin = dp2;
            marginLayoutParams.topMargin = dp2;
            marginLayoutParams.leftMargin = dp2;
            int dp3 = AndroidUtilities.dp(64.0f);
            marginLayoutParams2.bottomMargin = dp3;
            marginLayoutParams3.bottomMargin = dp3;
            marginLayoutParams4.bottomMargin = dp3;
            if (this.f27308s.getAlpha() < 1.0f) {
                org.telegram.messenger.vh.q(this.f27308s.animate().alpha(1.0f), ds.h, 240L);
            }
        } else {
            s6 s6Var3 = this.f27308s;
            int i13 = org.telegram.ui.ActionBar.y6.f23425h5;
            int themedColor3 = getThemedColor(i13);
            int i14 = org.telegram.ui.ActionBar.y6.f23596q7;
            org.telegram.ui.ActionBar.f7.R(s6Var3, org.telegram.ui.ActionBar.y6.h0(themedColor3, org.telegram.ui.ActionBar.y6.o1(0.1f, getThemedColor(i14))), org.telegram.ui.ActionBar.f7.N(i13), org.telegram.ui.ActionBar.f7.L(0.1f, i14), this.resourcesProvider);
            this.f27313w.setBackgroundColor(0);
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.rightMargin = 0;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.leftMargin = 0;
            int dp4 = AndroidUtilities.dp(48.0f);
            marginLayoutParams2.bottomMargin = dp4;
            marginLayoutParams3.bottomMargin = dp4;
            marginLayoutParams4.bottomMargin = dp4;
            if (this.f27308s.getAlpha() < 1.0f) {
                org.telegram.messenger.vh.q(this.f27308s.animate().alpha(1.0f), ds.h, 240L);
            }
        }
        this.containerView.requestLayout();
    }

    public cz0(Context context, String str, ArrayList arrayList, ArrayList arrayList2) {
        super(1, context, (org.telegram.ui.ActionBar.u6) null, false);
        this.I = new AnimatorSet[2];
        this.J = new View[2];
        this.f27298j0 = true;
        this.f27300l0 = new aa.m0(7);
        this.m0 = new ry0(this);
        fixNavigationBar();
        this.N = (Activity) context;
        this.X = arrayList;
        this.f27286a0 = str;
        Utilities.globalQueue.postRunnable(new ny0(this, arrayList, arrayList2, 1));
        t0(context);
    }

    public cz0(Context context, org.telegram.ui.ActionBar.r2 r2Var, TLRPC.InputStickerSet inputStickerSet, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, zy0 zy0Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(1, context, u6Var, false);
        this.I = new AnimatorSet[2];
        this.J = new View[2];
        this.f27298j0 = true;
        this.f27300l0 = new aa.m0(7);
        this.m0 = new ry0(this);
        fixNavigationBar();
        this.f27288b0 = zy0Var;
        this.V = inputStickerSet;
        this.S = tL_messages_stickerSet;
        this.L = r2Var;
        v0();
        t0(context);
    }
}
