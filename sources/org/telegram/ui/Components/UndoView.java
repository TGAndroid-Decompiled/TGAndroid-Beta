package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.CharacterStyle;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.Premium.boosts.BoostRepository;
import org.telegram.ui.PaymentFormActivity;

public class UndoView extends FrameLayout {
    public static int ACTION_RINGTONE_ADDED = 83;
    private float additionalTranslationY;
    private BackupImageView avatarImageView;
    Drawable backgroundDrawable;
    private int currentAccount;
    private int currentAction;
    private Runnable currentActionRunnable;
    private Runnable currentCancelRunnable;
    private ArrayList currentDialogIds;
    private Object currentInfoObject;
    private Object currentInfoObject2;
    float enterOffset;
    private int enterOffsetMargin;
    private boolean fromTop;
    private int hideAnimationType;
    private CharSequence infoText;
    private LinkSpanDrawable.LinksTextView infoTextView;
    private int infoTextViewEmojiCacheType;
    private boolean isShown;
    private long lastUpdateTime;
    private RLottieImageView leftImageView;
    private BaseFragment parentFragment;
    private int prevSeconds;
    private Paint progressPaint;
    private RectF rect;
    private final Theme.ResourcesProvider resourcesProvider;
    private TextView subinfoTextView;
    private TextPaint textPaint;
    private int textWidth;
    int textWidthOut;
    StaticLayout timeLayout;
    StaticLayout timeLayoutOut;
    private long timeLeft;
    private String timeLeftString;
    float timeReplaceProgress;
    private LinearLayout undoButton;
    private ImageView undoImageView;
    private TextView undoTextView;
    private int undoViewHeight;

    public static boolean $r8$lambda$ObNJKqvGU8xXsV6D0ktsjRDi0mw(View view, MotionEvent motionEvent) {
        return true;
    }

    public static boolean $r8$lambda$l8XtLSzZxmJyp89hFOLv7CHxCiE(View view, MotionEvent motionEvent) {
        return true;
    }

    protected boolean canUndo() {
        return true;
    }

    public void didPressUrl(CharacterStyle characterStyle) {
    }

    protected void onRemoveDialogAction(long j, int i) {
    }

    public class LinkMovementMethodMy extends LinkMovementMethod {
        public LinkMovementMethodMy() {
        }

        @Override
        public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
            CharacterStyle[] characterStyleArr;
            try {
                if (motionEvent.getAction() != 0 || ((characterStyleArr = (CharacterStyle[]) spannable.getSpans(textView.getSelectionStart(), textView.getSelectionEnd(), CharacterStyle.class)) != null && characterStyleArr.length != 0)) {
                    if (motionEvent.getAction() == 1) {
                        CharacterStyle[] characterStyleArr2 = (CharacterStyle[]) spannable.getSpans(textView.getSelectionStart(), textView.getSelectionEnd(), CharacterStyle.class);
                        if (characterStyleArr2 != null && characterStyleArr2.length > 0) {
                            UndoView.this.didPressUrl(characterStyleArr2[0]);
                        }
                        Selection.removeSelection(spannable);
                        return true;
                    }
                    return super.onTouchEvent(textView, spannable, motionEvent);
                }
                return false;
            } catch (Exception e) {
                FileLog.e(e);
                return false;
            }
        }
    }

    public UndoView(Context context) {
        this(context, null, false, null);
    }

    public UndoView(Context context, BaseFragment baseFragment) {
        this(context, baseFragment, false, null);
    }

    public UndoView(Context context, BaseFragment baseFragment, boolean z, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.infoTextViewEmojiCacheType = 0;
        this.currentAccount = UserConfig.selectedAccount;
        this.currentAction = -1;
        this.hideAnimationType = 1;
        this.enterOffsetMargin = AndroidUtilities.dp(8.0f);
        this.timeReplaceProgress = 1.0f;
        this.resourcesProvider = resourcesProvider;
        this.parentFragment = baseFragment;
        this.fromTop = z;
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, resourcesProvider) {
            @Override
            protected int emojiCacheType() {
                return UndoView.this.infoTextViewEmojiCacheType;
            }
        };
        this.infoTextView = linksTextView;
        linksTextView.setTextSize(1, 15.0f);
        LinkSpanDrawable.LinksTextView linksTextView2 = this.infoTextView;
        int i = Theme.key_undo_infoColor;
        linksTextView2.setTextColor(getThemedColor(i));
        LinkSpanDrawable.LinksTextView linksTextView3 = this.infoTextView;
        int i2 = Theme.key_undo_cancelColor;
        linksTextView3.setLinkTextColor(getThemedColor(i2));
        this.infoTextView.setMovementMethod(new LinkMovementMethodMy());
        addView(this.infoTextView, LayoutHelper.createFrame(-2, -2.0f, 51, 45.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.subinfoTextView = textView;
        textView.setTextSize(1, 13.0f);
        this.subinfoTextView.setTextColor(getThemedColor(i));
        this.subinfoTextView.setLinkTextColor(getThemedColor(i2));
        this.subinfoTextView.setHighlightColor(0);
        this.subinfoTextView.setSingleLine(true);
        this.subinfoTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.subinfoTextView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        addView(this.subinfoTextView, LayoutHelper.createFrame(-2, -2.0f, 51, 58.0f, 27.0f, 8.0f, 0.0f));
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.leftImageView = rLottieImageView;
        rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
        RLottieImageView rLottieImageView2 = this.leftImageView;
        int i3 = Theme.key_undo_background;
        rLottieImageView2.setLayerColor("info1", getThemedColor(i3) | (-16777216));
        this.leftImageView.setLayerColor("info2", getThemedColor(i3) | (-16777216));
        this.leftImageView.setLayerColor("luc12", getThemedColor(i));
        this.leftImageView.setLayerColor("luc11", getThemedColor(i));
        this.leftImageView.setLayerColor("luc10", getThemedColor(i));
        this.leftImageView.setLayerColor("luc9", getThemedColor(i));
        this.leftImageView.setLayerColor("luc8", getThemedColor(i));
        this.leftImageView.setLayerColor("luc7", getThemedColor(i));
        this.leftImageView.setLayerColor("luc6", getThemedColor(i));
        this.leftImageView.setLayerColor("luc5", getThemedColor(i));
        this.leftImageView.setLayerColor("luc4", getThemedColor(i));
        this.leftImageView.setLayerColor("luc3", getThemedColor(i));
        this.leftImageView.setLayerColor("luc2", getThemedColor(i));
        this.leftImageView.setLayerColor("luc1", getThemedColor(i));
        this.leftImageView.setLayerColor("Oval", getThemedColor(i));
        addView(this.leftImageView, LayoutHelper.createFrame(54, -2.0f, 19, 3.0f, 0.0f, 0.0f, 0.0f));
        BackupImageView backupImageView = new BackupImageView(context);
        this.avatarImageView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(15.0f));
        addView(this.avatarImageView, LayoutHelper.createFrame(30, 30.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.undoButton = linearLayout;
        linearLayout.setOrientation(0);
        this.undoButton.setBackground(Theme.createRadSelectorDrawable(getThemedColor(i2) & 587202559, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
        addView(this.undoButton, LayoutHelper.createFrame(-2, -2.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        this.undoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                UndoView.$r8$lambda$JLv2btTJNgmct5KVAEmTVxqbKC0(this.f$0, view);
            }
        });
        ImageView imageView = new ImageView(context);
        this.undoImageView = imageView;
        imageView.setImageResource(R.drawable.chats_undo);
        this.undoImageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(i2), PorterDuff.Mode.MULTIPLY));
        this.undoButton.addView(this.undoImageView, LayoutHelper.createLinear(-2, -2, 19, 4, 4, 0, 4));
        TextView textView2 = new TextView(context);
        this.undoTextView = textView2;
        textView2.setTextSize(1, 14.0f);
        this.undoTextView.setTypeface(AndroidUtilities.bold());
        this.undoTextView.setTextColor(getThemedColor(i2));
        this.undoTextView.setText(LocaleController.getString(R.string.UndoNoCaps));
        this.undoButton.addView(this.undoTextView, LayoutHelper.createLinear(-2, -2, 19, 6, 4, 8, 4));
        this.rect = new RectF(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(33.0f), AndroidUtilities.dp(33.0f));
        Paint paint = new Paint(1);
        this.progressPaint = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.progressPaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.progressPaint.setStrokeCap(Paint.Cap.ROUND);
        this.progressPaint.setColor(getThemedColor(i));
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        this.textPaint.setTypeface(AndroidUtilities.bold());
        this.textPaint.setColor(getThemedColor(i));
        setWillNotDraw(false);
        this.backgroundDrawable = Theme.createRoundRectDrawable(AndroidUtilities.dp(10.0f), getThemedColor(i3));
        setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return UndoView.$r8$lambda$ObNJKqvGU8xXsV6D0ktsjRDi0mw(view, motionEvent);
            }
        });
        setVisibility(4);
    }

    public static void $r8$lambda$JLv2btTJNgmct5KVAEmTVxqbKC0(UndoView undoView, View view) {
        if (undoView.canUndo()) {
            undoView.hide(false, 1);
        }
    }

    public void setColors(int i, int i2) {
        Theme.setDrawableColor(this.backgroundDrawable, i);
        this.infoTextView.setTextColor(i2);
        this.subinfoTextView.setTextColor(i2);
        int i3 = i | (-16777216);
        this.leftImageView.setLayerColor("info1", i3);
        this.leftImageView.setLayerColor("info2", i3);
    }

    private boolean isTooltipAction() {
        int i = this.currentAction;
        return i == 6 || i == 3 || i == 5 || i == 7 || i == 8 || i == 87 || i == 9 || i == 10 || i == 13 || i == 14 || i == 19 || i == 20 || i == 21 || i == 22 || i == 23 || i == 30 || i == 31 || i == 32 || i == 102 || i == 33 || i == 34 || i == 35 || i == 36 || i == 74 || i == 37 || i == 38 || i == 39 || i == 40 || i == 42 || i == 43 || i == 77 || i == 44 || i == 78 || i == 79 || i == 100 || i == 101 || i == ACTION_RINGTONE_ADDED;
    }

    private boolean hasSubInfo() {
        int i;
        Object obj;
        int i2 = this.currentAction;
        if (i2 == 11 || i2 == 24 || i2 == 6 || i2 == 3 || i2 == 5 || i2 == 13 || i2 == 14 || i2 == 74) {
            return true;
        }
        if ((i2 == 7 && MessagesController.getInstance(this.currentAccount).dialogFilters.isEmpty()) || (i = this.currentAction) == ACTION_RINGTONE_ADDED || i == 85) {
            return true;
        }
        return i == 88 && (obj = this.currentInfoObject2) != null && ((Integer) obj).intValue() > 0;
    }

    public boolean isMultilineSubInfo() {
        int i = this.currentAction;
        return i == 12 || i == 15 || i == 24 || i == 74 || i == ACTION_RINGTONE_ADDED;
    }

    public void setAdditionalTranslationY(float f) {
        if (this.additionalTranslationY != f) {
            this.additionalTranslationY = f;
            updatePosition();
        }
    }

    public Object getCurrentInfoObject() {
        return this.currentInfoObject;
    }

    public void hide(boolean z, int i) {
        if (getVisibility() == 0 && this.isShown) {
            this.currentInfoObject = null;
            this.currentInfoObject2 = null;
            this.isShown = false;
            Runnable runnable = this.currentActionRunnable;
            if (runnable != null) {
                if (z) {
                    runnable.run();
                }
                this.currentActionRunnable = null;
            }
            Runnable runnable2 = this.currentCancelRunnable;
            if (runnable2 != null) {
                if (!z) {
                    runnable2.run();
                }
                this.currentCancelRunnable = null;
            }
            int i2 = this.currentAction;
            if (i2 == 0 || i2 == 1 || i2 == 95 || i2 == 26 || i2 == 27) {
                for (int i3 = 0; i3 < this.currentDialogIds.size(); i3++) {
                    long jLongValue = ((Long) this.currentDialogIds.get(i3)).longValue();
                    MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
                    int i4 = this.currentAction;
                    messagesController.removeDialogAction(jLongValue, i4 == 0 || i4 == 26, z);
                    onRemoveDialogAction(jLongValue, this.currentAction);
                }
            }
            if (i != 0) {
                AnimatorSet animatorSet = new AnimatorSet();
                if (i == 1) {
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this, "enterOffset", (this.fromTop ? -1.0f : 1.0f) * (this.enterOffsetMargin + this.undoViewHeight)));
                    animatorSet.setDuration(250L);
                } else {
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this, (Property<UndoView, Float>) View.SCALE_X, 0.8f), ObjectAnimator.ofFloat(this, (Property<UndoView, Float>) View.SCALE_Y, 0.8f), ObjectAnimator.ofFloat(this, (Property<UndoView, Float>) View.ALPHA, 0.0f));
                    animatorSet.setDuration(180L);
                }
                animatorSet.setInterpolator(new DecelerateInterpolator());
                animatorSet.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        UndoView.this.setVisibility(4);
                        UndoView.this.setScaleX(1.0f);
                        UndoView.this.setScaleY(1.0f);
                        UndoView.this.setAlpha(1.0f);
                    }
                });
                animatorSet.start();
                return;
            }
            setEnterOffset((this.fromTop ? -1.0f : 1.0f) * (this.enterOffsetMargin + this.undoViewHeight));
            setVisibility(4);
        }
    }

    public void showWithAction(long j, int i, Runnable runnable) {
        showWithAction(j, i, (Object) null, (Object) null, runnable, (Runnable) null);
    }

    public void showWithAction(long j, int i, Object obj) {
        showWithAction(j, i, obj, (Object) null, (Runnable) null, (Runnable) null);
    }

    public void showWithAction(long j, int i, Runnable runnable, Runnable runnable2) {
        showWithAction(j, i, (Object) null, (Object) null, runnable, runnable2);
    }

    public void showWithAction(long j, int i, Object obj, Runnable runnable, Runnable runnable2) {
        showWithAction(j, i, obj, (Object) null, runnable, runnable2);
    }

    public void showWithAction(long j, int i, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j));
        showWithAction(arrayList, i, obj, obj2, runnable, runnable2);
    }

    public void showWithAction(ArrayList arrayList, int i, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        long j;
        boolean z;
        int iDp;
        int measuredWidth;
        int i2;
        float f;
        int iDp2;
        int i3;
        float f2;
        boolean z2;
        float f3;
        float f4;
        int measuredWidth2;
        CharSequence charSequenceReplaceTags;
        int i4;
        String firstName;
        CharSequence charSequenceReplaceTags2;
        int i5;
        String string;
        String string2;
        CharSequence charSequenceReplaceSingleTag;
        int i6;
        String firstName2;
        String firstName3;
        String firstName4;
        String firstName5;
        String name;
        int i7;
        int i8;
        int i9;
        if (AndroidUtilities.shouldShowClipboardToast() || !((i9 = this.currentAction) == 52 || i9 == 56 || i9 == 57 || i9 == 58 || i9 == 59 || i9 == 60 || i9 == 80 || i9 == 33)) {
            Runnable runnable3 = this.currentActionRunnable;
            if (runnable3 != null) {
                runnable3.run();
            }
            this.isShown = true;
            this.currentActionRunnable = runnable;
            this.currentCancelRunnable = runnable2;
            this.currentDialogIds = arrayList;
            Long l = (Long) arrayList.get(0);
            long jLongValue = l.longValue();
            this.currentAction = i;
            this.timeLeft = 5000L;
            this.currentInfoObject = obj;
            this.currentInfoObject2 = obj2;
            this.lastUpdateTime = SystemClock.elapsedRealtime();
            this.undoTextView.setText(LocaleController.getString(R.string.UndoNoCaps));
            this.undoImageView.setVisibility(0);
            this.leftImageView.setPadding(0, 0, 0, 0);
            this.leftImageView.setScaleX(1.0f);
            this.leftImageView.setScaleY(1.0f);
            this.infoTextView.setTextSize(1, 15.0f);
            this.avatarImageView.setVisibility(8);
            this.infoTextView.setGravity(51);
            ((FrameLayout.LayoutParams) this.subinfoTextView.getLayoutParams()).leftMargin = AndroidUtilities.dp(58.0f);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.infoTextView.getLayoutParams();
            layoutParams.height = -2;
            layoutParams.topMargin = AndroidUtilities.dp(13.0f);
            layoutParams.bottomMargin = 0;
            this.leftImageView.setScaleType(ImageView.ScaleType.CENTER);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.leftImageView.getLayoutParams();
            layoutParams2.gravity = 19;
            layoutParams2.bottomMargin = 0;
            layoutParams2.topMargin = 0;
            layoutParams2.leftMargin = AndroidUtilities.dp(3.0f);
            layoutParams2.width = AndroidUtilities.dp(54.0f);
            layoutParams2.height = -2;
            this.infoTextView.setMinHeight(0);
            String monoForumTitle = null;
            if ((runnable == null && runnable2 == null) || i == ACTION_RINGTONE_ADDED) {
                setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        this.f$0.hide(false, 1);
                    }
                });
                setOnTouchListener(null);
            } else {
                setOnClickListener(null);
                setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        return UndoView.$r8$lambda$l8XtLSzZxmJyp89hFOLv7CHxCiE(view, motionEvent);
                    }
                });
            }
            this.infoTextView.setMovementMethod(null);
            if (isTooltipAction()) {
                if (i == ACTION_RINGTONE_ADDED) {
                    this.subinfoTextView.setSingleLine(false);
                    charSequenceReplaceTags = LocaleController.getString(R.string.SoundAdded);
                    charSequenceReplaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SoundAddedSubtitle), runnable);
                    this.currentActionRunnable = null;
                    i5 = R.raw.sound_download;
                    this.timeLeft = 4000L;
                } else {
                    if (i == 74) {
                        this.subinfoTextView.setSingleLine(false);
                        charSequenceReplaceTags = LocaleController.getString(R.string.ReportChatSent);
                        monoForumTitle = LocaleController.formatString("ReportSentInfo", R.string.ReportSentInfo, new Object[0]);
                        i4 = R.raw.ic_admin;
                        this.timeLeft = 4000L;
                    } else {
                        if (i == 34) {
                            TLRPC.User user = (TLRPC.User) obj;
                            SpannableStringBuilder spannableStringBuilderReplaceTags = ChatObject.isChannelOrGiga((TLRPC.Chat) obj2) ? AndroidUtilities.replaceTags(LocaleController.formatString("VoipChannelInvitedUser", R.string.VoipChannelInvitedUser, UserObject.getFirstName(user))) : AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupInvitedUser", R.string.VoipGroupInvitedUser, UserObject.getFirstName(user)));
                            AvatarDrawable avatarDrawable = new AvatarDrawable();
                            avatarDrawable.setTextSize(AndroidUtilities.dp(12.0f));
                            avatarDrawable.setInfo(this.currentAccount, user);
                            this.avatarImageView.setForUserOrChat(user, avatarDrawable);
                            this.avatarImageView.setVisibility(0);
                            this.timeLeft = 3000L;
                            charSequenceReplaceTags = spannableStringBuilderReplaceTags;
                        } else if (i == 44) {
                            TLRPC.Chat chat = (TLRPC.Chat) obj2;
                            if (obj instanceof TLRPC.User) {
                                TLRPC.User user2 = (TLRPC.User) obj;
                                charSequenceReplaceTags = ChatObject.isChannelOrGiga(chat) ? AndroidUtilities.replaceTags(LocaleController.formatString(R.string.VoipChannelUserJoined, UserObject.getFirstName(user2))) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.VoipChatUserJoined, UserObject.getFirstName(user2)));
                            } else if (obj instanceof TLRPC.Chat) {
                                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                                charSequenceReplaceTags = ChatObject.isChannelOrGiga(chat) ? AndroidUtilities.replaceTags(LocaleController.formatString(R.string.VoipChannelChatJoined, chat2.title)) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.VoipChatChatJoined, chat2.title));
                            } else {
                                charSequenceReplaceTags = "";
                            }
                            AvatarDrawable avatarDrawable2 = new AvatarDrawable();
                            avatarDrawable2.setTextSize(AndroidUtilities.dp(12.0f));
                            TLObject tLObject = (TLObject) obj;
                            avatarDrawable2.setInfo(this.currentAccount, tLObject);
                            this.avatarImageView.setForUserOrChat(tLObject, avatarDrawable2);
                            this.avatarImageView.setVisibility(0);
                            this.timeLeft = 3000L;
                        } else if (i == 37) {
                            AvatarDrawable avatarDrawable3 = new AvatarDrawable();
                            avatarDrawable3.setTextSize(AndroidUtilities.dp(12.0f));
                            if (obj instanceof TLRPC.User) {
                                TLRPC.User user3 = (TLRPC.User) obj;
                                avatarDrawable3.setInfo(this.currentAccount, user3);
                                this.avatarImageView.setForUserOrChat(user3, avatarDrawable3);
                                name = ContactsController.formatName(user3.first_name, user3.last_name);
                            } else {
                                TLRPC.Chat chat3 = (TLRPC.Chat) obj;
                                avatarDrawable3.setInfo(this.currentAccount, chat3);
                                this.avatarImageView.setForUserOrChat(chat3, avatarDrawable3);
                                name = chat3.title;
                            }
                            if (ChatObject.isChannelOrGiga((TLRPC.Chat) obj2)) {
                                i7 = 0;
                                charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipChannelUserChanged", R.string.VoipChannelUserChanged, name));
                            } else {
                                i7 = 0;
                                charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupUserChanged", R.string.VoipGroupUserChanged, name));
                            }
                            this.avatarImageView.setVisibility(i7);
                            this.timeLeft = 3000L;
                        } else if (i == 33) {
                            charSequenceReplaceTags = LocaleController.getString(R.string.VoipGroupCopyInviteLinkCopied);
                            i4 = R.raw.voip_invite;
                            this.timeLeft = 3000L;
                        } else if (i == 77) {
                            charSequenceReplaceTags = (CharSequence) obj;
                            i4 = R.raw.payment_success;
                            this.timeLeft = 5000L;
                            if (this.parentFragment != null && (obj2 instanceof TLRPC.Message)) {
                                final TLRPC.Message message = (TLRPC.Message) obj2;
                                setOnTouchListener(null);
                                this.infoTextView.setMovementMethod(null);
                                setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view) {
                                        UndoView.$r8$lambda$pRV1L_28TR1KN0lQU0QgCwyHuGQ(this.f$0, message, view);
                                    }
                                });
                            }
                        } else if (i == 30) {
                            if (obj instanceof TLRPC.User) {
                                firstName5 = UserObject.getFirstName((TLRPC.User) obj);
                            } else {
                                firstName5 = ((TLRPC.Chat) obj).title;
                            }
                            charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupUserCantNowSpeak", R.string.VoipGroupUserCantNowSpeak, firstName5));
                            i4 = R.raw.voip_muted;
                            this.timeLeft = 3000L;
                        } else if (i == 35) {
                            if (obj instanceof TLRPC.User) {
                                firstName4 = UserObject.getFirstName((TLRPC.User) obj);
                            } else {
                                firstName4 = obj instanceof TLRPC.Chat ? ((TLRPC.Chat) obj).title : "";
                            }
                            charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupUserCantNowSpeakForYou", R.string.VoipGroupUserCantNowSpeakForYou, firstName4));
                            i4 = R.raw.voip_muted;
                            this.timeLeft = 3000L;
                        } else if (i == 31) {
                            if (obj instanceof TLRPC.User) {
                                firstName3 = UserObject.getFirstName((TLRPC.User) obj);
                            } else {
                                firstName3 = ((TLRPC.Chat) obj).title;
                            }
                            charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupUserCanNowSpeak", R.string.VoipGroupUserCanNowSpeak, firstName3));
                            i4 = R.raw.voip_unmuted;
                            this.timeLeft = 3000L;
                        } else if (i == 38) {
                            charSequenceReplaceTags = obj instanceof TLRPC.Chat ? AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupYouCanNowSpeakIn", R.string.VoipGroupYouCanNowSpeakIn, ((TLRPC.Chat) obj).title)) : AndroidUtilities.replaceTags(LocaleController.getString(R.string.VoipGroupYouCanNowSpeak));
                            i4 = R.raw.voip_allow_talk;
                            this.timeLeft = 3000L;
                        } else if (i == 42) {
                            if (ChatObject.isChannelOrGiga((TLRPC.Chat) obj)) {
                                charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.VoipChannelSoundMuted));
                            } else {
                                charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.VoipGroupSoundMuted));
                            }
                            i4 = R.raw.ic_mute;
                            this.timeLeft = 3000L;
                        } else if (i == 43) {
                            if (ChatObject.isChannelOrGiga((TLRPC.Chat) obj)) {
                                charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.VoipChannelSoundUnmuted));
                            } else {
                                charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.VoipGroupSoundUnmuted));
                            }
                            i4 = R.raw.ic_unmute;
                            this.timeLeft = 3000L;
                        } else {
                            int i10 = this.currentAction;
                            if (i10 == 39 || i10 == 100) {
                                charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString(i10 == 39 ? R.string.VoipGroupAudioRecordStarted : R.string.VoipGroupVideoRecordStarted));
                                i4 = R.raw.voip_record_start;
                                this.timeLeft = 3000L;
                            } else if (i10 == 40 || i10 == 101) {
                                String string3 = LocaleController.getString(i10 == 40 ? R.string.VoipGroupAudioRecordSaved : R.string.VoipGroupVideoRecordSaved);
                                i4 = R.raw.voip_record_saved;
                                this.timeLeft = 4000L;
                                this.infoTextView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string3);
                                int iIndexOf = string3.indexOf("**");
                                int iLastIndexOf = string3.lastIndexOf("**");
                                if (iIndexOf >= 0 && iLastIndexOf >= 0 && iIndexOf != iLastIndexOf) {
                                    spannableStringBuilder.replace(iLastIndexOf, iLastIndexOf + 2, (CharSequence) "");
                                    spannableStringBuilder.replace(iIndexOf, iIndexOf + 2, (CharSequence) "");
                                    try {
                                        spannableStringBuilder.setSpan(new URLSpanNoUnderline("tg://openmessage?user_id=" + UserConfig.getInstance(this.currentAccount).getClientUserId()), iIndexOf, iLastIndexOf - 2, 33);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                }
                                charSequenceReplaceTags = spannableStringBuilder;
                            } else if (i == 36) {
                                if (obj instanceof TLRPC.User) {
                                    firstName2 = UserObject.getFirstName((TLRPC.User) obj);
                                } else {
                                    firstName2 = ((TLRPC.Chat) obj).title;
                                }
                                charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupUserCanNowSpeakForYou", R.string.VoipGroupUserCanNowSpeakForYou, firstName2));
                                i4 = R.raw.voip_unmuted;
                                this.timeLeft = 3000L;
                            } else if (i == 32 || i == 102) {
                                if (obj instanceof TLRPC.User) {
                                    firstName = UserObject.getFirstName((TLRPC.User) obj);
                                } else {
                                    firstName = ((TLRPC.Chat) obj).title;
                                }
                                charSequenceReplaceTags = i == 102 ? AndroidUtilities.replaceTags(LocaleController.formatString(R.string.VoipConferenceKicked, firstName)) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.VoipGroupRemovedFromGroup, firstName));
                                i4 = R.raw.ic_ban;
                                this.timeLeft = 3000L;
                            } else if (i == 9 || i == 10) {
                                TLRPC.User user4 = (TLRPC.User) obj;
                                charSequenceReplaceTags = i == 9 ? AndroidUtilities.replaceTags(LocaleController.formatString("EditAdminTransferChannelToast", R.string.EditAdminTransferChannelToast, UserObject.getFirstName(user4))) : AndroidUtilities.replaceTags(LocaleController.formatString("EditAdminTransferGroupToast", R.string.EditAdminTransferGroupToast, UserObject.getFirstName(user4)));
                                i4 = R.raw.contact_check;
                            } else {
                                if (i == 8) {
                                    charSequenceReplaceTags = LocaleController.formatString("NowInContacts", R.string.NowInContacts, UserObject.getFirstName((TLRPC.User) obj));
                                    charSequenceReplaceSingleTag = null;
                                    i5 = R.raw.contact_check;
                                } else if (i == 87) {
                                    charSequenceReplaceTags = LocaleController.formatString(R.string.ProxyAddedSuccess, new Object[0]);
                                    i4 = R.raw.contact_check;
                                } else if (i == 22) {
                                    if (!DialogObject.isUserDialog(jLongValue)) {
                                        TLRPC.Chat chat4 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-jLongValue));
                                        if (!ChatObject.isChannel(chat4) || chat4.megagroup) {
                                            if (obj == null) {
                                                charSequenceReplaceTags = LocaleController.getString(R.string.MainGroupProfilePhotoSetHint);
                                            } else {
                                                charSequenceReplaceTags = LocaleController.getString(R.string.MainGroupProfileVideoSetHint);
                                            }
                                        } else if (obj == null) {
                                            charSequenceReplaceTags = LocaleController.getString(R.string.MainChannelProfilePhotoSetHint);
                                        } else {
                                            charSequenceReplaceTags = LocaleController.getString(R.string.MainChannelProfileVideoSetHint);
                                        }
                                    } else if (obj == null) {
                                        charSequenceReplaceTags = LocaleController.getString(R.string.MainProfilePhotoSetHint);
                                    } else {
                                        charSequenceReplaceTags = LocaleController.getString(R.string.MainProfileVideoSetHint);
                                    }
                                    i4 = R.raw.contact_check;
                                } else if (i == 23) {
                                    charSequenceReplaceTags = LocaleController.getString(R.string.ChatWasMovedToMainList);
                                    i4 = R.raw.contact_check;
                                } else if (i == 6) {
                                    charSequenceReplaceTags = LocaleController.getString(R.string.ArchiveHidden);
                                    String string4 = LocaleController.getString(R.string.ArchiveHiddenInfo);
                                    i5 = R.raw.chats_swipearchive;
                                    charSequenceReplaceSingleTag = string4;
                                    i6 = 48;
                                } else {
                                    if (i10 == 13) {
                                        string = LocaleController.getString(R.string.QuizWellDone);
                                        string2 = LocaleController.getString(R.string.QuizWellDoneInfo);
                                        i5 = R.raw.wallet_congrats;
                                    } else if (i10 == 14) {
                                        string = LocaleController.getString(R.string.QuizWrongAnswer);
                                        string2 = LocaleController.getString(R.string.QuizWrongAnswerInfo);
                                        i5 = R.raw.wallet_science;
                                    } else if (i == 7) {
                                        charSequenceReplaceTags = LocaleController.getString(R.string.ArchivePinned);
                                        monoForumTitle = MessagesController.getInstance(this.currentAccount).dialogFilters.isEmpty() ? LocaleController.getString(R.string.ArchivePinnedInfo) : null;
                                        i4 = R.raw.chats_infotip;
                                    } else {
                                        if (i == 20 || i == 21) {
                                            MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj2;
                                            Spannable spannableReplaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, this.infoTextView.getPaint().getFontMetricsInt(), false), dialogFilter.entities, this.infoTextView.getPaint().getFontMetricsInt());
                                            this.infoTextViewEmojiCacheType = dialogFilter.title_noanimate ? 26 : 0;
                                            if (jLongValue != 0) {
                                                if (DialogObject.isEncryptedDialog(jLongValue)) {
                                                    jLongValue = MessagesController.getInstance(this.currentAccount).getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(jLongValue))).user_id;
                                                }
                                                if (DialogObject.isUserDialog(jLongValue)) {
                                                    TLRPC.User user5 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(jLongValue));
                                                    String firstName6 = UserObject.getFirstName(user5);
                                                    if (UserObject.isUserSelf(user5)) {
                                                        firstName6 = LocaleController.getString(R.string.SavedMessages);
                                                    } else if (UserObject.isReplyUser(user5)) {
                                                        firstName6 = LocaleController.getString(R.string.RepliesTitle);
                                                    }
                                                    charSequenceReplaceTags2 = i == 20 ? AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterUserAddedToExisting, firstName6, spannableReplaceAnimatedEmoji)) : AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterUserRemovedFrom, firstName6, spannableReplaceAnimatedEmoji));
                                                } else {
                                                    TLRPC.Chat chat5 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-jLongValue));
                                                    charSequenceReplaceTags2 = i == 20 ? AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterChatAddedToExisting, chat5.title, spannableReplaceAnimatedEmoji)) : AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterChatRemovedFrom, chat5.title, spannableReplaceAnimatedEmoji));
                                                }
                                            } else {
                                                charSequenceReplaceTags2 = i == 20 ? AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterChatsAddedToExisting, LocaleController.formatPluralString("ChatsSelected", ((Integer) obj).intValue(), new Object[0]), spannableReplaceAnimatedEmoji)) : AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterChatsRemovedFrom, LocaleController.formatPluralString("ChatsSelected", ((Integer) obj).intValue(), new Object[0]), spannableReplaceAnimatedEmoji));
                                            }
                                            CharSequence charSequence = charSequenceReplaceTags2;
                                            i5 = i == 20 ? R.raw.folder_in : R.raw.folder_out;
                                            charSequenceReplaceTags = charSequence;
                                        } else if (i == 19) {
                                            charSequenceReplaceTags = this.infoText;
                                            i4 = R.raw.ic_delete;
                                        } else if (i == 82) {
                                            charSequenceReplaceTags = LocaleController.getString(((MediaController.PhotoEntry) obj).isVideo ? R.string.AttachMediaVideoDeselected : R.string.AttachMediaPhotoDeselected);
                                        } else if (i == 78 || i == 79) {
                                            int iIntValue = ((Integer) obj).intValue();
                                            if (i == 78) {
                                                charSequenceReplaceTags = LocaleController.formatPluralString("PinnedDialogsCount", iIntValue, new Object[0]);
                                            } else {
                                                charSequenceReplaceTags = LocaleController.formatPluralString("UnpinnedDialogsCount", iIntValue, new Object[0]);
                                            }
                                            i4 = this.currentAction == 78 ? R.raw.ic_pin : R.raw.ic_unpin;
                                            if (obj2 instanceof Integer) {
                                                this.timeLeft = ((Integer) obj2).intValue();
                                            }
                                        } else {
                                            if (i == 3) {
                                                charSequenceReplaceTags = LocaleController.getString(R.string.ChatArchived);
                                            } else {
                                                charSequenceReplaceTags = LocaleController.getString(R.string.ChatsArchived);
                                            }
                                            monoForumTitle = MessagesController.getInstance(this.currentAccount).dialogFilters.isEmpty() ? LocaleController.getString(R.string.ChatArchivedInfo) : null;
                                            i4 = R.raw.chats_infotip;
                                        }
                                        charSequenceReplaceSingleTag = monoForumTitle;
                                    }
                                    charSequenceReplaceTags = string;
                                    charSequenceReplaceSingleTag = string2;
                                    i6 = 44;
                                }
                                this.infoTextView.setText(charSequenceReplaceTags);
                                if (i5 != 0) {
                                    this.leftImageView.setAnimation(i5, i6, i6);
                                    RLottieDrawable animatedDrawable = this.leftImageView.getAnimatedDrawable();
                                    animatedDrawable.setPlayInDirectionOfCustomEndFrame(false);
                                    animatedDrawable.setCustomEndFrame(animatedDrawable.getFramesCount());
                                    this.leftImageView.setVisibility(0);
                                    this.leftImageView.setProgress(0.0f);
                                    this.leftImageView.playAnimation();
                                } else {
                                    this.leftImageView.setVisibility(8);
                                }
                                if (charSequenceReplaceSingleTag != null) {
                                    layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                                    layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                                    layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                                    ((FrameLayout.LayoutParams) this.subinfoTextView.getLayoutParams()).rightMargin = AndroidUtilities.dp(8.0f);
                                    this.subinfoTextView.setText(charSequenceReplaceSingleTag);
                                    this.subinfoTextView.setVisibility(0);
                                    this.infoTextView.setTextSize(1, 14.0f);
                                    this.infoTextView.setTypeface(AndroidUtilities.bold());
                                    i8 = 8;
                                } else {
                                    layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                                    layoutParams.topMargin = AndroidUtilities.dp(13.0f);
                                    layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                                    i8 = 8;
                                    this.subinfoTextView.setVisibility(8);
                                    this.infoTextView.setTextSize(1, 15.0f);
                                    this.infoTextView.setTypeface(Typeface.DEFAULT);
                                }
                                this.undoButton.setVisibility(i8);
                            }
                        }
                        charSequenceReplaceSingleTag = null;
                        i5 = 0;
                    }
                    i5 = i4;
                    charSequenceReplaceSingleTag = monoForumTitle;
                }
                i6 = 36;
                this.infoTextView.setText(charSequenceReplaceTags);
                if (i5 != 0) {
                    this.leftImageView.setAnimation(i5, i6, i6);
                    RLottieDrawable animatedDrawable2 = this.leftImageView.getAnimatedDrawable();
                    animatedDrawable2.setPlayInDirectionOfCustomEndFrame(false);
                    animatedDrawable2.setCustomEndFrame(animatedDrawable2.getFramesCount());
                    this.leftImageView.setVisibility(0);
                    this.leftImageView.setProgress(0.0f);
                    this.leftImageView.playAnimation();
                } else {
                    this.leftImageView.setVisibility(8);
                }
                if (charSequenceReplaceSingleTag != null) {
                    layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                    layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                    layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                    ((FrameLayout.LayoutParams) this.subinfoTextView.getLayoutParams()).rightMargin = AndroidUtilities.dp(8.0f);
                    this.subinfoTextView.setText(charSequenceReplaceSingleTag);
                    this.subinfoTextView.setVisibility(0);
                    this.infoTextView.setTextSize(1, 14.0f);
                    this.infoTextView.setTypeface(AndroidUtilities.bold());
                    i8 = 8;
                } else {
                    layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                    layoutParams.topMargin = AndroidUtilities.dp(13.0f);
                    layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                    i8 = 8;
                    this.subinfoTextView.setVisibility(8);
                    this.infoTextView.setTextSize(1, 15.0f);
                    this.infoTextView.setTypeface(Typeface.DEFAULT);
                }
                this.undoButton.setVisibility(i8);
            } else {
                int i11 = this.currentAction;
                if (i11 == 45 || i11 == 46 || i11 == 47 || i11 == 52 || i11 == 53 || i11 == 54 || i11 == 55 || i11 == 56 || i11 == 57 || i11 == 58 || i11 == 59 || i11 == 60 || i11 == 71 || i11 == 70 || i11 == 75 || i11 == 76 || i11 == 41 || i11 == 78 || i11 == 79 || i11 == 61 || i11 == 80) {
                    this.undoImageView.setVisibility(8);
                    this.leftImageView.setVisibility(0);
                    this.infoTextView.setTypeface(Typeface.DEFAULT);
                    int i12 = this.currentAction;
                    long j2 = -1;
                    if (i12 == 76) {
                        this.infoTextView.setText(LocaleController.getString(R.string.BroadcastGroupConvertSuccess));
                        this.leftImageView.setAnimation(R.raw.gigagroup_convert, 36, 36);
                        layoutParams.topMargin = AndroidUtilities.dp(9.0f);
                        this.infoTextView.setTextSize(1, 14.0f);
                    } else if (i12 == 75) {
                        this.infoTextView.setText(LocaleController.getString(R.string.GigagroupConvertCancelHint));
                        this.leftImageView.setAnimation(R.raw.chats_infotip, 36, 36);
                        layoutParams.topMargin = AndroidUtilities.dp(9.0f);
                        this.infoTextView.setTextSize(1, 14.0f);
                    } else {
                        if (i == 70) {
                            int iIntValue2 = ((Integer) obj2).intValue();
                            this.subinfoTextView.setSingleLine(false);
                            this.infoTextView.setText(LocaleController.formatString("AutoDeleteHintOnText", R.string.AutoDeleteHintOnText, LocaleController.formatTTLString(iIntValue2)));
                            this.leftImageView.setAnimation(R.raw.fire_on, 36, 36);
                            layoutParams.topMargin = AndroidUtilities.dp(9.0f);
                            this.timeLeft = 4000L;
                            this.leftImageView.setPadding(0, 0, 0, AndroidUtilities.dp(3.0f));
                            j = -1;
                            z = true;
                        } else {
                            if (i12 == 71) {
                                this.infoTextView.setText(LocaleController.getString(R.string.AutoDeleteHintOffText));
                                this.leftImageView.setAnimation(R.raw.fire_off, 36, 36);
                                this.infoTextView.setTextSize(1, 14.0f);
                                this.timeLeft = 3000L;
                                this.leftImageView.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
                            } else if (i12 == 45) {
                                this.infoTextView.setText(LocaleController.getString(R.string.ImportMutualError));
                                this.leftImageView.setAnimation(R.raw.error, 36, 36);
                                layoutParams.topMargin = AndroidUtilities.dp(9.0f);
                                this.infoTextView.setTextSize(1, 14.0f);
                            } else if (i12 == 46) {
                                this.infoTextView.setText(LocaleController.getString(R.string.ImportNotAdmin));
                                this.leftImageView.setAnimation(R.raw.error, 36, 36);
                                layoutParams.topMargin = AndroidUtilities.dp(9.0f);
                                this.infoTextView.setTextSize(1, 14.0f);
                            } else if (i12 == 47) {
                                this.infoTextView.setText(LocaleController.getString(R.string.ImportedInfo));
                                this.leftImageView.setAnimation(R.raw.imported, 36, 36);
                                this.leftImageView.setPadding(0, 0, 0, AndroidUtilities.dp(5.0f));
                                layoutParams.topMargin = AndroidUtilities.dp(9.0f);
                                this.infoTextView.setTextSize(1, 14.0f);
                            } else if (i12 == 52 || i12 == 56 || i12 == 57 || i12 == 58 || i12 == 59 || i12 == 60 || i12 == 80) {
                                if (!AndroidUtilities.shouldShowClipboardToast()) {
                                    return;
                                }
                                int i13 = R.raw.copy;
                                int i14 = this.currentAction;
                                if (i14 == 80) {
                                    this.infoTextView.setText(LocaleController.getString(R.string.EmailCopied));
                                } else if (i14 == 60) {
                                    this.infoTextView.setText(LocaleController.getString(R.string.PhoneCopied));
                                } else if (i14 == 56) {
                                    this.infoTextView.setText(LocaleController.getString(R.string.UsernameCopied));
                                } else if (i14 == 57) {
                                    this.infoTextView.setText(LocaleController.getString(R.string.HashtagCopied));
                                } else if (i14 == 52) {
                                    this.infoTextView.setText(LocaleController.getString(R.string.MessageCopied));
                                } else if (i14 == 59) {
                                    i13 = R.raw.voip_invite;
                                    this.infoTextView.setText(LocaleController.getString(R.string.LinkCopied));
                                } else {
                                    this.infoTextView.setText(LocaleController.getString(R.string.TextCopied));
                                }
                                this.leftImageView.setAnimation(i13, 30, 30);
                                this.timeLeft = 3000L;
                                this.infoTextView.setTextSize(1, 15.0f);
                            } else if (i12 == 54) {
                                this.infoTextView.setText(LocaleController.getString(R.string.ChannelNotifyMembersInfoOn));
                                this.leftImageView.setAnimation(R.raw.silent_unmute, 30, 30);
                                this.timeLeft = 3000L;
                                this.infoTextView.setTextSize(1, 15.0f);
                            } else if (i12 == 55) {
                                this.infoTextView.setText(LocaleController.getString(R.string.ChannelNotifyMembersInfoOff));
                                this.leftImageView.setAnimation(R.raw.silent_mute, 30, 30);
                                this.timeLeft = 3000L;
                                this.infoTextView.setTextSize(1, 15.0f);
                            } else if (i12 == 41) {
                                if (obj2 != null) {
                                    this.infoTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToChats", R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", ((Integer) obj2).intValue(), new Object[0]))));
                                } else if (jLongValue == UserConfig.getInstance(this.currentAccount).clientUserId) {
                                    this.infoTextView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.InvLinkToSavedMessages)));
                                } else if (DialogObject.isChatDialog(jLongValue)) {
                                    this.infoTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToGroup", R.string.InvLinkToGroup, MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-jLongValue)).title)));
                                } else {
                                    this.infoTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToUser", R.string.InvLinkToUser, UserObject.getFirstName(MessagesController.getInstance(this.currentAccount).getUser(l)))));
                                }
                                this.leftImageView.setAnimation(R.raw.contact_check, 36, 36);
                                this.timeLeft = 3000L;
                            } else if (i12 == 53) {
                                Integer num = (Integer) obj;
                                if (obj2 != null && !(obj2 instanceof TLRPC.TL_forumTopic)) {
                                    int iIntValue3 = ((Integer) obj2).intValue();
                                    if (num.intValue() == 1) {
                                        this.infoTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessageToManyChats", iIntValue3, new Object[0])));
                                    } else {
                                        this.infoTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessagesToManyChats", iIntValue3, new Object[0])));
                                    }
                                    this.leftImageView.setAnimation(R.raw.forward, 30, 30);
                                } else {
                                    if (jLongValue == UserConfig.getInstance(this.currentAccount).clientUserId) {
                                        if (num.intValue() == 1) {
                                            this.infoTextView.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessageToSavedMessages), new BulletinFactory$$ExternalSyntheticLambda0()));
                                        } else {
                                            this.infoTextView.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), new BulletinFactory$$ExternalSyntheticLambda0()));
                                        }
                                        this.leftImageView.setAnimation(R.raw.saved_messages, 30, 30);
                                    } else {
                                        if (DialogObject.isChatDialog(jLongValue)) {
                                            TLRPC.Chat chat6 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-jLongValue));
                                            TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj2;
                                            monoForumTitle = ChatObject.isMonoForum(chat6) ? ForumUtilities.getMonoForumTitle(this.currentAccount, chat6) : null;
                                            if (num.intValue() == 1) {
                                                LinkSpanDrawable.LinksTextView linksTextView = this.infoTextView;
                                                int i15 = R.string.FwdMessageToGroup;
                                                if (monoForumTitle == null) {
                                                    monoForumTitle = tL_forumTopic != null ? tL_forumTopic.title : chat6.title;
                                                }
                                                linksTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("FwdMessageToGroup", i15, monoForumTitle)));
                                            } else {
                                                LinkSpanDrawable.LinksTextView linksTextView2 = this.infoTextView;
                                                int i16 = R.string.FwdMessagesToGroup;
                                                if (monoForumTitle == null) {
                                                    monoForumTitle = tL_forumTopic != null ? tL_forumTopic.title : chat6.title;
                                                }
                                                linksTextView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("FwdMessagesToGroup", i16, monoForumTitle)));
                                            }
                                        } else {
                                            TLRPC.User user6 = MessagesController.getInstance(this.currentAccount).getUser(l);
                                            if (num.intValue() == 1) {
                                                this.infoTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("FwdMessageToUser", R.string.FwdMessageToUser, UserObject.getFirstName(user6))));
                                            } else {
                                                this.infoTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("FwdMessagesToUser", R.string.FwdMessagesToUser, UserObject.getFirstName(user6))));
                                            }
                                        }
                                        this.leftImageView.setAnimation(R.raw.forward, 30, 30);
                                    }
                                    this.timeLeft = 3000L;
                                }
                                j2 = 300;
                                this.timeLeft = 3000L;
                            } else if (i12 == 61) {
                                if (obj2 != null) {
                                    this.infoTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BackgroundToChats", R.string.BackgroundToChats, LocaleController.formatPluralString("Chats", ((Integer) obj2).intValue(), new Object[0]))));
                                    this.leftImageView.setAnimation(R.raw.forward, 30, 30);
                                } else if (jLongValue == UserConfig.getInstance(this.currentAccount).clientUserId) {
                                    this.infoTextView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.BackgroundToSavedMessages)));
                                    this.leftImageView.setAnimation(R.raw.saved_messages, 30, 30);
                                } else {
                                    if (DialogObject.isChatDialog(jLongValue)) {
                                        this.infoTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BackgroundToGroup", R.string.BackgroundToGroup, MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-jLongValue)).title)));
                                    } else {
                                        this.infoTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BackgroundToUser", R.string.BackgroundToUser, UserObject.getFirstName(MessagesController.getInstance(this.currentAccount).getUser(l)))));
                                    }
                                    this.leftImageView.setAnimation(R.raw.forward, 30, 30);
                                }
                                this.timeLeft = 3000L;
                            }
                            j = j2;
                            z = false;
                        }
                        this.subinfoTextView.setVisibility(8);
                        this.undoTextView.setTextColor(getThemedColor(Theme.key_undo_cancelColor));
                        this.undoButton.setVisibility(8);
                        layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                        layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                        this.leftImageView.setProgress(0.0f);
                        this.leftImageView.playAnimation();
                        if (j > 0) {
                            this.leftImageView.postDelayed(new Runnable() {
                                @Override
                                public final void run() {
                                    UndoView.$r8$lambda$SGadTwNKFYYR41YEuJowZRAkuAU(this.f$0);
                                }
                            }, j);
                        }
                    }
                    j = -1;
                    z = true;
                    this.subinfoTextView.setVisibility(8);
                    this.undoTextView.setTextColor(getThemedColor(Theme.key_undo_cancelColor));
                    this.undoButton.setVisibility(8);
                    layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                    layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                    this.leftImageView.setProgress(0.0f);
                    this.leftImageView.playAnimation();
                    if (j > 0) {
                        this.leftImageView.postDelayed(new Runnable() {
                            @Override
                            public final void run() {
                                UndoView.$r8$lambda$SGadTwNKFYYR41YEuJowZRAkuAU(this.f$0);
                            }
                        }, j);
                    }
                } else if (i11 == 24 || i11 == 25) {
                    int iIntValue4 = ((Integer) obj).intValue();
                    TLRPC.User user7 = (TLRPC.User) obj2;
                    this.undoImageView.setVisibility(8);
                    this.leftImageView.setVisibility(0);
                    if (iIntValue4 != 0) {
                        this.infoTextView.setTypeface(AndroidUtilities.bold());
                        this.infoTextView.setTextSize(1, 14.0f);
                        this.leftImageView.clearLayerColors();
                        RLottieImageView rLottieImageView = this.leftImageView;
                        int i17 = Theme.key_undo_infoColor;
                        rLottieImageView.setLayerColor("BODY", getThemedColor(i17));
                        this.leftImageView.setLayerColor("Wibe Big", getThemedColor(i17));
                        this.leftImageView.setLayerColor("Wibe Big 3", getThemedColor(i17));
                        this.leftImageView.setLayerColor("Wibe Small", getThemedColor(i17));
                        this.infoTextView.setText(LocaleController.getString(R.string.ProximityAlertSet));
                        this.leftImageView.setAnimation(R.raw.ic_unmute, 28, 28);
                        this.subinfoTextView.setVisibility(0);
                        this.subinfoTextView.setSingleLine(false);
                        this.subinfoTextView.setMaxLines(3);
                        if (user7 != null) {
                            this.subinfoTextView.setText(LocaleController.formatString("ProximityAlertSetInfoUser", R.string.ProximityAlertSetInfoUser, UserObject.getFirstName(user7), LocaleController.formatDistance(iIntValue4, 2)));
                        } else {
                            this.subinfoTextView.setText(LocaleController.formatString("ProximityAlertSetInfoGroup2", R.string.ProximityAlertSetInfoGroup2, LocaleController.formatDistance(iIntValue4, 2)));
                        }
                        this.undoButton.setVisibility(8);
                        layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                    } else {
                        this.infoTextView.setTypeface(Typeface.DEFAULT);
                        this.infoTextView.setTextSize(1, 15.0f);
                        this.leftImageView.clearLayerColors();
                        RLottieImageView rLottieImageView2 = this.leftImageView;
                        int i18 = Theme.key_undo_infoColor;
                        rLottieImageView2.setLayerColor("Body Main", getThemedColor(i18));
                        this.leftImageView.setLayerColor("Body Top", getThemedColor(i18));
                        this.leftImageView.setLayerColor("Line", getThemedColor(i18));
                        this.leftImageView.setLayerColor("Curve Big", getThemedColor(i18));
                        this.leftImageView.setLayerColor("Curve Small", getThemedColor(i18));
                        layoutParams.topMargin = AndroidUtilities.dp(14.0f);
                        this.infoTextView.setText(LocaleController.getString(R.string.ProximityAlertCancelled));
                        this.leftImageView.setAnimation(R.raw.ic_mute, 28, 28);
                        this.subinfoTextView.setVisibility(8);
                        this.undoTextView.setTextColor(getThemedColor(Theme.key_undo_cancelColor));
                        this.undoButton.setVisibility(0);
                    }
                    layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                    this.leftImageView.setProgress(0.0f);
                    this.leftImageView.playAnimation();
                } else if (i11 == 11) {
                    this.infoTextView.setText(LocaleController.getString(R.string.AuthAnotherClientOk));
                    this.leftImageView.setAnimation(R.raw.contact_check, 36, 36);
                    layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                    layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                    this.subinfoTextView.setText(((TLRPC.TL_authorization) obj).app_name);
                    this.subinfoTextView.setVisibility(0);
                    this.infoTextView.setTextSize(1, 14.0f);
                    this.infoTextView.setTypeface(AndroidUtilities.bold());
                    this.undoTextView.setTextColor(getThemedColor(Theme.key_text_RedRegular));
                    this.undoImageView.setVisibility(8);
                    this.undoButton.setVisibility(0);
                    this.leftImageView.setVisibility(0);
                    this.leftImageView.setProgress(0.0f);
                    this.leftImageView.playAnimation();
                } else if (i11 == 15) {
                    this.timeLeft = 10000L;
                    this.undoTextView.setText(LocaleController.getString(R.string.Open));
                    this.infoTextView.setText(LocaleController.getString(R.string.FilterAvailableTitle));
                    this.leftImageView.setAnimation(R.raw.filter_new, 36, 36);
                    int iCeil = ((int) Math.ceil(this.undoTextView.getPaint().measureText(this.undoTextView.getText().toString()))) + AndroidUtilities.dp(26.0f);
                    layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                    layoutParams.rightMargin = iCeil;
                    layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                    ((FrameLayout.LayoutParams) this.subinfoTextView.getLayoutParams()).rightMargin = iCeil;
                    String string5 = LocaleController.getString(R.string.FilterAvailableText);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(string5);
                    int iIndexOf2 = string5.indexOf(42);
                    int iLastIndexOf2 = string5.lastIndexOf(42);
                    if (iIndexOf2 >= 0 && iLastIndexOf2 >= 0 && iIndexOf2 != iLastIndexOf2) {
                        spannableStringBuilder2.replace(iLastIndexOf2, iLastIndexOf2 + 1, (CharSequence) "");
                        spannableStringBuilder2.replace(iIndexOf2, iIndexOf2 + 1, (CharSequence) "");
                        spannableStringBuilder2.setSpan(new URLSpanNoUnderline("tg://settings/folders"), iIndexOf2, iLastIndexOf2 - 1, 33);
                    }
                    this.subinfoTextView.setText(spannableStringBuilder2);
                    this.subinfoTextView.setVisibility(0);
                    this.subinfoTextView.setSingleLine(false);
                    this.subinfoTextView.setMaxLines(2);
                    this.undoButton.setVisibility(0);
                    this.undoImageView.setVisibility(8);
                    this.leftImageView.setVisibility(0);
                    this.leftImageView.setProgress(0.0f);
                    this.leftImageView.playAnimation();
                } else if (i11 == 16 || i11 == 17) {
                    this.timeLeft = 4000L;
                    this.infoTextView.setTextSize(1, 14.0f);
                    this.infoTextView.setGravity(16);
                    this.infoTextView.setMinHeight(AndroidUtilities.dp(30.0f));
                    String str = (String) obj;
                    if ("🎲".equals(str)) {
                        this.infoTextView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DiceInfo2)));
                        this.leftImageView.setImageResource(R.drawable.dice);
                    } else {
                        if ("🎯".equals(str)) {
                            this.infoTextView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DartInfo)));
                        } else {
                            String serverString = LocaleController.getServerString("DiceEmojiInfo_" + str);
                            if (!TextUtils.isEmpty(serverString)) {
                                LinkSpanDrawable.LinksTextView linksTextView3 = this.infoTextView;
                                linksTextView3.setText(Emoji.replaceEmoji(serverString, linksTextView3.getPaint().getFontMetricsInt(), false));
                            } else {
                                this.infoTextView.setText(Emoji.replaceEmoji(LocaleController.formatString("DiceEmojiInfo", R.string.DiceEmojiInfo, str), this.infoTextView.getPaint().getFontMetricsInt(), false));
                            }
                        }
                        this.leftImageView.setImageDrawable(Emoji.getEmojiDrawable(str));
                        this.leftImageView.setScaleType(ImageView.ScaleType.FIT_XY);
                        layoutParams.topMargin = AndroidUtilities.dp(14.0f);
                        layoutParams.bottomMargin = AndroidUtilities.dp(14.0f);
                        layoutParams2.leftMargin = AndroidUtilities.dp(14.0f);
                        layoutParams2.width = AndroidUtilities.dp(26.0f);
                        layoutParams2.height = AndroidUtilities.dp(26.0f);
                    }
                    this.undoTextView.setText(LocaleController.getString(R.string.SendDice));
                    if (this.currentAction == 16) {
                        iDp = ((int) Math.ceil(this.undoTextView.getPaint().measureText(this.undoTextView.getText().toString()))) + AndroidUtilities.dp(26.0f);
                        this.undoTextView.setVisibility(0);
                        this.undoTextView.setTextColor(getThemedColor(Theme.key_undo_cancelColor));
                        this.undoImageView.setVisibility(8);
                        this.undoButton.setVisibility(0);
                    } else {
                        iDp = AndroidUtilities.dp(8.0f);
                        this.undoTextView.setVisibility(8);
                        this.undoButton.setVisibility(8);
                    }
                    layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                    layoutParams.rightMargin = iDp;
                    layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                    layoutParams.bottomMargin = AndroidUtilities.dp(7.0f);
                    layoutParams.height = -1;
                    this.subinfoTextView.setVisibility(8);
                    this.leftImageView.setVisibility(0);
                } else if (i11 == 18) {
                    CharSequence charSequence2 = (CharSequence) obj;
                    this.timeLeft = Math.max(4000, Math.min((charSequence2.length() / 50) * 1600, 10000));
                    this.infoTextView.setTextSize(1, 14.0f);
                    this.infoTextView.setGravity(16);
                    this.infoTextView.setText(charSequence2);
                    this.undoTextView.setVisibility(8);
                    this.undoButton.setVisibility(8);
                    layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                    layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                    layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                    layoutParams.bottomMargin = AndroidUtilities.dp(7.0f);
                    layoutParams.height = -1;
                    layoutParams2.gravity = 51;
                    int iDp3 = AndroidUtilities.dp(8.0f);
                    layoutParams2.bottomMargin = iDp3;
                    layoutParams2.topMargin = iDp3;
                    this.leftImageView.setVisibility(0);
                    this.leftImageView.setAnimation(R.raw.chats_infotip, 36, 36);
                    this.leftImageView.setProgress(0.0f);
                    this.leftImageView.playAnimation();
                    this.infoTextView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                } else if (i11 == 12) {
                    this.infoTextView.setText(LocaleController.getString(R.string.ColorThemeChanged));
                    this.leftImageView.setImageResource(R.drawable.toast_pallete);
                    layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                    layoutParams.rightMargin = AndroidUtilities.dp(48.0f);
                    layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                    ((FrameLayout.LayoutParams) this.subinfoTextView.getLayoutParams()).rightMargin = AndroidUtilities.dp(48.0f);
                    String string6 = LocaleController.getString(R.string.ColorThemeChangedInfo);
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(string6);
                    int iIndexOf3 = string6.indexOf(42);
                    int iLastIndexOf3 = string6.lastIndexOf(42);
                    if (iIndexOf3 >= 0 && iLastIndexOf3 >= 0 && iIndexOf3 != iLastIndexOf3) {
                        spannableStringBuilder3.replace(iLastIndexOf3, iLastIndexOf3 + 1, (CharSequence) "");
                        spannableStringBuilder3.replace(iIndexOf3, iIndexOf3 + 1, (CharSequence) "");
                        spannableStringBuilder3.setSpan(new URLSpanNoUnderline("tg://settings/themes"), iIndexOf3, iLastIndexOf3 - 1, 33);
                    }
                    this.subinfoTextView.setText(spannableStringBuilder3);
                    this.subinfoTextView.setVisibility(0);
                    this.subinfoTextView.setSingleLine(false);
                    this.subinfoTextView.setMaxLines(2);
                    this.undoTextView.setVisibility(8);
                    this.undoButton.setVisibility(0);
                    this.leftImageView.setVisibility(0);
                } else if (i11 == 84) {
                    this.infoTextView.setVisibility(0);
                    this.infoTextView.setTextSize(1, 15.0f);
                    this.infoTextView.setTypeface(Typeface.DEFAULT);
                    this.infoTextView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumTranscriptionHint)));
                    this.leftImageView.setVisibility(0);
                    this.leftImageView.setAnimation(R.raw.voice_to_text, 36, 36);
                    this.leftImageView.setProgress(0.0f);
                    this.leftImageView.playAnimation();
                    this.undoTextView.setText(LocaleController.getString(R.string.PremiumMore));
                    layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                    layoutParams.rightMargin = ((int) Math.ceil(this.undoTextView.getPaint().measureText(this.undoTextView.getText().toString()))) + AndroidUtilities.dp(26.0f);
                    int iDp4 = AndroidUtilities.dp(6.0f);
                    layoutParams.bottomMargin = iDp4;
                    layoutParams.topMargin = iDp4;
                    layoutParams.height = -2;
                    this.avatarImageView.setVisibility(8);
                    this.subinfoTextView.setVisibility(8);
                    this.undoTextView.setVisibility(0);
                    this.undoButton.setVisibility(0);
                    this.undoImageView.setVisibility(8);
                } else if (i11 == 85) {
                    this.infoTextView.setVisibility(0);
                    this.infoTextView.setTextSize(1, 15.0f);
                    this.infoTextView.setTypeface(AndroidUtilities.bold());
                    this.infoTextView.setText(LocaleController.getString(R.string.SwipeToReplyHint));
                    this.leftImageView.setVisibility(0);
                    this.leftImageView.setAnimation(R.raw.hint_swipe_reply, 64, 64);
                    this.leftImageView.setProgress(0.0f);
                    this.leftImageView.playAnimation();
                    this.subinfoTextView.setVisibility(0);
                    this.subinfoTextView.setText(LocaleController.getString(R.string.SwipeToReplyHintMessage));
                    layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                    layoutParams.rightMargin = ((int) Math.ceil(this.undoTextView.getPaint().measureText(this.undoTextView.getText().toString()))) + AndroidUtilities.dp(26.0f);
                    layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                    layoutParams.height = -2;
                    this.avatarImageView.setVisibility(8);
                    this.undoButton.setVisibility(8);
                } else if (i11 == 90 || i11 == 91 || i11 == 92 || i11 == 93 || i11 == 94) {
                    switch (i11) {
                        case 90:
                            this.infoTextView.setText(LocaleController.formatPluralString("BoostingSelectUpToWarningChannelsGroupsPlural", (int) BoostRepository.giveawayAddPeersMax(), new Object[0]));
                            break;
                        case 91:
                            this.infoTextView.setText(LocaleController.getString(R.string.BoostingSelectUpToWarningUsers));
                            break;
                        case 92:
                            this.infoTextView.setText(LocaleController.formatPluralString("BoostingSelectUpToWarningCountriesPlural", (int) BoostRepository.giveawayCountriesMax(), new Object[0]));
                            break;
                        case 93:
                            this.infoTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingWaitWarningPlural", BoostRepository.boostsPerSentGift(), new Object[0])));
                            break;
                        case 94:
                            this.infoTextView.setText(LocaleController.getString(R.string.BoostingOnlyRecipientCode));
                            break;
                    }
                    layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                    layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                    this.infoTextView.setTextSize(1, 15.0f);
                    this.undoButton.setVisibility(8);
                    this.infoTextView.setTypeface(Typeface.DEFAULT);
                    this.subinfoTextView.setVisibility(8);
                    this.leftImageView.setVisibility(0);
                    this.leftImageView.setAnimation(R.raw.chats_infotip, 36, 36);
                    this.leftImageView.setProgress(0.0f);
                    this.leftImageView.playAnimation();
                } else {
                    int i19 = 2;
                    if (i11 == 2) {
                        if (i == i19) {
                            this.infoTextView.setText(LocaleController.getString(R.string.ChatArchived));
                        } else {
                            this.infoTextView.setText(LocaleController.getString(R.string.ChatsArchived));
                        }
                        layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                        layoutParams.topMargin = AndroidUtilities.dp(13.0f);
                        layoutParams.rightMargin = 0;
                        this.infoTextView.setTextSize(1, 15.0f);
                        this.undoButton.setVisibility(0);
                        this.infoTextView.setTypeface(Typeface.DEFAULT);
                        this.subinfoTextView.setVisibility(8);
                        this.leftImageView.setVisibility(0);
                        this.leftImageView.setAnimation(R.raw.chats_archived, 36, 36);
                        this.leftImageView.setProgress(0.0f);
                        this.leftImageView.playAnimation();
                    } else if (i11 == 4) {
                        i19 = 2;
                        if (i == i19) {
                            this.infoTextView.setText(LocaleController.getString(R.string.ChatArchived));
                        } else {
                            this.infoTextView.setText(LocaleController.getString(R.string.ChatsArchived));
                        }
                        layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                        layoutParams.topMargin = AndroidUtilities.dp(13.0f);
                        layoutParams.rightMargin = 0;
                        this.infoTextView.setTextSize(1, 15.0f);
                        this.undoButton.setVisibility(0);
                        this.infoTextView.setTypeface(Typeface.DEFAULT);
                        this.subinfoTextView.setVisibility(8);
                        this.leftImageView.setVisibility(0);
                        this.leftImageView.setAnimation(R.raw.chats_archived, 36, 36);
                        this.leftImageView.setProgress(0.0f);
                        this.leftImageView.playAnimation();
                    } else if (i == 82) {
                        layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                        this.infoTextView.setText(LocaleController.getString(photoEntry.isVideo ? R.string.AttachMediaVideoDeselected : R.string.AttachMediaPhotoDeselected));
                        this.undoButton.setVisibility(0);
                        this.infoTextView.setTextSize(1, 15.0f);
                        this.infoTextView.setTypeface(Typeface.DEFAULT);
                        this.subinfoTextView.setVisibility(8);
                        this.avatarImageView.setVisibility(0);
                        this.avatarImageView.setRoundRadius(AndroidUtilities.dp(2.0f));
                        String str2 = photoEntry.thumbPath;
                        if (str2 != null) {
                            this.avatarImageView.setImage(str2, null, Theme.chat_attachEmptyDrawable);
                        } else if (photoEntry.path != null) {
                            this.avatarImageView.setOrientation(photoEntry.orientation, photoEntry.invert, true);
                            if (photoEntry.isVideo) {
                                this.avatarImageView.setImage("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, Theme.chat_attachEmptyDrawable);
                            } else {
                                this.avatarImageView.setImage("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, Theme.chat_attachEmptyDrawable);
                            }
                        } else {
                            this.avatarImageView.setImageDrawable(Theme.chat_attachEmptyDrawable);
                        }
                    } else {
                        layoutParams.leftMargin = AndroidUtilities.dp(45.0f);
                        layoutParams.topMargin = AndroidUtilities.dp(13.0f);
                        layoutParams.rightMargin = 0;
                        this.infoTextView.setTextSize(1, 15.0f);
                        this.undoButton.setVisibility(0);
                        LinkSpanDrawable.LinksTextView linksTextView4 = this.infoTextView;
                        Typeface typeface = Typeface.DEFAULT;
                        linksTextView4.setTypeface(typeface);
                        this.subinfoTextView.setVisibility(8);
                        this.leftImageView.setVisibility(8);
                        int i20 = this.currentAction;
                        if (i20 == 88) {
                            String str3 = (String) obj;
                            int iIntValue5 = ((Integer) obj2).intValue();
                            if (iIntValue5 > 0) {
                                int iCeil2 = ((int) Math.ceil(this.undoTextView.getPaint().measureText(this.undoTextView.getText().toString()))) + AndroidUtilities.dp(26.0f);
                                layoutParams.leftMargin = AndroidUtilities.dp(48.0f);
                                layoutParams.rightMargin = iCeil2;
                                layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.subinfoTextView.getLayoutParams();
                                layoutParams3.leftMargin = AndroidUtilities.dp(48.0f);
                                layoutParams3.rightMargin = iCeil2;
                                this.infoTextView.setText(LocaleController.formatString("FolderLinkDeletedTitle", R.string.FolderLinkDeletedTitle, str3));
                                this.infoTextView.setTypeface(AndroidUtilities.bold());
                                this.subinfoTextView.setVisibility(0);
                                this.subinfoTextView.setText(LocaleController.formatPluralString("FolderLinkDeletedSubtitle", iIntValue5, new Object[0]));
                            } else {
                                this.infoTextView.setTypeface(typeface);
                                LinkSpanDrawable.LinksTextView linksTextView5 = this.infoTextView;
                                int i21 = R.string.FolderLinkDeleted;
                                if (str3 == null) {
                                    str3 = "";
                                }
                                linksTextView5.setText(AndroidUtilities.replaceTags(LocaleController.formatString("FolderLinkDeleted", i21, str3.replace('*', (char) 10033))));
                            }
                        } else if (i20 == 81 || i20 == 0 || i20 == 26) {
                            this.infoTextView.setText(LocaleController.getString(R.string.HistoryClearedUndo));
                        } else if (i20 == 27) {
                            this.infoTextView.setText(LocaleController.getString(R.string.ChatsDeletedUndo));
                        } else if (i20 == 95) {
                            if (DialogObject.isChatDialog(jLongValue)) {
                                TLRPC.Chat chat7 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-jLongValue));
                                if (ChatObject.isMonoForum(chat7)) {
                                    this.infoTextView.setText(LocaleController.getString(R.string.MonoforumDeletedUndo));
                                } else if (ChatObject.isChannel(chat7) && !chat7.megagroup) {
                                    this.infoTextView.setText(LocaleController.getString(R.string.ChannelLeftUndo));
                                } else {
                                    this.infoTextView.setText(LocaleController.getString(R.string.GroupLeftUndo));
                                }
                            } else {
                                this.infoTextView.setText(LocaleController.getString(R.string.ChatDeletedUndo));
                            }
                        } else if (DialogObject.isChatDialog(jLongValue)) {
                            TLRPC.Chat chat8 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-jLongValue));
                            if (ChatObject.isMonoForum(chat8)) {
                                this.infoTextView.setText(LocaleController.getString(R.string.MonoforumDeletedUndo));
                            } else if (ChatObject.isChannel(chat8) && !chat8.megagroup) {
                                this.infoTextView.setText(LocaleController.getString(R.string.ChannelDeletedUndo));
                            } else {
                                this.infoTextView.setText(LocaleController.getString(R.string.GroupDeletedUndo));
                            }
                        } else {
                            this.infoTextView.setText(LocaleController.getString(R.string.ChatDeletedUndo));
                        }
                        if (this.currentAction != 81) {
                            for (int i22 = 0; i22 < arrayList.size(); i22++) {
                                MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
                                long jLongValue2 = ((Long) arrayList.get(i22)).longValue();
                                int i23 = this.currentAction;
                                messagesController.addDialogAction(jLongValue2, i23 == 0 || i23 == 26);
                            }
                        }
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append((Object) this.infoTextView.getText());
                sb.append(this.subinfoTextView.getVisibility() == 0 ? ". " + ((Object) this.subinfoTextView.getText()) : "");
                AndroidUtilities.makeAccessibilityAnnouncement(sb.toString());
                if (isMultilineSubInfo()) {
                    measuredWidth2 = ((ViewGroup) getParent()).getMeasuredWidth();
                    if (measuredWidth2 == 0) {
                        measuredWidth2 = AndroidUtilities.displaySize.x;
                    }
                    measureChildWithMargins(this.subinfoTextView, View.MeasureSpec.makeMeasureSpec(measuredWidth2 - AndroidUtilities.dp(16.0f), 1073741824), 0, View.MeasureSpec.makeMeasureSpec(0, 0), 0);
                    this.undoViewHeight = this.subinfoTextView.getMeasuredHeight() + AndroidUtilities.dp(37.0f);
                } else if (hasSubInfo()) {
                    this.undoViewHeight = AndroidUtilities.dp(52.0f);
                } else if (getParent() instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) getParent();
                    measuredWidth = (viewGroup.getMeasuredWidth() - viewGroup.getPaddingLeft()) - viewGroup.getPaddingRight();
                    if (measuredWidth <= 0) {
                        measuredWidth = AndroidUtilities.displaySize.x;
                    }
                    measureChildWithMargins(this.infoTextView, View.MeasureSpec.makeMeasureSpec(measuredWidth - AndroidUtilities.dp(16.0f), 1073741824), 0, View.MeasureSpec.makeMeasureSpec(0, 0), 0);
                    int measuredHeight = this.infoTextView.getMeasuredHeight();
                    i2 = this.currentAction;
                    if (i2 != 16 || i2 == 17 || i2 == 18 || i2 == 84 || i2 == 86) {
                        f = 14.0f;
                    } else {
                        f = 28.0f;
                    }
                    iDp2 = measuredHeight + AndroidUtilities.dp(f);
                    this.undoViewHeight = iDp2;
                    i3 = this.currentAction;
                    if (i3 == 18) {
                        this.undoViewHeight = Math.max(iDp2, AndroidUtilities.dp(52.0f));
                    } else if (i3 == 25) {
                        this.undoViewHeight = Math.max(iDp2, AndroidUtilities.dp(50.0f));
                    } else if (z) {
                        this.undoViewHeight = iDp2 - AndroidUtilities.dp(8.0f);
                    }
                }
                if (getVisibility() != 0) {
                    setVisibility(0);
                    if (this.fromTop) {
                        f2 = -1.0f;
                    } else {
                        f2 = 1.0f;
                    }
                    setEnterOffset(f2 * (this.enterOffsetMargin + this.undoViewHeight));
                    AnimatorSet animatorSet = new AnimatorSet();
                    z2 = this.fromTop;
                    if (z2) {
                        f3 = -1.0f;
                    } else {
                        f3 = 1.0f;
                    }
                    float f5 = f3 * (this.enterOffsetMargin + this.undoViewHeight);
                    if (z2) {
                        f4 = 1.0f;
                    } else {
                        f4 = -1.0f;
                    }
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this, "enterOffset", f5, f4));
                    animatorSet.setInterpolator(new DecelerateInterpolator());
                    animatorSet.setDuration(180L);
                    animatorSet.start();
                }
            }
            z = false;
            StringBuilder sb2 = new StringBuilder();
            sb2.append((Object) this.infoTextView.getText());
            if (this.subinfoTextView.getVisibility() == 0) {
            }
            sb2.append(this.subinfoTextView.getVisibility() == 0 ? ". " + ((Object) this.subinfoTextView.getText()) : "");
            AndroidUtilities.makeAccessibilityAnnouncement(sb2.toString());
            if (isMultilineSubInfo()) {
                measuredWidth2 = ((ViewGroup) getParent()).getMeasuredWidth();
                if (measuredWidth2 == 0) {
                    measuredWidth2 = AndroidUtilities.displaySize.x;
                }
                measureChildWithMargins(this.subinfoTextView, View.MeasureSpec.makeMeasureSpec(measuredWidth2 - AndroidUtilities.dp(16.0f), 1073741824), 0, View.MeasureSpec.makeMeasureSpec(0, 0), 0);
                this.undoViewHeight = this.subinfoTextView.getMeasuredHeight() + AndroidUtilities.dp(37.0f);
            } else if (hasSubInfo()) {
                this.undoViewHeight = AndroidUtilities.dp(52.0f);
            } else if (getParent() instanceof ViewGroup) {
                ViewGroup viewGroup2 = (ViewGroup) getParent();
                measuredWidth = (viewGroup2.getMeasuredWidth() - viewGroup2.getPaddingLeft()) - viewGroup2.getPaddingRight();
                if (measuredWidth <= 0) {
                    measuredWidth = AndroidUtilities.displaySize.x;
                }
                measureChildWithMargins(this.infoTextView, View.MeasureSpec.makeMeasureSpec(measuredWidth - AndroidUtilities.dp(16.0f), 1073741824), 0, View.MeasureSpec.makeMeasureSpec(0, 0), 0);
                int measuredHeight2 = this.infoTextView.getMeasuredHeight();
                i2 = this.currentAction;
                if (i2 != 16) {
                    f = 14.0f;
                } else {
                    f = 14.0f;
                }
                iDp2 = measuredHeight2 + AndroidUtilities.dp(f);
                this.undoViewHeight = iDp2;
                i3 = this.currentAction;
                if (i3 == 18) {
                    this.undoViewHeight = Math.max(iDp2, AndroidUtilities.dp(52.0f));
                } else if (i3 == 25) {
                    this.undoViewHeight = Math.max(iDp2, AndroidUtilities.dp(50.0f));
                } else if (z) {
                    this.undoViewHeight = iDp2 - AndroidUtilities.dp(8.0f);
                }
            }
            if (getVisibility() != 0) {
                setVisibility(0);
                if (this.fromTop) {
                    f2 = -1.0f;
                } else {
                    f2 = 1.0f;
                }
                setEnterOffset(f2 * (this.enterOffsetMargin + this.undoViewHeight));
                AnimatorSet animatorSet2 = new AnimatorSet();
                z2 = this.fromTop;
                if (z2) {
                    f3 = -1.0f;
                } else {
                    f3 = 1.0f;
                }
                float f6 = f3 * (this.enterOffsetMargin + this.undoViewHeight);
                if (z2) {
                    f4 = 1.0f;
                } else {
                    f4 = -1.0f;
                }
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "enterOffset", f6, f4));
                animatorSet2.setInterpolator(new DecelerateInterpolator());
                animatorSet2.setDuration(180L);
                animatorSet2.start();
            }
        }
    }

    public static void $r8$lambda$pRV1L_28TR1KN0lQU0QgCwyHuGQ(final UndoView undoView, TLRPC.Message message, View view) {
        undoView.hide(true, 1);
        TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
        tL_payments_getPaymentReceipt.msg_id = message.id;
        tL_payments_getPaymentReceipt.peer = undoView.parentFragment.getMessagesController().getInputPeer(message.peer_id);
        undoView.parentFragment.getConnectionsManager().sendRequest(tL_payments_getPaymentReceipt, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                UndoView.m2936$r8$lambda$6d5vqfSMidtBNRUIWmlOqbnglA(this.f$0, tLObject, tL_error);
            }
        }, 2);
    }

    public static void m2936$r8$lambda$6d5vqfSMidtBNRUIWmlOqbnglA(final UndoView undoView, final TLObject tLObject, TLRPC.TL_error tL_error) {
        undoView.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                UndoView.$r8$lambda$xcxxkyMYuOhNs747Be0OLVKUxro(this.f$0, tLObject);
            }
        });
    }

    public static void $r8$lambda$xcxxkyMYuOhNs747Be0OLVKUxro(UndoView undoView, TLObject tLObject) {
        undoView.getClass();
        if (tLObject instanceof TLRPC.PaymentReceipt) {
            undoView.parentFragment.presentFragment(new PaymentFormActivity((TLRPC.PaymentReceipt) tLObject));
        }
    }

    public static void $r8$lambda$SGadTwNKFYYR41YEuJowZRAkuAU(UndoView undoView) {
        undoView.getClass();
        try {
            undoView.leftImageView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public void setEnterOffsetMargin(int i) {
        this.enterOffsetMargin = i;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(this.undoViewHeight, 1073741824));
        this.backgroundDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        if (this.additionalTranslationY != 0.0f) {
            canvas.save();
            float measuredHeight = (getMeasuredHeight() - this.enterOffset) + AndroidUtilities.dp(9.0f);
            if (measuredHeight > 0.0f) {
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
                super.dispatchDraw(canvas);
            }
            canvas.restore();
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (this.additionalTranslationY != 0.0f) {
            canvas.save();
            float measuredHeight = (getMeasuredHeight() - this.enterOffset) + this.enterOffsetMargin + AndroidUtilities.dp(1.0f);
            if (measuredHeight > 0.0f) {
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
                super.dispatchDraw(canvas);
            }
            this.backgroundDrawable.draw(canvas);
            canvas.restore();
        } else {
            this.backgroundDrawable.draw(canvas);
        }
        int i = this.currentAction;
        if (i == 1 || i == 95 || i == 0 || i == 27 || i == 26 || i == 81 || i == 88) {
            long j = this.timeLeft;
            int iCeil = j > 0 ? (int) Math.ceil(j / 1000.0f) : 0;
            if (this.prevSeconds != iCeil) {
                this.prevSeconds = iCeil;
                String str = String.format("%d", Integer.valueOf(Math.max(1, iCeil)));
                this.timeLeftString = str;
                StaticLayout staticLayout = this.timeLayout;
                if (staticLayout != null) {
                    this.timeLayoutOut = staticLayout;
                    this.timeReplaceProgress = 0.0f;
                    this.textWidthOut = this.textWidth;
                }
                this.textWidth = (int) Math.ceil(this.textPaint.measureText(str));
                this.timeLayout = new StaticLayout(this.timeLeftString, this.textPaint, Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            float f = this.timeReplaceProgress;
            if (f < 1.0f) {
                float f2 = f + 0.10666667f;
                this.timeReplaceProgress = f2;
                if (f2 > 1.0f) {
                    this.timeReplaceProgress = 1.0f;
                } else {
                    invalidate();
                }
            }
            int alpha = this.textPaint.getAlpha();
            if (this.timeLayoutOut != null) {
                float f3 = this.timeReplaceProgress;
                if (f3 < 1.0f) {
                    this.textPaint.setAlpha((int) (alpha * (1.0f - f3)));
                    canvas.save();
                    canvas.translate(this.rect.centerX() - (this.textWidth / 2), AndroidUtilities.dp(17.2f) + (AndroidUtilities.dp(10.0f) * this.timeReplaceProgress));
                    this.timeLayoutOut.draw(canvas);
                    this.textPaint.setAlpha(alpha);
                    canvas.restore();
                }
            }
            if (this.timeLayout != null) {
                float f4 = this.timeReplaceProgress;
                if (f4 != 1.0f) {
                    this.textPaint.setAlpha((int) (alpha * f4));
                }
                canvas.save();
                canvas.translate(this.rect.centerX() - (this.textWidth / 2), AndroidUtilities.dp(17.2f) - (AndroidUtilities.dp(10.0f) * (1.0f - this.timeReplaceProgress)));
                this.timeLayout.draw(canvas);
                if (this.timeReplaceProgress != 1.0f) {
                    this.textPaint.setAlpha(alpha);
                }
                canvas.restore();
            }
            canvas.drawArc(this.rect, -90.0f, (-360.0f) * (this.timeLeft / 5000.0f), false, this.progressPaint);
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.timeLeft - (jElapsedRealtime - this.lastUpdateTime);
        this.timeLeft = j2;
        this.lastUpdateTime = jElapsedRealtime;
        if (j2 <= 0) {
            hide(true, this.hideAnimationType);
        }
        if (this.currentAction != 82) {
            invalidate();
        }
    }

    @Override
    public void invalidate() {
        super.invalidate();
        this.infoTextView.invalidate();
        this.leftImageView.invalidate();
    }

    public void setInfoText(CharSequence charSequence) {
        this.infoText = charSequence;
    }

    public void setHideAnimationType(int i) {
        this.hideAnimationType = i;
    }

    public float getEnterOffset() {
        return this.enterOffset;
    }

    public void setEnterOffset(float f) {
        if (this.enterOffset != f) {
            this.enterOffset = f;
            updatePosition();
        }
    }

    private void updatePosition() {
        setTranslationY(((this.enterOffset - this.enterOffsetMargin) + AndroidUtilities.dp(8.0f)) - this.additionalTranslationY);
        invalidate();
    }

    @Override
    public Drawable getBackground() {
        return this.backgroundDrawable;
    }

    private int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }
}
