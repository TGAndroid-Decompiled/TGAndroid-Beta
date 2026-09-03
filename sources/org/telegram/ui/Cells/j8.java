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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ft;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.mr;
import org.telegram.ui.ai;
public final class j8 extends FrameLayout {
    public final TextView B;
    public final eg.c1 C;
    public final ImageView D;
    public AnimatorSet E;
    public final int f21236a;
    public final gg.q f21237b;
    public final TextView f21238c;
    public final org.telegram.ui.Components.p9 d;
    public final kp e;
    public boolean f21239f;
    public final ImageView h;
    public final ImageView f21240n;
    public TLRPC.TL_messages_stickerSet f21241r;
    public boolean f21242s;
    public final Rect v;
    public boolean f21243w;
    public final FrameLayout f21244x;
    public final TextView f21245y;

    public j8(Context context, int i10) {
        super(context);
        int i11;
        float f10;
        float f11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        float f12;
        float f13;
        int i17;
        int i18;
        int i19;
        this.v = new Rect();
        this.f21236a = i10;
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.d = p9Var;
        p9Var.setAspectFit(true);
        p9Var.setLayerNum(1);
        boolean z4 = LocaleController.isRTL;
        if (z4) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i20 = i11 | 48;
        if (z4) {
            f10 = 0.0f;
        } else {
            f10 = 13.0f;
        }
        if (z4) {
            f11 = 13.0f;
        } else {
            f11 = 0.0f;
        }
        addView(p9Var, k7.b6.d(40, 40.0f, i20, f10, 9.0f, f11, 0.0f));
        if (i10 != 0) {
            ImageView imageView = new ImageView(context);
            this.h = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            if (i10 != 3) {
                imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Vh, false), 1, -1));
            }
            if (i10 == 1) {
                int i21 = org.telegram.ui.ActionBar.j6.Uh;
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, i21, false);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
                imageView.setImageResource(R.drawable.msg_actions);
                imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
                if (LocaleController.isRTL) {
                    i19 = 3;
                } else {
                    i19 = 5;
                }
                addView(imageView, k7.b6.e(40, 40, i19 | 16));
                ImageView imageView2 = new ImageView(context);
                this.f21240n = imageView2;
                imageView2.setAlpha(0.0f);
                imageView2.setVisibility(8);
                imageView2.setScaleType(scaleType);
                imageView2.setImageResource(R.drawable.list_reorder);
                imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i21, false), mode));
                addView(imageView2, k7.b6.h(58.0f, 58.0f, 8388613));
                kp kpVar = new kp(context, 21, null);
                this.e = kpVar;
                kpVar.b(-1, org.telegram.ui.ActionBar.j6.f19881d6, org.telegram.ui.ActionBar.j6.f20007k7);
                kpVar.setDrawUnchecked(false);
                kpVar.setDrawBackgroundAsArc(3);
                addView(kpVar, k7.b6.i(24.0f, 24.0f, 8388611, 34.0f, 30.0f, 0.0f, 0.0f));
            } else if (i10 == 3) {
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Mh, false), PorterDuff.Mode.MULTIPLY));
                imageView.setImageResource(R.drawable.floating_check);
                boolean z10 = LocaleController.isRTL;
                if (z10) {
                    i17 = 3;
                } else {
                    i17 = 5;
                }
                int i22 = i17 | 48;
                if (z10) {
                    i18 = 10;
                } else {
                    i18 = 0;
                }
                addView(imageView, k7.b6.d(40, 40.0f, i22, i18, 9.0f, z10 ? 0 : 10, 0.0f));
            }
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f21244x = frameLayout;
        TextView textView = new TextView(context);
        this.f21245y = textView;
        ai.o(14.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.Add));
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
        int i23 = org.telegram.ui.ActionBar.j6.Oh;
        textView.setBackground(org.telegram.ui.ActionBar.z5.d(new float[]{14.0f}, org.telegram.ui.ActionBar.j6.w0(null, i23, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false)));
        textView.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        textView.setGravity(17);
        textView.setOnClickListener(new d8(this, 0));
        if (LocaleController.isRTL) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        frameLayout.addView(textView, k7.b6.h(-2.0f, 28.0f, i12 | 16));
        k7.d6.a(textView);
        TextView textView2 = new TextView(context);
        this.B = textView2;
        ai.o(14.0f, 1, textView2);
        textView2.setText(LocaleController.getString(R.string.StickersRemove));
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Rh, false));
        textView2.setBackground(org.telegram.ui.ActionBar.z5.d(new float[]{14.0f}, 0, org.telegram.ui.ActionBar.j6.w0(null, i23, false) & 452984831));
        textView2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        textView2.setGravity(17);
        textView2.setOnClickListener(new d8(this, 0));
        if (LocaleController.isRTL) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        frameLayout.addView(textView2, k7.b6.i(-2.0f, 32.0f, i13 | 16, 0.0f, -2.0f, 0.0f, 0.0f));
        k7.d6.a(textView2);
        eg.c1 c1Var = new eg.c1(AndroidUtilities.dp(4.0f), context, null, false);
        this.C = c1Var;
        c1Var.setIcon(R.raw.unlock_icon);
        c1Var.a(LocaleController.getString(R.string.Unlock), new d8(this, 0), false);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c1Var.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = AndroidUtilities.dp(1.0f);
            marginLayoutParams.topMargin = AndroidUtilities.dp(1.0f);
            int dp = AndroidUtilities.dp(20.0f);
            marginLayoutParams.height = dp;
            marginLayoutParams.width = dp;
            ((ViewGroup.MarginLayoutParams) c1Var.getTextView().getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
            c1Var.getChildAt(0).setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        } catch (Exception unused) {
        }
        FrameLayout frameLayout2 = this.f21244x;
        eg.c1 c1Var2 = this.C;
        if (LocaleController.isRTL) {
            i14 = 3;
        } else {
            i14 = 5;
        }
        frameLayout2.addView(c1Var2, k7.b6.h(-2.0f, 28.0f, i14 | 16));
        k7.d6.a(this.C);
        this.f21244x.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        View view = this.f21244x;
        if (LocaleController.isRTL) {
            i15 = 3;
        } else {
            i15 = 5;
        }
        addView(view, k7.b6.d(-2, -1.0f, i15, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f21244x.setOnClickListener(new d8(this, 1));
        gg.q qVar = new gg.q(context, 7);
        this.f21237b = qVar;
        NotificationCenter.listenEmojiLoading(qVar);
        qVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        qVar.setTextSize(1, 16.0f);
        qVar.setTypeface(AndroidUtilities.bold());
        qVar.setLines(1);
        qVar.setMaxLines(1);
        qVar.setSingleLine(true);
        qVar.setEllipsize(TextUtils.TruncateAt.END);
        qVar.setGravity(k7.b6.y());
        addView(qVar, k7.b6.i(-2.0f, -2.0f, 8388611, 71.0f, 9.0f, 70.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.f21238c = textView3;
        org.telegram.ui.b.q(textView3, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20273z6, false), 1, 13.0f, 1);
        textView3.setMaxLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(k7.b6.y());
        addView(textView3, k7.b6.i(-2.0f, -2.0f, 8388611, 71.0f, 32.0f, 70.0f, 0.0f));
        if (i10 == 3) {
            ImageView imageView3 = new ImageView(context);
            this.D = imageView3;
            imageView3.setImageResource(R.drawable.msg_close);
            imageView3.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            imageView3.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20256y6, false), PorterDuff.Mode.SRC_IN);
            imageView3.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19971i6, false), 1, -1));
            imageView3.setVisibility(8);
            boolean z11 = LocaleController.isRTL;
            if (z11) {
                i16 = 3;
            } else {
                i16 = 5;
            }
            int i24 = i16 | 16;
            if (z11) {
                f12 = 4.0f;
            } else {
                f12 = 0.0f;
            }
            if (z11) {
                f13 = 0.0f;
            } else {
                f13 = 4.0f;
            }
            addView(imageView3, k7.b6.d(-2, -2.0f, i24, f12, 0.0f, f13, 0.0f));
        }
        e(0);
    }

    public final boolean a() {
        int i10 = this.f21236a;
        if (i10 == 1) {
            return this.e.f26377a.f22938q;
        }
        if (i10 == 3) {
            if (this.h.getVisibility() != 0) {
                return false;
            }
        } else if (!this.f21243w || this.f21244x.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public final void b(boolean z4, boolean z10) {
        float f10;
        float f11;
        int i10 = this.f21236a;
        if (i10 == 1) {
            this.e.a(z4, z10);
            return;
        }
        int i11 = 4;
        float f12 = 0.0f;
        float f13 = 0.1f;
        if (i10 == 3) {
            ImageView imageView = this.h;
            if (z10) {
                imageView.animate().cancel();
                ViewPropertyAnimator listener = imageView.animate().setListener(new g8(this, z4, 0));
                if (z4) {
                    f12 = 1.0f;
                }
                ViewPropertyAnimator alpha = listener.alpha(f12);
                if (z4) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.1f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f11);
                if (z4) {
                    f13 = 1.0f;
                }
                scaleX.scaleY(f13).setDuration(150L).start();
                return;
            }
            if (z4) {
                i11 = 0;
            }
            imageView.setVisibility(i11);
            if (!z4) {
                imageView.setAlpha(0.0f);
                imageView.setScaleX(0.1f);
                imageView.setScaleY(0.1f);
                return;
            }
            imageView.setAlpha(1.0f);
            imageView.setScaleX(1.0f);
            imageView.setScaleY(1.0f);
        } else if (this.f21243w) {
            FrameLayout frameLayout = this.f21244x;
            if (z10) {
                frameLayout.animate().cancel();
                ViewPropertyAnimator listener2 = frameLayout.animate().setListener(new g8(this, z4, 1));
                if (z4) {
                    f12 = 1.0f;
                }
                ViewPropertyAnimator alpha2 = listener2.alpha(f12);
                if (z4) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.1f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f10);
                if (z4) {
                    f13 = 1.0f;
                }
                scaleX2.scaleY(f13).setDuration(150L).start();
                return;
            }
            if (z4) {
                i11 = 0;
            }
            frameLayout.setVisibility(i11);
            if (!z4) {
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

    public final void c(final boolean z4) {
        float f10;
        float f11;
        if (this.f21236a == 1) {
            float f12 = 0.0f;
            float f13 = 1.0f;
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (!z4) {
                f12 = 1.0f;
            }
            float[] fArr = {f10, f12};
            if (z4) {
                f11 = 1.0f;
            } else {
                f11 = 0.66f;
            }
            if (z4) {
                f13 = 0.66f;
            }
            float[] fArr2 = {f11, f13};
            ImageView imageView = this.f21240n;
            imageView.setVisibility(0);
            ViewPropertyAnimator duration = imageView.animate().alpha(fArr[0]).scaleX(fArr2[0]).scaleY(fArr2[0]).setDuration(200L);
            mr mrVar = ft.f24964a;
            duration.setInterpolator(mrVar).withEndAction(new Runnable(this) {
                public final j8 f21005b;

                {
                    this.f21005b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            boolean z10 = z4;
                            j8 j8Var = this.f21005b;
                            if (!z10) {
                                j8Var.f21240n.setVisibility(8);
                                return;
                            } else {
                                j8Var.getClass();
                                return;
                            }
                        case 1:
                            boolean z11 = z4;
                            j8 j8Var2 = this.f21005b;
                            if (z11) {
                                j8Var2.f21244x.setVisibility(8);
                                return;
                            } else {
                                j8Var2.getClass();
                                return;
                            }
                        default:
                            boolean z12 = z4;
                            j8 j8Var3 = this.f21005b;
                            if (z12) {
                                j8Var3.h.setVisibility(8);
                                return;
                            } else {
                                j8Var3.getClass();
                                return;
                            }
                    }
                }
            }).start();
            if (this.f21243w) {
                FrameLayout frameLayout = this.f21244x;
                frameLayout.setVisibility(0);
                frameLayout.animate().alpha(fArr[1]).scaleX(fArr2[1]).scaleY(fArr2[1]).setDuration(200L).setInterpolator(mrVar).withEndAction(new Runnable(this) {
                    public final j8 f21005b;

                    {
                        this.f21005b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                boolean z10 = z4;
                                j8 j8Var = this.f21005b;
                                if (!z10) {
                                    j8Var.f21240n.setVisibility(8);
                                    return;
                                } else {
                                    j8Var.getClass();
                                    return;
                                }
                            case 1:
                                boolean z11 = z4;
                                j8 j8Var2 = this.f21005b;
                                if (z11) {
                                    j8Var2.f21244x.setVisibility(8);
                                    return;
                                } else {
                                    j8Var2.getClass();
                                    return;
                                }
                            default:
                                boolean z12 = z4;
                                j8 j8Var3 = this.f21005b;
                                if (z12) {
                                    j8Var3.h.setVisibility(8);
                                    return;
                                } else {
                                    j8Var3.getClass();
                                    return;
                                }
                        }
                    }
                }).start();
                return;
            }
            ImageView imageView2 = this.h;
            imageView2.setVisibility(0);
            imageView2.animate().alpha(fArr[1]).scaleX(fArr2[1]).scaleY(fArr2[1]).setDuration(200L).setInterpolator(mrVar).withEndAction(new Runnable(this) {
                public final j8 f21005b;

                {
                    this.f21005b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            boolean z10 = z4;
                            j8 j8Var = this.f21005b;
                            if (!z10) {
                                j8Var.f21240n.setVisibility(8);
                                return;
                            } else {
                                j8Var.getClass();
                                return;
                            }
                        case 1:
                            boolean z11 = z4;
                            j8 j8Var2 = this.f21005b;
                            if (z11) {
                                j8Var2.f21244x.setVisibility(8);
                                return;
                            } else {
                                j8Var2.getClass();
                                return;
                            }
                        default:
                            boolean z12 = z4;
                            j8 j8Var3 = this.f21005b;
                            if (z12) {
                                j8Var3.h.setVisibility(8);
                                return;
                            } else {
                                j8Var3.getClass();
                                return;
                            }
                    }
                }
            }).start();
        }
    }

    public final void d(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z4, boolean z10) {
        int i10;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
        String str;
        ImageLocation forSticker;
        int i11;
        String str2;
        this.f21239f = z4;
        this.f21241r = tL_messages_stickerSet;
        this.f21242s = z10;
        org.telegram.ui.Components.p9 p9Var = this.d;
        p9Var.setVisibility(0);
        gg.q qVar = this.f21237b;
        qVar.setTranslationY(0.0f);
        qVar.setText(this.f21241r.set.title);
        boolean z11 = this.f21241r.set.archived;
        TextView textView = this.f21238c;
        if (z11) {
            qVar.setAlpha(0.5f);
            textView.setAlpha(0.5f);
            p9Var.setAlpha(0.5f);
        } else {
            qVar.setAlpha(1.0f);
            textView.setAlpha(1.0f);
            p9Var.setAlpha(1.0f);
        }
        boolean z12 = tL_messages_stickerSet.set.emojis;
        this.f21243w = z12;
        int i12 = 8;
        if (z12) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f21244x.setVisibility(i10);
        if (!this.f21243w) {
            i12 = 0;
        }
        this.h.setVisibility(i12);
        TLRPC.Document document = null;
        p9Var.setColorFilter(null);
        ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
        String str3 = "Stickers";
        if (arrayList != null && !arrayList.isEmpty()) {
            if (this.f21243w) {
                str3 = "EmojiCount";
            }
            textView.setText(LocaleController.formatPluralString(str3, arrayList.size(), new Object[0]));
            int i13 = 0;
            while (true) {
                if (i13 < arrayList.size()) {
                    TLRPC.Document document2 = arrayList.get(i13);
                    if (document2 != null && document2.f19165id == tL_messages_stickerSet.set.thumb_document_id) {
                        document = document2;
                        break;
                    }
                    i13++;
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
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_messages_stickerSet.set.thumbs, org.telegram.ui.ActionBar.j6.f19827a7, 1.0f);
            boolean z13 = closestPhotoSizeWithSize instanceof TLRPC.Document;
            if (z13) {
                forSticker = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document);
            } else {
                forSticker = ImageLocation.getForSticker((TLRPC.PhotoSize) closestPhotoSizeWithSize, document, tL_messages_stickerSet.set.thumb_version);
            }
            if (this.f21243w) {
                i11 = 16388;
            } else {
                i11 = 1;
            }
            if (!LiteMode.isEnabled(i11)) {
                str2 = "_firstframe";
            } else {
                str2 = "";
            }
            String concat = "50_50".concat(str2);
            if (!z13 || (!MessageObject.isAnimatedStickerDocument(document, true) && !MessageObject.isVideoSticker(document))) {
                tL_messages_stickerSet2 = tL_messages_stickerSet;
                if (forSticker != null && forSticker.imageType == 1) {
                    p9Var.i(forSticker, concat, "tgs", svgThumb, tL_messages_stickerSet2);
                } else {
                    p9Var.i(forSticker, concat, "webp", svgThumb, tL_messages_stickerSet2);
                }
            } else {
                if (svgThumb != null) {
                    p9Var.n(ImageLocation.getForDocument(document), concat, svgThumb, tL_messages_stickerSet);
                    tL_messages_stickerSet2 = tL_messages_stickerSet;
                } else {
                    p9Var.j(ImageLocation.getForDocument(document), concat, forSticker, null, 0, tL_messages_stickerSet);
                    tL_messages_stickerSet2 = tL_messages_stickerSet;
                }
                if (MessageObject.isTextColorEmoji(document)) {
                    p9Var.setColorFilter(org.telegram.ui.ActionBar.j6.f20197v3);
                }
            }
        } else {
            tL_messages_stickerSet2 = tL_messages_stickerSet;
            if (tL_messages_stickerSet2.set.emojis) {
                str3 = "EmojiCount";
            }
            textView.setText(LocaleController.formatPluralString(str3, 0, new Object[0]));
            p9Var.setImageDrawable(null);
            if (tL_messages_stickerSet2.set.thumb_document_id != 0) {
                org.telegram.ui.Components.l5.h(UserConfig.selectedAccount).b(tL_messages_stickerSet2.set.thumb_document_id, new org.telegram.ui.Components.i5() {
                    @Override
                    public final void a(TLRPC.Document document3) {
                        AndroidUtilities.runOnUIThread(new ia(7, j8.this, document3));
                    }
                });
            }
        }
        if (this.f21242s) {
            StringBuilder sb = new StringBuilder();
            if (tL_messages_stickerSet2.set.emojis) {
                str = "t.me/addemoji/";
            } else {
                str = "t.me/addstickers/";
            }
            sb.append(str);
            sb.append(tL_messages_stickerSet2.set.short_name);
            textView.setText(sb.toString());
        }
    }

    public final void e(int i10) {
        boolean z4;
        boolean z10;
        boolean z11;
        float f10;
        float f11;
        float f12;
        int i11;
        float f13;
        float f14;
        float f15;
        int i12;
        float f16;
        AnimatorSet animatorSet = this.E;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.E = null;
        }
        int i13 = 0;
        eg.c1 c1Var = this.C;
        if (i10 == 1) {
            c1Var.a(LocaleController.getString(R.string.Unlock), new d8(this, 0), false);
        } else if (i10 == 2) {
            c1Var.a(LocaleController.getString(R.string.Restore), new d8(this, 0), false);
        }
        if (i10 != 1 && i10 != 2) {
            z4 = false;
        } else {
            z4 = true;
        }
        c1Var.setEnabled(z4);
        if (i10 == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        TextView textView = this.f21245y;
        textView.setEnabled(z10);
        if (i10 == 4) {
            z11 = true;
        } else {
            z11 = false;
        }
        TextView textView2 = this.B;
        textView2.setEnabled(z11);
        float f17 = 0.0f;
        float f18 = 1.0f;
        if (i10 != 1 && i10 != 2) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        c1Var.setAlpha(f10);
        if (i10 != 1 && i10 != 2) {
            f11 = 0.6f;
        } else {
            f11 = 1.0f;
        }
        c1Var.setScaleX(f11);
        if (i10 != 1 && i10 != 2) {
            f12 = 0.6f;
        } else {
            f12 = 1.0f;
        }
        c1Var.setScaleY(f12);
        if (i10 != 1 && i10 != 2) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        c1Var.setVisibility(i11);
        if (i10 == 3) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        textView.setAlpha(f13);
        if (i10 == 3) {
            f14 = 1.0f;
        } else {
            f14 = 0.6f;
        }
        textView.setScaleX(f14);
        if (i10 == 3) {
            f15 = 1.0f;
        } else {
            f15 = 0.6f;
        }
        textView.setScaleY(f15);
        if (i10 == 3) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        textView.setVisibility(i12);
        if (i10 == 4) {
            f17 = 1.0f;
        }
        textView2.setAlpha(f17);
        if (i10 == 4) {
            f16 = 1.0f;
        } else {
            f16 = 0.6f;
        }
        textView2.setScaleX(f16);
        if (i10 != 4) {
            f18 = 0.6f;
        }
        textView2.setScaleY(f18);
        if (i10 != 4) {
            i13 = 8;
        }
        textView2.setVisibility(i13);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), 1073741824);
        FrameLayout frameLayout = this.f21244x;
        frameLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        int measuredWidth = frameLayout.getMeasuredWidth() + AndroidUtilities.dp(26.0f);
        boolean z12 = LocaleController.isRTL;
        TextView textView3 = this.f21238c;
        gg.q qVar = this.f21237b;
        if (z12) {
            ((ViewGroup.MarginLayoutParams) qVar.getLayoutParams()).leftMargin = measuredWidth;
            ((ViewGroup.MarginLayoutParams) textView3.getLayoutParams()).leftMargin = measuredWidth;
            return;
        }
        ((ViewGroup.MarginLayoutParams) qVar.getLayoutParams()).rightMargin = measuredWidth;
        ((ViewGroup.MarginLayoutParams) textView3.getLayoutParams()).rightMargin = measuredWidth;
    }

    public TLRPC.TL_messages_stickerSet getStickersSet() {
        return this.f21241r;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        if (this.f21239f) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(71.0f);
            }
            float height = getHeight() - 1;
            int width = getWidth() - getPaddingRight();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(71.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(dp, height, width - i10, getHeight() - 1, org.telegram.ui.ActionBar.j6.f20000k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        kp kpVar = this.e;
        if (kpVar != null && kpVar.f26377a.f22938q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f) + (this.f21239f ? 1 : 0), 1073741824));
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
        if (getBackground() != null && this.f21243w && (frameLayout = this.f21244x) != null) {
            frameLayout.getHitRect(rect);
            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setChecked(boolean z4) {
        b(z4, true);
    }

    public void setDeleteAction(View.OnClickListener onClickListener) {
        int i10;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (onClickListener == null) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            imageView.setVisibility(i10);
            imageView.setOnClickListener(onClickListener);
        }
    }

    public void setNeedDivider(boolean z4) {
        this.f21239f = z4;
    }

    public void setOnOptionsClick(View.OnClickListener onClickListener) {
        ImageView imageView = this.h;
        if (imageView == null) {
            return;
        }
        imageView.setOnClickListener(onClickListener);
    }

    public void setOnReorderButtonTouchListener(View.OnTouchListener onTouchListener) {
        this.f21240n.setOnTouchListener(onTouchListener);
    }

    public void setReorderable(boolean z4) {
        c(z4);
    }
}
