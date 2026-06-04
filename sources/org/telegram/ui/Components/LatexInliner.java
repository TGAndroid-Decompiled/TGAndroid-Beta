package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public abstract class LatexInliner {
    private static volatile boolean initialized;
    private static final HashMap SYMBOLS = new HashMap();
    private static final HashSet FUNCTIONS = new HashSet();
    private static final HashSet KEEP_CONTENT = new HashSet();
    private static final HashMap SUPER = new HashMap();
    private static final HashMap SUB = new HashMap();
    private static final HashMap BLACKBOARD = new HashMap();

    private static void ensureInit() {
        if (initialized) {
            return;
        }
        synchronized (LatexInliner.class) {
            try {
                if (initialized) {
                    return;
                }
                buildTables();
                initialized = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void buildTables() {
        HashMap map = SYMBOLS;
        map.put("alpha", "α");
        map.put("beta", "β");
        map.put("gamma", "γ");
        map.put("delta", "δ");
        map.put("epsilon", "ε");
        map.put("varepsilon", "ε");
        map.put("zeta", "ζ");
        map.put("eta", "η");
        map.put("theta", "θ");
        map.put("vartheta", "ϑ");
        map.put("iota", "ι");
        map.put("kappa", "κ");
        map.put("lambda", "λ");
        map.put("mu", "μ");
        map.put("nu", "ν");
        map.put("xi", "ξ");
        map.put("omicron", "ο");
        map.put("pi", "π");
        map.put("varpi", "ϖ");
        map.put("rho", "ρ");
        map.put("varrho", "ϱ");
        map.put("sigma", "σ");
        map.put("varsigma", "ς");
        map.put("tau", "τ");
        map.put("upsilon", "υ");
        map.put("phi", "φ");
        map.put("varphi", "ϕ");
        map.put("chi", "χ");
        map.put("psi", "ψ");
        map.put("omega", "ω");
        map.put("Gamma", "Γ");
        map.put("Delta", "Δ");
        map.put("Theta", "Θ");
        map.put("Lambda", "Λ");
        map.put("Xi", "Ξ");
        map.put("Pi", "Π");
        map.put("Sigma", "Σ");
        map.put("Upsilon", "Υ");
        map.put("Phi", "Φ");
        map.put("Psi", "Ψ");
        map.put("Omega", "Ω");
        map.put("times", "×");
        map.put("div", "÷");
        map.put("pm", "±");
        map.put("mp", "∓");
        map.put("cdot", "·");
        map.put("ast", "∗");
        map.put("star", "⋆");
        map.put("circ", "∘");
        map.put("bullet", "•");
        map.put("oplus", "⊕");
        map.put("otimes", "⊗");
        map.put("odot", "⊙");
        map.put("leq", "≤");
        map.put("le", "≤");
        map.put("geq", "≥");
        map.put("ge", "≥");
        map.put("neq", "≠");
        map.put("ne", "≠");
        map.put("approx", "≈");
        map.put("equiv", "≡");
        map.put("sim", "∼");
        map.put("simeq", "≃");
        map.put("cong", "≅");
        map.put("propto", "∝");
        map.put("ll", "≪");
        map.put("gg", "≫");
        map.put("doteq", "≐");
        map.put("sum", "∑");
        map.put("prod", "∏");
        map.put("coprod", "∐");
        map.put("int", "∫");
        map.put("iint", "∬");
        map.put("iiint", "∭");
        map.put("oint", "∮");
        map.put("bigcup", "⋃");
        map.put("bigcap", "⋂");
        map.put("bigvee", "⋁");
        map.put("bigwedge", "⋀");
        map.put("in", "∈");
        map.put("notin", "∉");
        map.put("ni", "∋");
        map.put("subset", "⊂");
        map.put("subseteq", "⊆");
        map.put("supset", "⊃");
        map.put("supseteq", "⊇");
        map.put("cup", "∪");
        map.put("cap", "∩");
        map.put("setminus", "∖");
        map.put("emptyset", "∅");
        map.put("varnothing", "∅");
        map.put("forall", "∀");
        map.put("exists", "∃");
        map.put("nexists", "∄");
        map.put("neg", "¬");
        map.put("lnot", "¬");
        map.put("land", "∧");
        map.put("wedge", "∧");
        map.put("lor", "∨");
        map.put("vee", "∨");
        map.put("implies", "⟹");
        map.put("impliedby", "⟸");
        map.put("iff", "⟺");
        map.put("therefore", "∴");
        map.put("because", "∵");
        map.put("Re", "ℜ");
        map.put("Im", "ℑ");
        map.put("aleph", "ℵ");
        map.put("hbar", "ℏ");
        map.put("ell", "ℓ");
        map.put("wp", "℘");
        map.put("rightarrow", "→");
        map.put("to", "→");
        map.put("gets", "←");
        map.put("leftarrow", "←");
        map.put("leftrightarrow", "↔");
        map.put("Rightarrow", "⇒");
        map.put("Leftarrow", "⇐");
        map.put("Leftrightarrow", "⇔");
        map.put("mapsto", "↦");
        map.put("uparrow", "↑");
        map.put("downarrow", "↓");
        map.put("longrightarrow", "⟶");
        map.put("longleftarrow", "⟵");
        map.put("infty", "∞");
        map.put("partial", "∂");
        map.put("nabla", "∇");
        map.put("angle", "∠");
        map.put("perp", "⊥");
        map.put("parallel", "∥");
        map.put("prime", "′");
        map.put("degree", "°");
        map.put("dots", "…");
        map.put("ldots", "…");
        map.put("cdots", "⋯");
        map.put("vdots", "⋮");
        map.put("ddots", "⋱");
        map.put("dagger", "†");
        map.put("ddagger", "‡");
        map.put("triangle", "△");
        map.put("square", "□");
        map.put("checkmark", "✓");
        map.put("clubsuit", "♣");
        map.put("diamondsuit", "♦");
        map.put("heartsuit", "♥");
        map.put("spadesuit", "♠");
        map.put("flat", "♭");
        map.put("sharp", "♯");
        map.put("natural", "♮");
        map.put(",", " ");
        map.put(";", " ");
        map.put(":", " ");
        map.put("!", "");
        map.put("quad", "  ");
        map.put("qquad", "    ");
        map.put("\\", "\n");
        map.put("%", "%");
        map.put("&", "&");
        map.put("#", "#");
        map.put("$", "$");
        map.put("_", "_");
        map.put("{", "{");
        map.put("}", "}");
        FUNCTIONS.addAll(Arrays.asList("sin", "cos", "tan", "cot", "sec", "csc", "sinh", "cosh", "tanh", "coth", "arcsin", "arccos", "arctan", "log", "ln", "lg", "exp", "lim", "limsup", "liminf", "max", "min", "sup", "inf", "det", "dim", "ker", "deg", "gcd", "hom", "arg", "mod", "bmod", "Pr"));
        KEEP_CONTENT.addAll(Arrays.asList("text", "textrm", "textbf", "textit", "texttt", "textsf", "mathrm", "mathbf", "mathit", "mathtt", "mathsf", "mathcal", "mathfrak", "operatorname", "boldsymbol", "bm", "left", "right", "big", "Big", "bigg", "Bigg", "displaystyle", "textstyle", "scriptstyle", "limits", "nolimits"));
        HashMap map2 = SUPER;
        putPairs(map2, "0123456789+-=()ni", "⁰¹²³⁴⁵⁶⁷⁸⁹⁺⁻⁼⁽⁾ⁿⁱ");
        putPairs(map2, "abcdefghijklmnoprstuvwxyz", "ᵃᵇᶜᵈᵉᶠᵍʰⁱʲᵏˡᵐⁿᵒᵖʳˢᵗᵘᵛʷˣʸᶻ");
        putPairs(SUB, "0123456789+-=()aehijklmnoprstuvx", "₀₁₂₃₄₅₆₇₈₉₊₋₌₍₎ₐₑₕᵢⱼₖₗₘₙₒₚᵣₛₜᵤᵥₓ");
        putPairs(BLACKBOARD, "CHNPQRZ", "ℂℍℕℙℚℝℤ");
    }

    private static void putPairs(HashMap map, String str, String str2) {
        for (int i = 0; i < str.length() && i < str2.length(); i++) {
            map.put(Character.valueOf(str.charAt(i)), Character.valueOf(str2.charAt(i)));
        }
    }

    public static String inlineLatex(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        ensureInit();
        return process(str.trim(), new int[]{0}, false);
    }

    private static String process(String str, int[] iArr, boolean z) {
        StringBuilder sb = new StringBuilder();
        while (iArr[0] < str.length()) {
            char cCharAt = str.charAt(iArr[0]);
            if (cCharAt == '}') {
                iArr[0] = iArr[0] + 1;
                if (z) {
                    break;
                }
            } else if (cCharAt == '{') {
                iArr[0] = iArr[0] + 1;
                sb.append(process(str, iArr, true));
            } else if (cCharAt == '\\') {
                sb.append(readCommand(str, iArr));
            } else if (cCharAt == '^') {
                iArr[0] = iArr[0] + 1;
                sb.append(applyScript(readArgument(str, iArr), true));
            } else if (cCharAt == '_') {
                iArr[0] = iArr[0] + 1;
                sb.append(applyScript(readArgument(str, iArr), false));
            } else if (cCharAt == '&' || cCharAt == '~') {
                sb.append(' ');
                iArr[0] = iArr[0] + 1;
            } else {
                sb.append(cCharAt);
                iArr[0] = iArr[0] + 1;
            }
        }
        return sb.toString();
    }

    private static String readArgument(String str, int[] iArr) {
        while (iArr[0] < str.length() && str.charAt(iArr[0]) == ' ') {
            iArr[0] = iArr[0] + 1;
        }
        if (iArr[0] >= str.length()) {
            return "";
        }
        char cCharAt = str.charAt(iArr[0]);
        if (cCharAt == '{') {
            iArr[0] = iArr[0] + 1;
            return process(str, iArr, true);
        }
        if (cCharAt == '\\') {
            return readCommand(str, iArr);
        }
        iArr[0] = iArr[0] + 1;
        return String.valueOf(cCharAt);
    }

    private static String readCommand(String str, int[] iArr) {
        String strSubstring;
        String strInlineLatex;
        int iIndexOf;
        String str2;
        int i = iArr[0] + 1;
        iArr[0] = i;
        if (i >= str.length()) {
            return "";
        }
        char cCharAt = str.charAt(iArr[0]);
        if (!Character.isLetter(cCharAt)) {
            String strValueOf = String.valueOf(cCharAt);
            iArr[0] = iArr[0] + 1;
            String str3 = (String) SYMBOLS.get(strValueOf);
            return str3 != null ? str3 : strValueOf;
        }
        int i2 = iArr[0];
        while (iArr[0] < str.length() && Character.isLetter(str.charAt(iArr[0]))) {
            iArr[0] = iArr[0] + 1;
        }
        strSubstring = str.substring(i2, iArr[0]);
        strSubstring.hashCode();
        switch (strSubstring) {
            case "mathbb":
                String argument = readArgument(str, iArr);
                StringBuilder sb = new StringBuilder();
                for (int i3 = 0; i3 < argument.length(); i3++) {
                    char cCharAt2 = argument.charAt(i3);
                    Character ch = (Character) BLACKBOARD.get(Character.valueOf(cCharAt2));
                    if (ch != null) {
                        cCharAt2 = ch.charValue();
                    }
                    sb.append(cCharAt2);
                }
                return sb.toString();
            case "bar":
            case "overline":
                return readArgument(str, iArr);
            case "dot":
                return readArgument(str, iArr) + "̇";
            case "end":
            case "begin":
                readArgument(str, iArr);
                return "";
            case "hat":
                return readArgument(str, iArr) + "̂";
            case "vec":
                return readArgument(str, iArr) + "⃗";
            case "frac":
            case "dfrac":
            case "tfrac":
                return wrapIfNeeded(readArgument(str, iArr)) + "/" + wrapIfNeeded(readArgument(str, iArr));
            case "sqrt":
                skipSpaces(str, iArr);
                if (iArr[0] >= str.length() || str.charAt(iArr[0]) != '[' || (iIndexOf = str.indexOf(93, iArr[0])) <= 0) {
                    strInlineLatex = null;
                } else {
                    strInlineLatex = inlineLatex(str.substring(iArr[0] + 1, iIndexOf));
                    iArr[0] = iIndexOf + 1;
                }
                String argument2 = readArgument(str, iArr);
                return (strInlineLatex != null ? superscriptOrRaw(strInlineLatex) : "") + "√" + wrapIfNeeded(argument2);
            case "tilde":
                return readArgument(str, iArr) + "̃";
            default:
                if (KEEP_CONTENT.contains(strSubstring)) {
                    return readArgument(str, iArr);
                }
                return (FUNCTIONS.contains(strSubstring) || (str2 = (String) SYMBOLS.get(strSubstring)) == null) ? strSubstring : str2;
        }
    }

    private static void skipSpaces(String str, int[] iArr) {
        while (iArr[0] < str.length() && str.charAt(iArr[0]) == ' ') {
            iArr[0] = iArr[0] + 1;
        }
    }

    private static String applyScript(String str, boolean z) {
        if (str.isEmpty()) {
            return "";
        }
        HashMap map = z ? SUPER : SUB;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            Character ch = (Character) map.get(Character.valueOf(str.charAt(i)));
            if (ch != null) {
                sb.append(ch.charValue());
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(z ? "^" : "_");
                sb2.append(wrapIfNeeded(str));
                return sb2.toString();
            }
        }
        return sb.toString();
    }

    private static String superscriptOrRaw(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            Character ch = (Character) SUPER.get(Character.valueOf(str.charAt(i)));
            if (ch == null) {
                return "";
            }
            sb.append(ch.charValue());
        }
        return sb.toString();
    }

    private static String wrapIfNeeded(String str) {
        if (str.length() <= 1) {
            return str;
        }
        char cCharAt = str.charAt(0);
        char cCharAt2 = str.charAt(str.length() - 1);
        if ((cCharAt == '(' && cCharAt2 == ')') || (cCharAt == '[' && cCharAt2 == ']')) {
            return str;
        }
        return "(" + str + ")";
    }
}
