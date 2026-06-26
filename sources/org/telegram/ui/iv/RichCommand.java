package org.telegram.ui.iv;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;

public class RichCommand {
    private static ArrayList cmds;
    public final List commands;
    public final int icon;
    public final String name;

    public static ArrayList get() {
        ArrayList arrayList = cmds;
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        cmds = arrayList2;
        arrayList2.add(new RichCommand(R.drawable.iv_h1, LocaleController.getString(R.string.ArticleHeading1), "#", "/h1", "/header", "/title", "/heading"));
        cmds.add(new RichCommand(R.drawable.iv_h2, LocaleController.getString(R.string.ArticleHeading2), "##", "/h2"));
        cmds.add(new RichCommand(R.drawable.iv_h3, LocaleController.getString(R.string.ArticleHeading3), "###", "/h3"));
        cmds.add(new RichCommand(R.drawable.iv_h4, LocaleController.getString(R.string.ArticleHeading4), "####", "/h4"));
        cmds.add(new RichCommand(R.drawable.iv_h5, LocaleController.getString(R.string.ArticleHeading5), "#####", "/h5"));
        cmds.add(new RichCommand(R.drawable.iv_h6, LocaleController.getString(R.string.ArticleHeading6), "######", "/h6"));
        cmds.add(new RichCommand(R.drawable.iv_quote, LocaleController.getString(R.string.ArticleQuote), "|", "/quote"));
        cmds.add(new RichCommand(R.drawable.iv_pullquote, LocaleController.getString(R.string.ArticlePullquote), "/pullquote"));
        cmds.add(new RichCommand(R.drawable.iv_code, LocaleController.getString(R.string.ArticleCode), "```", "/code", "/pre", "/preformatted"));
        cmds.add(new RichCommand(R.drawable.iv_footer, LocaleController.getString(R.string.ArticleFooter), "/footer"));
        cmds.add(new RichCommand(R.drawable.iv_list, LocaleController.getString(R.string.ArticleCommandList), "-", "/list"));
        cmds.add(new RichCommand(R.drawable.iv_ordered_list, LocaleController.getString(R.string.ArticleCommandOrderedList), "1."));
        cmds.add(new RichCommand(R.drawable.iv_todo, LocaleController.getString(R.string.ArticleListChecklist), "[]", "/todo", "/checklist"));
        cmds.add(new RichCommand(R.drawable.iv_details, LocaleController.getString(R.string.ArticleCommandToggle), ">", "/toggle", "/details"));
        cmds.add(new RichCommand(R.drawable.iv_table, LocaleController.getString(R.string.ArticleCommandTable), "/table"));
        cmds.add(new RichCommand(R.drawable.iv_math, LocaleController.getString(R.string.ArticleCommandMath), "/math", "/latex", "/expression"));
        cmds.add(new RichCommand(R.drawable.iv_divider, LocaleController.getString(R.string.ArticleCommandDivider), "---"));
        ArrayList arrayList3 = cmds;
        int i = R.drawable.iv_media;
        arrayList3.add(new RichCommand(i, LocaleController.getString(R.string.ArticleCommandImage), "/image", "/pic", "/picture", "/photo", "/img", "/media"));
        cmds.add(new RichCommand(i, LocaleController.getString(R.string.ArticleCommandVideo), "/video", "/vid", "/media"));
        cmds.add(new RichCommand(R.drawable.iv_audio, LocaleController.getString(R.string.ArticleCommandAudio), "/audio", "/music", "/media"));
        cmds.add(new RichCommand(R.drawable.iv_location, LocaleController.getString(R.string.ArticleCommandMap), "/map", "/location", "/venue"));
        return cmds;
    }

    public static ArrayList match(String str) {
        String strTrim = str == null ? "" : str.trim();
        if (strTrim.startsWith("/")) {
            strTrim = strTrim.substring(1);
        }
        String lowerCase = strTrim.toLowerCase();
        ArrayList arrayList = new ArrayList();
        Iterator it = get().iterator();
        while (it.hasNext()) {
            RichCommand richCommand = (RichCommand) it.next();
            if (lowerCase.isEmpty() || richCommand.matches(lowerCase)) {
                arrayList.add(richCommand);
            }
        }
        return arrayList;
    }

    public RichCommand(int i, String str, String... strArr) {
        this.icon = i;
        this.name = str;
        this.commands = Arrays.asList(strArr);
    }

    public boolean matches(String str) {
        for (String str2 : this.name.toLowerCase().split(" ")) {
            if (str2.startsWith(str)) {
                return true;
            }
        }
        Iterator it = this.commands.iterator();
        while (it.hasNext()) {
            String lowerCase = ((String) it.next()).toLowerCase();
            if (lowerCase.startsWith("/")) {
                lowerCase = lowerCase.substring(1);
            }
            if (lowerCase.startsWith(str)) {
                return true;
            }
        }
        return false;
    }

    public static class View extends LinearLayout implements Theme.Colorable {
        private final RichCommand cmd;
        private final ImageView iconView;
        private final Theme.ResourcesProvider resourcesProvider;
        private final TextView textView;
        private final TextView textView2;

        public View(Context context, RichCommand richCommand, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.cmd = richCommand;
            this.resourcesProvider = resourcesProvider;
            setOrientation(0);
            ImageView imageView = new ImageView(context);
            this.iconView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(imageView, LayoutHelper.createLinear(42, 42, 19, 0, 0, 0, 0));
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextSize(1, 16.0f);
            TextView textView2 = new TextView(context);
            this.textView2 = textView2;
            textView2.setTextSize(1, 16.0f);
            textView2.setGravity(5);
            addView(textView, LayoutHelper.createLinear(-2, -2, 19, 8, 0, 0, 0));
            addView(new Space(context), LayoutHelper.createLinear(0, -2, 1.0f, 119));
            addView(textView2, LayoutHelper.createLinear(-2, -2, 21, 8, 0, 0, 0));
            imageView.setImageResource(richCommand.icon);
            textView.setText(richCommand.name);
            textView2.setText((CharSequence) richCommand.commands.get(0));
            updateColors();
        }

        @Override
        public void updateColors() {
            ImageView imageView = this.iconView;
            int i = Theme.key_windowBackgroundWhiteBlackText;
            imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
            this.textView.setTextColor(Theme.getColor(i, this.resourcesProvider));
            this.textView2.setTextColor(Theme.multAlpha(Theme.getColor(i, this.resourcesProvider), 0.75f));
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
        }
    }
}
