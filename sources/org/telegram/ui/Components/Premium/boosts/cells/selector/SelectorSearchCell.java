package org.telegram.ui.Components.Premium.boosts.cells.selector;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ScrollView;
import com.google.android.gms.internal.mlkit_language_id_common.zziq;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda62;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.GroupCreateSpan;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.telegram.ui.UsersSelectActivity;

public abstract class SelectorSearchCell extends ScrollView {
    public final ArrayList allSpans;
    public final LinearGradient bottomGradient;
    public final AnimatedFloat bottomGradientAlpha;
    public final Matrix bottomGradientMatrix;
    public final Paint bottomGradientPaint;
    public float containerHeight;
    public GroupCreateSpan currentDeletingSpan;
    public final UsersSelectActivity.AnonymousClass4 editText;
    public int fieldY;
    public final int hintTextWidth;
    public boolean ignoreScrollEvent;
    public boolean ignoreTextChange;
    public Utilities.Callback onSearchTextChange;
    public final Theme.ResourcesProvider resourcesProvider;
    public final StoryPrivacyBottomSheet.SearchUsersCell.SpansContainer spansContainer;
    public final LinearGradient topGradient;
    public final AnimatedFloat topGradientAlpha;
    public final Matrix topGradientMatrix;
    public final Paint topGradientPaint;

    public SelectorSearchCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.allSpans = new ArrayList();
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.topGradientAlpha = new AnimatedFloat(this, 0L, 300L, cubicBezierInterpolator);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
        this.topGradient = linearGradient;
        Paint paint = new Paint(1);
        this.topGradientPaint = paint;
        this.topGradientMatrix = new Matrix();
        this.bottomGradientAlpha = new AnimatedFloat(this, 0L, 300L, cubicBezierInterpolator);
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode);
        this.bottomGradient = linearGradient2;
        Paint paint2 = new Paint(1);
        this.bottomGradientPaint = paint2;
        this.bottomGradientMatrix = new Matrix();
        paint.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(linearGradient2);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.resourcesProvider = resourcesProvider;
        setVerticalScrollBarEnabled(false);
        AndroidUtilities.setScrollViewEdgeEffectColor(this, Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
        StoryPrivacyBottomSheet.SearchUsersCell.SpansContainer spansContainer = new StoryPrivacyBottomSheet.SearchUsersCell.SpansContainer(this, context);
        this.spansContainer = spansContainer;
        addView(spansContainer, LayoutHelper.createFrame(-2.0f, -1));
        UsersSelectActivity.AnonymousClass4 anonymousClass4 = new UsersSelectActivity.AnonymousClass4(this, context, 5);
        this.editText = anonymousClass4;
        if (Build.VERSION.SDK_INT >= 25) {
            anonymousClass4.setRevealOnFocusHint(false);
        }
        anonymousClass4.setTextSize(1, 16.0f);
        anonymousClass4.setHintColor(Theme.getColor(Theme.key_groupcreate_hintText, resourcesProvider));
        anonymousClass4.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
        int i = Theme.key_groupcreate_cursor;
        anonymousClass4.setCursorColor(Theme.getColor(i, resourcesProvider));
        anonymousClass4.setHandlesColor(Theme.getColor(i, resourcesProvider));
        anonymousClass4.setCursorWidth(1.5f);
        anonymousClass4.setInputType(anonymousClass4.getInputType() | 176);
        anonymousClass4.setSingleLine(true);
        anonymousClass4.setBackgroundDrawable(null);
        anonymousClass4.setVerticalScrollBarEnabled(false);
        anonymousClass4.setHorizontalScrollBarEnabled(false);
        anonymousClass4.setTextIsSelectable(false);
        anonymousClass4.setPadding(0, 0, 0, 0);
        anonymousClass4.setImeOptions(268435462);
        anonymousClass4.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        spansContainer.addView(anonymousClass4);
        int i2 = R.string.Search;
        anonymousClass4.setHintText(LocaleController.getString(i2));
        this.hintTextWidth = (int) anonymousClass4.getPaint().measureText(LocaleController.getString(i2));
        anonymousClass4.addTextChangedListener(new TextWatcher() {
            @Override
            public final void afterTextChanged(Editable editable) {
                Utilities.Callback callback;
                SelectorSearchCell selectorSearchCell = SelectorSearchCell.this;
                if (selectorSearchCell.ignoreTextChange || (callback = selectorSearchCell.onSearchTextChange) == null || editable == null) {
                    return;
                }
                callback.run(editable.toString());
            }

            @Override
            public final void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            }

            @Override
            public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            }
        });
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int scrollY = getScrollY();
        float f = scrollY;
        canvas.saveLayerAlpha(0.0f, f, getWidth(), getHeight() + scrollY, 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        float f2 = this.topGradientAlpha.set(canScrollVertically(-1));
        Matrix matrix = this.topGradientMatrix;
        matrix.reset();
        matrix.postTranslate(0.0f, f);
        this.topGradient.setLocalMatrix(matrix);
        Paint paint = this.topGradientPaint;
        paint.setAlpha((int) (f2 * 255.0f));
        canvas.drawRect(0.0f, f, getWidth(), AndroidUtilities.dp(8.0f) + scrollY, paint);
        float f3 = this.bottomGradientAlpha.set(canScrollVertically(1));
        Matrix matrix2 = this.bottomGradientMatrix;
        matrix2.reset();
        matrix2.postTranslate(0.0f, (getHeight() + scrollY) - AndroidUtilities.dp(8.0f));
        this.bottomGradient.setLocalMatrix(matrix2);
        Paint paint2 = this.bottomGradientPaint;
        paint2.setAlpha((int) (f3 * 255.0f));
        canvas.drawRect(0.0f, (getHeight() + scrollY) - AndroidUtilities.dp(8.0f), getWidth(), getHeight() + scrollY, paint2);
        canvas.restore();
        canvas.restore();
    }

    public EditTextBoldCursor getEditText() {
        return this.editText;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(150.0f), Integer.MIN_VALUE));
    }

    @Override
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        if (this.ignoreScrollEvent) {
            this.ignoreScrollEvent = false;
            return false;
        }
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        rect.top = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(this.fieldY, 20.0f, rect.top);
        rect.bottom = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(this.fieldY, 50.0f, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    public void setContainerHeight(float f) {
        this.containerHeight = f;
        StoryPrivacyBottomSheet.SearchUsersCell.SpansContainer spansContainer = this.spansContainer;
        if (spansContainer != null) {
            spansContainer.requestLayout();
        }
    }

    public void setOnSearchTextChange(Utilities.Callback<String> callback) {
        this.onSearchTextChange = callback;
    }

    public void setText(CharSequence charSequence) {
        this.ignoreTextChange = true;
        this.editText.setText(charSequence);
        this.ignoreTextChange = false;
    }

    public final void updateSpans(boolean z, final HashSet hashSet, final Runnable runnable, ArrayList arrayList) {
        ArrayList arrayList2;
        int i;
        int i2;
        Property property;
        Property property2;
        Property property3;
        Object obj;
        ArrayList arrayList3 = arrayList;
        int i3 = 1;
        MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        int i4 = 0;
        while (true) {
            arrayList2 = this.allSpans;
            if (i4 >= arrayList2.size()) {
                break;
            }
            GroupCreateSpan groupCreateSpan = (GroupCreateSpan) arrayList2.get(i4);
            if (!hashSet.contains(Long.valueOf(groupCreateSpan.getUid()))) {
                arrayList4.add(groupCreateSpan);
            }
            i4++;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Long l = (Long) it.next();
            long jLongValue = l.longValue();
            int i5 = 0;
            while (true) {
                if (i5 >= arrayList2.size()) {
                    Object user = jLongValue >= 0 ? messagesController.getUser(l) : messagesController.getChat(Long.valueOf(-jLongValue));
                    if (arrayList3 == null) {
                        obj = user;
                        break;
                    }
                    int size = arrayList3.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size) {
                            obj = user;
                            break;
                        }
                        Object obj2 = arrayList3.get(i6);
                        i6 += i3;
                        TLRPC.TL_help_country tL_help_country = (TLRPC.TL_help_country) obj2;
                        if (tL_help_country.default_name.hashCode() == jLongValue) {
                            obj = tL_help_country;
                            break;
                        } else {
                            arrayList3 = arrayList;
                            i3 = 1;
                        }
                    }
                    if (obj != null) {
                        GroupCreateSpan groupCreateSpan2 = new GroupCreateSpan(getContext(), obj, null, true, this.resourcesProvider);
                        groupCreateSpan2.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda62(this, hashSet, runnable, 28));
                        arrayList5.add(groupCreateSpan2);
                    }
                    arrayList3 = arrayList;
                    it = it;
                    i3 = 1;
                    break;
                }
                if (((GroupCreateSpan) arrayList2.get(i5)).getUid() == jLongValue) {
                    break;
                } else {
                    i5 += i3;
                }
            }
        }
        if (!arrayList4.isEmpty() || !arrayList5.isEmpty()) {
            StoryPrivacyBottomSheet.SearchUsersCell.SpansContainer spansContainer = this.spansContainer;
            SelectorSearchCell selectorSearchCell = (SelectorSearchCell) spansContainer.this$0;
            selectorSearchCell.ignoreScrollEvent = true;
            ArrayList arrayList6 = selectorSearchCell.allSpans;
            arrayList6.removeAll(arrayList4);
            arrayList6.addAll(arrayList5);
            ArrayList arrayList7 = spansContainer.removingSpans;
            arrayList7.clear();
            arrayList7.addAll(arrayList4);
            for (int i7 = 0; i7 < arrayList4.size(); i7++) {
                ((GroupCreateSpan) arrayList4.get(i7)).setOnClickListener(null);
            }
            spansContainer.setupEndValues();
            if (z) {
                spansContainer.animationStarted = false;
                AnimatorSet animatorSet = new AnimatorSet();
                spansContainer.currentAnimation = animatorSet;
                animatorSet.addListener(new SelectorSearchCell$SpansContainer$2(spansContainer, arrayList4, 0));
                ArrayList arrayList8 = spansContainer.animators;
                arrayList8.clear();
                ArrayList arrayList9 = spansContainer.animAddingSpans;
                arrayList9.clear();
                ArrayList arrayList10 = spansContainer.animRemovingSpans;
                arrayList10.clear();
                int i8 = 0;
                while (true) {
                    int size2 = arrayList4.size();
                    property = View.ALPHA;
                    property2 = View.SCALE_Y;
                    property3 = View.SCALE_X;
                    if (i8 >= size2) {
                        break;
                    }
                    GroupCreateSpan groupCreateSpan3 = (GroupCreateSpan) arrayList4.get(i8);
                    arrayList10.add(groupCreateSpan3);
                    arrayList8.add(ObjectAnimator.ofFloat(groupCreateSpan3, (Property<GroupCreateSpan, Float>) property3, 1.0f, 0.01f));
                    arrayList8.add(ObjectAnimator.ofFloat(groupCreateSpan3, (Property<GroupCreateSpan, Float>) property2, 1.0f, 0.01f));
                    arrayList8.add(ObjectAnimator.ofFloat(groupCreateSpan3, (Property<GroupCreateSpan, Float>) property, 1.0f, 0.0f));
                    i8++;
                }
                for (int i9 = 0; i9 < arrayList5.size(); i9++) {
                    GroupCreateSpan groupCreateSpan4 = (GroupCreateSpan) arrayList5.get(i9);
                    arrayList9.add(groupCreateSpan4);
                    arrayList8.add(ObjectAnimator.ofFloat(groupCreateSpan4, (Property<GroupCreateSpan, Float>) property3, 0.01f, 1.0f));
                    arrayList8.add(ObjectAnimator.ofFloat(groupCreateSpan4, (Property<GroupCreateSpan, Float>) property2, 0.01f, 1.0f));
                    arrayList8.add(ObjectAnimator.ofFloat(groupCreateSpan4, (Property<GroupCreateSpan, Float>) property, 0.0f, 1.0f));
                }
                i = 1;
                i2 = 0;
            } else {
                i = 1;
                for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                    spansContainer.removeView((View) arrayList4.get(i10));
                }
                arrayList7.clear();
                spansContainer.currentAnimation = null;
                i2 = 0;
                spansContainer.animationStarted = false;
                selectorSearchCell.editText.setAllowDrawCursor(true);
            }
            while (i2 < arrayList5.size()) {
                spansContainer.addView((View) arrayList5.get(i2));
                i2 += i;
            }
            spansContainer.requestLayout();
        }
        this.editText.setOnKeyListener(new View.OnKeyListener() {
            public boolean wasEmpty;

            @Override
            public final boolean onKey(View view, int i11, KeyEvent keyEvent) {
                if (i11 == 67) {
                    int action = keyEvent.getAction();
                    SelectorSearchCell selectorSearchCell2 = SelectorSearchCell.this;
                    if (action == 0) {
                        this.wasEmpty = selectorSearchCell2.editText.length() == 0;
                        return false;
                    }
                    if (keyEvent.getAction() == 1 && this.wasEmpty && !selectorSearchCell2.allSpans.isEmpty()) {
                        ArrayList arrayList11 = selectorSearchCell2.allSpans;
                        GroupCreateSpan groupCreateSpan5 = (GroupCreateSpan) zziq.m(1, arrayList11);
                        if (!arrayList11.contains(groupCreateSpan5)) {
                            return true;
                        }
                        if (groupCreateSpan5.deleting) {
                            selectorSearchCell2.currentDeletingSpan = null;
                            selectorSearchCell2.spansContainer.removeSpan(groupCreateSpan5);
                            hashSet.remove(Long.valueOf(groupCreateSpan5.getUid()));
                            runnable.run();
                            return true;
                        }
                        GroupCreateSpan groupCreateSpan6 = selectorSearchCell2.currentDeletingSpan;
                        if (groupCreateSpan6 != null) {
                            groupCreateSpan6.cancelDeleteAnimation();
                            selectorSearchCell2.currentDeletingSpan = null;
                        }
                        selectorSearchCell2.currentDeletingSpan = groupCreateSpan5;
                        groupCreateSpan5.startDeleteAnimation();
                        return true;
                    }
                }
                return false;
            }
        });
    }
}
