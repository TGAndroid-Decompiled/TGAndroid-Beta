package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AiTonesController;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.LaunchActivity;
public final class r extends sa implements NotificationCenter.NotificationCenterDelegate {
    public final TL_aicompose.AiComposeTone U;
    public final AiTonesController V;
    public final ImageView W;
    public final FrameLayout X;
    public final TextView Y;
    public final TextView Z;
    public final FrameLayout f30573a0;
    public final qh.d f30574b0;
    public w51 f30575c0;
    public int f30576d0;
    public final TL_aicompose.aiComposeToneExample[] f30577e0;

    public r(Context context, TL_aicompose.AiComposeTone aiComposeTone, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, null, false, false, false, false, false, 2, g6Var);
        int i10;
        this.f30576d0 = 0;
        AiTonesController tonesController = MessagesController.getInstance(this.currentAccount).getTonesController();
        this.V = tonesController;
        tonesController.load();
        this.U = aiComposeTone;
        TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = new TL_aicompose.aiComposeToneExample[MessagesController.getInstance(this.currentAccount).config.aicomposeToneExamplesNum.get()];
        this.f30577e0 = aicomposetoneexampleArr;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            aicomposetoneexampleArr[0] = ((TL_aicompose.TL_aiComposeTone) aiComposeTone).example_english;
        }
        ImageView imageView = new ImageView(context);
        this.W = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        imageView.setColorFilter(getThemedColor(i11));
        imageView.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.l1(0.1f, getThemedColor(i11)), 1, -1));
        this.containerView.addView(imageView, k7.c6.d(54, 54.0f, 53, 0.0f, 0.0f, 8.0f, 0.0f));
        k7.e6.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new o(this, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        this.X = frameLayout;
        frameLayout.setClipToPadding(false);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(100.0f), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21661d6, g6Var)));
        frameLayout.addView(frameLayout2, k7.c6.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
        p9 p9Var = new p9(context);
        p9Var.setAnimatedEmojiDrawable(new l5(4, this.currentAccount, aiComposeTone.emoji_id));
        frameLayout2.addView(p9Var, k7.c6.e(64, 64, 17));
        TextView textView = new TextView(context);
        this.Y = textView;
        textView.setTextColor(getThemedColor(i11));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(aiComposeTone.title);
        TextView textView2 = new TextView(context);
        this.Z = textView2;
        textView2.setTextColor(getThemedColor(i11));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.AIEditorStyleText));
        this.f31015e.setTitle(aiComposeTone.title);
        int i12 = org.telegram.ui.ActionBar.k6.f21607a7;
        this.behindKeyboardColorKey = i12;
        setBackgroundColor(getThemedColor(i12));
        sl0 sl0Var = this.d;
        int i13 = this.backgroundPaddingLeft;
        sl0Var.setPadding(i13, 0, i13, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.o1();
        this.d.setOnItemClickListener(new k(this, 1));
        this.I = false;
        this.H = AndroidUtilities.dp(36.0f);
        this.v = 0.35f;
        this.L = true;
        q qVar = new q(this);
        qVar.f5910m = false;
        qVar.C = false;
        qVar.o(pr.h);
        qVar.n(350L);
        this.d.setItemAnimator(qVar);
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        frameLayout3.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.k6.l1(0.0f, getThemedColor(i12)), getThemedColor(i12), getThemedColor(i12)}));
        FrameLayout.LayoutParams e6 = k7.c6.e(-1, -2, 80);
        int i14 = e6.leftMargin;
        int i15 = this.backgroundPaddingLeft;
        e6.leftMargin = i14 + i15;
        e6.rightMargin += i15;
        this.containerView.addView(frameLayout3, e6);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f30573a0 = frameLayout4;
        FrameLayout.LayoutParams d = k7.c6.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i16 = d.leftMargin;
        int i17 = this.backgroundPaddingLeft;
        d.leftMargin = i16 + i17;
        d.rightMargin += i17;
        this.containerView.addView(frameLayout4, d);
        qh.d p10 = org.telegram.messenger.y3.p(24, context, g6Var, true);
        this.f30574b0 = p10;
        if (U()) {
            i10 = R.string.AIEditorStyleDone;
        } else {
            i10 = R.string.AIEditorAddStyle;
        }
        p10.setText(LocaleController.getString(i10));
        p10.setOnClickListener(new eg.o(this, aiComposeTone, g6Var, 14));
        frameLayout3.addView(p10, k7.c6.e(-1, 48, 119));
        this.f30575c0.N(false);
    }

    public static void P(r rVar, TL_aicompose.AiComposeTone aiComposeTone, org.telegram.ui.ActionBar.g6 g6Var) {
        qh.d dVar = rVar.f30574b0;
        if (dVar.T && !dVar.K) {
            if (rVar.U()) {
                rVar.dismiss();
                return;
            }
            dVar.setLoading(true);
            TL_aicompose.saveTone savetone = new TL_aicompose.saveTone();
            savetone.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
            ConnectionsManager.getInstance(rVar.currentAccount).sendRequestTyped(savetone, new Object(), new lh.a0(rVar, g6Var, aiComposeTone, 6));
        }
    }

    public static void Q(final r rVar) {
        TL_aicompose.AiComposeTone aiComposeTone = rVar.U;
        if (!(aiComposeTone instanceof TL_aicompose.TL_aiComposeTone)) {
            return;
        }
        int i10 = rVar.f30576d0 + 1;
        rVar.f30576d0 = i10;
        TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = rVar.f30577e0;
        if (i10 >= aicomposetoneexampleArr.length) {
            rVar.f30576d0 = 0;
        }
        final int i11 = rVar.f30576d0;
        if (aicomposetoneexampleArr[i11] == null) {
            TL_aicompose.getToneExample gettoneexample = new TL_aicompose.getToneExample();
            gettoneexample.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
            gettoneexample.num = i11;
            ConnectionsManager.getInstance(rVar.currentAccount).sendRequestTyped(gettoneexample, new Object(), new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    TL_aicompose.aiComposeToneExample aicomposetoneexample = (TL_aicompose.aiComposeToneExample) obj;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                    r rVar2 = r.this;
                    if (aicomposetoneexample != null) {
                        rVar2.f30577e0[i11] = aicomposetoneexample;
                        rVar2.f30575c0.N(true);
                        return;
                    }
                    rVar2.getClass();
                }
            });
        }
        rVar.f30575c0.N(true);
    }

    public static void R(r rVar, ArrayList arrayList, w51 w51Var) {
        CharSequence formatTextWithEntities;
        CharSequence formatTextWithEntities2;
        String str;
        String formatString;
        w51Var.B = 1;
        TLRPC.User user = null;
        arrayList.add(h51.B(null));
        FrameLayout frameLayout = rVar.X;
        h51 h51Var = new h51(-4);
        h51Var.f27368c = frameLayout;
        h51Var.f27388z = -1;
        h51Var.f27369e = true;
        arrayList.add(h51Var);
        arrayList.add(h51.B(null));
        arrayList.add(h51.l(rVar.Y));
        arrayList.add(h51.C(AndroidUtilities.dp(1.0f)));
        arrayList.add(h51.l(rVar.Z));
        arrayList.add(h51.C(AndroidUtilities.dp(24.0f)));
        TL_aicompose.AiComposeTone aiComposeTone = rVar.U;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
            TL_aicompose.aiComposeToneExample aicomposetoneexample = rVar.f30577e0[rVar.f30576d0];
            w51Var.U();
            arrayList.add(a41.a(3, LocaleController.getString(R.string.AIEditorBefore), null, null, null, false, null, new o(rVar, 1)));
            if (aicomposetoneexample == null) {
                formatTextWithEntities = V();
            } else {
                formatTextWithEntities = MessageObject.formatTextWithEntities(aicomposetoneexample.from);
            }
            arrayList.add(e41.a(4, formatTextWithEntities, false, null, null, null));
            arrayList.add(a41.b(5, LocaleController.getString(R.string.AIEditorAfter), null, null, null));
            if (aicomposetoneexample == null) {
                formatTextWithEntities2 = V();
            } else {
                formatTextWithEntities2 = MessageObject.formatTextWithEntities(aicomposetoneexample.to);
            }
            arrayList.add(e41.a(6, formatTextWithEntities2, false, null, null, null));
            w51Var.T();
            if (tL_aiComposeTone.author_id != 0) {
                user = MessagesController.getInstance(rVar.currentAccount).getUser(Long.valueOf(tL_aiComposeTone.author_id));
            }
            String publicUsername = UserObject.getPublicUsername(user);
            if (user == null) {
                int i10 = tL_aiComposeTone.installs_count;
                if (i10 > 0) {
                    arrayList.add(h51.B(LocaleController.formatPluralString("AIEditorUsedBy", i10, new Object[0])));
                }
            } else {
                StringBuilder sb = new StringBuilder();
                if (tL_aiComposeTone.installs_count > 0) {
                    str = LocaleController.formatPluralString("AIEditorUsedBy", tL_aiComposeTone.installs_count, new Object[0]) + " ";
                } else {
                    str = "";
                }
                sb.append(str);
                if (TextUtils.isEmpty(publicUsername)) {
                    formatString = LocaleController.formatString(R.string.AIEditorCreatedBy, UserObject.getUserName(user));
                } else {
                    formatString = LocaleController.formatString(R.string.AIEditorCreatedBy, org.telegram.ui.yh.k("@", publicUsername));
                }
                sb.append(formatString);
                arrayList.add(h51.B(AndroidUtilities.replaceSingleLink(sb.toString(), rVar.getThemedColor(org.telegram.ui.ActionBar.k6.f21722gc), new org.telegram.ui.mp(6, rVar, tL_aiComposeTone))));
            }
        }
        arrayList.add(h51.C(AndroidUtilities.dp(32.0f)));
    }

    public static void S(r rVar, org.telegram.ui.ActionBar.g6 g6Var, TL_aicompose.AiComposeTone aiComposeTone, TLRPC.TL_error tL_error) {
        FrameLayout frameLayout = rVar.f30573a0;
        rVar.f30574b0.setLoading(false);
        if (tL_error != null) {
            if ("TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text)) {
                f0.o0(rVar.currentAccount, new qc(frameLayout, g6Var));
                return;
            } else {
                org.telegram.ui.yh.u(frameLayout, g6Var, tL_error, false);
                return;
            }
        }
        MessagesController.getInstance(rVar.currentAccount).getTonesController().add(aiComposeTone);
        rVar.dismiss();
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U != null) {
            qc.a0(U).p(aiComposeTone.emoji_id, LocaleController.getString(R.string.AIEditorToneAddedTitle), LocaleController.formatString(R.string.AIEditorToneAddedText, aiComposeTone.title)).j();
        }
    }

    public static SpannableStringBuilder V() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i10 = 0; i10 < 5; i10++) {
            if (i10 > 0) {
                spannableStringBuilder.append((CharSequence) "\n");
            }
            int dp = AndroidUtilities.dp((int) (Math.random() * 50.0d));
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Loading));
            l90 l90Var = new l90(null, dp, 0, null);
            l90Var.f28701f = AndroidUtilities.dp(6.0f);
            l90Var.h = 0.5f;
            l90Var.f28702n = true;
            spannableStringBuilder.setSpan(l90Var, length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    @Override
    public final void B(float f10) {
        pa paVar = this.f31015e;
        org.telegram.ui.ActionBar.l5 titleTextView = paVar.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.setAlpha(f10);
        }
        float translationY = paVar.getTranslationY() + AndroidUtilities.statusBarHeight;
        int height = paVar.getHeight() - AndroidUtilities.statusBarHeight;
        ImageView imageView = this.W;
        imageView.setTranslationY(((1.0f - f10) * AndroidUtilities.dp(28.0f)) + ((height - imageView.getHeight()) / 2.0f) + translationY);
    }

    public final boolean U() {
        TL_aicompose.AiComposeTone aiComposeTone = this.U;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
            int i10 = 0;
            while (true) {
                AiTonesController aiTonesController = this.V;
                if (i10 >= aiTonesController.tones.size()) {
                    break;
                }
                TL_aicompose.AiComposeTone aiComposeTone2 = aiTonesController.tones.get(i10);
                if ((aiComposeTone2 instanceof TL_aicompose.TL_aiComposeTone) && ((TL_aicompose.TL_aiComposeTone) aiComposeTone2).f21056id == tL_aiComposeTone.f21056id) {
                    return true;
                }
                i10++;
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        if (i10 == NotificationCenter.loadedAiComposeTones) {
            if (U()) {
                i12 = R.string.AIEditorStyleDone;
            } else {
                i12 = R.string.AIEditorAddStyle;
            }
            this.f30574b0.setText(LocaleController.getString(i12));
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.loadedAiComposeTones);
    }

    @Override
    public final void show() {
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.loadedAiComposeTones);
    }

    @Override
    public final rl0 v(sl0 sl0Var) {
        w51 w51Var = new w51(sl0Var, getContext(), this.currentAccount, 0, true, new d(this, 1), this.resourcesProvider);
        this.f30575c0 = w51Var;
        w51Var.f32651r = false;
        return w51Var;
    }

    @Override
    public final CharSequence y() {
        TL_aicompose.AiComposeTone aiComposeTone = this.U;
        if (aiComposeTone == null) {
            return "";
        }
        return aiComposeTone.title;
    }
}
