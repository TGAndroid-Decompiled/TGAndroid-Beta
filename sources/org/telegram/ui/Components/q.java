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

public final class q extends qa implements NotificationCenter.NotificationCenterDelegate {
    public final TL_aicompose.AiComposeTone T;
    public final AiTonesController U;
    public final ImageView V;
    public final FrameLayout W;
    public final TextView X;
    public final TextView Y;
    public final FrameLayout Z;

    public final lh.d f31713a0;

    public b51 f31714b0;

    public int f31715c0;

    public final TL_aicompose.aiComposeToneExample[] f31716d0;

    public q(Context context, TL_aicompose.AiComposeTone aiComposeTone, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null, false, false, false, false, false, 2, c6Var);
        this.f31715c0 = 0;
        AiTonesController tonesController = MessagesController.getInstance(this.currentAccount).getTonesController();
        this.U = tonesController;
        tonesController.load();
        this.T = aiComposeTone;
        TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = new TL_aicompose.aiComposeToneExample[MessagesController.getInstance(this.currentAccount).config.aicomposeToneExamplesNum.get()];
        this.f31716d0 = aicomposetoneexampleArr;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            aicomposetoneexampleArr[0] = ((TL_aicompose.TL_aiComposeTone) aiComposeTone).example_english;
        }
        ImageView imageView = new ImageView(context);
        this.V = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        imageView.setColorFilter(getThemedColor(i10));
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.l1(0.1f, getThemedColor(i10)), 1, -1));
        this.containerView.addView(imageView, h7.z5.d(54, 54.0f, 53, 0.0f, 0.0f, 8.0f, 0.0f));
        h7.b6.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new n(this, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        this.W = frameLayout;
        frameLayout.setClipToPadding(false);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(100.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, c6Var)));
        frameLayout.addView(frameLayout2, h7.z5.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
        n9 n9Var = new n9(context);
        n9Var.setAnimatedEmojiDrawable(new k5(4, this.currentAccount, aiComposeTone.emoji_id));
        frameLayout2.addView(n9Var, h7.z5.e(64, 64, 17));
        TextView textView = new TextView(context);
        this.X = textView;
        textView.setTextColor(getThemedColor(i10));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(aiComposeTone.title);
        TextView textView2 = new TextView(context);
        this.Y = textView2;
        textView2.setTextColor(getThemedColor(i10));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.AIEditorStyleText));
        this.f31853e.setTitle(aiComposeTone.title);
        int i11 = org.telegram.ui.ActionBar.g6.f22999a7;
        this.behindKeyboardColorKey = i11;
        setBackgroundColor(getThemedColor(i11));
        zk0 zk0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        zk0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.p1();
        this.d.setOnItemClickListener(new j(this, 1));
        this.H = false;
        this.G = AndroidUtilities.dp(36.0f);
        this.v = 0.35f;
        this.K = true;
        p pVar = new p(this);
        pVar.f5819m = false;
        pVar.C = false;
        pVar.o(er.h);
        pVar.n(350L);
        this.d.setItemAnimator(pVar);
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        frameLayout3.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.g6.l1(0.0f, getThemedColor(i11)), getThemedColor(i11), getThemedColor(i11)}));
        FrameLayout.LayoutParams layoutParamsE = h7.z5.e(-1, -2, 80);
        int i13 = layoutParamsE.leftMargin;
        int i14 = this.backgroundPaddingLeft;
        layoutParamsE.leftMargin = i13 + i14;
        layoutParamsE.rightMargin += i14;
        this.containerView.addView(frameLayout3, layoutParamsE);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.Z = frameLayout4;
        FrameLayout.LayoutParams layoutParamsD = h7.z5.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i15 = layoutParamsD.leftMargin;
        int i16 = this.backgroundPaddingLeft;
        layoutParamsD.leftMargin = i15 + i16;
        layoutParamsD.rightMargin += i16;
        this.containerView.addView(frameLayout4, layoutParamsD);
        lh.d dVarG = org.telegram.messenger.rl.g(24, context, c6Var, true);
        this.f31713a0 = dVarG;
        dVarG.setText(LocaleController.getString(U() ? R.string.AIEditorStyleDone : R.string.AIEditorAddStyle));
        dVarG.setOnClickListener(new gg.f(this, aiComposeTone, c6Var, 16));
        frameLayout3.addView(dVarG, h7.z5.e(-1, 48, 119));
        this.f31714b0.N(false);
    }

    public static void P(q qVar, TL_aicompose.AiComposeTone aiComposeTone, org.telegram.ui.ActionBar.c6 c6Var) {
        lh.d dVar = qVar.f31713a0;
        if (!dVar.S || dVar.J) {
            return;
        }
        if (qVar.U()) {
            qVar.dismiss();
            return;
        }
        dVar.setLoading(true);
        TL_aicompose.saveTone savetone = new TL_aicompose.saveTone();
        savetone.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
        ConnectionsManager.getInstance(qVar.currentAccount).sendRequestTyped(savetone, new org.telegram.messenger.a(), new gh.d0(qVar, c6Var, aiComposeTone, 6));
    }

    public static void Q(final q qVar) {
        TL_aicompose.AiComposeTone aiComposeTone = qVar.T;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            int i10 = qVar.f31715c0 + 1;
            qVar.f31715c0 = i10;
            TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = qVar.f31716d0;
            if (i10 >= aicomposetoneexampleArr.length) {
                qVar.f31715c0 = 0;
            }
            final int i11 = qVar.f31715c0;
            if (aicomposetoneexampleArr[i11] == null) {
                TL_aicompose.getToneExample gettoneexample = new TL_aicompose.getToneExample();
                gettoneexample.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
                gettoneexample.num = i11;
                ConnectionsManager.getInstance(qVar.currentAccount).sendRequestTyped(gettoneexample, new org.telegram.messenger.a(), new Utilities.Callback2() {
                    @Override
                    public final void run(Object obj, Object obj2) {
                        TL_aicompose.aiComposeToneExample aicomposetoneexample = (TL_aicompose.aiComposeToneExample) obj;
                        q qVar2 = this.f31120a;
                        if (aicomposetoneexample == null) {
                            qVar2.getClass();
                        } else {
                            qVar2.f31716d0[i11] = aicomposetoneexample;
                            qVar2.f31714b0.N(true);
                        }
                    }
                });
            }
            qVar.f31714b0.N(true);
        }
    }

    public static void R(q qVar, ArrayList arrayList, b51 b51Var) {
        String str;
        b51Var.A = 1;
        arrayList.add(n41.B(null));
        FrameLayout frameLayout = qVar.W;
        n41 n41Var = new n41(-4);
        n41Var.f30837c = frameLayout;
        n41Var.f30857z = -1;
        n41Var.f30838e = true;
        arrayList.add(n41Var);
        arrayList.add(n41.B(null));
        arrayList.add(n41.l(qVar.X));
        arrayList.add(n41.C(AndroidUtilities.dp(1.0f)));
        arrayList.add(n41.l(qVar.Y));
        arrayList.add(n41.C(AndroidUtilities.dp(24.0f)));
        TL_aicompose.AiComposeTone aiComposeTone = qVar.T;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
            TL_aicompose.aiComposeToneExample aicomposetoneexample = qVar.f31716d0[qVar.f31715c0];
            b51Var.U();
            arrayList.add(g31.a(3, LocaleController.getString(R.string.AIEditorBefore), null, null, null, false, null, new n(qVar, 1)));
            arrayList.add(k31.a(4, aicomposetoneexample == null ? V() : MessageObject.formatTextWithEntities(aicomposetoneexample.from), false, null, null, null));
            arrayList.add(g31.b(5, LocaleController.getString(R.string.AIEditorAfter), null, null, null));
            arrayList.add(k31.a(6, aicomposetoneexample == null ? V() : MessageObject.formatTextWithEntities(aicomposetoneexample.to), false, null, null, null));
            b51Var.T();
            TLRPC.User user = tL_aiComposeTone.author_id != 0 ? MessagesController.getInstance(qVar.currentAccount).getUser(Long.valueOf(tL_aiComposeTone.author_id)) : null;
            String publicUsername = UserObject.getPublicUsername(user);
            if (user == null) {
                int i10 = tL_aiComposeTone.installs_count;
                if (i10 > 0) {
                    arrayList.add(n41.B(LocaleController.formatPluralString("AIEditorUsedBy", i10, new Object[0])));
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                if (tL_aiComposeTone.installs_count > 0) {
                    str = LocaleController.formatPluralString("AIEditorUsedBy", tL_aiComposeTone.installs_count, new Object[0]) + " ";
                } else {
                    str = "";
                }
                sb2.append(str);
                sb2.append(TextUtils.isEmpty(publicUsername) ? LocaleController.formatString(R.string.AIEditorCreatedBy, UserObject.getUserName(user)) : LocaleController.formatString(R.string.AIEditorCreatedBy, s3.c.e("@", publicUsername)));
                arrayList.add(n41.B(AndroidUtilities.replaceSingleLink(sb2.toString(), qVar.getThemedColor(org.telegram.ui.ActionBar.g6.gc), new org.telegram.ui.yq(2, qVar, tL_aiComposeTone))));
            }
        }
        arrayList.add(n41.C(AndroidUtilities.dp(32.0f)));
    }

    public static void S(q qVar, org.telegram.ui.ActionBar.c6 c6Var, TL_aicompose.AiComposeTone aiComposeTone, TLRPC.TL_error tL_error) {
        FrameLayout frameLayout = qVar.Z;
        qVar.f31713a0.setLoading(false);
        if (tL_error != null) {
            if ("TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text)) {
                e0.o0(qVar.currentAccount, new mc(frameLayout, c6Var));
                return;
            } else {
                org.telegram.ui.Cells.pa.t(frameLayout, c6Var, tL_error, false);
                return;
            }
        }
        MessagesController.getInstance(qVar.currentAccount).getTonesController().add(aiComposeTone);
        qVar.dismiss();
        org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
        if (n2VarU != null) {
            mc.a0(n2VarU).p(aiComposeTone.emoji_id, LocaleController.getString(R.string.AIEditorToneAddedTitle), LocaleController.formatString(R.string.AIEditorToneAddedText, aiComposeTone.title)).j();
        }
    }

    public static SpannableStringBuilder V() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i10 = 0; i10 < 5; i10++) {
            if (i10 > 0) {
                spannableStringBuilder.append((CharSequence) "\n");
            }
            int iDp = AndroidUtilities.dp((int) (Math.random() * 50.0d));
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Loading));
            u80 u80Var = new u80(null, iDp, 0, null);
            u80Var.f33017f = AndroidUtilities.dp(6.0f);
            u80Var.h = 0.5f;
            u80Var.f33018n = true;
            spannableStringBuilder.setSpan(u80Var, length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    @Override
    public final void C(float f10) {
        na naVar = this.f31853e;
        org.telegram.ui.ActionBar.h5 titleTextView = naVar.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.setAlpha(f10);
        }
        float translationY = naVar.getTranslationY() + AndroidUtilities.statusBarHeight;
        int height = naVar.getHeight() - AndroidUtilities.statusBarHeight;
        ImageView imageView = this.V;
        imageView.setTranslationY(((1.0f - f10) * AndroidUtilities.dp(28.0f)) + ((height - imageView.getHeight()) / 2.0f) + translationY);
    }

    public final boolean U() {
        TL_aicompose.AiComposeTone aiComposeTone = this.T;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
            int i10 = 0;
            while (true) {
                AiTonesController aiTonesController = this.U;
                if (i10 >= aiTonesController.tones.size()) {
                    break;
                }
                TL_aicompose.AiComposeTone aiComposeTone2 = aiTonesController.tones.get(i10);
                if ((aiComposeTone2 instanceof TL_aicompose.TL_aiComposeTone) && ((TL_aicompose.TL_aiComposeTone) aiComposeTone2).f22591id == tL_aiComposeTone.f22591id) {
                    return true;
                }
                i10++;
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.loadedAiComposeTones) {
            this.f31713a0.setText(LocaleController.getString(U() ? R.string.AIEditorStyleDone : R.string.AIEditorAddStyle));
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
    public final yk0 w(zk0 zk0Var) {
        b51 b51Var = new b51(zk0Var, getContext(), this.currentAccount, 0, true, new d(this, 1), this.resourcesProvider);
        this.f31714b0 = b51Var;
        b51Var.f26942r = false;
        return b51Var;
    }

    @Override
    public final CharSequence z() {
        TL_aicompose.AiComposeTone aiComposeTone = this.T;
        return aiComposeTone == null ? "" : aiComposeTone.title;
    }
}
