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
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ws;

public final class h8 extends FrameLayout {
    public final TextView A;
    public final ag.s1 B;
    public final ImageView C;
    public AnimatorSet D;

    public final int f24452a;

    public final cg.q f24453b;

    public final TextView f24454c;
    public final org.telegram.ui.Components.n9 d;

    public final bp f24455e;

    public boolean f24456f;
    public final ImageView h;

    public final ImageView f24457n;

    public TLRPC.TL_messages_stickerSet f24458r;

    public boolean f24459s;
    public final Rect v;

    public boolean f24460w;

    public final FrameLayout f24461x;

    public final TextView f24462y;

    public h8(Context context, int i10) {
        super(context);
        this.v = new Rect();
        this.f24452a = i10;
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        this.d = n9Var;
        n9Var.setAspectFit(true);
        n9Var.setLayerNum(1);
        boolean z10 = LocaleController.isRTL;
        addView(n9Var, h7.z5.d(40, 40.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 13.0f, 9.0f, z10 ? 13.0f : 0.0f, 0.0f));
        if (i10 != 0) {
            ImageView imageView = new ImageView(context);
            this.h = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            if (i10 != 3) {
                imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Vh, false), 1, -1));
            }
            if (i10 == 1) {
                int i11 = org.telegram.ui.ActionBar.g6.Uh;
                int iW0 = org.telegram.ui.ActionBar.g6.w0(null, i11, false);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                imageView.setColorFilter(new PorterDuffColorFilter(iW0, mode));
                imageView.setImageResource(R.drawable.msg_actions);
                imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
                addView(imageView, h7.z5.e(40, 40, (LocaleController.isRTL ? 3 : 5) | 16));
                ImageView imageView2 = new ImageView(context);
                this.f24457n = imageView2;
                imageView2.setAlpha(0.0f);
                imageView2.setVisibility(8);
                imageView2.setScaleType(scaleType);
                imageView2.setImageResource(R.drawable.list_reorder);
                imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i11, false), mode));
                addView(imageView2, h7.z5.h(58.0f, 58.0f, 8388613));
                bp bpVar = new bp(context, 21, null);
                this.f24455e = bpVar;
                bpVar.b(-1, org.telegram.ui.ActionBar.g6.f23053d6, org.telegram.ui.ActionBar.g6.f23182k7);
                bpVar.setDrawUnchecked(false);
                bpVar.setDrawBackgroundAsArc(3);
                addView(bpVar, h7.z5.i(24.0f, 24.0f, 8388611, 34.0f, 30.0f, 0.0f, 0.0f));
            } else if (i10 == 3) {
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Mh, false), PorterDuff.Mode.MULTIPLY));
                imageView.setImageResource(R.drawable.floating_check);
                boolean z11 = LocaleController.isRTL;
                addView(imageView, h7.z5.d(40, 40.0f, (z11 ? 3 : 5) | 48, z11 ? 10 : 0, 9.0f, z11 ? 0 : 10, 0.0f));
            }
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f24461x = frameLayout;
        TextView textView = new TextView(context);
        this.f24462y = textView;
        pa.m(14.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.Add));
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
        int i12 = org.telegram.ui.ActionBar.g6.Oh;
        textView.setBackground(org.telegram.ui.ActionBar.w5.d(new float[]{14.0f}, org.telegram.ui.ActionBar.g6.w0(null, i12, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qh, false)));
        textView.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        textView.setGravity(17);
        textView.setOnClickListener(new b8(this, 0));
        frameLayout.addView(textView, h7.z5.h(-2.0f, 28.0f, (LocaleController.isRTL ? 3 : 5) | 16));
        h7.b6.a(textView);
        TextView textView2 = new TextView(context);
        this.A = textView2;
        pa.m(14.0f, 1, textView2);
        textView2.setText(LocaleController.getString(R.string.StickersRemove));
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Rh, false));
        textView2.setBackground(org.telegram.ui.ActionBar.w5.d(new float[]{14.0f}, 0, org.telegram.ui.ActionBar.g6.w0(null, i12, false) & 452984831));
        textView2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        textView2.setGravity(17);
        textView2.setOnClickListener(new b8(this, 0));
        frameLayout.addView(textView2, h7.z5.i(-2.0f, 32.0f, (LocaleController.isRTL ? 3 : 5) | 16, 0.0f, -2.0f, 0.0f, 0.0f));
        h7.b6.a(textView2);
        ag.s1 s1Var = new ag.s1(AndroidUtilities.dp(4.0f), context, null, false);
        this.B = s1Var;
        s1Var.setIcon(R.raw.unlock_icon);
        s1Var.a(LocaleController.getString(R.string.Unlock), new b8(this, 0), false);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) s1Var.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = AndroidUtilities.dp(1.0f);
            marginLayoutParams.topMargin = AndroidUtilities.dp(1.0f);
            int iDp = AndroidUtilities.dp(20.0f);
            marginLayoutParams.height = iDp;
            marginLayoutParams.width = iDp;
            ((ViewGroup.MarginLayoutParams) s1Var.getTextView().getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
            s1Var.getChildAt(0).setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        } catch (Exception unused) {
        }
        this.f24461x.addView(this.B, h7.z5.h(-2.0f, 28.0f, (LocaleController.isRTL ? 3 : 5) | 16));
        h7.b6.a(this.B);
        this.f24461x.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        addView(this.f24461x, h7.z5.d(-2, -1.0f, LocaleController.isRTL ? 3 : 5, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f24461x.setOnClickListener(new b8(this, 1));
        cg.q qVar = new cg.q(context, 9);
        this.f24453b = qVar;
        NotificationCenter.listenEmojiLoading(qVar);
        qVar.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        qVar.setTextSize(1, 16.0f);
        qVar.setTypeface(AndroidUtilities.bold());
        qVar.setLines(1);
        qVar.setMaxLines(1);
        qVar.setSingleLine(true);
        qVar.setEllipsize(TextUtils.TruncateAt.END);
        qVar.setGravity(h7.z5.y());
        addView(qVar, h7.z5.i(-2.0f, -2.0f, 8388611, 71.0f, 9.0f, 70.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.f24454c = textView3;
        rl.p(textView3, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23441z6, false), 1, 13.0f, 1);
        textView3.setMaxLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(h7.z5.y());
        addView(textView3, h7.z5.i(-2.0f, -2.0f, 8388611, 71.0f, 32.0f, 70.0f, 0.0f));
        if (i10 == 3) {
            ImageView imageView3 = new ImageView(context);
            this.C = imageView3;
            imageView3.setImageResource(R.drawable.msg_close);
            imageView3.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            imageView3.setColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23423y6, false), PorterDuff.Mode.SRC_IN);
            imageView3.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23144i6, false), 1, -1));
            imageView3.setVisibility(8);
            boolean z12 = LocaleController.isRTL;
            addView(imageView3, h7.z5.d(-2, -2.0f, (z12 ? 3 : 5) | 16, z12 ? 4.0f : 0.0f, 0.0f, z12 ? 0.0f : 4.0f, 0.0f));
        }
        e(0);
    }

    public final boolean a() {
        int i10 = this.f24452a;
        if (i10 == 1) {
            return this.f24455e.f27188a.f26309q;
        }
        if (i10 == 3) {
            if (this.h.getVisibility() != 0) {
                return false;
            }
        } else if (!this.f24460w || this.f24461x.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public final void b(boolean z10, boolean z11) {
        int i10 = this.f24452a;
        if (i10 == 1) {
            this.f24455e.a(z10, z11);
            return;
        }
        if (i10 == 3) {
            ImageView imageView = this.h;
            if (z11) {
                imageView.animate().cancel();
                imageView.animate().setListener(new e8(this, z10, 0)).alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.1f).scaleY(z10 ? 1.0f : 0.1f).setDuration(150L).start();
                return;
            }
            imageView.setVisibility(z10 ? 0 : 4);
            if (z10) {
                imageView.setAlpha(1.0f);
                imageView.setScaleX(1.0f);
                imageView.setScaleY(1.0f);
                return;
            } else {
                imageView.setAlpha(0.0f);
                imageView.setScaleX(0.1f);
                imageView.setScaleY(0.1f);
                return;
            }
        }
        if (this.f24460w) {
            FrameLayout frameLayout = this.f24461x;
            if (z11) {
                frameLayout.animate().cancel();
                frameLayout.animate().setListener(new e8(this, z10, 1)).alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.1f).scaleY(z10 ? 1.0f : 0.1f).setDuration(150L).start();
                return;
            }
            frameLayout.setVisibility(z10 ? 0 : 4);
            if (z10) {
                frameLayout.setAlpha(1.0f);
                frameLayout.setScaleX(1.0f);
                frameLayout.setScaleY(1.0f);
            } else {
                frameLayout.setAlpha(0.0f);
                frameLayout.setScaleX(0.1f);
                frameLayout.setScaleY(0.1f);
            }
        }
    }

    public final void c(final boolean z10) {
        final int i10 = 1;
        if (this.f24452a == 1) {
            final int i11 = 2;
            final int i12 = 0;
            float[] fArr = {z10 ? 1.0f : 0.0f, z10 ? 0.0f : 1.0f};
            float[] fArr2 = {z10 ? 1.0f : 0.66f, z10 ? 0.66f : 1.0f};
            ImageView imageView = this.f24457n;
            imageView.setVisibility(0);
            ViewPropertyAnimator duration = imageView.animate().alpha(fArr[0]).scaleX(fArr2[0]).scaleY(fArr2[0]).setDuration(200L);
            er erVar = ws.f34316a;
            duration.setInterpolator(erVar).withEndAction(new Runnable(this) {

                public final h8 f24168b;

                {
                    this.f24168b = this;
                }

                @Override
                public final void run() {
                    switch (i12) {
                        case 0:
                            boolean z11 = z10;
                            h8 h8Var = this.f24168b;
                            if (!z11) {
                                h8Var.f24457n.setVisibility(8);
                            } else {
                                h8Var.getClass();
                            }
                            break;
                        case 1:
                            boolean z12 = z10;
                            h8 h8Var2 = this.f24168b;
                            if (!z12) {
                                h8Var2.getClass();
                            } else {
                                h8Var2.f24461x.setVisibility(8);
                            }
                            break;
                        default:
                            boolean z13 = z10;
                            h8 h8Var3 = this.f24168b;
                            if (!z13) {
                                h8Var3.getClass();
                            } else {
                                h8Var3.h.setVisibility(8);
                            }
                            break;
                    }
                }
            }).start();
            if (this.f24460w) {
                FrameLayout frameLayout = this.f24461x;
                frameLayout.setVisibility(0);
                frameLayout.animate().alpha(fArr[1]).scaleX(fArr2[1]).scaleY(fArr2[1]).setDuration(200L).setInterpolator(erVar).withEndAction(new Runnable(this) {

                    public final h8 f24168b;

                    {
                        this.f24168b = this;
                    }

                    @Override
                    public final void run() {
                        switch (i10) {
                            case 0:
                                boolean z11 = z10;
                                h8 h8Var = this.f24168b;
                                if (!z11) {
                                    h8Var.f24457n.setVisibility(8);
                                } else {
                                    h8Var.getClass();
                                }
                                break;
                            case 1:
                                boolean z12 = z10;
                                h8 h8Var2 = this.f24168b;
                                if (!z12) {
                                    h8Var2.getClass();
                                } else {
                                    h8Var2.f24461x.setVisibility(8);
                                }
                                break;
                            default:
                                boolean z13 = z10;
                                h8 h8Var3 = this.f24168b;
                                if (!z13) {
                                    h8Var3.getClass();
                                } else {
                                    h8Var3.h.setVisibility(8);
                                }
                                break;
                        }
                    }
                }).start();
            } else {
                ImageView imageView2 = this.h;
                imageView2.setVisibility(0);
                imageView2.animate().alpha(fArr[1]).scaleX(fArr2[1]).scaleY(fArr2[1]).setDuration(200L).setInterpolator(erVar).withEndAction(new Runnable(this) {

                    public final h8 f24168b;

                    {
                        this.f24168b = this;
                    }

                    @Override
                    public final void run() {
                        switch (i11) {
                            case 0:
                                boolean z11 = z10;
                                h8 h8Var = this.f24168b;
                                if (!z11) {
                                    h8Var.f24457n.setVisibility(8);
                                } else {
                                    h8Var.getClass();
                                }
                                break;
                            case 1:
                                boolean z12 = z10;
                                h8 h8Var2 = this.f24168b;
                                if (!z12) {
                                    h8Var2.getClass();
                                } else {
                                    h8Var2.f24461x.setVisibility(8);
                                }
                                break;
                            default:
                                boolean z13 = z10;
                                h8 h8Var3 = this.f24168b;
                                if (!z13) {
                                    h8Var3.getClass();
                                } else {
                                    h8Var3.h.setVisibility(8);
                                }
                                break;
                        }
                    }
                }).start();
            }
        }
    }

    public final void d(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z10, boolean z11) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
        this.f24456f = z10;
        this.f24458r = tL_messages_stickerSet;
        this.f24459s = z11;
        org.telegram.ui.Components.n9 n9Var = this.d;
        n9Var.setVisibility(0);
        cg.q qVar = this.f24453b;
        qVar.setTranslationY(0.0f);
        qVar.setText(this.f24458r.set.title);
        boolean z12 = this.f24458r.set.archived;
        TextView textView = this.f24454c;
        if (z12) {
            qVar.setAlpha(0.5f);
            textView.setAlpha(0.5f);
            n9Var.setAlpha(0.5f);
        } else {
            qVar.setAlpha(1.0f);
            textView.setAlpha(1.0f);
            n9Var.setAlpha(1.0f);
        }
        boolean z13 = tL_messages_stickerSet.set.emojis;
        this.f24460w = z13;
        this.f24461x.setVisibility(z13 ? 0 : 8);
        this.h.setVisibility(this.f24460w ? 8 : 0);
        TLRPC.Document document = null;
        n9Var.setColorFilter(null);
        ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
        if (arrayList == null || arrayList.isEmpty()) {
            tL_messages_stickerSet2 = tL_messages_stickerSet;
            textView.setText(LocaleController.formatPluralString(tL_messages_stickerSet2.set.emojis ? "EmojiCount" : "Stickers", 0, new Object[0]));
            n9Var.setImageDrawable(null);
            if (tL_messages_stickerSet2.set.thumb_document_id != 0) {
                org.telegram.ui.Components.k5.h(UserConfig.selectedAccount).b(tL_messages_stickerSet2.set.thumb_document_id, new org.telegram.ui.Components.h5() {
                    @Override
                    public final void a(TLRPC.Document document2) {
                        AndroidUtilities.runOnUIThread(new ga(7, this.f24227a, document2));
                    }
                });
            }
        } else {
            textView.setText(LocaleController.formatPluralString(this.f24460w ? "EmojiCount" : "Stickers", arrayList.size(), new Object[0]));
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TLRPC.Document document2 = arrayList.get(i10);
                if (document2 != null && document2.f22386id == tL_messages_stickerSet.set.thumb_document_id) {
                    document = document2;
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
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_messages_stickerSet.set.thumbs, org.telegram.ui.ActionBar.g6.f22999a7, 1.0f);
            boolean z14 = closestPhotoSizeWithSize instanceof TLRPC.Document;
            ImageLocation forDocument = z14 ? ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document) : ImageLocation.getForSticker((TLRPC.PhotoSize) closestPhotoSizeWithSize, document, tL_messages_stickerSet.set.thumb_version);
            String strConcat = "50_50".concat(!LiteMode.isEnabled(this.f24460w ? 16388 : 1) ? "_firstframe" : "");
            if (z14 && (MessageObject.isAnimatedStickerDocument(document, true) || MessageObject.isVideoSticker(document))) {
                if (svgThumb != null) {
                    n9Var.n(ImageLocation.getForDocument(document), strConcat, svgThumb, tL_messages_stickerSet);
                    tL_messages_stickerSet2 = tL_messages_stickerSet;
                } else {
                    n9Var.j(ImageLocation.getForDocument(document), strConcat, forDocument, null, 0, tL_messages_stickerSet);
                    tL_messages_stickerSet2 = tL_messages_stickerSet;
                }
                if (MessageObject.isTextColorEmoji(document)) {
                    n9Var.setColorFilter(org.telegram.ui.ActionBar.g6.f23371v3);
                }
            } else {
                tL_messages_stickerSet2 = tL_messages_stickerSet;
                if (forDocument == null || forDocument.imageType != 1) {
                    n9Var.i(forDocument, strConcat, "webp", svgThumb, tL_messages_stickerSet2);
                } else {
                    n9Var.i(forDocument, strConcat, "tgs", svgThumb, tL_messages_stickerSet2);
                }
            }
        }
        if (this.f24459s) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_messages_stickerSet2.set.emojis ? "t.me/addemoji/" : "t.me/addstickers/");
            sb2.append(tL_messages_stickerSet2.set.short_name);
            textView.setText(sb2.toString());
        }
    }

    public final void e(int i10) {
        AnimatorSet animatorSet = this.D;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.D = null;
        }
        ag.s1 s1Var = this.B;
        if (i10 == 1) {
            s1Var.a(LocaleController.getString(R.string.Unlock), new b8(this, 0), false);
        } else if (i10 == 2) {
            s1Var.a(LocaleController.getString(R.string.Restore), new b8(this, 0), false);
        }
        s1Var.setEnabled(i10 == 1 || i10 == 2);
        boolean z10 = i10 == 3;
        TextView textView = this.f24462y;
        textView.setEnabled(z10);
        boolean z11 = i10 == 4;
        TextView textView2 = this.A;
        textView2.setEnabled(z11);
        s1Var.setAlpha((i10 == 1 || i10 == 2) ? 1.0f : 0.0f);
        s1Var.setScaleX((i10 == 1 || i10 == 2) ? 1.0f : 0.6f);
        s1Var.setScaleY((i10 == 1 || i10 == 2) ? 1.0f : 0.6f);
        s1Var.setVisibility((i10 == 1 || i10 == 2) ? 0 : 8);
        textView.setAlpha(i10 == 3 ? 1.0f : 0.0f);
        textView.setScaleX(i10 == 3 ? 1.0f : 0.6f);
        textView.setScaleY(i10 == 3 ? 1.0f : 0.6f);
        textView.setVisibility(i10 == 3 ? 0 : 8);
        textView2.setAlpha(i10 == 4 ? 1.0f : 0.0f);
        textView2.setScaleX(i10 == 4 ? 1.0f : 0.6f);
        textView2.setScaleY(i10 != 4 ? 0.6f : 1.0f);
        textView2.setVisibility(i10 != 4 ? 8 : 0);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), 1073741824);
        FrameLayout frameLayout = this.f24461x;
        frameLayout.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredWidth = frameLayout.getMeasuredWidth() + AndroidUtilities.dp(26.0f);
        boolean z12 = LocaleController.isRTL;
        TextView textView3 = this.f24454c;
        cg.q qVar = this.f24453b;
        if (z12) {
            ((ViewGroup.MarginLayoutParams) qVar.getLayoutParams()).leftMargin = measuredWidth;
            ((ViewGroup.MarginLayoutParams) textView3.getLayoutParams()).leftMargin = measuredWidth;
        } else {
            ((ViewGroup.MarginLayoutParams) qVar.getLayoutParams()).rightMargin = measuredWidth;
            ((ViewGroup.MarginLayoutParams) textView3.getLayoutParams()).rightMargin = measuredWidth;
        }
    }

    public TLRPC.TL_messages_stickerSet getStickersSet() {
        return this.f24458r;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f24456f) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(71.0f), getHeight() - 1, (getWidth() - getPaddingRight()) - (LocaleController.isRTL ? AndroidUtilities.dp(71.0f) : 0), getHeight() - 1, org.telegram.ui.ActionBar.g6.f23175k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        bp bpVar = this.f24455e;
        if (bpVar == null || !bpVar.f27188a.f26309q) {
            return;
        }
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f) + (this.f24456f ? 1 : 0), 1073741824));
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
        if (getBackground() != null && this.f24460w && (frameLayout = this.f24461x) != null) {
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
        ImageView imageView = this.C;
        if (imageView != null) {
            imageView.setVisibility(onClickListener == null ? 8 : 0);
            imageView.setOnClickListener(onClickListener);
        }
    }

    public void setNeedDivider(boolean z10) {
        this.f24456f = z10;
    }

    public void setOnOptionsClick(View.OnClickListener onClickListener) {
        ImageView imageView = this.h;
        if (imageView == null) {
            return;
        }
        imageView.setOnClickListener(onClickListener);
    }

    public void setOnReorderButtonTouchListener(View.OnTouchListener onTouchListener) {
        this.f24457n.setOnTouchListener(onTouchListener);
    }

    public void setReorderable(boolean z10) {
        c(z10);
    }
}
