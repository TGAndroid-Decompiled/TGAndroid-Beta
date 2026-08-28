package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.xs;
public final class k8 extends FrameLayout {
    public final TextView A;
    public final zf.p0 B;
    public final ImageView C;
    public AnimatorSet D;
    public final int f24616a;
    public final bg.t f24617b;
    public final TextView f24618c;
    public final org.telegram.ui.Components.o9 d;
    public final dp f24619e;
    public boolean f24620f;
    public final ImageView h;
    public final ImageView f24621n;
    public TLRPC.TL_messages_stickerSet f24622r;
    public boolean f24623s;
    public final Rect v;
    public boolean f24624w;
    public final FrameLayout f24625x;
    public final TextView f24626y;

    public k8(Context context, int i9) {
        super(context);
        int i10;
        float f10;
        float f11;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f12;
        float f13;
        int i16;
        int i17;
        int i18;
        this.v = new Rect();
        this.f24616a = i9;
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.d = o9Var;
        o9Var.setAspectFit(true);
        o9Var.setLayerNum(1);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i19 = i10 | 48;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 13.0f;
        }
        if (z10) {
            f11 = 13.0f;
        } else {
            f11 = 0.0f;
        }
        addView(o9Var, g7.e6.d(40, 40.0f, i19, f10, 9.0f, f11, 0.0f));
        if (i9 != 0) {
            ImageView imageView = new ImageView(context);
            this.h = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            if (i9 != 3) {
                imageView.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Vh, false), 1, -1));
            }
            if (i9 == 1) {
                int i20 = org.telegram.ui.ActionBar.f6.Uh;
                int w02 = org.telegram.ui.ActionBar.f6.w0(null, i20, false);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
                imageView.setImageResource(R.drawable.msg_actions);
                imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
                if (LocaleController.isRTL) {
                    i18 = 3;
                } else {
                    i18 = 5;
                }
                addView(imageView, g7.e6.e(40, 40, i18 | 16));
                ImageView imageView2 = new ImageView(context);
                this.f24621n = imageView2;
                imageView2.setAlpha(0.0f);
                imageView2.setVisibility(8);
                imageView2.setScaleType(scaleType);
                imageView2.setImageResource(R.drawable.list_reorder);
                imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i20, false), mode));
                addView(imageView2, g7.e6.h(58.0f, 58.0f, 8388613));
                dp dpVar = new dp(context, 21, null);
                this.f24619e = dpVar;
                dpVar.b(-1, org.telegram.ui.ActionBar.f6.f23001d6, org.telegram.ui.ActionBar.f6.f23128k7);
                dpVar.setDrawUnchecked(false);
                dpVar.setDrawBackgroundAsArc(3);
                addView(dpVar, g7.e6.i(24.0f, 24.0f, 8388611, 34.0f, 30.0f, 0.0f, 0.0f));
            } else if (i9 == 3) {
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Mh, false), PorterDuff.Mode.MULTIPLY));
                imageView.setImageResource(R.drawable.floating_check);
                boolean z11 = LocaleController.isRTL;
                if (z11) {
                    i16 = 3;
                } else {
                    i16 = 5;
                }
                int i21 = i16 | 48;
                if (z11) {
                    i17 = 10;
                } else {
                    i17 = 0;
                }
                addView(imageView, g7.e6.d(40, 40.0f, i21, i17, 9.0f, z11 ? 0 : 10, 0.0f));
            }
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f24625x = frameLayout;
        TextView textView = new TextView(context);
        this.f24626y = textView;
        j3.r0.u(14.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.Add));
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false));
        int i22 = org.telegram.ui.ActionBar.f6.Oh;
        textView.setBackground(org.telegram.ui.ActionBar.v5.d(new float[]{14.0f}, org.telegram.ui.ActionBar.f6.w0(null, i22, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Qh, false)));
        textView.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        textView.setGravity(17);
        textView.setOnClickListener(new e8(this, 0));
        if (LocaleController.isRTL) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        frameLayout.addView(textView, g7.e6.h(-2.0f, 28.0f, i11 | 16));
        g7.g6.a(textView);
        TextView textView2 = new TextView(context);
        this.A = textView2;
        j3.r0.u(14.0f, 1, textView2);
        textView2.setText(LocaleController.getString(R.string.StickersRemove));
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Rh, false));
        textView2.setBackground(org.telegram.ui.ActionBar.v5.d(new float[]{14.0f}, 0, org.telegram.ui.ActionBar.f6.w0(null, i22, false) & 452984831));
        textView2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        textView2.setGravity(17);
        textView2.setOnClickListener(new e8(this, 0));
        if (LocaleController.isRTL) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        frameLayout.addView(textView2, g7.e6.i(-2.0f, 32.0f, i12 | 16, 0.0f, -2.0f, 0.0f, 0.0f));
        g7.g6.a(textView2);
        zf.p0 p0Var = new zf.p0(AndroidUtilities.dp(4.0f), context, null, false);
        this.B = p0Var;
        p0Var.setIcon(R.raw.unlock_icon);
        p0Var.a(LocaleController.getString(R.string.Unlock), new e8(this, 0), false);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) p0Var.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = AndroidUtilities.dp(1.0f);
            marginLayoutParams.topMargin = AndroidUtilities.dp(1.0f);
            int dp = AndroidUtilities.dp(20.0f);
            marginLayoutParams.height = dp;
            marginLayoutParams.width = dp;
            ((ViewGroup.MarginLayoutParams) p0Var.getTextView().getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
            p0Var.getChildAt(0).setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        } catch (Exception unused) {
        }
        FrameLayout frameLayout2 = this.f24625x;
        zf.p0 p0Var2 = this.B;
        if (LocaleController.isRTL) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        frameLayout2.addView(p0Var2, g7.e6.h(-2.0f, 28.0f, i13 | 16));
        g7.g6.a(this.B);
        this.f24625x.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        View view = this.f24625x;
        if (LocaleController.isRTL) {
            i14 = 3;
        } else {
            i14 = 5;
        }
        addView(view, g7.e6.d(-2, -1.0f, i14, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f24625x.setOnClickListener(new e8(this, 1));
        bg.t tVar = new bg.t(context, 9);
        this.f24617b = tVar;
        NotificationCenter.listenEmojiLoading(tVar);
        tVar.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
        tVar.setTextSize(1, 16.0f);
        tVar.setTypeface(AndroidUtilities.bold());
        tVar.setLines(1);
        tVar.setMaxLines(1);
        tVar.setSingleLine(true);
        tVar.setEllipsize(TextUtils.TruncateAt.END);
        tVar.setGravity(g7.e6.y());
        addView(tVar, g7.e6.i(-2.0f, -2.0f, 8388611, 71.0f, 9.0f, 70.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.f24618c = textView3;
        ll.s(textView3, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23386z6, false), 1, 13.0f, 1);
        textView3.setMaxLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(g7.e6.y());
        addView(textView3, g7.e6.i(-2.0f, -2.0f, 8388611, 71.0f, 32.0f, 70.0f, 0.0f));
        if (i9 == 3) {
            ImageView imageView3 = new ImageView(context);
            this.C = imageView3;
            imageView3.setImageResource(R.drawable.msg_close);
            imageView3.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            imageView3.setColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23369y6, false), PorterDuff.Mode.SRC_IN);
            imageView3.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23092i6, false), 1, -1));
            imageView3.setVisibility(8);
            boolean z12 = LocaleController.isRTL;
            if (z12) {
                i15 = 3;
            } else {
                i15 = 5;
            }
            int i23 = i15 | 16;
            if (z12) {
                f12 = 4.0f;
            } else {
                f12 = 0.0f;
            }
            if (z12) {
                f13 = 0.0f;
            } else {
                f13 = 4.0f;
            }
            addView(imageView3, g7.e6.d(-2, -2.0f, i23, f12, 0.0f, f13, 0.0f));
        }
        e(0);
    }

    public final boolean a() {
        int i9 = this.f24616a;
        if (i9 == 1) {
            return this.f24619e.f27781a.f26313q;
        }
        if (i9 == 3) {
            if (this.h.getVisibility() != 0) {
                return false;
            }
        } else if (!this.f24624w || this.f24625x.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public final void b(boolean z10, boolean z11) {
        float f10;
        float f11;
        int i9 = this.f24616a;
        if (i9 == 1) {
            this.f24619e.a(z10, z11);
            return;
        }
        int i10 = 4;
        float f12 = 0.0f;
        float f13 = 0.1f;
        if (i9 == 3) {
            ImageView imageView = this.h;
            if (z11) {
                imageView.animate().cancel();
                ViewPropertyAnimator listener = imageView.animate().setListener(new h8(this, z10, 0));
                if (z10) {
                    f12 = 1.0f;
                }
                ViewPropertyAnimator alpha = listener.alpha(f12);
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.1f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f11);
                if (z10) {
                    f13 = 1.0f;
                }
                scaleX.scaleY(f13).setDuration(150L).start();
                return;
            }
            if (z10) {
                i10 = 0;
            }
            imageView.setVisibility(i10);
            if (!z10) {
                imageView.setAlpha(0.0f);
                imageView.setScaleX(0.1f);
                imageView.setScaleY(0.1f);
                return;
            }
            imageView.setAlpha(1.0f);
            imageView.setScaleX(1.0f);
            imageView.setScaleY(1.0f);
        } else if (this.f24624w) {
            FrameLayout frameLayout = this.f24625x;
            if (z11) {
                frameLayout.animate().cancel();
                ViewPropertyAnimator listener2 = frameLayout.animate().setListener(new h8(this, z10, 1));
                if (z10) {
                    f12 = 1.0f;
                }
                ViewPropertyAnimator alpha2 = listener2.alpha(f12);
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.1f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f10);
                if (z10) {
                    f13 = 1.0f;
                }
                scaleX2.scaleY(f13).setDuration(150L).start();
                return;
            }
            if (z10) {
                i10 = 0;
            }
            frameLayout.setVisibility(i10);
            if (!z10) {
                frameLayout.setAlpha(0.0f);
                frameLayout.setScaleX(0.1f);
                frameLayout.setScaleY(0.1f);
                return;
            }
            frameLayout.setAlpha(1.0f);
            frameLayout.setScaleX(1.0f);
            frameLayout.setScaleY(1.0f);
        }
    }

    public final void c(final boolean z10) {
        float f10;
        float f11;
        if (this.f24616a == 1) {
            float f12 = 0.0f;
            float f13 = 1.0f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (!z10) {
                f12 = 1.0f;
            }
            float[] fArr = {f10, f12};
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.66f;
            }
            if (z10) {
                f13 = 0.66f;
            }
            float[] fArr2 = {f11, f13};
            ImageView imageView = this.f24621n;
            imageView.setVisibility(0);
            ViewPropertyAnimator duration = imageView.animate().alpha(fArr[0]).scaleX(fArr2[0]).scaleY(fArr2[0]).setDuration(200L);
            gr grVar = xs.f34751a;
            duration.setInterpolator(grVar).withEndAction(new Runnable(this) {
                public final k8 f24347b;

                {
                    this.f24347b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            k8 k8Var = this.f24347b;
                            if (!z11) {
                                k8Var.f24621n.setVisibility(8);
                                return;
                            } else {
                                k8Var.getClass();
                                return;
                            }
                        case 1:
                            boolean z12 = z10;
                            k8 k8Var2 = this.f24347b;
                            if (z12) {
                                k8Var2.f24625x.setVisibility(8);
                                return;
                            } else {
                                k8Var2.getClass();
                                return;
                            }
                        default:
                            boolean z13 = z10;
                            k8 k8Var3 = this.f24347b;
                            if (z13) {
                                k8Var3.h.setVisibility(8);
                                return;
                            } else {
                                k8Var3.getClass();
                                return;
                            }
                    }
                }
            }).start();
            if (this.f24624w) {
                FrameLayout frameLayout = this.f24625x;
                frameLayout.setVisibility(0);
                frameLayout.animate().alpha(fArr[1]).scaleX(fArr2[1]).scaleY(fArr2[1]).setDuration(200L).setInterpolator(grVar).withEndAction(new Runnable(this) {
                    public final k8 f24347b;

                    {
                        this.f24347b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                boolean z11 = z10;
                                k8 k8Var = this.f24347b;
                                if (!z11) {
                                    k8Var.f24621n.setVisibility(8);
                                    return;
                                } else {
                                    k8Var.getClass();
                                    return;
                                }
                            case 1:
                                boolean z12 = z10;
                                k8 k8Var2 = this.f24347b;
                                if (z12) {
                                    k8Var2.f24625x.setVisibility(8);
                                    return;
                                } else {
                                    k8Var2.getClass();
                                    return;
                                }
                            default:
                                boolean z13 = z10;
                                k8 k8Var3 = this.f24347b;
                                if (z13) {
                                    k8Var3.h.setVisibility(8);
                                    return;
                                } else {
                                    k8Var3.getClass();
                                    return;
                                }
                        }
                    }
                }).start();
                return;
            }
            ImageView imageView2 = this.h;
            imageView2.setVisibility(0);
            imageView2.animate().alpha(fArr[1]).scaleX(fArr2[1]).scaleY(fArr2[1]).setDuration(200L).setInterpolator(grVar).withEndAction(new Runnable(this) {
                public final k8 f24347b;

                {
                    this.f24347b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            k8 k8Var = this.f24347b;
                            if (!z11) {
                                k8Var.f24621n.setVisibility(8);
                                return;
                            } else {
                                k8Var.getClass();
                                return;
                            }
                        case 1:
                            boolean z12 = z10;
                            k8 k8Var2 = this.f24347b;
                            if (z12) {
                                k8Var2.f24625x.setVisibility(8);
                                return;
                            } else {
                                k8Var2.getClass();
                                return;
                            }
                        default:
                            boolean z13 = z10;
                            k8 k8Var3 = this.f24347b;
                            if (z13) {
                                k8Var3.h.setVisibility(8);
                                return;
                            } else {
                                k8Var3.getClass();
                                return;
                            }
                    }
                }
            }).start();
        }
    }

    public final void d(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z10, boolean z11) {
        int i9;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
        String str;
        ImageLocation forSticker;
        int i10;
        String str2;
        this.f24620f = z10;
        this.f24622r = tL_messages_stickerSet;
        this.f24623s = z11;
        org.telegram.ui.Components.o9 o9Var = this.d;
        o9Var.setVisibility(0);
        bg.t tVar = this.f24617b;
        tVar.setTranslationY(0.0f);
        tVar.setText(this.f24622r.set.title);
        boolean z12 = this.f24622r.set.archived;
        TextView textView = this.f24618c;
        if (z12) {
            tVar.setAlpha(0.5f);
            textView.setAlpha(0.5f);
            o9Var.setAlpha(0.5f);
        } else {
            tVar.setAlpha(1.0f);
            textView.setAlpha(1.0f);
            o9Var.setAlpha(1.0f);
        }
        boolean z13 = tL_messages_stickerSet.set.emojis;
        this.f24624w = z13;
        int i11 = 8;
        if (z13) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        this.f24625x.setVisibility(i9);
        if (!this.f24624w) {
            i11 = 0;
        }
        this.h.setVisibility(i11);
        TLRPC.Document document = null;
        o9Var.setColorFilter(null);
        ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
        String str3 = "Stickers";
        if (arrayList != null && !arrayList.isEmpty()) {
            if (this.f24624w) {
                str3 = "EmojiCount";
            }
            textView.setText(LocaleController.formatPluralString(str3, arrayList.size(), new Object[0]));
            int i12 = 0;
            while (true) {
                if (i12 < arrayList.size()) {
                    TLRPC.Document document2 = arrayList.get(i12);
                    if (document2 != null && document2.f22386id == tL_messages_stickerSet.set.thumb_document_id) {
                        document = document2;
                        break;
                    }
                    i12++;
                } else {
                    break;
                }
            }
            if (document == null) {
                document = arrayList.get(0);
            }
            LiteMode.isEnabled(1);
            TLObject closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tL_messages_stickerSet.set.thumbs, 90);
            if (closestPhotoSizeWithSize == null) {
                closestPhotoSizeWithSize = document;
            }
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_messages_stickerSet.set.thumbs, org.telegram.ui.ActionBar.f6.f22947a7, 1.0f);
            boolean z14 = closestPhotoSizeWithSize instanceof TLRPC.Document;
            if (z14) {
                forSticker = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document);
            } else {
                forSticker = ImageLocation.getForSticker((TLRPC.PhotoSize) closestPhotoSizeWithSize, document, tL_messages_stickerSet.set.thumb_version);
            }
            if (this.f24624w) {
                i10 = 16388;
            } else {
                i10 = 1;
            }
            if (!LiteMode.isEnabled(i10)) {
                str2 = "_firstframe";
            } else {
                str2 = "";
            }
            String concat = "50_50".concat(str2);
            if (!z14 || (!MessageObject.isAnimatedStickerDocument(document, true) && !MessageObject.isVideoSticker(document))) {
                tL_messages_stickerSet2 = tL_messages_stickerSet;
                if (forSticker != null && forSticker.imageType == 1) {
                    o9Var.i(forSticker, concat, "tgs", svgThumb, tL_messages_stickerSet2);
                } else {
                    o9Var.i(forSticker, concat, "webp", svgThumb, tL_messages_stickerSet2);
                }
            } else {
                if (svgThumb != null) {
                    o9Var.n(ImageLocation.getForDocument(document), concat, svgThumb, tL_messages_stickerSet);
                    tL_messages_stickerSet2 = tL_messages_stickerSet;
                } else {
                    o9Var.j(ImageLocation.getForDocument(document), concat, forSticker, null, 0, tL_messages_stickerSet);
                    tL_messages_stickerSet2 = tL_messages_stickerSet;
                }
                if (MessageObject.isTextColorEmoji(document)) {
                    o9Var.setColorFilter(org.telegram.ui.ActionBar.f6.f23317v3);
                }
            }
        } else {
            tL_messages_stickerSet2 = tL_messages_stickerSet;
            if (tL_messages_stickerSet2.set.emojis) {
                str3 = "EmojiCount";
            }
            textView.setText(LocaleController.formatPluralString(str3, 0, new Object[0]));
            o9Var.setImageDrawable(null);
            if (tL_messages_stickerSet2.set.thumb_document_id != 0) {
                org.telegram.ui.Components.k5.h(UserConfig.selectedAccount).b(tL_messages_stickerSet2.set.thumb_document_id, new org.telegram.ui.Components.h5() {
                    @Override
                    public final void a(TLRPC.Document document3) {
                        AndroidUtilities.runOnUIThread(new ka(7, k8.this, document3));
                    }
                });
            }
        }
        if (this.f24623s) {
            StringBuilder sb2 = new StringBuilder();
            if (tL_messages_stickerSet2.set.emojis) {
                str = "t.me/addemoji/";
            } else {
                str = "t.me/addstickers/";
            }
            sb2.append(str);
            sb2.append(tL_messages_stickerSet2.set.short_name);
            textView.setText(sb2.toString());
        }
    }

    public final void e(int i9) {
        boolean z10;
        boolean z11;
        boolean z12;
        float f10;
        float f11;
        float f12;
        int i10;
        float f13;
        float f14;
        float f15;
        int i11;
        float f16;
        AnimatorSet animatorSet = this.D;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.D = null;
        }
        int i12 = 0;
        zf.p0 p0Var = this.B;
        if (i9 == 1) {
            p0Var.a(LocaleController.getString(R.string.Unlock), new e8(this, 0), false);
        } else if (i9 == 2) {
            p0Var.a(LocaleController.getString(R.string.Restore), new e8(this, 0), false);
        }
        if (i9 != 1 && i9 != 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        p0Var.setEnabled(z10);
        if (i9 == 3) {
            z11 = true;
        } else {
            z11 = false;
        }
        TextView textView = this.f24626y;
        textView.setEnabled(z11);
        if (i9 == 4) {
            z12 = true;
        } else {
            z12 = false;
        }
        TextView textView2 = this.A;
        textView2.setEnabled(z12);
        float f17 = 0.0f;
        float f18 = 1.0f;
        if (i9 != 1 && i9 != 2) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        p0Var.setAlpha(f10);
        if (i9 != 1 && i9 != 2) {
            f11 = 0.6f;
        } else {
            f11 = 1.0f;
        }
        p0Var.setScaleX(f11);
        if (i9 != 1 && i9 != 2) {
            f12 = 0.6f;
        } else {
            f12 = 1.0f;
        }
        p0Var.setScaleY(f12);
        if (i9 != 1 && i9 != 2) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        p0Var.setVisibility(i10);
        if (i9 == 3) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        textView.setAlpha(f13);
        if (i9 == 3) {
            f14 = 1.0f;
        } else {
            f14 = 0.6f;
        }
        textView.setScaleX(f14);
        if (i9 == 3) {
            f15 = 1.0f;
        } else {
            f15 = 0.6f;
        }
        textView.setScaleY(f15);
        if (i9 == 3) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        textView.setVisibility(i11);
        if (i9 == 4) {
            f17 = 1.0f;
        }
        textView2.setAlpha(f17);
        if (i9 == 4) {
            f16 = 1.0f;
        } else {
            f16 = 0.6f;
        }
        textView2.setScaleX(f16);
        if (i9 != 4) {
            f18 = 0.6f;
        }
        textView2.setScaleY(f18);
        if (i9 != 4) {
            i12 = 8;
        }
        textView2.setVisibility(i12);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), 1073741824);
        FrameLayout frameLayout = this.f24625x;
        frameLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        int measuredWidth = frameLayout.getMeasuredWidth() + AndroidUtilities.dp(26.0f);
        boolean z13 = LocaleController.isRTL;
        TextView textView3 = this.f24618c;
        bg.t tVar = this.f24617b;
        if (z13) {
            ((ViewGroup.MarginLayoutParams) tVar.getLayoutParams()).leftMargin = measuredWidth;
            ((ViewGroup.MarginLayoutParams) textView3.getLayoutParams()).leftMargin = measuredWidth;
            return;
        }
        ((ViewGroup.MarginLayoutParams) tVar.getLayoutParams()).rightMargin = measuredWidth;
        ((ViewGroup.MarginLayoutParams) textView3.getLayoutParams()).rightMargin = measuredWidth;
    }

    public TLRPC.TL_messages_stickerSet getStickersSet() {
        return this.f24622r;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i9;
        if (this.f24620f) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(71.0f);
            }
            float height = getHeight() - 1;
            int width = getWidth() - getPaddingRight();
            if (LocaleController.isRTL) {
                i9 = AndroidUtilities.dp(71.0f);
            } else {
                i9 = 0;
            }
            canvas.drawLine(dp, height, width - i9, getHeight() - 1, org.telegram.ui.ActionBar.f6.f23121k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        dp dpVar = this.f24619e;
        if (dpVar != null && dpVar.f27781a.f26313q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f) + (this.f24620f ? 1 : 0), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout;
        ImageView imageView;
        Drawable background = getBackground();
        Rect rect = this.v;
        if (background != null && (imageView = this.h) != null) {
            imageView.getHitRect(rect);
            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return true;
            }
        }
        if (getBackground() != null && this.f24624w && (frameLayout = this.f24625x) != null) {
            frameLayout.getHitRect(rect);
            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setChecked(boolean z10) {
        b(z10, true);
    }

    public void setDeleteAction(View.OnClickListener onClickListener) {
        int i9;
        ImageView imageView = this.C;
        if (imageView != null) {
            if (onClickListener == null) {
                i9 = 8;
            } else {
                i9 = 0;
            }
            imageView.setVisibility(i9);
            imageView.setOnClickListener(onClickListener);
        }
    }

    public void setNeedDivider(boolean z10) {
        this.f24620f = z10;
    }

    public void setOnOptionsClick(View.OnClickListener onClickListener) {
        ImageView imageView = this.h;
        if (imageView == null) {
            return;
        }
        imageView.setOnClickListener(onClickListener);
    }

    public void setOnReorderButtonTouchListener(View.OnTouchListener onTouchListener) {
        this.f24621n.setOnTouchListener(onTouchListener);
    }

    public void setReorderable(boolean z10) {
        c(z10);
    }
}
